@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerableEvent
import com.moderntreasury.api.models.LedgerableEventCreateParams
import com.moderntreasury.api.models.LedgerableEventRetrieveParams

interface LedgerableEventServiceAsync {

    /** Translation missing: en.openapi.descriptions.ledger.operations.create_ledgerable_event */
    suspend fun create(
        params: LedgerableEventCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerableEvent

    /** Get details on a single ledgerable event. */
    suspend fun retrieve(
        params: LedgerableEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerableEvent
}
