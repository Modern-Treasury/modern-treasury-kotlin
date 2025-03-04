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
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.Ledger
import com.moderntreasury.api.models.LedgerCreateParams
import com.moderntreasury.api.models.LedgerDeleteParams
import com.moderntreasury.api.models.LedgerListPage
import com.moderntreasury.api.models.LedgerListParams
import com.moderntreasury.api.models.LedgerRetrieveParams
import com.moderntreasury.api.models.LedgerUpdateParams

class LedgerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerService {

    private val withRawResponse: LedgerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerService.WithRawResponse = withRawResponse

    override fun create(params: LedgerCreateParams, requestOptions: RequestOptions): Ledger =
        // post /api/ledgers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: LedgerRetrieveParams, requestOptions: RequestOptions): Ledger =
        // get /api/ledgers/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: LedgerUpdateParams, requestOptions: RequestOptions): Ledger =
        // patch /api/ledgers/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: LedgerListParams, requestOptions: RequestOptions): LedgerListPage =
        // get /api/ledgers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: LedgerDeleteParams, requestOptions: RequestOptions): Ledger =
        // delete /api/ledgers/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerService.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Ledger> =
            jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: LedgerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Ledger> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "ledgers")
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

        private val retrieveHandler: Handler<Ledger> =
            jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Ledger> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledgers", params.getPathParam(0))
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

        private val updateHandler: Handler<Ledger> =
            jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LedgerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Ledger> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "ledgers", params.getPathParam(0))
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

        private val listHandler: Handler<List<Ledger>> =
            jsonHandler<List<Ledger>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: LedgerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledgers")
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
                        LedgerListPage.of(
                            LedgerServiceImpl(clientOptions),
                            params,
                            LedgerListPage.Response.builder()
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

        private val deleteHandler: Handler<Ledger> =
            jsonHandler<Ledger>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: LedgerDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Ledger> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "ledgers", params.getPathParam(0))
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
