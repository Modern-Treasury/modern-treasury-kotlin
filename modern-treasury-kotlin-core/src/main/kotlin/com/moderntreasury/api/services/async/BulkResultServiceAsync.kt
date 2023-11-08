// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.BulkResult
import com.moderntreasury.api.models.BulkResultListPageAsync
import com.moderntreasury.api.models.BulkResultListParams
import com.moderntreasury.api.models.BulkResultRetrieveParams

interface BulkResultServiceAsync {

    /** get bulk_result */
    suspend fun retrieve(
        params: BulkResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BulkResult

    /** list bulk_results */
    suspend fun list(
        params: BulkResultListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BulkResultListPageAsync
}
