// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPage
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import com.moderntreasury.api.services.blocking.ledgerAccountSettlements.AccountEntryService
import com.moderntreasury.api.services.blocking.ledgerAccountSettlements.AccountEntryServiceImpl

class LedgerAccountSettlementServiceImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerAccountSettlementService {

    private val withRawResponse: LedgerAccountSettlementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accountEntries: AccountEntryService by lazy {
        AccountEntryServiceImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountSettlementService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): LedgerAccountSettlementService =
        LedgerAccountSettlementServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun accountEntries(): AccountEntryService = accountEntries

    override fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountSettlement =
        // post /api/ledger_account_settlements
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerAccountSettlement =
        // get /api/ledger_account_settlements/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountSettlement =
        // patch /api/ledger_account_settlements/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LedgerAccountSettlementListParams,
        requestOptions: RequestOptions,
    ): LedgerAccountSettlementListPage =
        // get /api/ledger_account_settlements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountSettlementService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val accountEntries: AccountEntryService.WithRawResponse by lazy {
            AccountEntryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerAccountSettlementService.WithRawResponse =
            LedgerAccountSettlementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun accountEntries(): AccountEntryService.WithRawResponse = accountEntries

        private val createHandler: Handler<LedgerAccountSettlement> =
            jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: LedgerAccountSettlementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountSettlement> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_settlements")
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

        private val retrieveHandler: Handler<LedgerAccountSettlement> =
            jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerAccountSettlementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountSettlement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_settlements", params._pathParam(0))
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

        private val updateHandler: Handler<LedgerAccountSettlement> =
            jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: LedgerAccountSettlementUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountSettlement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_settlements", params._pathParam(0))
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

        private val listHandler: Handler<List<LedgerAccountSettlement>> =
            jsonHandler<List<LedgerAccountSettlement>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LedgerAccountSettlementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountSettlementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_settlements")
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
                        LedgerAccountSettlementListPage.builder()
                            .service(LedgerAccountSettlementServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
