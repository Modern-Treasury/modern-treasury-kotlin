// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.paymentOrders

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.checkRequired
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
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalListPage
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.Reversal

class ReversalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReversalService {

    private val withRawResponse: ReversalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ReversalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReversalService =
        ReversalServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions,
    ): Reversal =
        // post /api/payment_orders/{payment_order_id}/reversals
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions,
    ): Reversal =
        // get /api/payment_orders/{payment_order_id}/reversals/{reversal_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions,
    ): PaymentOrderReversalListPage =
        // get /api/payment_orders/{payment_order_id}/reversals
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ReversalService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReversalService.WithRawResponse =
            ReversalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Reversal> =
            jsonHandler<Reversal>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PaymentOrderReversalCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Reversal> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentOrderId", params.paymentOrderId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "payment_orders", params._pathParam(0), "reversals")
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

        private val retrieveHandler: Handler<Reversal> =
            jsonHandler<Reversal>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentOrderReversalRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Reversal> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reversalId", params.reversalId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "payment_orders",
                        params._pathParam(0),
                        "reversals",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<List<Reversal>> =
            jsonHandler<List<Reversal>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: PaymentOrderReversalListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentOrderReversalListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("paymentOrderId", params.paymentOrderId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "payment_orders", params._pathParam(0), "reversals")
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
                        PaymentOrderReversalListPage.builder()
                            .service(ReversalServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
