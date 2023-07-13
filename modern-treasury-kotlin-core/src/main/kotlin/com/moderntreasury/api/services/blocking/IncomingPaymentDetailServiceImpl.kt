package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.IncomingPaymentDetail
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailListPage
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.json
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class IncomingPaymentDetailServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : IncomingPaymentDetailService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<IncomingPaymentDetail> =
        jsonHandler<IncomingPaymentDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an existing Incoming Payment Detail. */
    override fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions
    ): IncomingPaymentDetail {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "incoming_payment_details", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<IncomingPaymentDetail> =
        jsonHandler<IncomingPaymentDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update an existing Incoming Payment Detail. */
    override fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions
    ): IncomingPaymentDetail {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "incoming_payment_details", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<IncomingPaymentDetail>> =
        jsonHandler<List<IncomingPaymentDetail>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of Incoming Payment Details. */
    override fun list(
        params: IncomingPaymentDetailListParams,
        requestOptions: RequestOptions
    ): IncomingPaymentDetailListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "incoming_payment_details")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    IncomingPaymentDetailListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { IncomingPaymentDetailListPage.of(this, params, it) }
        }
    }

    private val createAsyncHandler: Handler<AsyncResponse> =
        jsonHandler<AsyncResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Simulate Incoming Payment Detail */
    override fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams,
        requestOptions: RequestOptions
    ): AsyncResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "simulations", "incoming_payment_details", "create_async")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { createAsyncHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
