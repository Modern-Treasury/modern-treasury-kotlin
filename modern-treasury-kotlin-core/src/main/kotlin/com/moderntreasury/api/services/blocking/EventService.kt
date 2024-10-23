// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Event
import com.moderntreasury.api.models.EventListPage
import com.moderntreasury.api.models.EventListParams
import com.moderntreasury.api.models.EventRetrieveParams

interface EventService {

    /** get event */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Event

    /** list events */
    fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventListPage
}
