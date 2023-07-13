@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Event
import com.moderntreasury.api.models.EventListPageAsync
import com.moderntreasury.api.models.EventListParams
import com.moderntreasury.api.models.EventRetrieveParams

interface EventServiceAsync {

    /** get event */
    suspend fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Event

    /** list events */
    suspend fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventListPageAsync
}
