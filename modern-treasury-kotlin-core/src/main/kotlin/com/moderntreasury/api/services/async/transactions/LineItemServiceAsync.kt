// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LineItemServiceAsync

    /** create transaction line items */
    suspend fun create(
        params: TransactionLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** get transaction line item */
    suspend fun retrieve(
        id: String,
        params: TransactionLineItemRetrieveParams = TransactionLineItemRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: TransactionLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): TransactionLineItem =
        retrieve(id, TransactionLineItemRetrieveParams.none(), requestOptions)

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
        id: String,
        params: TransactionLineItemDeleteParams = TransactionLineItemDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: TransactionLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [delete] */
    suspend fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, TransactionLineItemDeleteParams.none(), requestOptions)

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
            id: String,
            params: TransactionLineItemRetrieveParams = TransactionLineItemRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLineItem> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionLineItem>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionLineItem> =
            retrieve(id, TransactionLineItemRetrieveParams.none(), requestOptions)

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
            id: String,
            params: TransactionLineItemDeleteParams = TransactionLineItemDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: TransactionLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, TransactionLineItemDeleteParams.none(), requestOptions)
    }
}
