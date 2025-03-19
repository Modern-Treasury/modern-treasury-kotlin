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
import com.moderntreasury.api.models.ExternalAccount
import com.moderntreasury.api.models.ExternalAccountCompleteVerificationParams
import com.moderntreasury.api.models.ExternalAccountCreateParams
import com.moderntreasury.api.models.ExternalAccountDeleteParams
import com.moderntreasury.api.models.ExternalAccountListPageAsync
import com.moderntreasury.api.models.ExternalAccountListParams
import com.moderntreasury.api.models.ExternalAccountRetrieveParams
import com.moderntreasury.api.models.ExternalAccountUpdateParams
import com.moderntreasury.api.models.ExternalAccountVerifyParams
import com.moderntreasury.api.models.ExternalAccountVerifyResponse

class ExternalAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalAccountServiceAsync {

    private val withRawResponse: ExternalAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalAccountServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        // post /api/external_accounts
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        // get /api/external_accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        // patch /api/external_accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions,
    ): ExternalAccountListPageAsync =
        // get /api/external_accounts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /api/external_accounts/{id}
        withRawResponse().delete(params, requestOptions)
    }

    override suspend fun completeVerification(
        params: ExternalAccountCompleteVerificationParams,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        // post /api/external_accounts/{id}/complete_verification
        withRawResponse().completeVerification(params, requestOptions).parse()

    override suspend fun verify(
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions,
    ): ExternalAccountVerifyResponse =
        // post /api/external_accounts/{id}/verify
        withRawResponse().verify(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "external_accounts")
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

        private val retrieveHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "external_accounts", params._pathParam(0))
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

        private val updateHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "external_accounts", params._pathParam(0))
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

        private val listHandler: Handler<List<ExternalAccount>> =
            jsonHandler<List<ExternalAccount>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ExternalAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccountListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "external_accounts")
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
                        ExternalAccountListPageAsync.of(
                            ExternalAccountServiceAsyncImpl(clientOptions),
                            params,
                            ExternalAccountListPageAsync.Response.builder()
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
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "external_accounts", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }

        private val completeVerificationHandler: Handler<ExternalAccount> =
            jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun completeVerification(
            params: ExternalAccountCompleteVerificationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "api",
                        "external_accounts",
                        params._pathParam(0),
                        "complete_verification",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { completeVerificationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val verifyHandler: Handler<ExternalAccountVerifyResponse> =
            jsonHandler<ExternalAccountVerifyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun verify(
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccountVerifyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "external_accounts", params._pathParam(0), "verify")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { verifyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
