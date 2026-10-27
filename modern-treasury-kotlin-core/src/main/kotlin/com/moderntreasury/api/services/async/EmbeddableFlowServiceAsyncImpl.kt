// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

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
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.EmbeddableFlow
import com.moderntreasury.api.models.EmbeddableFlowCreateParams
import com.moderntreasury.api.models.EmbeddableFlowListPageAsync
import com.moderntreasury.api.models.EmbeddableFlowListParams
import com.moderntreasury.api.models.EmbeddableFlowRetrieveParams
import com.moderntreasury.api.models.EmbeddableFlowUpdateParams

class EmbeddableFlowServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : EmbeddableFlowServiceAsync {

    private val withRawResponse: EmbeddableFlowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EmbeddableFlowServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): EmbeddableFlowServiceAsync =
        EmbeddableFlowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: EmbeddableFlowCreateParams,
        requestOptions: RequestOptions,
    ): EmbeddableFlow =
        // post /api/embeddable_flows
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: EmbeddableFlowRetrieveParams,
        requestOptions: RequestOptions,
    ): EmbeddableFlow =
        // get /api/embeddable_flows/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: EmbeddableFlowUpdateParams,
        requestOptions: RequestOptions,
    ): EmbeddableFlow =
        // patch /api/embeddable_flows/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: EmbeddableFlowListParams,
        requestOptions: RequestOptions,
    ): EmbeddableFlowListPageAsync =
        // get /api/embeddable_flows
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EmbeddableFlowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EmbeddableFlowServiceAsync.WithRawResponse =
            EmbeddableFlowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<EmbeddableFlow> =
            jsonHandler<EmbeddableFlow>(clientOptions.jsonMapper)

        override suspend fun create(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun retrieve(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun update(
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        override suspend fun list(
            params: EmbeddableFlowListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddableFlowListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "embeddable_flows")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        EmbeddableFlowListPageAsync.builder()
                            .service(EmbeddableFlowServiceAsyncImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
