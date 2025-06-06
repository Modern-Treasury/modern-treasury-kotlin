// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.ClientOptions

class LedgerEventHandlerServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LedgerEventHandlerServiceAsync {

    private val withRawResponse: LedgerEventHandlerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerEventHandlerServiceAsync.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerEventHandlerServiceAsync.WithRawResponse
}
