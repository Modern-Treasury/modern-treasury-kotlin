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
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.ConnectionLegalEntity
import com.moderntreasury.api.models.ConnectionLegalEntityCreateParams
import com.moderntreasury.api.models.ConnectionLegalEntityListPage
import com.moderntreasury.api.models.ConnectionLegalEntityListParams
import com.moderntreasury.api.models.ConnectionLegalEntityRetrieveParams
import com.moderntreasury.api.models.ConnectionLegalEntityUpdateParams

class ConnectionLegalEntityServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ConnectionLegalEntityService {

    private val withRawResponse: ConnectionLegalEntityService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConnectionLegalEntityService.WithRawResponse = withRawResponse

    override fun create(
        params: ConnectionLegalEntityCreateParams,
        requestOptions: RequestOptions,
    ): ConnectionLegalEntity =
        // post /api/connection_legal_entities
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ConnectionLegalEntityRetrieveParams,
        requestOptions: RequestOptions,
    ): ConnectionLegalEntity =
        // get /api/connection_legal_entities/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ConnectionLegalEntityUpdateParams,
        requestOptions: RequestOptions,
    ): ConnectionLegalEntity =
        // patch /api/connection_legal_entities/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ConnectionLegalEntityListParams,
        requestOptions: RequestOptions,
    ): ConnectionLegalEntityListPage =
        // get /api/connection_legal_entities
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectionLegalEntityService.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ConnectionLegalEntity> =
            jsonHandler<ConnectionLegalEntity>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ConnectionLegalEntityCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionLegalEntity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "connection_legal_entities")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ConnectionLegalEntity> =
            jsonHandler<ConnectionLegalEntity>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ConnectionLegalEntityRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionLegalEntity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "connection_legal_entities", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ConnectionLegalEntity> =
            jsonHandler<ConnectionLegalEntity>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: ConnectionLegalEntityUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionLegalEntity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "connection_legal_entities", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<ConnectionLegalEntity>> =
            jsonHandler<List<ConnectionLegalEntity>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ConnectionLegalEntityListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionLegalEntityListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "connection_legal_entities")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        ConnectionLegalEntityListPage.of(
                            ConnectionLegalEntityServiceImpl(clientOptions),
                            params,
                            ConnectionLegalEntityListPage.Response.builder()
                                .items(it)
                                .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                                .afterCursor(
                                    response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                                )
                                .build(),
                        )
                    }
            }
        }
    }
}
