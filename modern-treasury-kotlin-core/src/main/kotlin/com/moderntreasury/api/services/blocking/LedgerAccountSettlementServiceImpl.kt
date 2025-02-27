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

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val accountEntries: AccountEntryService by lazy {
        AccountEntryServiceImpl(clientOptions)
    }

    override fun accountEntries(): AccountEntryService = accountEntries

    private val createHandler: Handler<LedgerAccountSettlement> =
        jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a ledger account settlement. */
    override fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountSettlement {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_account_settlements")
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

    private val retrieveHandler: Handler<LedgerAccountSettlement> =
        jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get details on a single ledger account settlement. */
    override fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerAccountSettlement {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_settlements", params.getPathParam(0))
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

    private val updateHandler: Handler<LedgerAccountSettlement> =
        jsonHandler<LedgerAccountSettlement>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update the details of a ledger account settlement. */
    override fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountSettlement {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "ledger_account_settlements", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<List<LedgerAccountSettlement>> =
        jsonHandler<List<LedgerAccountSettlement>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of ledger account settlements. */
    override fun list(
        params: LedgerAccountSettlementListParams,
        requestOptions: RequestOptions,
    ): LedgerAccountSettlementListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_settlements")
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
                LedgerAccountSettlementListPage.of(
                    this,
                    params,
                    LedgerAccountSettlementListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }
}
