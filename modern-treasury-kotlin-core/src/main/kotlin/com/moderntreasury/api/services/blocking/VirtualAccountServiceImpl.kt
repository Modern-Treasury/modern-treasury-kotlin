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
import com.moderntreasury.api.models.VirtualAccount
import com.moderntreasury.api.models.VirtualAccountCreateParams
import com.moderntreasury.api.models.VirtualAccountDeleteParams
import com.moderntreasury.api.models.VirtualAccountListPage
import com.moderntreasury.api.models.VirtualAccountListParams
import com.moderntreasury.api.models.VirtualAccountRetrieveParams
import com.moderntreasury.api.models.VirtualAccountUpdateParams

class VirtualAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VirtualAccountService {

    private val withRawResponse: VirtualAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VirtualAccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VirtualAccountService =
        VirtualAccountServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: VirtualAccountCreateParams,
        requestOptions: RequestOptions,
    ): VirtualAccount =
        // post /api/virtual_accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: VirtualAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): VirtualAccount =
        // get /api/virtual_accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: VirtualAccountUpdateParams,
        requestOptions: RequestOptions,
    ): VirtualAccount =
        // patch /api/virtual_accounts/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: VirtualAccountListParams,
        requestOptions: RequestOptions,
    ): VirtualAccountListPage =
        // get /api/virtual_accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: VirtualAccountDeleteParams,
        requestOptions: RequestOptions,
    ): VirtualAccount =
        // delete /api/virtual_accounts/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VirtualAccountService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VirtualAccountService.WithRawResponse =
            VirtualAccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<VirtualAccount> =
            jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
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

        private val retrieveHandler: Handler<VirtualAccount> =
            jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
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

        private val updateHandler: Handler<VirtualAccount> =
            jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
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

        private val listHandler: Handler<List<VirtualAccount>> =
            jsonHandler<List<VirtualAccount>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: VirtualAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VirtualAccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "virtual_accounts")
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
                        VirtualAccountListPage.builder()
                            .service(VirtualAccountServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<VirtualAccount> =
            jsonHandler<VirtualAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
