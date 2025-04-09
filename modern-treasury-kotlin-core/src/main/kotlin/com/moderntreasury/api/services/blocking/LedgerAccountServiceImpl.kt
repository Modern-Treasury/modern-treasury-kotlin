// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.LedgerAccount
import com.moderntreasury.api.models.LedgerAccountCreateParams
import com.moderntreasury.api.models.LedgerAccountDeleteParams
import com.moderntreasury.api.models.LedgerAccountListPage
import com.moderntreasury.api.models.LedgerAccountListParams
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams

class LedgerAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerAccountService {

    private val withRawResponse: LedgerAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountService.WithRawResponse = withRawResponse

    override fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions,
    ): LedgerAccount =
        // post /api/ledger_accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerAccount =
        // get /api/ledger_accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions,
    ): LedgerAccount =
        // patch /api/ledger_accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LedgerAccountListParams,
        requestOptions: RequestOptions,
    ): LedgerAccountListPage =
        // get /api/ledger_accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions,
    ): LedgerAccount =
        // delete /api/ledger_accounts/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LedgerAccount> =
            jsonHandler<LedgerAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: LedgerAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "ledger_accounts")
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

        private val retrieveHandler: Handler<LedgerAccount> =
            jsonHandler<LedgerAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_accounts", params._pathParam(0))
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

        private val updateHandler: Handler<LedgerAccount> =
            jsonHandler<LedgerAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LedgerAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "ledger_accounts", params._pathParam(0))
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

        private val listHandler: Handler<List<LedgerAccount>> =
            jsonHandler<List<LedgerAccount>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LedgerAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_accounts")
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
                        LedgerAccountListPage.builder()
                            .service(LedgerAccountServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<LedgerAccount> =
            jsonHandler<LedgerAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: LedgerAccountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "ledger_accounts", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
