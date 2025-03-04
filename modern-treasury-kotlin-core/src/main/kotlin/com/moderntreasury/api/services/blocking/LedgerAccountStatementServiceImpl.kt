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
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.core.http.parseable
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementCreateResponse
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveResponse

class LedgerAccountStatementServiceImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerAccountStatementService {

    private val withRawResponse: LedgerAccountStatementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerAccountStatementService.WithRawResponse = withRawResponse

    override fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions,
    ): LedgerAccountStatementCreateResponse =
        // post /api/ledger_account_statements
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions,
    ): LedgerAccountStatementRetrieveResponse =
        // get /api/ledger_account_statements/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerAccountStatementService.WithRawResponse {

        private val errorHandler: Handler<ModernTreasuryError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<LedgerAccountStatementCreateResponse> =
            jsonHandler<LedgerAccountStatementCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: LedgerAccountStatementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountStatementCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("api", "ledger_account_statements")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<LedgerAccountStatementRetrieveResponse> =
            jsonHandler<LedgerAccountStatementRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: LedgerAccountStatementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountStatementRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("api", "ledger_account_statements", params.getPathParam(0))
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
    }
}
