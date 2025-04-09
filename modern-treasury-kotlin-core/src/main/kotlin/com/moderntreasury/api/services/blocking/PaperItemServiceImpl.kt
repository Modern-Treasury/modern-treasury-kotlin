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
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.PaperItem
import com.moderntreasury.api.models.PaperItemListPage
import com.moderntreasury.api.models.PaperItemListParams
import com.moderntreasury.api.models.PaperItemRetrieveParams

class PaperItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaperItemService {

    private val withRawResponse: PaperItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaperItemService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: PaperItemRetrieveParams,
        requestOptions: RequestOptions,
    ): PaperItem =
        // get /api/paper_items/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PaperItemListParams,
        requestOptions: RequestOptions,
    ): PaperItemListPage =
        // get /api/paper_items
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaperItemService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<PaperItem> =
            jsonHandler<PaperItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaperItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaperItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "paper_items", params._pathParam(0))
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

        private val listHandler: Handler<List<PaperItem>> =
            jsonHandler<List<PaperItem>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: PaperItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaperItemListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "paper_items")
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
                        PaperItemListPage.of(
                            PaperItemServiceImpl(clientOptions),
                            params,
                            response.headers(),
                            it,
                        )
                    }
            }
        }
    }
}
