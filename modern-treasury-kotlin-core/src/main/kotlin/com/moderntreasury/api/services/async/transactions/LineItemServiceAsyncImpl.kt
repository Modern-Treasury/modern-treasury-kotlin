// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.transactions

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
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.TransactionLineItem
import com.moderntreasury.api.models.TransactionLineItemCreateParams
import com.moderntreasury.api.models.TransactionLineItemDeleteParams
import com.moderntreasury.api.models.TransactionLineItemListPageAsync
import com.moderntreasury.api.models.TransactionLineItemListParams
import com.moderntreasury.api.models.TransactionLineItemRetrieveParams

class LineItemServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LineItemServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<TransactionLineItem> =
        jsonHandler<TransactionLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create transaction line items */
    override suspend fun create(
        params: TransactionLineItemCreateParams,
        requestOptions: RequestOptions
    ): TransactionLineItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "transaction_line_items")
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

    private val retrieveHandler: Handler<TransactionLineItem> =
        jsonHandler<TransactionLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get transaction line item */
    override suspend fun retrieve(
        params: TransactionLineItemRetrieveParams,
        requestOptions: RequestOptions
    ): TransactionLineItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "transaction_line_items", params.getPathParam(0))
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

    private val listHandler: Handler<List<TransactionLineItem>> =
        jsonHandler<List<TransactionLineItem>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** list transaction_line_items */
    override suspend fun list(
        params: TransactionLineItemListParams,
        requestOptions: RequestOptions
    ): TransactionLineItemListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "transaction_line_items")
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
                TransactionLineItemListPageAsync.of(
                    this,
                    params,
                    TransactionLineItemListPageAsync.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                )
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** delete transaction line item */
    override suspend fun delete(
        params: TransactionLineItemDeleteParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "transaction_line_items", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        response.use { deleteHandler.handle(it) }
    }
}
