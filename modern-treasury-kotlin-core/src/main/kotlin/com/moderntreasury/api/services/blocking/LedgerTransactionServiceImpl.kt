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
import com.moderntreasury.api.models.LedgerTransaction
import com.moderntreasury.api.models.LedgerTransactionCreateParams
import com.moderntreasury.api.models.LedgerTransactionCreatePartialPostParams
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionListPage
import com.moderntreasury.api.models.LedgerTransactionListParams
import com.moderntreasury.api.models.LedgerTransactionRetrieveParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionService
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionServiceImpl

class LedgerTransactionServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LedgerTransactionService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val versions: VersionService by lazy { VersionServiceImpl(clientOptions) }

    override fun versions(): VersionService = versions

    private val createHandler: Handler<LedgerTransaction> =
        jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a ledger transaction. */
    override fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions
    ): LedgerTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_transactions")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
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

    private val retrieveHandler: Handler<LedgerTransaction> =
        jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single ledger transaction. */
    override fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions
    ): LedgerTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_transactions", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
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

    private val updateHandler: Handler<LedgerTransaction> =
        jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the details of a ledger transaction. */
    override fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions
    ): LedgerTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "ledger_transactions", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
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

    private val listHandler: Handler<List<LedgerTransaction>> =
        jsonHandler<List<LedgerTransaction>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of ledger transactions. */
    override fun list(
        params: LedgerTransactionListParams,
        requestOptions: RequestOptions
    ): LedgerTransactionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_transactions")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
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
                    LedgerTransactionListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { LedgerTransactionListPage.of(this, params, it) }
        }
    }

    private val createPartialPostHandler: Handler<LedgerTransaction> =
        jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a ledger transaction that partially posts another ledger transaction. */
    override fun createPartialPost(
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions
    ): LedgerTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "api",
                    "ledger_transactions",
                    params.getPathParam(0),
                    "partial_post"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createPartialPostHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val createReversalHandler: Handler<LedgerTransaction> =
        jsonHandler<LedgerTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a ledger transaction reversal. */
    override fun createReversal(
        params: LedgerTransactionCreateReversalParams,
        requestOptions: RequestOptions
    ): LedgerTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_transactions", params.getPathParam(0), "reversal")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createReversalHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
