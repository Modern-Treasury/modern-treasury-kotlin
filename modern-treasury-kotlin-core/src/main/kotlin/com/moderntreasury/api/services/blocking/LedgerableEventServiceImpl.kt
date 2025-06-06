// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.ClientOptions

class LedgerableEventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LedgerableEventService {

    private val withRawResponse: LedgerableEventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LedgerableEventService.WithRawResponse = withRawResponse

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LedgerableEventService.WithRawResponse
}
