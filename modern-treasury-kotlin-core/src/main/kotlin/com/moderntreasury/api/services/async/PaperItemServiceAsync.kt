// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaperItem
import com.moderntreasury.api.models.PaperItemListPageAsync
import com.moderntreasury.api.models.PaperItemListParams
import com.moderntreasury.api.models.PaperItemRetrieveParams

interface PaperItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): PaperItemListPageAsync =
        list(PaperItemListParams.none(), requestOptions)

    /**
     * A view of [PaperItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/paper_items/{id}`, but is otherwise the same as
         * [PaperItemServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: PaperItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaperItem>

        /**
         * Returns a raw HTTP response for `get /api/paper_items`, but is otherwise the same as
         * [PaperItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PaperItemListParams = PaperItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaperItemListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<PaperItemListPageAsync> =
            list(PaperItemListParams.none(), requestOptions)
    }
}
