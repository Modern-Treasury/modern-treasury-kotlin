// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ReturnCreateParams
import com.moderntreasury.api.models.ReturnListPageAsync
import com.moderntreasury.api.models.ReturnListParams
import com.moderntreasury.api.models.ReturnObject
import com.moderntreasury.api.models.ReturnRetrieveParams

interface ReturnServiceAsync {

    /** Create a return. */
    suspend fun create(
        params: ReturnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject

    /** Get a single return. */
    suspend fun retrieve(
        params: ReturnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject

    /** Get a list of returns. */
    suspend fun list(
        params: ReturnListParams = ReturnListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnListPageAsync

    /** Get a list of returns. */
    suspend fun list(requestOptions: RequestOptions): ReturnListPageAsync =
        list(ReturnListParams.none(), requestOptions)
}
