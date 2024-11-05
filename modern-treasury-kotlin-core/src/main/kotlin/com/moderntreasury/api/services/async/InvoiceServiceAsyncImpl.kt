// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.emptyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.json
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.Invoice
import com.moderntreasury.api.models.InvoiceAddPaymentOrderParams
import com.moderntreasury.api.models.InvoiceCreateParams
import com.moderntreasury.api.models.InvoiceListPageAsync
import com.moderntreasury.api.models.InvoiceListParams
import com.moderntreasury.api.models.InvoiceRetrieveParams
import com.moderntreasury.api.models.InvoiceUpdateParams
import com.moderntreasury.api.services.async.invoices.LineItemServiceAsync
import com.moderntreasury.api.services.async.invoices.LineItemServiceAsyncImpl

class InvoiceServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InvoiceServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val lineItems: LineItemServiceAsync by lazy { LineItemServiceAsyncImpl(clientOptions) }

    override fun lineItems(): LineItemServiceAsync = lineItems

    private val createHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create invoice */
    override suspend fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions
    ): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "invoices")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get invoice */
    override suspend fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions
    ): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "invoices", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<Invoice> =
        jsonHandler<Invoice>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update invoice */
    override suspend fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions
    ): Invoice {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "invoices", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<Invoice>> =
        jsonHandler<List<Invoice>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list invoices */
    override suspend fun list(
        params: InvoiceListParams,
        requestOptions: RequestOptions
    ): InvoiceListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "invoices")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    InvoiceListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { InvoiceListPageAsync.of(this, params, it) }
        }
    }

    private val addPaymentOrderHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Add a payment order to an invoice. */
    override suspend fun addPaymentOrder(
        params: InvoiceAddPaymentOrderParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "api",
                    "invoices",
                    params.getPathParam(0),
                    "payment_orders",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { addPaymentOrderHandler.handle(it) }
        }
    }
}
