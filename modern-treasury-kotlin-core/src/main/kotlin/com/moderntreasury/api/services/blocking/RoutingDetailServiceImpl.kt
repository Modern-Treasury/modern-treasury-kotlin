// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.RoutingDetail
import com.moderntreasury.api.models.RoutingDetailCreateParams
import com.moderntreasury.api.models.RoutingDetailDeleteParams
import com.moderntreasury.api.models.RoutingDetailListPage
import com.moderntreasury.api.models.RoutingDetailListParams
import com.moderntreasury.api.models.RoutingDetailRetrieveParams

class RoutingDetailServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RoutingDetailService {

    private val withRawResponse: RoutingDetailService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RoutingDetailService.WithRawResponse = withRawResponse

    override fun create(
        params: RoutingDetailCreateParams,
        requestOptions: RequestOptions,
    ): RoutingDetail =
        // post /api/{accounts_type}/{account_id}/routing_details
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: RoutingDetailRetrieveParams,
        requestOptions: RequestOptions,
    ): RoutingDetail =
        // get /api/{accounts_type}/{account_id}/routing_details/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: RoutingDetailListParams,
        requestOptions: RequestOptions,
    ): RoutingDetailListPage =
        // get /api/{accounts_type}/{account_id}/routing_details
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: RoutingDetailDeleteParams, requestOptions: RequestOptions) {
        // delete /api/{accounts_type}/{account_id}/routing_details/{id}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RoutingDetailService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<RoutingDetail> =
            jsonHandler<RoutingDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: RoutingDetailCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingDetail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "api",
                        params._pathParam(0),
                        params._pathParam(1),
                        "routing_details",
                    )
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

        private val retrieveHandler: Handler<RoutingDetail> =
            jsonHandler<RoutingDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: RoutingDetailRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingDetail> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        params._pathParam(0),
                        params._pathParam(1),
                        "routing_details",
                        params._pathParam(2),
                    )
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

        private val listHandler: Handler<List<RoutingDetail>> =
            jsonHandler<List<RoutingDetail>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: RoutingDetailListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingDetailListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "api",
                        params._pathParam(0),
                        params._pathParam(1),
                        "routing_details",
                    )
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
                        RoutingDetailListPage.of(
                            RoutingDetailServiceImpl(clientOptions),
                            params,
                            response.headers(),
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: RoutingDetailDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "api",
                        params._pathParam(0),
                        params._pathParam(1),
                        "routing_details",
                        params._pathParam(2),
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deleteHandler.handle(it) } }
        }
    }
}
