// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ConnectionListPageAsync
import com.moderntreasury.api.models.ConnectionListParams

interface ConnectionServiceAsync {

    /** Get a list of all connections. */
    suspend fun list(
        params: ConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConnectionListPageAsync
}
