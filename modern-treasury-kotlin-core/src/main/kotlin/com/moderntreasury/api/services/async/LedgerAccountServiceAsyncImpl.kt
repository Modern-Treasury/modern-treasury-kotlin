// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.handlers.errorBodyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.LedgerAccount
import com.moderntreasury.api.models.LedgerAccountCreateParams
import com.moderntreasury.api.models.LedgerAccountDeleteParams
import com.moderntreasury.api.models.LedgerAccountListPageAsync
import com.moderntreasury.api.models.LedgerAccountListParams
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams

class LedgerAccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerAccountServiceAsync {

    private val withRawResponse: LedgerAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerAccountServiceAsync =
        LedgerAccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions,
    ): LedgerAccount =
        // post /api/ledger_accounts
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerAccount =
        // get /api/ledger_accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions,
    ): LedgerAccount =
        // patch /api/ledger_accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: LedgerAccountListParams,
        requestOptions: RequestOptions,
    ): LedgerAccountListPageAsync =
        // get /api/ledger_accounts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions,
    ): LedgerAccount =
        // delete /api/ledger_accounts/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerAccountServiceAsync.WithRawResponse =
            LedgerAccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<LedgerAccount> =
            jsonHandler<LedgerAccount>(clientOptions.jsonMapper)

        override suspend fun create(
            params: LedgerAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<LedgerAccount> =
            jsonHandler<LedgerAccount>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: LedgerAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_accounts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<LedgerAccount> =
            jsonHandler<LedgerAccount>(clientOptions.jsonMapper)

        override suspend fun update(
            params: LedgerAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<LedgerAccount>> =
            jsonHandler<List<LedgerAccount>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: LedgerAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        LedgerAccountListPageAsync.builder()
                            .service(LedgerAccountServiceAsyncImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<LedgerAccount> =
            jsonHandler<LedgerAccount>(clientOptions.jsonMapper)

        override suspend fun delete(
            params: LedgerAccountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_accounts", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
