@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ConnectionListPage
import com.moderntreasury.api.models.ConnectionListParams

interface ConnectionService {

    /** Get a list of all connections. */
    fun list(
        params: ConnectionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConnectionListPage
}
