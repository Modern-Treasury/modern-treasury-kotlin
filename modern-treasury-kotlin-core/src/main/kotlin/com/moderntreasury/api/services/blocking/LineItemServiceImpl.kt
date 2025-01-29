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
import com.moderntreasury.api.models.LineItem
import com.moderntreasury.api.models.LineItemListPage
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemUpdateParams

class LineItemServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LineItemService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<LineItem> =
        jsonHandler<LineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a single line item */
    override fun retrieve(
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions
    ): LineItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "line_items",
                    params.getPathParam(2)
                )
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<LineItem> =
        jsonHandler<LineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update line item */
    override fun update(params: LineItemUpdateParams, requestOptions: RequestOptions): LineItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "line_items",
                    params.getPathParam(2)
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<LineItem>> =
        jsonHandler<List<LineItem>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of line items */
    override fun list(
        params: LineItemListParams,
        requestOptions: RequestOptions
    ): LineItemListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "line_items"
                )
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    LineItemListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { LineItemListPage.of(this, params, it) }
        }
    }
}
