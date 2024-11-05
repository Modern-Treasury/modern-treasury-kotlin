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
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPage
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams

class LedgerAccountBalanceMonitorServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LedgerAccountBalanceMonitorService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LedgerAccountBalanceMonitor> =
        jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a ledger account balance monitor. */
    override fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitor {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_account_balance_monitors")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitor {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_balance_monitors", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitor {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "ledger_account_balance_monitors", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    override fun list(
        params: LedgerAccountBalanceMonitorListParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitorListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_balance_monitors")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    LedgerAccountBalanceMonitorListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { LedgerAccountBalanceMonitorListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<LedgerAccountBalanceMonitor> =
        jsonHandler<LedgerAccountBalanceMonitor>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Delete a ledger account balance monitor. */
    override fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions
    ): LedgerAccountBalanceMonitor {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "ledger_account_balance_monitors", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
