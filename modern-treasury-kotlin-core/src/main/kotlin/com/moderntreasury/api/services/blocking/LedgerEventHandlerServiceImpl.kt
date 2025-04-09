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
import com.moderntreasury.api.models.LedgerEventHandler
import com.moderntreasury.api.models.LedgerEventHandlerCreateParams
import com.moderntreasury.api.models.LedgerEventHandlerDeleteParams
import com.moderntreasury.api.models.LedgerEventHandlerListPage
import com.moderntreasury.api.models.LedgerEventHandlerListParams
import com.moderntreasury.api.models.LedgerEventHandlerRetrieveParams

class LedgerEventHandlerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerEventHandlerService {

    private val withRawResponse: LedgerEventHandlerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerEventHandlerService.WithRawResponse = withRawResponse

    override fun create(
        params: LedgerEventHandlerCreateParams,
        requestOptions: RequestOptions,
    ): LedgerEventHandler =
        // post /api/ledger_event_handlers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LedgerEventHandlerRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerEventHandler =
        // get /api/ledger_event_handlers/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: LedgerEventHandlerListParams,
        requestOptions: RequestOptions,
    ): LedgerEventHandlerListPage =
        // get /api/ledger_event_handlers
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: LedgerEventHandlerDeleteParams,
        requestOptions: RequestOptions,
    ): LedgerEventHandler =
        // delete /api/ledger_event_handlers/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerEventHandlerService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LedgerEventHandler> =
            jsonHandler<LedgerEventHandler>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: LedgerEventHandlerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerEventHandler> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "ledger_event_handlers")
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

        private val retrieveHandler: Handler<LedgerEventHandler> =
            jsonHandler<LedgerEventHandler>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerEventHandlerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerEventHandler> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_event_handlers", params._pathParam(0))
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

        private val listHandler: Handler<List<LedgerEventHandler>> =
            jsonHandler<List<LedgerEventHandler>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LedgerEventHandlerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerEventHandlerListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_event_handlers")
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
                        LedgerEventHandlerListPage.of(
                            LedgerEventHandlerServiceImpl(clientOptions),
                            params,
                            response.headers(),
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<LedgerEventHandler> =
            jsonHandler<LedgerEventHandler>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: LedgerEventHandlerDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerEventHandler> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("api", "ledger_event_handlers", params._pathParam(0))
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
