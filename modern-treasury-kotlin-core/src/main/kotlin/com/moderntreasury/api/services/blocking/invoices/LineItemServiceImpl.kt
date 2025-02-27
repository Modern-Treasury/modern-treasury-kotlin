// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.invoices

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
import com.moderntreasury.api.models.InvoiceLineItem
import com.moderntreasury.api.models.InvoiceLineItemCreateParams
import com.moderntreasury.api.models.InvoiceLineItemDeleteParams
import com.moderntreasury.api.models.InvoiceLineItemListPage
import com.moderntreasury.api.models.InvoiceLineItemListParams
import com.moderntreasury.api.models.InvoiceLineItemRetrieveParams
import com.moderntreasury.api.models.InvoiceLineItemUpdateParams

class LineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LineItemService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InvoiceLineItem> =
        jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create invoice_line_item */
    override fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "invoices", params.getPathParam(0), "invoice_line_items")
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

    private val retrieveHandler: Handler<InvoiceLineItem> =
        jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get invoice_line_item */
    override fun retrieve(
        params: InvoiceLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "invoices",
                    params.getPathParam(0),
                    "invoice_line_items",
                    params.getPathParam(1),
                )
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

    private val updateHandler: Handler<InvoiceLineItem> =
        jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update invoice_line_item */
    override fun update(
        params: InvoiceLineItemUpdateParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments(
                    "api",
                    "invoices",
                    params.getPathParam(0),
                    "invoice_line_items",
                    params.getPathParam(1),
                )
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

    private val listHandler: Handler<List<InvoiceLineItem>> =
        jsonHandler<List<InvoiceLineItem>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list invoice_line_items */
    override fun list(
        params: InvoiceLineItemListParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItemListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "invoices", params.getPathParam(0), "invoice_line_items")
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
                InvoiceLineItemListPage.of(
                    this,
                    params,
                    InvoiceLineItemListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }

    private val deleteHandler: Handler<InvoiceLineItem> =
        jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** delete invoice_line_item */
    override fun delete(
        params: InvoiceLineItemDeleteParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "api",
                    "invoices",
                    params.getPathParam(0),
                    "invoice_line_items",
                    params.getPathParam(1),
                )
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
