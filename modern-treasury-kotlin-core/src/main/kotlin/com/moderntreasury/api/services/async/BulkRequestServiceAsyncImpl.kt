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
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPageAsync
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams

class BulkRequestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BulkRequestServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BulkRequest> =
        jsonHandler<BulkRequest>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create bulk_request */
    override suspend fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions,
    ): BulkRequest {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "bulk_requests")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<BulkRequest> =
        jsonHandler<BulkRequest>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get bulk_request */
    override suspend fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): BulkRequest {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "bulk_requests", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<List<BulkRequest>> =
        jsonHandler<List<BulkRequest>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list bulk_requests */
    override suspend fun list(
        params: BulkRequestListParams,
        requestOptions: RequestOptions,
    ): BulkRequestListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "bulk_requests")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.forEach { it.validate() }
                }
            }
            .let {
                BulkRequestListPageAsync.of(
                    this,
                    params,
                    BulkRequestListPageAsync.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }
}
