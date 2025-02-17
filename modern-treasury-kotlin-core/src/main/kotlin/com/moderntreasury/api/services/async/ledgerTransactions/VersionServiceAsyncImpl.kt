// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.ledgerTransactions

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerTransactionVersion
import com.moderntreasury.api.models.LedgerTransactionVersionListPageAsync
import com.moderntreasury.api.models.LedgerTransactionVersionListParams

class VersionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VersionServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<LedgerTransactionVersion>> =
        jsonHandler<List<LedgerTransactionVersion>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of ledger transaction versions. */
    override suspend fun list(
        params: LedgerTransactionVersionListParams,
        requestOptions: RequestOptions,
    ): LedgerTransactionVersionListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_transaction_versions")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.forEach { it.validate() }
                }
            }
            .let {
                LedgerTransactionVersionListPageAsync.of(
                    this,
                    params,
                    LedgerTransactionVersionListPageAsync.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }
}
