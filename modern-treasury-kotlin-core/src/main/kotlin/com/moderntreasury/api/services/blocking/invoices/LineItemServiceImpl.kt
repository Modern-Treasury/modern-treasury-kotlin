// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.invoices

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
import com.moderntreasury.api.models.InvoiceLineItem
import com.moderntreasury.api.models.InvoiceLineItemCreateParams
import com.moderntreasury.api.models.InvoiceLineItemDeleteParams
import com.moderntreasury.api.models.InvoiceLineItemListPage
import com.moderntreasury.api.models.InvoiceLineItemListParams
import com.moderntreasury.api.models.InvoiceLineItemRetrieveParams
import com.moderntreasury.api.models.InvoiceLineItemUpdateParams

class LineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LineItemService {

    private val withRawResponse: LineItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LineItemService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LineItemService =
        LineItemServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItem =
        // post /api/invoices/{invoice_id}/invoice_line_items
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: InvoiceLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItem =
        // get /api/invoices/{invoice_id}/invoice_line_items/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: InvoiceLineItemUpdateParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItem =
        // patch /api/invoices/{invoice_id}/invoice_line_items/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: InvoiceLineItemListParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItemListPage =
        // get /api/invoices/{invoice_id}/invoice_line_items
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: InvoiceLineItemDeleteParams,
        requestOptions: RequestOptions,
    ): InvoiceLineItem =
        // delete /api/invoices/{invoice_id}/invoice_line_items/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LineItemService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LineItemService.WithRawResponse =
            LineItemServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<InvoiceLineItem> =
            jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: InvoiceLineItemCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceLineItem> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "invoices", params._pathParam(0), "invoice_line_items")
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

        private val retrieveHandler: Handler<InvoiceLineItem> =
            jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: InvoiceLineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceLineItem> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "invoices",
                        params._pathParam(0),
                        "invoice_line_items",
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

        private val updateHandler: Handler<InvoiceLineItem> =
            jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: InvoiceLineItemUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceLineItem> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "invoices",
                        params._pathParam(0),
                        "invoice_line_items",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<List<InvoiceLineItem>> =
            jsonHandler<List<InvoiceLineItem>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InvoiceLineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceLineItemListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("invoiceId", params.invoiceId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "invoices", params._pathParam(0), "invoice_line_items")
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
                        InvoiceLineItemListPage.builder()
                            .service(LineItemServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<InvoiceLineItem> =
            jsonHandler<InvoiceLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: InvoiceLineItemDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InvoiceLineItem> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "invoices",
                        params._pathParam(0),
                        "invoice_line_items",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
