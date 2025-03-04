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
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.PaymentOrder
import com.moderntreasury.api.models.PaymentOrderCreateAsyncParams
import com.moderntreasury.api.models.PaymentOrderCreateParams
import com.moderntreasury.api.models.PaymentOrderListPage
import com.moderntreasury.api.models.PaymentOrderListParams
import com.moderntreasury.api.models.PaymentOrderRetrieveParams
import com.moderntreasury.api.models.PaymentOrderUpdateParams
import com.moderntreasury.api.services.blocking.paymentOrders.ReversalService
import com.moderntreasury.api.services.blocking.paymentOrders.ReversalServiceImpl

class PaymentOrderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentOrderService {

    private val withRawResponse: PaymentOrderService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val reversals: ReversalService by lazy { ReversalServiceImpl(clientOptions) }

    override fun withRawResponse(): PaymentOrderService.WithRawResponse = withRawResponse

    override fun reversals(): ReversalService = reversals

    override fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions,
    ): PaymentOrder =
        // post /api/payment_orders
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): PaymentOrder =
        // get /api/payment_orders/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions,
    ): PaymentOrder =
        // patch /api/payment_orders/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PaymentOrderListParams,
        requestOptions: RequestOptions,
    ): PaymentOrderListPage =
        // get /api/payment_orders
        withRawResponse().list(params, requestOptions).parse()

    override fun createAsync(
        params: PaymentOrderCreateAsyncParams,
        requestOptions: RequestOptions,
    ): AsyncResponse =
        // post /api/payment_orders/create_async
        withRawResponse().createAsync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentOrderService.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val reversals: ReversalService.WithRawResponse by lazy {
            ReversalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun reversals(): ReversalService.WithRawResponse = reversals

        private val createHandler: Handler<PaymentOrder> =
            jsonHandler<PaymentOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PaymentOrderCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentOrder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "payment_orders")
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

        private val retrieveHandler: Handler<PaymentOrder> =
            jsonHandler<PaymentOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentOrderRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentOrder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "payment_orders", params.getPathParam(0))
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

        private val updateHandler: Handler<PaymentOrder> =
            jsonHandler<PaymentOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PaymentOrderUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentOrder> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "payment_orders", params.getPathParam(0))
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

        private val listHandler: Handler<List<PaymentOrder>> =
            jsonHandler<List<PaymentOrder>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: PaymentOrderListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentOrderListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "payment_orders")
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
                        PaymentOrderListPage.of(
                            PaymentOrderServiceImpl(clientOptions),
                            params,
                            PaymentOrderListPage.Response.builder()
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

        private val createAsyncHandler: Handler<AsyncResponse> =
            jsonHandler<AsyncResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createAsync(
            params: PaymentOrderCreateAsyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AsyncResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "payment_orders", "create_async")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createAsyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
