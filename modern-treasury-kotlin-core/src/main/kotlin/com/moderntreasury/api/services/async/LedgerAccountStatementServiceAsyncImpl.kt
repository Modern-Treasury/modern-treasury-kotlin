// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.checkRequired
import com.moderntreasury.api.core.handlers.errorBodyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.json
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.prepareAsync
import com.moderntreasury.api.models.LedgerAccountStatement
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams

class LedgerAccountStatementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    LedgerAccountStatementServiceAsync {

    private val withRawResponse: LedgerAccountStatementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountStatementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): LedgerAccountStatementServiceAsync =
        LedgerAccountStatementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountStatement =
        // post /api/ledger_account_statements
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerAccountStatement =
        // get /api/ledger_account_statements/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountStatementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerAccountStatementServiceAsync.WithRawResponse =
            LedgerAccountStatementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<LedgerAccountStatement> =
            jsonHandler<LedgerAccountStatement>(clientOptions.jsonMapper)

        override suspend fun create(
            params: LedgerAccountStatementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountStatement> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_statements")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<LedgerAccountStatement> =
            jsonHandler<LedgerAccountStatement>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: LedgerAccountStatementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountStatement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_account_statements", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
