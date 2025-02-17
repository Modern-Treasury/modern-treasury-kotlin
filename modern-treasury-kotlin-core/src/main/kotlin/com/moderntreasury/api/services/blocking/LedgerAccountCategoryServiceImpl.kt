// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerAccountCategory
import com.moderntreasury.api.models.LedgerAccountCategoryAddLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryAddNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryCreateParams
import com.moderntreasury.api.models.LedgerAccountCategoryDeleteParams
import com.moderntreasury.api.models.LedgerAccountCategoryListPage
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams

class LedgerAccountCategoryServiceImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerAccountCategoryService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LedgerAccountCategory> =
        jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a ledger account category. */
    override fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledger_account_categories")
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

    private val retrieveHandler: Handler<LedgerAccountCategory> =
        jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the details on a single ledger account category. */
    override fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_categories", params.getPathParam(0))
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

    private val updateHandler: Handler<LedgerAccountCategory> =
        jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the details of a ledger account category. */
    override fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "ledger_account_categories", params.getPathParam(0))
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

    private val listHandler: Handler<List<LedgerAccountCategory>> =
        jsonHandler<List<LedgerAccountCategory>>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get a list of ledger account categories. */
    override fun list(
        params: LedgerAccountCategoryListParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategoryListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledger_account_categories")
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
                LedgerAccountCategoryListPage.of(
                    this,
                    params,
                    LedgerAccountCategoryListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }

    private val deleteHandler: Handler<LedgerAccountCategory> =
        jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a ledger account category. */
    override fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "ledger_account_categories", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val addLedgerAccountHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Add a ledger account to a ledger account category. */
    override fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "api",
                    "ledger_account_categories",
                    params.getPathParam(0),
                    "ledger_accounts",
                    params.getPathParam(1),
                )
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { addLedgerAccountHandler.handle(it) }
    }

    private val addNestedCategoryHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Add a ledger account category to a ledger account category. */
    override fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "api",
                    "ledger_account_categories",
                    params.getPathParam(0),
                    "ledger_account_categories",
                    params.getPathParam(1),
                )
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { addNestedCategoryHandler.handle(it) }
    }

    private val removeLedgerAccountHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Remove a ledger account from a ledger account category. */
    override fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "api",
                    "ledger_account_categories",
                    params.getPathParam(0),
                    "ledger_accounts",
                    params.getPathParam(1),
                )
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { removeLedgerAccountHandler.handle(it) }
    }

    private val removeNestedCategoryHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Delete a ledger account category from a ledger account category. */
    override fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "api",
                    "ledger_account_categories",
                    params.getPathParam(0),
                    "ledger_account_categories",
                    params.getPathParam(1),
                )
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { removeNestedCategoryHandler.handle(it) }
    }
}
