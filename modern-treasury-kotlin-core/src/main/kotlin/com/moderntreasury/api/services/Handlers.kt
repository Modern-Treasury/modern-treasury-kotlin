@file:JvmName("Handlers")

package com.moderntreasury.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.http.BinaryResponseContent
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.BadRequestException
import com.moderntreasury.api.errors.InternalServerException
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.errors.ModernTreasuryException
import com.moderntreasury.api.errors.NotFoundException
import com.moderntreasury.api.errors.PermissionDeniedException
import com.moderntreasury.api.errors.RateLimitException
import com.moderntreasury.api.errors.UnauthorizedException
import com.moderntreasury.api.errors.UnexpectedStatusCodeException
import com.moderntreasury.api.errors.UnprocessableEntityException
import java.io.InputStream
import java.io.OutputStream

internal fun emptyHandler(): Handler<Void?> = EmptyHandler

private object EmptyHandler : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}

internal fun stringHandler(): Handler<String> = StringHandler

internal fun binaryHandler(): Handler<BinaryResponseContent> = BinaryHandler

private object StringHandler : Handler<String> {
    override fun handle(response: HttpResponse): String {
        return response.body().readBytes().toString(Charsets.UTF_8)
    }
}

private object BinaryHandler : Handler<BinaryResponseContent> {
    override fun handle(response: HttpResponse): BinaryResponseContent {
        return BinaryResponseContentImpl(response)
    }
}

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw ModernTreasuryException("Error reading response", e)
            }
        }
    }
}

internal fun errorHandler(jsonMapper: JsonMapper): Handler<ModernTreasuryError> {
    val handler = jsonHandler<ModernTreasuryError>(jsonMapper)

    return object : Handler<ModernTreasuryError> {
        override fun handle(response: HttpResponse): ModernTreasuryError {
            try {
                return handler.handle(response)
            } catch (e: Exception) {
                return ModernTreasuryError.builder().build()
            }
        }
    }
}

internal fun <T> Handler<T>.withErrorHandler(
    errorHandler: Handler<ModernTreasuryError>
): Handler<T> {
    return object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> return this@withErrorHandler.handle(response)
                400 -> throw BadRequestException(response.headers(), errorHandler.handle(response))
                401 ->
                    throw UnauthorizedException(response.headers(), errorHandler.handle(response))
                403 ->
                    throw PermissionDeniedException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                404 -> throw NotFoundException(response.headers(), errorHandler.handle(response))
                422 ->
                    throw UnprocessableEntityException(
                        response.headers(),
                        errorHandler.handle(response)
                    )
                429 -> throw RateLimitException(response.headers(), errorHandler.handle(response))
                in 500..599 ->
                    throw InternalServerException(
                        statusCode,
                        response.headers(),
                        errorHandler.handle(response)
                    )
                else ->
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        response.headers(),
                        StringHandler.handle(response)
                    )
            }
        }
    }
}

class BinaryResponseContentImpl
constructor(
    private val response: HttpResponse,
) : BinaryResponseContent {
    override fun contentType(): String? {
        return response.headers().get("Content-Type").firstOrNull()
    }

    override fun body(): InputStream {
        return response.body()
    }

    override fun writeTo(outputStream: OutputStream) {
        response.body().copyTo(outputStream)
    }

    override fun close() {
        response.body().close()
    }
}
