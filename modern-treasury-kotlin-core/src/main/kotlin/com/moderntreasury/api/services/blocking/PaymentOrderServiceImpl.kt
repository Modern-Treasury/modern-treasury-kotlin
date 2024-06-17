// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
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
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.json
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class PaymentOrderServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PaymentOrderService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val reversals: ReversalService by lazy { ReversalServiceImpl(clientOptions) }

    override fun reversals(): ReversalService = reversals

    private val createHandler: Handler<PaymentOrder> =
        jsonHandler<PaymentOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new Payment Order */
    override fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions
    ): PaymentOrder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "payment_orders")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<PaymentOrder> =
        jsonHandler<PaymentOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single payment order */
    override fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions
    ): PaymentOrder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_orders", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<PaymentOrder> =
        jsonHandler<PaymentOrder>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a payment order */
    override fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions
    ): PaymentOrder {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "payment_orders", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<PaymentOrder>> =
        jsonHandler<List<PaymentOrder>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of all payment orders */
    override fun list(
        params: PaymentOrderListParams,
        requestOptions: RequestOptions
    ): PaymentOrderListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_orders")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    PaymentOrderListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { PaymentOrderListPage.of(this, params, it) }
        }
    }

    private val createAsyncHandler: Handler<AsyncResponse> =
        jsonHandler<AsyncResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new payment order asynchronously */
    override fun createAsync(
        params: PaymentOrderCreateAsyncParams,
        requestOptions: RequestOptions
    ): AsyncResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "payment_orders", "create_async")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createAsyncHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
