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
import com.moderntreasury.api.models.Counterparty
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCollectAccountResponse
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyDeleteParams
import com.moderntreasury.api.models.CounterpartyListPage
import com.moderntreasury.api.models.CounterpartyListParams
import com.moderntreasury.api.models.CounterpartyRetrieveParams
import com.moderntreasury.api.models.CounterpartyUpdateParams

class CounterpartyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CounterpartyService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Counterparty> =
        jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new counterparty. */
    override fun create(
        params: CounterpartyCreateParams,
        requestOptions: RequestOptions,
    ): Counterparty {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "counterparties")
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

    private val retrieveHandler: Handler<Counterparty> =
        jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get details on a single counterparty. */
    override fun retrieve(
        params: CounterpartyRetrieveParams,
        requestOptions: RequestOptions,
    ): Counterparty {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "counterparties", params.getPathParam(0))
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

    private val updateHandler: Handler<Counterparty> =
        jsonHandler<Counterparty>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Updates a given counterparty with new information. */
    override fun update(
        params: CounterpartyUpdateParams,
        requestOptions: RequestOptions,
    ): Counterparty {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("api", "counterparties", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<List<Counterparty>> =
        jsonHandler<List<Counterparty>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a paginated list of all counterparties. */
    override fun list(
        params: CounterpartyListParams,
        requestOptions: RequestOptions,
    ): CounterpartyListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("api", "counterparties")
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
                CounterpartyListPage.of(
                    this,
                    params,
                    CounterpartyListPage.Response.builder()
                        .items(it)
                        .perPage(response.headers().values("X-Per-Page").getOrNull(0) ?: "")
                        .afterCursor(response.headers().values("X-After-Cursor").getOrNull(0) ?: "")
                        .build(),
                )
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Deletes a given counterparty. */
    override fun delete(params: CounterpartyDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("api", "counterparties", params.getPathParam(0))
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { deleteHandler.handle(it) }
    }

    private val collectAccountHandler: Handler<CounterpartyCollectAccountResponse> =
        jsonHandler<CounterpartyCollectAccountResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Send an email requesting account details. */
    override fun collectAccount(
        params: CounterpartyCollectAccountParams,
        requestOptions: RequestOptions,
    ): CounterpartyCollectAccountResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "counterparties", params.getPathParam(0), "collect_account")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { collectAccountHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
