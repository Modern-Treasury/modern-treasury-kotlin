// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.handlers.errorBodyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.AccountCollectionFlow
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowListPageAsync
import com.moderntreasury.api.models.AccountCollectionFlowListParams
import com.moderntreasury.api.models.AccountCollectionFlowRetrieveParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams

class AccountCollectionFlowServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AccountCollectionFlowServiceAsync {

    private val withRawResponse: AccountCollectionFlowServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountCollectionFlowServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): AccountCollectionFlowServiceAsync =
        AccountCollectionFlowServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: AccountCollectionFlowCreateParams,
        requestOptions: RequestOptions,
    ): AccountCollectionFlow =
        // post /api/account_collection_flows
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AccountCollectionFlowRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountCollectionFlow =
        // get /api/account_collection_flows/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AccountCollectionFlowUpdateParams,
        requestOptions: RequestOptions,
    ): AccountCollectionFlow =
        // patch /api/account_collection_flows/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AccountCollectionFlowListParams,
        requestOptions: RequestOptions,
    ): AccountCollectionFlowListPageAsync =
        // get /api/account_collection_flows
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountCollectionFlowServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountCollectionFlowServiceAsync.WithRawResponse =
            AccountCollectionFlowServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<AccountCollectionFlow> =
            jsonHandler<AccountCollectionFlow>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AccountCollectionFlowCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCollectionFlow> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "account_collection_flows")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<AccountCollectionFlow> =
            jsonHandler<AccountCollectionFlow>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AccountCollectionFlowRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCollectionFlow> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "account_collection_flows", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<AccountCollectionFlow> =
            jsonHandler<AccountCollectionFlow>(clientOptions.jsonMapper)

        override suspend fun update(
            params: AccountCollectionFlowUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCollectionFlow> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "account_collection_flows", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<AccountCollectionFlow>> =
            jsonHandler<List<AccountCollectionFlow>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AccountCollectionFlowListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCollectionFlowListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "account_collection_flows")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        AccountCollectionFlowListPageAsync.builder()
                            .service(AccountCollectionFlowServiceAsyncImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
