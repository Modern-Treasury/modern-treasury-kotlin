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
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementCreateResponse
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveResponse

class LedgerAccountStatementServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LedgerAccountStatementService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LedgerAccountStatementCreateResponse> =
        jsonHandler<LedgerAccountStatementCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a ledger account statement. */
    override fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions
    ): LedgerAccountStatementCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_account_statements")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
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

    private val retrieveHandler: Handler<LedgerAccountStatementRetrieveResponse> =
        jsonHandler<LedgerAccountStatementRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get details on a single ledger account statement. */
    override fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions
    ): LedgerAccountStatementRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_statements", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
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
}
