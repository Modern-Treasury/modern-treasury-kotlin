// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPageAsync
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams

class LedgerAccountBalanceMonitorServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LedgerAccountBalanceMonitorServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LedgerAccountBalanceMonitor> =
        jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a ledger account balance monitor. */
    override suspend fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitor {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_account_balance_monitors")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
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

    private val retrieveHandler: Handler<LedgerAccountBalanceMonitor> =
        jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get details on a single ledger account balance monitor. */
    override suspend fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitor {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_balance_monitors", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<LedgerAccountBalanceMonitor> =
        jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update a ledger account balance monitor. */
    override suspend fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitor {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "ledger_account_balance_monitors", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
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

    private val listHandler: Handler<List<LedgerAccountBalanceMonitor>> =
        jsonHandler<List<LedgerAccountBalanceMonitor>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of ledger account balance monitors. */
    override suspend fun list(
        params: LedgerAccountBalanceMonitorListParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitorListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_balance_monitors")
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    LedgerAccountBalanceMonitorListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { LedgerAccountBalanceMonitorListPageAsync.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<LedgerAccountBalanceMonitor> =
        jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete a ledger account balance monitor. */
    override suspend fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitor {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "ledger_account_balance_monitors", params.getPathParam(0))
                .apply { params._body()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { deleteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
