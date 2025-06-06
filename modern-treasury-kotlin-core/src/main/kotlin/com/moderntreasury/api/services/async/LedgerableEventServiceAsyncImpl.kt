// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions

class LedgerableEventServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerableEventServiceAsync {

    private val withRawResponse: LedgerableEventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerableEventServiceAsync.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerableEventServiceAsync.WithRawResponse
}
