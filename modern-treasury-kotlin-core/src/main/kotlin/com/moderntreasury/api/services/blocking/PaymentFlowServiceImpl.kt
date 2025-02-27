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
import com.moderntreasury.api.core.json
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

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PaymentFlow> =
        jsonHandler<PaymentFlow>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create payment_flow */
    override fun create(
        params: PaymentFlowCreateParams,
        requestOptions: RequestOptions,
    ): PaymentFlow {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "payment_flows")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<PaymentFlow> =
        jsonHandler<PaymentFlow>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get payment_flow */
    override fun retrieve(
        params: PaymentFlowRetrieveParams,
        requestOptions: RequestOptions,
    ): PaymentFlow {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_flows", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<PaymentFlow> =
        jsonHandler<PaymentFlow>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update payment_flow */
    override fun update(
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions,
    ): PaymentFlow {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "payment_flows", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<List<PaymentFlow>> =
        jsonHandler<List<PaymentFlow>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list payment_flows */
    override fun list(
        params: PaymentFlowListParams,
        requestOptions: RequestOptions,
    ): PaymentFlowListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_flows")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.forEach { it.validate() }
                }
            }
            .let {
                PaymentFlowListPage.of(
                    this,
                    params,
                    PaymentFlowListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }
}
