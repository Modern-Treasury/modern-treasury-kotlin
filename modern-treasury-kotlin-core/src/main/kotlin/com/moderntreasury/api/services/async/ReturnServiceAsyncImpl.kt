// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.json
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.ReturnCreateParams
import com.moderntreasury.api.models.ReturnListPageAsync
import com.moderntreasury.api.models.ReturnListParams
import com.moderntreasury.api.models.ReturnObject
import com.moderntreasury.api.models.ReturnRetrieveParams

class ReturnServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ReturnServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ReturnObject> =
        jsonHandler<ReturnObject>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a return. */
    override suspend fun create(
        params: ReturnCreateParams,
        requestOptions: RequestOptions
    ): ReturnObject {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "returns")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<ReturnObject> =
        jsonHandler<ReturnObject>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a single return. */
    override suspend fun retrieve(
        params: ReturnRetrieveParams,
        requestOptions: RequestOptions
    ): ReturnObject {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "returns", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<ReturnObject>> =
        jsonHandler<List<ReturnObject>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of returns. */
    override suspend fun list(
        params: ReturnListParams,
        requestOptions: RequestOptions
    ): ReturnListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "returns")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    ReturnListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { ReturnListPageAsync.of(this, params, it) }
        }
    }
}
