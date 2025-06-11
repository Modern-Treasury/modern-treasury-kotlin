// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

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
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.VirtualAccount
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountDeleteParams
import com.moderntreasury.api.models.VirtualAccountListPageAsync
import com.moderntreasury.api.models.VirtualAccountListParams
import com.moderntreasury.api.models.VirtualAccountRetrieveParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams

class VirtualAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : VirtualAccountServiceAsync {

    private val withRawResponse: VirtualAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VirtualAccountServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions,
    ): VirtualAccount =
        // post /api/virtual_accounts
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): VirtualAccount =
        // get /api/virtual_accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions,
    ): VirtualAccount =
        // patch /api/virtual_accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: VirtualAccountListParams,
        requestOptions: RequestOptions,
    ): VirtualAccountListPageAsync =
        // get /api/virtual_accounts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions,
    ): VirtualAccount =
        // delete /api/virtual_accounts/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VirtualAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<VirtualAccount> =
            jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: VirtualAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_accounts")
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

        private val retrieveHandler: Handler<VirtualAccount> =
            jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: VirtualAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_accounts", params._pathParam(0))
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

        private val updateHandler: Handler<VirtualAccount> =
            jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: VirtualAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_accounts", params._pathParam(0))
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

        private val listHandler: Handler<List<VirtualAccount>> =
            jsonHandler<List<VirtualAccount>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: VirtualAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccountListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_accounts")
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
                        VirtualAccountListPageAsync.builder()
                            .service(VirtualAccountServiceAsyncImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<VirtualAccount> =
            jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun delete(
            params: VirtualAccountDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_accounts", params._pathParam(0))
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
    }
}
