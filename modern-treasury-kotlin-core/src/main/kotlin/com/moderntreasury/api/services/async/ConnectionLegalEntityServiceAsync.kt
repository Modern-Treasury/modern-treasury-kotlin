// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ConnectionLegalEntity
import com.moderntreasury.api.models.ConnectionLegalEntityCreateParams
import com.moderntreasury.api.models.ConnectionLegalEntityListPageAsync
import com.moderntreasury.api.models.ConnectionLegalEntityListParams
import com.moderntreasury.api.models.ConnectionLegalEntityRetrieveParams
import com.moderntreasury.api.models.ConnectionLegalEntityUpdateParams

interface ConnectionLegalEntityServiceAsync {

    /** Create a connection legal entity. */
    suspend fun create(
        params: ConnectionLegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConnectionLegalEntity

    /** Get details on a single connection legal entity. */
    suspend fun retrieve(
        params: ConnectionLegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConnectionLegalEntity

    /** Update a connection legal entity. */
    suspend fun update(
        params: ConnectionLegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConnectionLegalEntity

    /** Get a list of all connection legal entities. */
    suspend fun list(
        params: ConnectionLegalEntityListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ConnectionLegalEntityListPageAsync
}
