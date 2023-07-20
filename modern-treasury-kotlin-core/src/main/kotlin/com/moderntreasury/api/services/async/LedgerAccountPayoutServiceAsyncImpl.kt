package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerAccountPayout
import com.moderntreasury.api.models.LedgerAccountPayoutCreateParams
import com.moderntreasury.api.models.LedgerAccountPayoutListPageAsync
import com.moderntreasury.api.models.LedgerAccountPayoutListParams
import com.moderntreasury.api.models.LedgerAccountPayoutRetireveParams
import com.moderntreasury.api.models.LedgerAccountPayoutUpdateParams
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.json
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class LedgerAccountPayoutServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LedgerAccountPayoutServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LedgerAccountPayout> =
        jsonHandler<LedgerAccountPayout>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a ledger account payout. */
    override suspend fun create(
        params: LedgerAccountPayoutCreateParams,
        requestOptions: RequestOptions
    ): LedgerAccountPayout {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_account_payouts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<LedgerAccountPayout> =
        jsonHandler<LedgerAccountPayout>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the details of a ledger account payout. */
    override suspend fun update(
        params: LedgerAccountPayoutUpdateParams,
        requestOptions: RequestOptions
    ): LedgerAccountPayout {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "ledger_account_payouts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<LedgerAccountPayout>> =
        jsonHandler<List<LedgerAccountPayout>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of ledger account payouts. */
    override suspend fun list(
        params: LedgerAccountPayoutListParams,
        requestOptions: RequestOptions
    ): LedgerAccountPayoutListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_payouts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    LedgerAccountPayoutListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { LedgerAccountPayoutListPageAsync.of(this, params, it) }
        }
    }

    private val retireveHandler: Handler<LedgerAccountPayout> =
        jsonHandler<LedgerAccountPayout>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single ledger account payout. */
    override suspend fun retireve(
        params: LedgerAccountPayoutRetireveParams,
        requestOptions: RequestOptions
    ): LedgerAccountPayout {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_payouts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retireveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
