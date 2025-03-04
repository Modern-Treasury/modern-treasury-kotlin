// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BulkResult
import com.moderntreasury.api.models.BulkResultListPage
import com.moderntreasury.api.models.BulkResultListParams
import com.moderntreasury.api.models.BulkResultRetrieveParams

interface BulkResultService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** get bulk_result */
    fun retrieve(
        params: BulkResultRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkResult

    /** list bulk_results */
    fun list(
        params: BulkResultListParams = BulkResultListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkResultListPage

    /** list bulk_results */
    fun list(requestOptions: RequestOptions): BulkResultListPage =
        list(BulkResultListParams.none(), requestOptions)

    /** A view of [BulkResultService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/bulk_results/{id}`, but is otherwise the same
         * as [BulkResultService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BulkResultRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkResult>

        /**
         * Returns a raw HTTP response for `get /api/bulk_results`, but is otherwise the same as
         * [BulkResultService.list].
         */
        @MustBeClosed
        fun list(
            params: BulkResultListParams = BulkResultListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkResultListPage>

        /**
         * Returns a raw HTTP response for `get /api/bulk_results`, but is otherwise the same as
         * [BulkResultService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BulkResultListPage> =
            list(BulkResultListParams.none(), requestOptions)
    }
}
