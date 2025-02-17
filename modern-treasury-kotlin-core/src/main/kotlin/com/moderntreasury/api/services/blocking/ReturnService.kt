// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.ReturnCreateParams
import com.moderntreasury.api.models.ReturnListPage
import com.moderntreasury.api.models.ReturnListParams
import com.moderntreasury.api.models.ReturnObject
import com.moderntreasury.api.models.ReturnRetrieveParams

interface ReturnService {

    /** Create a return. */
    fun create(
        params: ReturnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject

    /** Get a single return. */
    fun retrieve(
        params: ReturnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject

    /** Get a list of returns. */
    fun list(
        params: ReturnListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnListPage
}
