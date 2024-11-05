// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.internalAccounts

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.emptyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.json
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.BalanceReport
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportListPageAsync
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams

class BalanceReportServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BalanceReportServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BalanceReport> =
        jsonHandler<BalanceReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create balance reports */
    override suspend fun create(
        params: BalanceReportCreateParams,
        requestOptions: RequestOptions
    ): BalanceReport {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "api",
                    "internal_accounts",
                    params.getPathParam(0),
                    "balance_reports"
                )
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<BalanceReport> =
        jsonHandler<BalanceReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a single balance report for a given internal account. */
    override suspend fun retrieve(
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions
    ): BalanceReport {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "internal_accounts",
                    params.getPathParam(0),
                    "balance_reports",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
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

    private val listHandler: Handler<List<BalanceReport>> =
        jsonHandler<List<BalanceReport>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get all balance reports for a given internal account. */
    override suspend fun list(
        params: BalanceReportListParams,
        requestOptions: RequestOptions
    ): BalanceReportListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    "internal_accounts",
                    params.getPathParam(0),
                    "balance_reports"
                )
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
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
                    BalanceReportListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { BalanceReportListPageAsync.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Deletes a given balance report. */
    override suspend fun delete(params: BalanceReportDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "api",
                    "internal_accounts",
                    params.getPathParam(0),
                    "balance_reports",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}
