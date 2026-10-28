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
import com.moderntreasury.api.models.PaymentAction
import com.moderntreasury.api.models.PaymentActionCreateParams
import com.moderntreasury.api.models.PaymentActionListPageAsync
import com.moderntreasury.api.models.PaymentActionListParams
import com.moderntreasury.api.models.PaymentActionRetrieveParams
import com.moderntreasury.api.models.PaymentActionUpdateParams

class PaymentActionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentActionServiceAsync {

    private val withRawResponse: PaymentActionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentActionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentActionServiceAsync =
        PaymentActionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: PaymentActionCreateParams,
        requestOptions: RequestOptions,
    ): PaymentAction =
        // post /api/payment_actions
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: PaymentActionRetrieveParams,
        requestOptions: RequestOptions,
    ): PaymentAction =
        // get /api/payment_actions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions,
    ): PaymentAction =
        // patch /api/payment_actions/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: PaymentActionListParams,
        requestOptions: RequestOptions,
    ): PaymentActionListPageAsync =
        // get /api/payment_actions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentActionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentActionServiceAsync.WithRawResponse =
            PaymentActionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<PaymentAction> =
            jsonHandler<PaymentAction>(clientOptions.jsonMapper)

        override suspend fun create(
            params: PaymentActionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentAction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "payment_actions")
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

        private val retrieveHandler: Handler<PaymentAction> =
            jsonHandler<PaymentAction>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: PaymentActionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentAction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "payment_actions", params._pathParam(0))
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

        private val updateHandler: Handler<PaymentAction> =
            jsonHandler<PaymentAction>(clientOptions.jsonMapper)

        override suspend fun update(
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentAction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "payment_actions", params._pathParam(0))
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

        private val listHandler: Handler<List<PaymentAction>> =
            jsonHandler<List<PaymentAction>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PaymentActionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentActionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "payment_actions")
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
                        PaymentActionListPageAsync.builder()
                            .service(PaymentActionServiceAsyncImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
