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
import com.moderntreasury.api.models.ForeignExchangeQuote
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteListPage
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams

class ForeignExchangeQuoteServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ForeignExchangeQuoteService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ForeignExchangeQuote> =
        jsonHandler<ForeignExchangeQuote>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create foreign_exchange_quote */
    override fun create(
        params: ForeignExchangeQuoteCreateParams,
        requestOptions: RequestOptions,
    ): ForeignExchangeQuote {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "foreign_exchange_quotes")
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

    private val retrieveHandler: Handler<ForeignExchangeQuote> =
        jsonHandler<ForeignExchangeQuote>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get foreign_exchange_quote */
    override fun retrieve(
        params: ForeignExchangeQuoteRetrieveParams,
        requestOptions: RequestOptions,
    ): ForeignExchangeQuote {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "foreign_exchange_quotes", params.getPathParam(0))
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

    private val listHandler: Handler<List<ForeignExchangeQuote>> =
        jsonHandler<List<ForeignExchangeQuote>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** list foreign_exchange_quotes */
    override fun list(
        params: ForeignExchangeQuoteListParams,
        requestOptions: RequestOptions,
    ): ForeignExchangeQuoteListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "foreign_exchange_quotes")
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
                ForeignExchangeQuoteListPage.of(
                    this,
                    params,
                    ForeignExchangeQuoteListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }
}
