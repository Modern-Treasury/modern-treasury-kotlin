// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCollectAccountResponse
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyDeleteParams
import com.moderntreasury.api.models.CounterpartyListPage
import com.moderntreasury.api.models.CounterpartyListParams
import com.moderntreasury.api.models.CounterpartyRetrieveParams
import com.moderntreasury.api.models.CounterpartyUpdateParams

class CounterpartyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CounterpartyService {

    private val withRawResponse: CounterpartyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CounterpartyService.WithRawResponse = withRawResponse

    override fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions,
    ): Counterparty =
        // post /api/counterparties
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions,
    ): Counterparty =
        // get /api/counterparties/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions,
    ): Counterparty =
        // patch /api/counterparties/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CounterpartyListParams,
        requestOptions: RequestOptions,
    ): CounterpartyListPage =
        // get /api/counterparties
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: CounterpartyDeleteParams, requestOptions: RequestOptions) {
        // delete /api/counterparties/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override fun collectAccount(
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions,
    ): CounterpartyCollectAccountResponse =
        // post /api/counterparties/{id}/collect_account
        withRawResponse().collectAccount(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CounterpartyService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Counterparty> =
            jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CounterpartyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Counterparty> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "counterparties")
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

        private val retrieveHandler: Handler<Counterparty> =
            jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CounterpartyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Counterparty> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "counterparties", params._pathParam(0))
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

        private val updateHandler: Handler<Counterparty> =
            jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CounterpartyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Counterparty> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "counterparties", params._pathParam(0))
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

        private val listHandler: Handler<List<Counterparty>> =
            jsonHandler<List<Counterparty>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: CounterpartyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterpartyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "counterparties")
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
                        CounterpartyListPage.of(
                            CounterpartyServiceImpl(clientOptions),
                            params,
                            response.headers(),
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: CounterpartyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "counterparties", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val collectAccountHandler: Handler<CounterpartyCollectAccountResponse> =
            jsonHandler<CounterpartyCollectAccountResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun collectAccount(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
