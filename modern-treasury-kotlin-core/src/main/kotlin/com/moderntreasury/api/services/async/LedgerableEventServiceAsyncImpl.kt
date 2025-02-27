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
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerableEvent
import com.moderntreasury.api.models.LedgerableEventCreateParams
import com.moderntreasury.api.models.LedgerableEventRetrieveParams

class LedgerableEventServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerableEventServiceAsync {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LedgerableEvent> =
        jsonHandler<LedgerableEvent>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a ledgerable event. */
    override suspend fun create(
        params: LedgerableEventCreateParams,
        requestOptions: RequestOptions,
    ): LedgerableEvent {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "ledgerable_events")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<LedgerableEvent> =
        jsonHandler<LedgerableEvent>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single ledgerable event. */
    override suspend fun retrieve(
        params: LedgerableEventRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerableEvent {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "ledgerable_events", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
