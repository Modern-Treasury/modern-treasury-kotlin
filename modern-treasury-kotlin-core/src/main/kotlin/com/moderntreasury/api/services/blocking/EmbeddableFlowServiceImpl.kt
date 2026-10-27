// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.handlers.errorBodyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.EmbeddableFlow
import com.moderntreasury.api.models.EmbeddableFlowCreateParams
import com.moderntreasury.api.models.EmbeddableFlowListPage
import com.moderntreasury.api.models.EmbeddableFlowListParams
import com.moderntreasury.api.models.EmbeddableFlowRetrieveParams
import com.moderntreasury.api.models.EmbeddableFlowUpdateParams

class EmbeddableFlowServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EmbeddableFlowService {

    private val withRawResponse: EmbeddableFlowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmbeddableFlowService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmbeddableFlowService =
        EmbeddableFlowServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: EmbeddableFlowCreateParams,
        requestOptions: RequestOptions,
    ): EmbeddableFlow =
        // post /api/embeddable_flows
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: EmbeddableFlowRetrieveParams,
        requestOptions: RequestOptions,
    ): EmbeddableFlow =
        // get /api/embeddable_flows/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: EmbeddableFlowUpdateParams,
        requestOptions: RequestOptions,
    ): EmbeddableFlow =
        // patch /api/embeddable_flows/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: EmbeddableFlowListParams,
        requestOptions: RequestOptions,
    ): EmbeddableFlowListPage =
        // get /api/embeddable_flows
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmbeddableFlowService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EmbeddableFlowService.WithRawResponse =
            EmbeddableFlowServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<EmbeddableFlow> =
            jsonHandler<EmbeddableFlow>(clientOptions.jsonMapper)

        override fun create(
            params: EmbeddableFlowCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddableFlow> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "embeddable_flows")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<EmbeddableFlow> =
            jsonHandler<EmbeddableFlow>(clientOptions.jsonMapper)

        override fun retrieve(
            params: EmbeddableFlowRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddableFlow> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "embeddable_flows", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<EmbeddableFlow> =
            jsonHandler<EmbeddableFlow>(clientOptions.jsonMapper)

        override fun update(
            params: EmbeddableFlowUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddableFlow> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "embeddable_flows", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<EmbeddableFlow>> =
            jsonHandler<List<EmbeddableFlow>>(clientOptions.jsonMapper)

        override fun list(
            params: EmbeddableFlowListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddableFlowListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "embeddable_flows")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        EmbeddableFlowListPage.builder()
                            .service(EmbeddableFlowServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
