// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

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
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPage
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams

class PaymentReferenceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentReferenceService {

    private val withRawResponse: PaymentReferenceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentReferenceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentReferenceService =
        PaymentReferenceServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions,
    ): PaymentReference =
        // get /api/payment_references/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PaymentReferenceListParams,
        requestOptions: RequestOptions,
    ): PaymentReferenceListPage =
        // get /api/payment_references
        withRawResponse().list(params, requestOptions).parse()

    @Deprecated("use `retrieve` instead")
    override fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions,
    ): PaymentReference =
        // get /api/payment_references/{id}
        withRawResponse().retireve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentReferenceService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentReferenceService.WithRawResponse =
            PaymentReferenceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<PaymentReference> =
            jsonHandler<PaymentReference>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentReferenceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "payment_references", params._pathParam(0))
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

        private val listHandler: Handler<List<PaymentReference>> =
            jsonHandler<List<PaymentReference>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PaymentReferenceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReferenceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "payment_references")
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
                        PaymentReferenceListPage.builder()
                            .service(PaymentReferenceServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }

        private val retireveHandler: Handler<PaymentReference> =
            jsonHandler<PaymentReference>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        @Deprecated("use `retrieve` instead")
        override fun retireve(
            params: PaymentReferenceRetireveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "payment_references", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
