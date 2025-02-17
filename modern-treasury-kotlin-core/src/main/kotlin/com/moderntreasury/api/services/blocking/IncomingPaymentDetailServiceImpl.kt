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
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.IncomingPaymentDetail
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailListPage
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams

class IncomingPaymentDetailServiceImpl
internal constructor(private val clientOptions: ClientOptions) : IncomingPaymentDetailService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<IncomingPaymentDetail> =
        jsonHandler<IncomingPaymentDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an existing Incoming Payment Detail. */
    override fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions,
    ): IncomingPaymentDetail {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "incoming_payment_details", params.getPathParam(0))
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

    private val updateHandler: Handler<IncomingPaymentDetail> =
        jsonHandler<IncomingPaymentDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update an existing Incoming Payment Detail. */
    override fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions,
    ): IncomingPaymentDetail {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "incoming_payment_details", params.getPathParam(0))
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

    private val listHandler: Handler<List<IncomingPaymentDetail>> =
        jsonHandler<List<IncomingPaymentDetail>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of Incoming Payment Details. */
    override fun list(
        params: IncomingPaymentDetailListParams,
        requestOptions: RequestOptions,
    ): IncomingPaymentDetailListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "incoming_payment_details")
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
                IncomingPaymentDetailListPage.of(
                    this,
                    params,
                    IncomingPaymentDetailListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }

    private val createAsyncHandler: Handler<AsyncResponse> =
        jsonHandler<AsyncResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Simulate Incoming Payment Detail */
    override fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams,
        requestOptions: RequestOptions,
    ): AsyncResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "simulations", "incoming_payment_details", "create_async")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createAsyncHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
