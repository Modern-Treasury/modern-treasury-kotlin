// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.handlers.emptyHandler
import com.moderntreasury.api.core.handlers.errorHandler
import com.moderntreasury.api.core.handlers.jsonHandler
import com.moderntreasury.api.core.handlers.withErrorHandler
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.core.json
import com.moderntreasury.api.core.prepare
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.AccountDetail
import com.moderntreasury.api.models.AccountDetailCreateParams
import com.moderntreasury.api.models.AccountDetailDeleteParams
import com.moderntreasury.api.models.AccountDetailListPage
import com.moderntreasury.api.models.AccountDetailListParams
import com.moderntreasury.api.models.AccountDetailRetrieveParams

class AccountDetailServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AccountDetailService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AccountDetail> =
        jsonHandler<AccountDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an account detail for an external account. */
    override fun create(
        params: AccountDetailCreateParams,
        requestOptions: RequestOptions
    ): AccountDetail {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "account_details"
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<AccountDetail> =
        jsonHandler<AccountDetail>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a single account detail for a single internal or external account. */
    override fun retrieve(
        params: AccountDetailRetrieveParams,
        requestOptions: RequestOptions
    ): AccountDetail {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "account_details",
                    params.getPathParam(2)
                )
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<AccountDetail>> =
        jsonHandler<List<AccountDetail>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a list of account details for a single internal or external account. */
    override fun list(
        params: AccountDetailListParams,
        requestOptions: RequestOptions
    ): AccountDetailListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "account_details"
                )
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    AccountDetailListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build()
                }
                .let { AccountDetailListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Delete a single account detail for an external account. */
    override fun delete(params: AccountDetailDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "api",
                    params.getPathParam(0),
                    params.getPathParam(1),
                    "account_details",
                    params.getPathParam(2)
                )
                .apply { params._body()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }
}
