// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions

class LedgerEventHandlerServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerEventHandlerService {

    private val withRawResponse: LedgerEventHandlerService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerEventHandlerService.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerEventHandlerService.WithRawResponse
}
