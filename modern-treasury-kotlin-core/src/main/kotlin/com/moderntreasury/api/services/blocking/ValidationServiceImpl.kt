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
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.RoutingNumberLookupRequest
import com.moderntreasury.api.models.ValidationValidateRoutingNumberParams

class ValidationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ValidationService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val validateRoutingNumberHandler: Handler<RoutingNumberLookupRequest> =
        jsonHandler<RoutingNumberLookupRequest>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Validates the routing number information supplied without creating a routing detail */
    override fun validateRoutingNumber(
        params: ValidationValidateRoutingNumberParams,
        requestOptions: RequestOptions,
    ): RoutingNumberLookupRequest {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "validations", "routing_numbers")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { validateRoutingNumberHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
