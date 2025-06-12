// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LineItem
import com.moderntreasury.api.models.LineItemListPageAsync
import com.moderntreasury.api.models.LineItemListParams
import com.moderntreasury.api.models.LineItemRetrieveParams
import com.moderntreasury.api.models.LineItemUpdateParams

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LineItemServiceAsync

    /** Get a single line item */
    suspend fun retrieve(
        id: String,
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: LineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem

    /** update line item */
    suspend fun update(
        id: String,
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: LineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem

    /** Get a list of line items */
    suspend fun list(
        itemizableId: String,
        params: LineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItemListPageAsync =
        list(params.toBuilder().itemizableId(itemizableId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: LineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItemListPageAsync

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/{itemizable_type}/{itemizable_id}/line_items/{id}`, but is otherwise the same as
         * [LineItemServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: LineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem>

        /**
         * Returns a raw HTTP response for `patch
         * /api/{itemizable_type}/{itemizable_id}/line_items/{id}`, but is otherwise the same as
         * [LineItemServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: LineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItem>

        /**
         * Returns a raw HTTP response for `get /api/{itemizable_type}/{itemizable_id}/line_items`,
         * but is otherwise the same as [LineItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            itemizableId: String,
            params: LineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItemListPageAsync> =
            list(params.toBuilder().itemizableId(itemizableId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: LineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItemListPageAsync>
    }
}
