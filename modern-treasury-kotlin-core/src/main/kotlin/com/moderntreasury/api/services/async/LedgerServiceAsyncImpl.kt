// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

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
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.Ledger
import com.moderntreasury.api.models.LedgerCreateParams
import com.moderntreasury.api.models.LedgerDeleteParams
import com.moderntreasury.api.models.LedgerListPageAsync
import com.moderntreasury.api.models.LedgerListParams
import com.moderntreasury.api.models.LedgerRetrieveParams
import com.moderntreasury.api.models.LedgerUpdateParams

class LedgerServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerServiceAsync {

    private val withRawResponse: LedgerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: LedgerCreateParams,
        requestOptions: RequestOptions,
    ): Ledger =
        // post /api/ledgers
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LedgerRetrieveParams,
        requestOptions: RequestOptions,
    ): Ledger =
        // get /api/ledgers/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: LedgerUpdateParams,
        requestOptions: RequestOptions,
    ): Ledger =
        // patch /api/ledgers/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: LedgerListParams,
        requestOptions: RequestOptions,
    ): LedgerListPageAsync =
        // get /api/ledgers
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: LedgerDeleteParams,
        requestOptions: RequestOptions,
    ): Ledger =
        // delete /api/ledgers/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Ledger> =
            jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: LedgerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Ledger> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledgers")
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

        private val retrieveHandler: Handler<Ledger> =
            jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: LedgerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Ledger> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledgers", params._pathParam(0))
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

        private val updateHandler: Handler<Ledger> =
            jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: LedgerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Ledger> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledgers", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<List<Ledger>> =
            jsonHandler<List<Ledger>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(
            params: LedgerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledgers")
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
                        LedgerListPageAsync.builder()
                            .service(LedgerServiceAsyncImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Ledger> =
            jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun delete(
            params: LedgerDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Ledger> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledgers", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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
