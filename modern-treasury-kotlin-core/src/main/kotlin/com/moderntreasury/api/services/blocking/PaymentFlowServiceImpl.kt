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
import com.moderntreasury.api.models.PaymentFlow
import com.moderntreasury.api.models.PaymentFlowCreateParams
import com.moderntreasury.api.models.PaymentFlowListPage
import com.moderntreasury.api.models.PaymentFlowListParams
import com.moderntreasury.api.models.PaymentFlowRetrieveParams
import com.moderntreasury.api.models.PaymentFlowUpdateParams

class PaymentFlowServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentFlowService {

    private val withRawResponse: PaymentFlowService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentFlowService.WithRawResponse = withRawResponse

    override fun create(
        params: PaymentFlowCreateParams,
        requestOptions: RequestOptions,
    ): PaymentFlow =
        // post /api/payment_flows
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PaymentFlowRetrieveParams,
        requestOptions: RequestOptions,
    ): PaymentFlow =
        // get /api/payment_flows/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions,
    ): PaymentFlow =
        // patch /api/payment_flows/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PaymentFlowListParams,
        requestOptions: RequestOptions,
    ): PaymentFlowListPage =
        // get /api/payment_flows
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentFlowService.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PaymentFlow> =
            jsonHandler<PaymentFlow>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PaymentFlowCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentFlow> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "payment_flows")
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

        private val retrieveHandler: Handler<PaymentFlow> =
            jsonHandler<PaymentFlow>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentFlowRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentFlow> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "payment_flows", params.getPathParam(0))
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

        private val updateHandler: Handler<PaymentFlow> =
            jsonHandler<PaymentFlow>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PaymentFlowUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentFlow> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "payment_flows", params.getPathParam(0))
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

        private val listHandler: Handler<List<PaymentFlow>> =
            jsonHandler<List<PaymentFlow>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: PaymentFlowListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentFlowListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "payment_flows")
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
                        PaymentFlowListPage.of(
                            PaymentFlowServiceImpl(clientOptions),
                            params,
                            PaymentFlowListPage.Response.builder()
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
