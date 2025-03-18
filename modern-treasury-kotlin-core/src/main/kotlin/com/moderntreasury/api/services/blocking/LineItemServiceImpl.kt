// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
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
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LineItem
import com.moderntreasury.api.models.LineItemListPage
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemUpdateParams

class LineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LineItemService {

    private val withRawResponse: LineItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LineItemService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): LineItem =
        // get /api/{itemizable_type}/{itemizable_id}/line_items/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: LineItemUpdateParams, requestOptions: RequestOptions): LineItem =
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

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<LineItem> =
            jsonHandler<LineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LineItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
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

        private val updateHandler: Handler<LineItem> =
            jsonHandler<LineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LineItemUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LineItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
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

        private val listHandler: Handler<List<LineItem>> =
            jsonHandler<List<LineItem>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: LineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LineItemListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
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
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
                    .let {
                        LineItemListPage.of(
                            LineItemServiceImpl(clientOptions),
                            params,
                            LineItemListPage.Response.builder()
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
