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
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.BalanceReport
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportListPageAsync
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams

class BalanceReportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceReportServiceAsync {

    private val withRawResponse: BalanceReportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceReportServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: BalanceReportCreateParams,
        requestOptions: RequestOptions,
    ): BalanceReport =
        // post /api/internal_accounts/{internal_account_id}/balance_reports
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions,
    ): BalanceReport =
        // get /api/internal_accounts/{internal_account_id}/balance_reports/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: BalanceReportListParams,
        requestOptions: RequestOptions,
    ): BalanceReportListPageAsync =
        // get /api/internal_accounts/{internal_account_id}/balance_reports
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(params: BalanceReportDeleteParams, requestOptions: RequestOptions) {
        // delete /api/internal_accounts/{internal_account_id}/balance_reports/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceReportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BalanceReport> =
            jsonHandler<BalanceReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: BalanceReportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceReport> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "api",
                        "internal_accounts",
                        params._pathParam(0),
                        "balance_reports",
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

        private val retrieveHandler: Handler<BalanceReport> =
            jsonHandler<BalanceReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: BalanceReportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceReport> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "internal_accounts",
                        params._pathParam(0),
                        "balance_reports",
                        params._pathParam(1),
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

        private val listHandler: Handler<List<BalanceReport>> =
            jsonHandler<List<BalanceReport>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: BalanceReportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceReportListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        "internal_accounts",
                        params._pathParam(0),
                        "balance_reports",
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
                        BalanceReportListPageAsync.of(
                            BalanceReportServiceAsyncImpl(clientOptions),
                            params,
                            BalanceReportListPageAsync.Response.builder()
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
            params: BalanceReportDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "api",
                        "internal_accounts",
                        params._pathParam(0),
                        "balance_reports",
                        params._pathParam(1),
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
