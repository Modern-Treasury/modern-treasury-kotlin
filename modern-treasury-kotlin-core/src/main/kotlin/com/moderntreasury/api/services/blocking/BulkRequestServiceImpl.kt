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
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPage
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams

class BulkRequestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BulkRequestService {

    private val withRawResponse: BulkRequestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BulkRequestService.WithRawResponse = withRawResponse

    override fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions,
    ): BulkRequest =
        // post /api/bulk_requests
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): BulkRequest =
        // get /api/bulk_requests/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: BulkRequestListParams,
        requestOptions: RequestOptions,
    ): BulkRequestListPage =
        // get /api/bulk_requests
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BulkRequestService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BulkRequest> =
            jsonHandler<BulkRequest>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: BulkRequestCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkRequest> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "bulk_requests")
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

        private val retrieveHandler: Handler<BulkRequest> =
            jsonHandler<BulkRequest>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BulkRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkRequest> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "bulk_requests", params._pathParam(0))
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

        private val listHandler: Handler<List<BulkRequest>> =
            jsonHandler<List<BulkRequest>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: BulkRequestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkRequestListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "bulk_requests")
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
                        BulkRequestListPage.of(
                            BulkRequestServiceImpl(clientOptions),
                            params,
                            BulkRequestListPage.Response.builder()
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
    }
}
