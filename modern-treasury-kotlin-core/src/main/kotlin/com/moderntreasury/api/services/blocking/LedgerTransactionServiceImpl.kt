// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.LedgerTransaction
import com.moderntreasury.api.models.LedgerTransactionCreateParams
import com.moderntreasury.api.models.LedgerTransactionCreatePartialPostParams
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionListPage
import com.moderntreasury.api.models.LedgerTransactionListParams
import com.moderntreasury.api.models.LedgerTransactionRetrieveParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionService
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionServiceImpl

class LedgerTransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerTransactionService {

    private val withRawResponse: LedgerTransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val versions: VersionService by lazy { VersionServiceImpl(clientOptions) }

    override fun withRawResponse(): LedgerTransactionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerTransactionService =
        LedgerTransactionServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun versions(): VersionService = versions

    override fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions,
    ): LedgerTransaction =
        // post /api/ledger_transactions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerTransaction =
        // get /api/ledger_transactions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions,
    ): LedgerTransaction =
        // patch /api/ledger_transactions/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LedgerTransactionListParams,
        requestOptions: RequestOptions,
    ): LedgerTransactionListPage =
        // get /api/ledger_transactions
        withRawResponse().list(params, requestOptions).parse()

    override fun createPartialPost(
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions,
    ): LedgerTransaction =
        // post /api/ledger_transactions/{id}/partial_post
        withRawResponse().createPartialPost(params, requestOptions).parse()

    override fun createReversal(
        params: LedgerTransactionCreateReversalParams,
        requestOptions: RequestOptions,
    ): LedgerTransaction =
        // post /api/ledger_transactions/{id}/reversal
        withRawResponse().createReversal(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerTransactionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val versions: VersionService.WithRawResponse by lazy {
            VersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerTransactionService.WithRawResponse =
            LedgerTransactionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun versions(): VersionService.WithRawResponse = versions

        private val createHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper)

        override fun create(
            params: LedgerTransactionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_transactions")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LedgerTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_transactions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper)

        override fun update(
            params: LedgerTransactionUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_transactions", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<List<LedgerTransaction>> =
            jsonHandler<List<LedgerTransaction>>(clientOptions.jsonMapper)

        override fun list(
            params: LedgerTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransactionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_transactions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        LedgerTransactionListPage.builder()
                            .service(LedgerTransactionServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }

        private val createPartialPostHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper)

        override fun createPartialPost(
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "ledger_transactions",
                        params._pathParam(0),
                        "partial_post",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createPartialPostHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createReversalHandler: Handler<LedgerTransaction> =
            jsonHandler<LedgerTransaction>(clientOptions.jsonMapper)

        override fun createReversal(
            params: LedgerTransactionCreateReversalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_transactions", params._pathParam(0), "reversal")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createReversalHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
