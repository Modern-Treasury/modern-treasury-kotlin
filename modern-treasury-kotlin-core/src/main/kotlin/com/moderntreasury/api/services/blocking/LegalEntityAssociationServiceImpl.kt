// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions

class LegalEntityAssociationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : LegalEntityAssociationService {

    private val withRawResponse: LegalEntityAssociationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LegalEntityAssociationService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): LegalEntityAssociationService =
        LegalEntityAssociationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LegalEntityAssociationService.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LegalEntityAssociationService.WithRawResponse =
            LegalEntityAssociationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
