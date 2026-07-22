// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.services.async.LegalEntityAssociationServiceAsync
import com.moderntreasury.api.services.async.LegalEntityAssociationServiceAsyncImpl

class LegalEntityAssociationServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : LegalEntityAssociationServiceAsync {

    private val withRawResponse: LegalEntityAssociationServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): LegalEntityAssociationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LegalEntityAssociationServiceAsync = LegalEntityAssociationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : LegalEntityAssociationServiceAsync.WithRawResponse {

        override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LegalEntityAssociationServiceAsync.WithRawResponse = LegalEntityAssociationServiceAsyncImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())
    }
}
