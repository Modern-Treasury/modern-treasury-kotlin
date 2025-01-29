// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.emptyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.RoutingDetail
import com.moderntreasury.api.models.RoutingDetailCreateParams
import com.moderntreasury.api.models.RoutingDetailDeleteParams
import com.moderntreasury.api.models.RoutingDetailListPageAsync
import com.moderntreasury.api.models.RoutingDetailListParams
import com.moderntreasury.api.models.RoutingDetailRetrieveParams

class RoutingDetailServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : RoutingDetailServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<RoutingDetail> =
        jsonHandler<RoutingDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a routing detail for a single external account. */
    override suspend fun create(
        params: RoutingDetailCreateParams,
        requestOptions: RequestOptions
    ): RoutingDetail {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "routing_details"
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
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

    private val retrieveHandler: Handler<RoutingDetail> =
        jsonHandler<RoutingDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a single routing detail for a single internal or external account. */
    override suspend fun retrieve(
        params: RoutingDetailRetrieveParams,
        requestOptions: RequestOptions
    ): RoutingDetail {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "routing_details",
                    params.getPathParam(2)
                )
                .build()
                .prepareAsync(clientOptions, params)
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

    private val listHandler: Handler<List<RoutingDetail>> =
        jsonHandler<List<RoutingDetail>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of routing details for a single internal or external account. */
    override suspend fun list(
        params: RoutingDetailListParams,
        requestOptions: RequestOptions
    ): RoutingDetailListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "routing_details"
                )
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    RoutingDetailListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { RoutingDetailListPageAsync.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete a routing detail for a single external account. */
    override suspend fun delete(params: RoutingDetailDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "routing_details",
                    params.getPathParam(2)
                )
                .apply { params._body()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}
