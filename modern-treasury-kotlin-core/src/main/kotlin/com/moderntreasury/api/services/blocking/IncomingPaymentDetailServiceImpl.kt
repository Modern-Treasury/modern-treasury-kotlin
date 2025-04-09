// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.RequestOptions
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
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.IncomingPaymentDetail
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailListPage
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams

class IncomingPaymentDetailServiceImpl
internal constructor(private val clientOptions: ClientOptions) : IncomingPaymentDetailService {

    private val withRawResponse: IncomingPaymentDetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IncomingPaymentDetailService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions,
    ): IncomingPaymentDetail =
        // get /api/incoming_payment_details/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions,
    ): IncomingPaymentDetail =
        // patch /api/incoming_payment_details/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: IncomingPaymentDetailListParams,
        requestOptions: RequestOptions,
    ): IncomingPaymentDetailListPage =
        // get /api/incoming_payment_details
        withRawResponse().list(params, requestOptions).parse()

    override fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams,
        requestOptions: RequestOptions,
    ): AsyncResponse =
        // post /api/simulations/incoming_payment_details/create_async
        withRawResponse().createAsync(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IncomingPaymentDetailService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<IncomingPaymentDetail> =
            jsonHandler<IncomingPaymentDetail>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: IncomingPaymentDetailRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IncomingPaymentDetail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "incoming_payment_details", params._pathParam(0))
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

        private val updateHandler: Handler<IncomingPaymentDetail> =
            jsonHandler<IncomingPaymentDetail>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: IncomingPaymentDetailUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IncomingPaymentDetail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("api", "incoming_payment_details", params._pathParam(0))
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

        private val listHandler: Handler<List<IncomingPaymentDetail>> =
            jsonHandler<List<IncomingPaymentDetail>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: IncomingPaymentDetailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IncomingPaymentDetailListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "incoming_payment_details")
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
                        IncomingPaymentDetailListPage.of(
                            IncomingPaymentDetailServiceImpl(clientOptions),
                            params,
                            response.headers(),
                            it,
                        )
                    }
            }
        }

        private val createAsyncHandler: Handler<AsyncResponse> =
            jsonHandler<AsyncResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createAsync(
            params: IncomingPaymentDetailCreateAsyncParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AsyncResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "api",
                        "simulations",
                        "incoming_payment_details",
                        "create_async",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createAsyncHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
