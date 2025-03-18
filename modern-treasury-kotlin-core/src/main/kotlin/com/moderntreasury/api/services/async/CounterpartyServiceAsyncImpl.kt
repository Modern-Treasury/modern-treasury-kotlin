// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
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
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCollectAccountResponse
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyDeleteParams
import com.moderntreasury.api.models.CounterpartyListPageAsync
import com.moderntreasury.api.models.CounterpartyListParams
import com.moderntreasury.api.models.CounterpartyRetrieveParams
import com.moderntreasury.api.models.CounterpartyUpdateParams

class CounterpartyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CounterpartyServiceAsync {

    private val withRawResponse: CounterpartyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CounterpartyServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions,
    ): Counterparty =
        // post /api/counterparties
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions,
    ): Counterparty =
        // get /api/counterparties/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions,
    ): Counterparty =
        // patch /api/counterparties/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: CounterpartyListParams,
        requestOptions: RequestOptions,
    ): CounterpartyListPageAsync =
        // get /api/counterparties
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: CounterpartyDeleteParams, requestOptions: RequestOptions) {
        // delete /api/counterparties/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun collectAccount(
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions,
    ): CounterpartyCollectAccountResponse =
        // post /api/counterparties/{id}/collect_account
        withRawResponse().collectAccount(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CounterpartyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Counterparty> =
            jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: CounterpartyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Counterparty> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "counterparties")
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

        private val retrieveHandler: Handler<Counterparty> =
            jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: CounterpartyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Counterparty> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "counterparties", params._pathParam(0))
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

        private val updateHandler: Handler<Counterparty> =
            jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: CounterpartyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Counterparty> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "counterparties", params._pathParam(0))
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

        private val listHandler: Handler<List<Counterparty>> =
            jsonHandler<List<Counterparty>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(
            params: CounterpartyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterpartyListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "counterparties")
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
                        CounterpartyListPageAsync.of(
                            CounterpartyServiceAsyncImpl(clientOptions),
                            params,
                            CounterpartyListPageAsync.Response.builder()
                                .items(it)
                                .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                                .afterCursor(
                                    response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                                )
                                .build(),
                        )
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun delete(
            params: CounterpartyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "counterparties", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val collectAccountHandler: Handler<CounterpartyCollectAccountResponse> =
            jsonHandler<CounterpartyCollectAccountResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun collectAccount(
            params: CounterpartyCollectAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterpartyCollectAccountResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "api",
                        "counterparties",
                        params._pathParam(0),
                        "collect_account",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { collectAccountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
