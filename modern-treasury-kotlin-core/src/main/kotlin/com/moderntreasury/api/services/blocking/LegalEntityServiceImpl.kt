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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPage
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams

class LegalEntityServiceImpl
internal constructor(
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
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.forEach { it.validate() }
                }
            }
            .let {
                LegalEntityListPage.of(
                    this,
                    params,
                    LegalEntityListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                )
            }
    }
}
