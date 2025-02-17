// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPage
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams

interface BulkRequestService {

    /** create bulk_request */
    fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequest

    /** get bulk_request */
    fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequest

    /** list bulk_requests */
    fun list(
        params: BulkRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequestListPage
}
