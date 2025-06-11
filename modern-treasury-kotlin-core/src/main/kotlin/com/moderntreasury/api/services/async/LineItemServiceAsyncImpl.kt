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
import com.moderntreasury.api.models.LineItem
import com.moderntreasury.api.models.LineItemListPageAsync
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemUpdateParams

class LineItemServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LineItemServiceAsync {

    private val withRawResponse: LineItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LineItemServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): LineItem =
        // get /api/{itemizable_type}/{itemizable_id}/line_items/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: LineItemUpdateParams,
        requestOptions: RequestOptions,
    ): LineItem =
        // patch /api/{itemizable_type}/{itemizable_id}/line_items/{id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: LineItemListParams,
        requestOptions: RequestOptions,
    ): LineItemListPageAsync =
        // get /api/{itemizable_type}/{itemizable_id}/line_items
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LineItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<LineItem> =
            jsonHandler<LineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LineItem> {
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

        private val updateHandler: Handler<LineItem> =
            jsonHandler<LineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: LineItemUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LineItem> {
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

        private val listHandler: Handler<List<LineItem>> =
            jsonHandler<List<LineItem>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(
            params: LineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LineItemListPageAsync> {
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
                        LineItemListPageAsync.builder()
                            .service(LineItemServiceAsyncImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
