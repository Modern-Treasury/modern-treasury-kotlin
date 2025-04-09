// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.transactions

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.emptyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.TransactionLineItem
import com.moderntreasury.api.models.TransactionLineItemCreateParams
import com.moderntreasury.api.models.TransactionLineItemDeleteParams
import com.moderntreasury.api.models.TransactionLineItemListPageAsync
import com.moderntreasury.api.models.TransactionLineItemListParams
import com.moderntreasury.api.models.TransactionLineItemRetrieveParams

class LineItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LineItemServiceAsync {

    private val withRawResponse: LineItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LineItemServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: TransactionLineItemCreateParams,
        requestOptions: RequestOptions,
    ): TransactionLineItem =
        // post /api/transaction_line_items
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: TransactionLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): TransactionLineItem =
        // get /api/transaction_line_items/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: TransactionLineItemListParams,
        requestOptions: RequestOptions,
    ): TransactionLineItemListPageAsync =
        // get /api/transaction_line_items
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: TransactionLineItemDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /api/transaction_line_items/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LineItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<TransactionLineItem> =
            jsonHandler<TransactionLineItem>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: TransactionLineItemCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLineItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "transaction_line_items")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val retrieveHandler: Handler<TransactionLineItem> =
            jsonHandler<TransactionLineItem>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: TransactionLineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLineItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "transaction_line_items", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<List<TransactionLineItem>> =
            jsonHandler<List<TransactionLineItem>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: TransactionLineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLineItemListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "transaction_line_items")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        TransactionLineItemListPageAsync.of(
                            LineItemServiceAsyncImpl(clientOptions),
                            params,
                            response.headers(),
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun delete(
            params: TransactionLineItemDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "transaction_line_items", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
