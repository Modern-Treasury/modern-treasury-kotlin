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
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.ExpectedPayment
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentListPage
import com.moderntreasury.api.models.ExpectedPaymentListParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams

class ExpectedPaymentServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ExpectedPaymentService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ExpectedPayment> =
        jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create expected payment */
    override fun create(
        params: ExpectedPaymentCreateParams,
        requestOptions: RequestOptions
    ): ExpectedPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "expected_payments")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<ExpectedPayment> =
        jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** get expected payment */
    override fun retrieve(
        params: ExpectedPaymentRetrieveParams,
        requestOptions: RequestOptions
    ): ExpectedPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "expected_payments", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<ExpectedPayment> =
        jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** update expected payment */
    override fun update(
        params: ExpectedPaymentUpdateParams,
        requestOptions: RequestOptions
    ): ExpectedPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "expected_payments", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<List<ExpectedPayment>> =
        jsonHandler<List<ExpectedPayment>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** list expected_payments */
    override fun list(
        params: ExpectedPaymentListParams,
        requestOptions: RequestOptions
    ): ExpectedPaymentListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "expected_payments")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.forEach { it.validate() }
                }
            }
            .let {
                ExpectedPaymentListPage.of(
                    this,
                    params,
                    ExpectedPaymentListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                )
            }
    }

    private val deleteHandler: Handler<ExpectedPayment> =
        jsonHandler<ExpectedPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** delete expected payment */
    override fun delete(
        params: ExpectedPaymentDeleteParams,
        requestOptions: RequestOptions
    ): ExpectedPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "expected_payments", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
