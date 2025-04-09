// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.emptyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.LedgerAccountCategory
import com.moderntreasury.api.models.LedgerAccountCategoryAddLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryAddNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryCreateParams
import com.moderntreasury.api.models.LedgerAccountCategoryDeleteParams
import com.moderntreasury.api.models.LedgerAccountCategoryListPageAsync
import com.moderntreasury.api.models.LedgerAccountCategoryListParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveLedgerAccountParams
import com.moderntreasury.api.models.LedgerAccountCategoryRemoveNestedCategoryParams
import com.moderntreasury.api.models.LedgerAccountCategoryRetrieveParams
import com.moderntreasury.api.models.LedgerAccountCategoryUpdateParams

class LedgerAccountCategoryServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerAccountCategoryServiceAsync {

    private val withRawResponse: LedgerAccountCategoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountCategoryServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun create(
        params: LedgerAccountCategoryCreateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory =
        // post /api/ledger_account_categories
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LedgerAccountCategoryRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory =
        // get /api/ledger_account_categories/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: LedgerAccountCategoryUpdateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory =
        // patch /api/ledger_account_categories/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: LedgerAccountCategoryListParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategoryListPageAsync =
        // get /api/ledger_account_categories
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: LedgerAccountCategoryDeleteParams,
        requestOptions: RequestOptions,
    ): LedgerAccountCategory =
        // delete /api/ledger_account_categories/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override suspend fun addLedgerAccount(
        params: LedgerAccountCategoryAddLedgerAccountParams,
        requestOptions: RequestOptions,
    ) {
        // put /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}
        withRawResponse().addLedgerAccount(params, requestOptions)
    }

    override suspend fun addNestedCategory(
        params: LedgerAccountCategoryAddNestedCategoryParams,
        requestOptions: RequestOptions,
    ) {
        // put /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}
        withRawResponse().addNestedCategory(params, requestOptions)
    }

    override suspend fun removeLedgerAccount(
        params: LedgerAccountCategoryRemoveLedgerAccountParams,
        requestOptions: RequestOptions,
    ) {
        // delete /api/ledger_account_categories/{id}/ledger_accounts/{ledger_account_id}
        withRawResponse().removeLedgerAccount(params, requestOptions)
    }

    override suspend fun removeNestedCategory(
        params: LedgerAccountCategoryRemoveNestedCategoryParams,
        requestOptions: RequestOptions,
    ) {
        // delete /api/ledger_account_categories/{id}/ledger_account_categories/{sub_category_id}
        withRawResponse().removeNestedCategory(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountCategoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: LedgerAccountCategoryCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "ledger_account_categories")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: LedgerAccountCategoryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_account_categories", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun update(
            params: LedgerAccountCategoryUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "ledger_account_categories", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<LedgerAccountCategory>> =
            jsonHandler<List<LedgerAccountCategory>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: LedgerAccountCategoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategoryListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_account_categories")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        LedgerAccountCategoryListPageAsync.of(
                            LedgerAccountCategoryServiceAsyncImpl(clientOptions),
                            params,
                            response.headers(),
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<LedgerAccountCategory> =
            jsonHandler<LedgerAccountCategory>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun delete(
            params: LedgerAccountCategoryDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountCategory> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "ledger_account_categories", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addLedgerAccountHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun addLedgerAccount(
            params: LedgerAccountCategoryAddLedgerAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "api",
                        "ledger_account_categories",
                        params._pathParam(0),
                        "ledger_accounts",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { addLedgerAccountHandler.handle(it) } }
        }

        private val addNestedCategoryHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun addNestedCategory(
            params: LedgerAccountCategoryAddNestedCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "api",
                        "ledger_account_categories",
                        params._pathParam(0),
                        "ledger_account_categories",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { addNestedCategoryHandler.handle(it) } }
        }

        private val removeLedgerAccountHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun removeLedgerAccount(
            params: LedgerAccountCategoryRemoveLedgerAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "api",
                        "ledger_account_categories",
                        params._pathParam(0),
                        "ledger_accounts",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { removeLedgerAccountHandler.handle(it) } }
        }

        private val removeNestedCategoryHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override suspend fun removeNestedCategory(
            params: LedgerAccountCategoryRemoveNestedCategoryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "api",
                        "ledger_account_categories",
                        params._pathParam(0),
                        "ledger_account_categories",
                        params._pathParam(1),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { removeNestedCategoryHandler.handle(it) } }
        }
    }
}
