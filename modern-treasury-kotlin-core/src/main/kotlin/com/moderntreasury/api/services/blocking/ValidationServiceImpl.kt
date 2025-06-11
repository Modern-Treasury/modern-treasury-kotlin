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
import com.moderntreasury.api.models.RoutingNumberLookupRequest
import com.moderntreasury.api.models.ValidationValidateRoutingNumberParams

class ValidationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ValidationService {

    private val withRawResponse: ValidationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ValidationService.WithRawResponse = withRawResponse

    override fun validateRoutingNumber(
        params: ValidationValidateRoutingNumberParams,
        requestOptions: RequestOptions,
    ): RoutingNumberLookupRequest =
        // get /api/validations/routing_numbers
        withRawResponse().validateRoutingNumber(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ValidationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val validateRoutingNumberHandler: Handler<RoutingNumberLookupRequest> =
            jsonHandler<RoutingNumberLookupRequest>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun validateRoutingNumber(
            params: ValidationValidateRoutingNumberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RoutingNumberLookupRequest> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "validations", "routing_numbers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { validateRoutingNumberHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
