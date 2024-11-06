// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.models.ConnectionLegalEntityListPage
import com.moderntreasury.api.models.ConnectionLegalEntityListParams
import com.moderntreasury.api.models.ConnectionLegalEntityRetrieveParams
import com.moderntreasury.api.models.ConnectionLegalEntityUpdateParams

class ConnectionLegalEntityServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ConnectionLegalEntityService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ConnectionLegalEntity> =
        jsonHandler<ConnectionLegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a connection legal entity. */
    override fun create(
        params: ConnectionLegalEntityCreateParams,
        requestOptions: RequestOptions
    ): ConnectionLegalEntity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "connection_legal_entities")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun retrieve(
        params: ConnectionLegalEntityRetrieveParams,
        requestOptions: RequestOptions
    ): ConnectionLegalEntity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "connection_legal_entities", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun update(
        params: ConnectionLegalEntityUpdateParams,
        requestOptions: RequestOptions
    ): ConnectionLegalEntity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "connection_legal_entities", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun list(
        params: ConnectionLegalEntityListParams,
        requestOptions: RequestOptions
    ): ConnectionLegalEntityListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "connection_legal_entities")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    ConnectionLegalEntityListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { ConnectionLegalEntityListPage.of(this, params, it) }
        }
    }
}
