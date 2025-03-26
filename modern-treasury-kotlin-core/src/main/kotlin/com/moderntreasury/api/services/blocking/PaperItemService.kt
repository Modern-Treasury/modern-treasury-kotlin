// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaperItem
import com.moderntreasury.api.models.PaperItemListPage
import com.moderntreasury.api.models.PaperItemListParams
import com.moderntreasury.api.models.PaperItemRetrieveParams

interface PaperItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get details on a single paper item. */
    fun retrieve(
        params: PaperItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaperItem

    /** Get a list of all paper items. */
    fun list(
        params: PaperItemListParams = PaperItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaperItemListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PaperItemListPage =
        list(PaperItemListParams.none(), requestOptions)

    /** A view of [PaperItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/paper_items/{id}`, but is otherwise the same as
         * [PaperItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PaperItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaperItem>

        /**
         * Returns a raw HTTP response for `get /api/paper_items`, but is otherwise the same as
         * [PaperItemService.list].
         */
        @MustBeClosed
        fun list(
            params: PaperItemListParams = PaperItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaperItemListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaperItemListPage> =
            list(PaperItemListParams.none(), requestOptions)
    }
}
