package com.moderntreasury.api.services.blocking.transactions

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.TransactionLineItem
import com.moderntreasury.api.models.TransactionLineItemListPage
import com.moderntreasury.api.models.TransactionLineItemListParams
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class LineItemServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LineItemService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<TransactionLineItem>> =
        jsonHandler<List<TransactionLineItem>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** list transaction_line_items */
    override fun list(
        params: TransactionLineItemListParams,
        requestOptions: RequestOptions
    ): TransactionLineItemListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "transactions", params.getPathParam(0), "line_items")
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
                    TransactionLineItemListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { TransactionLineItemListPage.of(this, params, it) }
        }
    }
}
