// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.PaperItem
import com.moderntreasury.api.models.PaperItemListPageAsync
import com.moderntreasury.api.models.PaperItemListParams
import com.moderntreasury.api.models.PaperItemRetrieveParams

interface PaperItemServiceAsync {

    /** Get details on a single paper item. */
    suspend fun retrieve(
        params: PaperItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaperItem

    /** Get a list of all paper items. */
    suspend fun list(
        params: PaperItemListParams = PaperItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaperItemListPageAsync

    /** Get a list of all paper items. */
    suspend fun list(requestOptions: RequestOptions): PaperItemListPageAsync =
        list(PaperItemListParams.none(), requestOptions)
}
