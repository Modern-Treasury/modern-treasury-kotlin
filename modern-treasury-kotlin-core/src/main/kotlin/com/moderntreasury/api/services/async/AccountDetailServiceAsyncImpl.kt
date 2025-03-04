// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
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
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.AccountDetail
import com.moderntreasury.api.models.AccountDetailCreateParams
import com.moderntreasury.api.models.AccountDetailDeleteParams
import com.moderntreasury.api.models.AccountDetailListPageAsync
import com.moderntreasury.api.models.AccountDetailListParams
import com.moderntreasury.api.models.AccountDetailRetrieveParams

class AccountDetailServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountDetailServiceAsync {

    private val withRawResponse: AccountDetailServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountDetailServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: AccountDetailCreateParams,
        requestOptions: RequestOptions,
    ): AccountDetail =
        // post /api/{accounts_type}/{account_id}/account_details
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AccountDetailRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountDetail =
        // get /api/{accounts_type}/{account_id}/account_details/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: AccountDetailListParams,
        requestOptions: RequestOptions,
    ): AccountDetailListPageAsync =
        // get /api/{accounts_type}/{account_id}/account_details
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: AccountDetailDeleteParams, requestOptions: RequestOptions) {
        // delete /api/{accounts_type}/{account_id}/account_details/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountDetailServiceAsync.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AccountDetail> =
            jsonHandler<AccountDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: AccountDetailCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountDetail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "api",
                        params.getPathParam(0),
                        params.getPathParam(1),
                        "account_details",
                    )
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

        private val retrieveHandler: Handler<AccountDetail> =
            jsonHandler<AccountDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: AccountDetailRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountDetail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        params.getPathParam(0),
                        params.getPathParam(1),
                        "account_details",
                        params.getPathParam(2),
                    )
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

        private val listHandler: Handler<List<AccountDetail>> =
            jsonHandler<List<AccountDetail>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: AccountDetailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountDetailListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        params.getPathParam(0),
                        params.getPathParam(1),
                        "account_details",
                    )
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
                        AccountDetailListPageAsync.of(
                            AccountDetailServiceAsyncImpl(clientOptions),
                            params,
                            AccountDetailListPageAsync.Response.builder()
                                .items(it)
                                .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                                .afterCursor(
                                    response.headers().values("X-After-Cursor").getOrNull(0) ?: ""
                                )
                                .build(),
                        )
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override suspend fun delete(
            params: AccountDetailDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "api",
                        params.getPathParam(0),
                        params.getPathParam(1),
                        "account_details",
                        params.getPathParam(2),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
