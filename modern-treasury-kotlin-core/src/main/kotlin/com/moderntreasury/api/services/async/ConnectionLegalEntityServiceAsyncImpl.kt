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
import com.moderntreasury.api.models.ConnectionLegalEntity
import com.moderntreasury.api.models.ConnectionLegalEntityCreateParams
import com.moderntreasury.api.models.ConnectionLegalEntityListPageAsync
import com.moderntreasury.api.models.ConnectionLegalEntityListParams
import com.moderntreasury.api.models.ConnectionLegalEntityRetrieveParams
import com.moderntreasury.api.models.ConnectionLegalEntityUpdateParams

class ConnectionLegalEntityServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ConnectionLegalEntityServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ConnectionLegalEntity> =
        jsonHandler<ConnectionLegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a connection legal entity. */
    override suspend fun create(
        params: ConnectionLegalEntityCreateParams,
        requestOptions: RequestOptions
    ): ConnectionLegalEntity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "connection_legal_entities")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
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

    private val retrieveHandler: Handler<ConnectionLegalEntity> =
        jsonHandler<ConnectionLegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single connection legal entity. */
    override suspend fun retrieve(
        params: ConnectionLegalEntityRetrieveParams,
        requestOptions: RequestOptions
    ): ConnectionLegalEntity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "connection_legal_entities", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
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

    private val updateHandler: Handler<ConnectionLegalEntity> =
        jsonHandler<ConnectionLegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a connection legal entity. */
    override suspend fun update(
        params: ConnectionLegalEntityUpdateParams,
        requestOptions: RequestOptions
    ): ConnectionLegalEntity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "connection_legal_entities", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<ConnectionLegalEntity>> =
        jsonHandler<List<ConnectionLegalEntity>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of all connection legal entities. */
    override suspend fun list(
        params: ConnectionLegalEntityListParams,
        requestOptions: RequestOptions
    ): ConnectionLegalEntityListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "connection_legal_entities")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
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
                    ConnectionLegalEntityListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { ConnectionLegalEntityListPageAsync.of(this, params, it) }
        }
    }
}
