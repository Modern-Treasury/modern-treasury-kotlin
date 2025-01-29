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
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPageAsync
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.async.internalAccounts.BalanceReportServiceAsync
import com.moderntreasury.api.services.async.internalAccounts.BalanceReportServiceAsyncImpl

class InternalAccountServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InternalAccountServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val balanceReports: BalanceReportServiceAsync by lazy {
        BalanceReportServiceAsyncImpl(clientOptions)
    }

    override fun balanceReports(): BalanceReportServiceAsync = balanceReports

    private val createHandler: Handler<InternalAccount> =
        jsonHandler<InternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create internal account */
    override suspend fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions
    ): InternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "internal_accounts")
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

    private val retrieveHandler: Handler<InternalAccount> =
        jsonHandler<InternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get internal account */
    override suspend fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions
    ): InternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "internal_accounts", params.getPathParam(0))
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

    private val updateHandler: Handler<InternalAccount> =
        jsonHandler<InternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update internal account */
    override suspend fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions
    ): InternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "internal_accounts", params.getPathParam(0))
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

    private val listHandler: Handler<List<InternalAccount>> =
        jsonHandler<List<InternalAccount>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list internal accounts */
    override suspend fun list(
        params: InternalAccountListParams,
        requestOptions: RequestOptions
    ): InternalAccountListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "internal_accounts")
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
                    InternalAccountListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { InternalAccountListPageAsync.of(this, params, it) }
        }
    }
}
