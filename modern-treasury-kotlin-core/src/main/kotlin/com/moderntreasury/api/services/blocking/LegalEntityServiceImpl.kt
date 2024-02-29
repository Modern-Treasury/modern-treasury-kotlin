// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPage
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.json
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class LegalEntityServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LegalEntityService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LegalEntity> =
        jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create legal_entity */
    override fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions
    ): LegalEntity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "legal_entities")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<LegalEntity> =
        jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single legal entity. */
    override fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions
    ): LegalEntity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "legal_entities", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val updateHandler: Handler<LegalEntity> =
        jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a legal entity. */
    override fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions
    ): LegalEntity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "legal_entities", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val listHandler: Handler<List<LegalEntity>> =
        jsonHandler<List<LegalEntity>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of all legal entities. */
    override fun list(
        params: LegalEntityListParams,
        requestOptions: RequestOptions
    ): LegalEntityListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "legal_entities")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
                    LegalEntityListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { LegalEntityListPage.of(this, params, it) }
        }
    }
}
