// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpMethod
import com.moderntreasury.api.core.http.HttpRequest
import com.moderntreasury.api.core.http.HttpResponse.Handler
import com.moderntreasury.api.errors.ModernTreasuryError
import com.moderntreasury.api.models.LegalEntityAssociation
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams
import com.moderntreasury.api.services.errorHandler
import com.moderntreasury.api.services.json
import com.moderntreasury.api.services.jsonHandler
import com.moderntreasury.api.services.withErrorHandler

class LegalEntityAssociationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : LegalEntityAssociationService {

    private val errorHandler: Handler<ModernTreasuryError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<LegalEntityAssociation> =
        jsonHandler<LegalEntityAssociation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** create legal_entity_association */
    override fun create(
        params: LegalEntityAssociationCreateParams,
        requestOptions: RequestOptions
    ): LegalEntityAssociation {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("api", "legal_entity_associations")
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
}
