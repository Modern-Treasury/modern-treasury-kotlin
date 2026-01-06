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
import com.moderntreasury.api.models.LineItemListPage
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemListResponse
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemRetrieveResponse
import com.moderntreasury.api.models.LineItemUpdateParams
import com.moderntreasury.api.models.LineItemUpdateResponse

class LineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LineItemService {

    private val withRawResponse: LineItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LineItemService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LineItemService =
        LineItemServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): LineItemRetrieveResponse =
        // get /api/{itemizable_type}/{itemizable_id}/line_items/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LineItemUpdateParams,
        requestOptions: RequestOptions,
    ): LineItemUpdateResponse =
        // patch /api/{itemizable_type}/{itemizable_id}/line_items/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LineItemListParams,
        requestOptions: RequestOptions,
    ): LineItemListPage =
        // get /api/{itemizable_type}/{itemizable_id}/line_items
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LineItemService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LineItemService.WithRawResponse =
            LineItemServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<LineItemRetrieveResponse> =
            jsonHandler<LineItemRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LineItemRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        params._pathParam(0),
                        params._pathParam(1),
                        "line_items",
                        params._pathParam(2),
                    )
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

        private val updateHandler: Handler<LineItemUpdateResponse> =
            jsonHandler<LineItemUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: LineItemUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LineItemUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        params._pathParam(0),
                        params._pathParam(1),
                        "line_items",
                        params._pathParam(2),
                    )
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

        private val listHandler: Handler<List<LineItemListResponse>> =
            jsonHandler<List<LineItemListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LineItemListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("itemizableId", params.itemizableId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "api",
                        params._pathParam(0),
                        params._pathParam(1),
                        "line_items",
                    )
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
                        LineItemListPage.builder()
                            .service(LineItemServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
