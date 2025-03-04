// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BulkRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.BulkRequestListPageAsync
import com.moderntreasury.api.models.BulkRequestListParams
import com.moderntreasury.api.models.BulkRequestRetrieveParams

interface BulkRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create bulk_request */
    suspend fun create(
        params: BulkRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequest

    /** get bulk_request */
    suspend fun retrieve(
        params: BulkRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequest

    /** list bulk_requests */
    suspend fun list(
        params: BulkRequestListParams = BulkRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BulkRequestListPageAsync

    /** list bulk_requests */
    suspend fun list(requestOptions: RequestOptions): BulkRequestListPageAsync =
        list(BulkRequestListParams.none(), requestOptions)

    /**
     * A view of [BulkRequestServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BulkRequestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkRequest>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests/{id}`, but is otherwise the same
         * as [BulkRequestServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: BulkRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkRequest>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BulkRequestListParams = BulkRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BulkRequestListPageAsync>

        /**
         * Returns a raw HTTP response for `get /api/bulk_requests`, but is otherwise the same as
         * [BulkRequestServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<BulkRequestListPageAsync> =
            list(BulkRequestListParams.none(), requestOptions)
    }
}
