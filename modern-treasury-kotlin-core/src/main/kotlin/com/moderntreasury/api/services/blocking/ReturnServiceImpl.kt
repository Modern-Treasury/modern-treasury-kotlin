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
import com.moderntreasury.api.models.ReturnCreateParams
import com.moderntreasury.api.models.ReturnListPage
import com.moderntreasury.api.models.ReturnListParams
import com.moderntreasury.api.models.ReturnObject
import com.moderntreasury.api.models.ReturnRetrieveParams

class ReturnServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ReturnService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ReturnObject> =
        jsonHandler<ReturnObject>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a return. */
    override fun create(params: ReturnCreateParams, requestOptions: RequestOptions): ReturnObject {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "returns")
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

    private val retrieveHandler: Handler<ReturnObject> =
        jsonHandler<ReturnObject>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a single return. */
    override fun retrieve(
        params: ReturnRetrieveParams,
        requestOptions: RequestOptions,
    ): ReturnObject {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "returns", params.getPathParam(0))
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

    private val listHandler: Handler<List<ReturnObject>> =
        jsonHandler<List<ReturnObject>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of returns. */
    override fun list(params: ReturnListParams, requestOptions: RequestOptions): ReturnListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "returns")
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
                ReturnListPage.of(
                    this,
                    params,
                    ReturnListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }
}
