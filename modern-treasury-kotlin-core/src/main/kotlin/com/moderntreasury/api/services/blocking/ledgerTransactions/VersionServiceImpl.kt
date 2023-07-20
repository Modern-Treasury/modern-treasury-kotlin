package com.moderntreasury.api.services.blocking.ledgerTransactions

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerTransactionVersion
import com.moderntreasury.api.models.LedgerTransactionVersionListPage
import com.moderntreasury.api.models.LedgerTransactionVersionListParams
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class VersionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : VersionService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<List<LedgerTransactionVersion>> =
        jsonHandler<List<LedgerTransactionVersion>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of ledger transaction versions. */
    override fun list(
        params: LedgerTransactionVersionListParams,
        requestOptions: RequestOptions
    ): LedgerTransactionVersionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_transaction_versions")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
                    LedgerTransactionVersionListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { LedgerTransactionVersionListPage.of(this, params, it) }
        }
    }
}
