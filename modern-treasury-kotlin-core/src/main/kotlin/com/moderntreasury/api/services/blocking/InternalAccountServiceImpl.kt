// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.InternalAccount
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListPage
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateAccountCapabilityParams
import com.moderntreasury.api.models.InternalAccountUpdateAccountCapabilityResponse
import com.moderntreasury.api.models.InternalAccountUpdateParams
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportService
import com.moderntreasury.api.services.blocking.internalAccounts.BalanceReportServiceImpl

class InternalAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InternalAccountService {

    private val withRawResponse: InternalAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val balanceReports: BalanceReportService by lazy {
        BalanceReportServiceImpl(clientOptions)
    }

    override fun withRawResponse(): InternalAccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InternalAccountService =
        InternalAccountServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun balanceReports(): BalanceReportService = balanceReports

    override fun create(
        params: InternalAccountCreateParams,
        requestOptions: RequestOptions,
    ): InternalAccount =
        // post /api/internal_accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: InternalAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): InternalAccount =
        // get /api/internal_accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: InternalAccountUpdateParams,
        requestOptions: RequestOptions,
    ): InternalAccount =
        // patch /api/internal_accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: InternalAccountListParams,
        requestOptions: RequestOptions,
    ): InternalAccountListPage =
        // get /api/internal_accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun updateAccountCapability(
        params: InternalAccountUpdateAccountCapabilityParams,
        requestOptions: RequestOptions,
    ): InternalAccountUpdateAccountCapabilityResponse =
        // patch /api/internal_accounts/{internal_account_id}/account_capabilities/{id}
        withRawResponse().updateAccountCapability(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InternalAccountService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val balanceReports: BalanceReportService.WithRawResponse by lazy {
            BalanceReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InternalAccountService.WithRawResponse =
            InternalAccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        override fun balanceReports(): BalanceReportService.WithRawResponse = balanceReports

        private val createHandler: Handler<InternalAccount> =
            jsonHandler<InternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: InternalAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "internal_accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<InternalAccount> =
            jsonHandler<InternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: InternalAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "internal_accounts", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateHandler: Handler<InternalAccount> =
            jsonHandler<InternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: InternalAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "internal_accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<List<InternalAccount>> =
            jsonHandler<List<InternalAccount>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: InternalAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "internal_accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        InternalAccountListPage.builder()
                            .service(InternalAccountServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }

        private val updateAccountCapabilityHandler:
            Handler<InternalAccountUpdateAccountCapabilityResponse> =
            jsonHandler<InternalAccountUpdateAccountCapabilityResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateAccountCapability(
            params: InternalAccountUpdateAccountCapabilityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccountUpdateAccountCapabilityResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        "internal_accounts",
                        params._pathParam(0),
                        "account_capabilities",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateAccountCapabilityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
