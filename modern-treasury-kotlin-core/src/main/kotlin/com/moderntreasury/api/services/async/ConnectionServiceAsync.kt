@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
