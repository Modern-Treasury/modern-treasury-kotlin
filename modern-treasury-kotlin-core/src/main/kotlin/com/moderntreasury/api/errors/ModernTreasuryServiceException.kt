package com.moderntreasury.api.errors

import com.moderntreasury.api.core.http.Headers

abstract class ModernTreasuryServiceException(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: ModernTreasuryError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null,
) : ModernTreasuryException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): ModernTreasuryError = error
}
