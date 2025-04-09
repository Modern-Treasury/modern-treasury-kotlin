// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.ForeignExchangeQuote
import com.moderntreasury.api.models.ForeignExchangeQuoteCreateParams
import com.moderntreasury.api.models.ForeignExchangeQuoteListPageAsync
import com.moderntreasury.api.models.ForeignExchangeQuoteListParams
import com.moderntreasury.api.models.ForeignExchangeQuoteRetrieveParams

class ForeignExchangeQuoteServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ForeignExchangeQuoteServiceAsync {

    private val withRawResponse: ForeignExchangeQuoteServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ForeignExchangeQuoteServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun create(
        params: ForeignExchangeQuoteCreateParams,
        requestOptions: RequestOptions,
    ): ForeignExchangeQuote =
        // post /api/foreign_exchange_quotes
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: ForeignExchangeQuoteRetrieveParams,
        requestOptions: RequestOptions,
    ): ForeignExchangeQuote =
        // get /api/foreign_exchange_quotes/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ForeignExchangeQuoteListParams,
        requestOptions: RequestOptions,
    ): ForeignExchangeQuoteListPageAsync =
        // get /api/foreign_exchange_quotes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ForeignExchangeQuoteServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ForeignExchangeQuote> =
            jsonHandler<ForeignExchangeQuote>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: ForeignExchangeQuoteCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ForeignExchangeQuote> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "foreign_exchange_quotes")
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

        private val retrieveHandler: Handler<ForeignExchangeQuote> =
            jsonHandler<ForeignExchangeQuote>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ForeignExchangeQuoteRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ForeignExchangeQuote> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "foreign_exchange_quotes", params._pathParam(0))
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

        private val listHandler: Handler<List<ForeignExchangeQuote>> =
            jsonHandler<List<ForeignExchangeQuote>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ForeignExchangeQuoteListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ForeignExchangeQuoteListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "foreign_exchange_quotes")
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
                        ForeignExchangeQuoteListPageAsync.builder()
                            .service(ForeignExchangeQuoteServiceAsyncImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
