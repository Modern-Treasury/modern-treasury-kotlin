// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.ledgerTransactions

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
import com.moderntreasury.api.models.LedgerTransactionVersion
import com.moderntreasury.api.models.LedgerTransactionVersionListPage
import com.moderntreasury.api.models.LedgerTransactionVersionListParams

class VersionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VersionService {

    private val withRawResponse: VersionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VersionService.WithRawResponse = withRawResponse

    override fun list(
        params: LedgerTransactionVersionListParams,
        requestOptions: RequestOptions,
    ): LedgerTransactionVersionListPage =
        // get /api/ledger_transaction_versions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VersionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<List<LedgerTransactionVersion>> =
            jsonHandler<List<LedgerTransactionVersion>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LedgerTransactionVersionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransactionVersionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "ledger_transaction_versions")
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
                        LedgerTransactionVersionListPage.builder()
                            .service(VersionServiceImpl(clientOptions))
                            .params(params)
                            .headers(response.headers())
                            .items(it)
                            .build()
                    }
            }
        }
    }
}
