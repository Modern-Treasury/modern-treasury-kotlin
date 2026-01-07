// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.HoldCreateParams
import com.moderntreasury.api.models.HoldCreateResponse
import com.moderntreasury.api.models.HoldListPage
import com.moderntreasury.api.models.HoldListParams
import com.moderntreasury.api.models.HoldListResponse
import com.moderntreasury.api.models.HoldRetrieveParams
import com.moderntreasury.api.models.HoldRetrieveResponse
import com.moderntreasury.api.models.HoldUpdateParams
import com.moderntreasury.api.models.HoldUpdateResponse

class HoldServiceImpl internal constructor(private val clientOptions: ClientOptions) : HoldService {

    private val withRawResponse: HoldService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HoldService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HoldService =
        HoldServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: HoldCreateParams,
        requestOptions: RequestOptions,
    ): HoldCreateResponse =
        // post /api/holds
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: HoldRetrieveParams,
        requestOptions: RequestOptions,
    ): HoldRetrieveResponse =
        // get /api/holds/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: HoldUpdateParams,
        requestOptions: RequestOptions,
    ): HoldUpdateResponse =
        // patch /api/holds/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: HoldListParams, requestOptions: RequestOptions): HoldListPage =
        // get /api/holds
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HoldService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): HoldService.WithRawResponse =
            HoldServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<HoldCreateResponse> =
            jsonHandler<HoldCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HoldCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "holds")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<HoldRetrieveResponse> =
            jsonHandler<HoldRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HoldRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "holds", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateHandler: Handler<HoldUpdateResponse> =
            jsonHandler<HoldUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: HoldUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HoldUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "holds", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<List<HoldListResponse>> =
            jsonHandler<List<HoldListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: HoldListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HoldListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "holds")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        HoldListPage.builder()
                            .service(HoldServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
