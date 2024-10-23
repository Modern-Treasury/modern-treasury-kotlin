// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerableEvent
import com.moderntreasury.api.models.LedgerableEventCreateParams
import com.moderntreasury.api.models.LedgerableEventRetrieveParams

interface LedgerableEventService {

    /** Create a ledgerable event. */
    fun create(
        params: LedgerableEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerableEvent

    /** Get details on a single ledgerable event. */
    fun retrieve(
        params: LedgerableEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerableEvent
}
