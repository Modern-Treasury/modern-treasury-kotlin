// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPageAsync
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams

class PaymentReferenceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PaymentReferenceServiceAsync {

    private val withRawResponse: PaymentReferenceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentReferenceServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions,
    ): PaymentReference =
        // get /api/payment_references/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: PaymentReferenceListParams,
        requestOptions: RequestOptions,
    ): PaymentReferenceListPageAsync =
        // get /api/payment_references
        withRawResponse().list(params, requestOptions).parse()

    @Deprecated("use `retrieve` instead")
    override suspend fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions,
    ): PaymentReference =
        // get /api/payment_references/{id}
        withRawResponse().retireve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentReferenceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<PaymentReference> =
            jsonHandler<PaymentReference>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: PaymentReferenceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "payment_references", params.getPathParam(0))
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

        private val listHandler: Handler<List<PaymentReference>> =
            jsonHandler<List<PaymentReference>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: PaymentReferenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReferenceListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "payment_references")
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
                        PaymentReferenceListPageAsync.of(
                            PaymentReferenceServiceAsyncImpl(clientOptions),
                            params,
                            PaymentReferenceListPageAsync.Response.builder()
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

        private val retireveHandler: Handler<PaymentReference> =
            jsonHandler<PaymentReference>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        @Deprecated("use `retrieve` instead")
        override suspend fun retireve(
            params: PaymentReferenceRetireveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "payment_references", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retireveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
