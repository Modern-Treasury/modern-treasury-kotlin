// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.TransactionLineItem
import com.moderntreasury.api.models.TransactionLineItemCreateParams
import com.moderntreasury.api.models.TransactionLineItemDeleteParams
import com.moderntreasury.api.models.TransactionLineItemListPageAsync
import com.moderntreasury.api.models.TransactionLineItemListParams
import com.moderntreasury.api.models.TransactionLineItemRetrieveParams

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create transaction line items */
    suspend fun create(
        params: TransactionLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** get transaction line item */
    suspend fun retrieve(
        params: TransactionLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** list transaction_line_items */
    suspend fun list(
        params: TransactionLineItemListParams = TransactionLineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItemListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): TransactionLineItemListPageAsync =
        list(TransactionLineItemListParams.none(), requestOptions)

    /** delete transaction line item */
    suspend fun delete(
        params: TransactionLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/transaction_line_items`, but is otherwise the
         * same as [LineItemServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: TransactionLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLineItem>

        /**
         * Returns a raw HTTP response for `get /api/transaction_line_items/{id}`, but is otherwise
         * the same as [LineItemServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLineItem>

        /**
         * Returns a raw HTTP response for `get /api/transaction_line_items`, but is otherwise the
         * same as [LineItemServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TransactionLineItemListParams = TransactionLineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLineItemListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransactionLineItemListPageAsync> =
            list(TransactionLineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/transaction_line_items/{id}`, but is
         * otherwise the same as [LineItemServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: TransactionLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
