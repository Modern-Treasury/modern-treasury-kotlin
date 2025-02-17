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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.PaperItem
import com.moderntreasury.api.models.PaperItemListPage
import com.moderntreasury.api.models.PaperItemListParams
import com.moderntreasury.api.models.PaperItemRetrieveParams

class PaperItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaperItemService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<PaperItem> =
        jsonHandler<PaperItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single paper item. */
    override fun retrieve(
        params: PaperItemRetrieveParams,
        requestOptions: RequestOptions,
    ): PaperItem {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "paper_items", params.getPathParam(0))
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

    private val listHandler: Handler<List<PaperItem>> =
        jsonHandler<List<PaperItem>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of all paper items. */
    override fun list(
        params: PaperItemListParams,
        requestOptions: RequestOptions,
    ): PaperItemListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "paper_items")
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
                PaperItemListPage.of(
                    this,
                    params,
                    PaperItemListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }
}
