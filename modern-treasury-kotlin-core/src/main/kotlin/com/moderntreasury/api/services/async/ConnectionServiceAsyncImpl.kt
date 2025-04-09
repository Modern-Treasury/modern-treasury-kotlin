// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

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
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.Connection
import com.moderntreasury.api.models.ConnectionListPageAsync
import com.moderntreasury.api.models.ConnectionListParams

class ConnectionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ConnectionServiceAsync {

    private val withRawResponse: ConnectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ConnectionServiceAsync.WithRawResponse = withRawResponse

    override suspend fun list(
        params: ConnectionListParams,
        requestOptions: RequestOptions,
    ): ConnectionListPageAsync =
        // get /api/connections
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ConnectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<List<Connection>> =
            jsonHandler<List<Connection>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(
            params: ConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "connections")
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
                        ConnectionListPageAsync.of(
                            ConnectionServiceAsyncImpl(clientOptions),
                            params,
                            response.headers(),
                            it,
                        )
                    }
            }
        }
    }
}
