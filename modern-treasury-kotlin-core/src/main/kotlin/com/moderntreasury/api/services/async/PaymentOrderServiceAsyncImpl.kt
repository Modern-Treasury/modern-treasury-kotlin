// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.PaymentOrder
import com.moderntreasury.api.models.PaymentOrderCreateAsyncParams
import com.moderntreasury.api.models.PaymentOrderCreateParams
import com.moderntreasury.api.models.PaymentOrderListPageAsync
import com.moderntreasury.api.models.PaymentOrderListParams
import com.moderntreasury.api.models.PaymentOrderRetrieveParams
import com.moderntreasury.api.models.PaymentOrderUpdateParams
import com.moderntreasury.api.services.async.paymentOrders.ReversalServiceAsync
import com.moderntreasury.api.services.async.paymentOrders.ReversalServiceAsyncImpl

class PaymentOrderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentOrderServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val reversals: ReversalServiceAsync by lazy { ReversalServiceAsyncImpl(clientOptions) }

    override fun reversals(): ReversalServiceAsync = reversals

    private val createHandler: Handler<PaymentOrder> =
        jsonHandler<PaymentOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new Payment Order */
    override suspend fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions,
    ): PaymentOrder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "payment_orders")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<PaymentOrder> =
        jsonHandler<PaymentOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single payment order */
    override suspend fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions,
    ): PaymentOrder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_orders", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<PaymentOrder> =
        jsonHandler<PaymentOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a payment order */
    override suspend fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions,
    ): PaymentOrder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "payment_orders", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<List<PaymentOrder>> =
        jsonHandler<List<PaymentOrder>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of all payment orders */
    override suspend fun list(
        params: PaymentOrderListParams,
        requestOptions: RequestOptions,
    ): PaymentOrderListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_orders")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.forEach { it.validate() }
                }
            }
            .let {
                PaymentOrderListPageAsync.of(
                    this,
                    params,
                    PaymentOrderListPageAsync.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }

    private val createAsyncHandler: Handler<AsyncResponse> =
        jsonHandler<AsyncResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new payment order asynchronously */
    override suspend fun createAsync(
        params: PaymentOrderCreateAsyncParams,
        requestOptions: RequestOptions,
    ): AsyncResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "payment_orders", "create_async")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createAsyncHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
