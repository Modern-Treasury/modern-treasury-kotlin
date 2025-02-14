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
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPageAsync
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams

class PaymentReferenceServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : PaymentReferenceServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<PaymentReference> =
        jsonHandler<PaymentReference>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get payment_reference */
    override suspend fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions
    ): PaymentReference {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_references", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<PaymentReference>> =
        jsonHandler<List<PaymentReference>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list payment_references */
    override suspend fun list(
        params: PaymentReferenceListParams,
        requestOptions: RequestOptions
    ): PaymentReferenceListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_references")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    PaymentReferenceListPageAsync.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { PaymentReferenceListPageAsync.of(this, params, it) }
        }
    }

    private val retireveHandler: Handler<PaymentReference> =
        jsonHandler<PaymentReference>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get payment_reference */
    @Deprecated("use `retrieve` instead")
    override suspend fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions
    ): PaymentReference {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "payment_references", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retireveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
