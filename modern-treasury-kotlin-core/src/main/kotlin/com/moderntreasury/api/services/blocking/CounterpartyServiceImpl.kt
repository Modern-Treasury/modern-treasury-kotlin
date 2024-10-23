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
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCollectAccountResponse
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyDeleteParams
import com.moderntreasury.api.models.CounterpartyListPage
import com.moderntreasury.api.models.CounterpartyListParams
import com.moderntreasury.api.models.CounterpartyRetrieveParams
import com.moderntreasury.api.models.CounterpartyUpdateParams

class CounterpartyServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CounterpartyService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Counterparty> =
        jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new counterparty. */
    override fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions
    ): Counterparty {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "counterparties")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
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

    private val retrieveHandler: Handler<Counterparty> =
        jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single counterparty. */
    override fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions
    ): Counterparty {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "counterparties", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
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

    private val updateHandler: Handler<Counterparty> =
        jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Updates a given counterparty with new information. */
    override fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions
    ): Counterparty {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "counterparties", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<List<Counterparty>> =
        jsonHandler<List<Counterparty>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a paginated list of all counterparties. */
    override fun list(
        params: CounterpartyListParams,
        requestOptions: RequestOptions
    ): CounterpartyListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "counterparties")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
                    }
                }
                .let {
                    CounterpartyListPage.Response.Builder()
                        .items(it)
                        .perPage(response.headers()["X-Per-Page"].getOrNull(0) ?: "")
                        .afterCursor(response.headers()["X-After-Cursor"].getOrNull(0) ?: "")
                        .build()
                }
                .let { CounterpartyListPage.of(this, params, it) }
        }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Deletes a given counterparty. */
    override fun delete(params: CounterpartyDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "counterparties", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }

    private val collectAccountHandler: Handler<CounterpartyCollectAccountResponse> =
        jsonHandler<CounterpartyCollectAccountResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Send an email requesting account details. */
    override fun collectAccount(
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions
    ): CounterpartyCollectAccountResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "counterparties", params.getPathParam(0), "collect_account")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { collectAccountHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
