// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
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
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPage
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams

class LegalEntityServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LegalEntityService {

    private val withRawResponse: LegalEntityService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LegalEntityService.WithRawResponse = withRawResponse

    override fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions,
    ): LegalEntity =
        // post /api/legal_entities
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions,
    ): LegalEntity =
        // get /api/legal_entities/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions,
    ): LegalEntity =
        // patch /api/legal_entities/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LegalEntityListParams,
        requestOptions: RequestOptions,
    ): LegalEntityListPage =
        // get /api/legal_entities
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegalEntityService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LegalEntity> =
            jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: LegalEntityCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LegalEntity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "legal_entities")
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

        private val retrieveHandler: Handler<LegalEntity> =
            jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LegalEntityRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LegalEntity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "legal_entities", params._pathParam(0))
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

        private val updateHandler: Handler<LegalEntity> =
            jsonHandler<LegalEntity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LegalEntityUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LegalEntity> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "legal_entities", params._pathParam(0))
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

        private val listHandler: Handler<List<LegalEntity>> =
            jsonHandler<List<LegalEntity>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: LegalEntityListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LegalEntityListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "legal_entities")
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
                        LegalEntityListPage.builder()
                            .service(LegalEntityServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
