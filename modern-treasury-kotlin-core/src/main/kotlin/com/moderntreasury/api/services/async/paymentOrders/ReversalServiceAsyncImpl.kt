// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.paymentOrders

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
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalListPageAsync
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.Reversal

class ReversalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ReversalServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Reversal> =
        jsonHandler<Reversal>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a reversal for a payment order. */
    override suspend fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions,
    ): Reversal {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "payment_orders", params.getPathParam(0), "reversals")
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

    private val retrieveHandler: Handler<Reversal> =
        jsonHandler<Reversal>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single reversal of a payment order. */
    override suspend fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions,
    ): Reversal {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "payment_orders",
                    params.getPathParam(0),
                    "reversals",
                    params.getPathParam(1),
                )
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

    private val listHandler: Handler<List<Reversal>> =
        jsonHandler<List<Reversal>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of all reversals of a payment order. */
    override suspend fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions,
    ): PaymentOrderReversalListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_orders", params.getPathParam(0), "reversals")
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
                PaymentOrderReversalListPageAsync.of(
                    this,
                    params,
                    PaymentOrderReversalListPageAsync.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }
}
