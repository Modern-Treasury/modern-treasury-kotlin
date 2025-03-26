// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Transaction
import com.moderntreasury.api.models.TransactionCreateParams
import com.moderntreasury.api.models.TransactionDeleteParams
import com.moderntreasury.api.models.TransactionListPage
import com.moderntreasury.api.models.TransactionListParams
import com.moderntreasury.api.models.TransactionRetrieveParams
import com.moderntreasury.api.models.TransactionUpdateParams
import com.moderntreasury.api.services.blocking.transactions.LineItemService

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun lineItems(): LineItemService

    /** create transaction */
    fun create(
        params: TransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** Get details on a single transaction. */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** Update a single transaction. */
    fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** Get a list of all transactions. */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): TransactionListPage =
        list(TransactionListParams.none(), requestOptions)

    /** delete transaction */
    fun delete(
        params: TransactionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun lineItems(): LineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/transactions`, but is otherwise the same as
         * [TransactionService.create].
         */
        @MustBeClosed
        fun create(
            params: TransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /**
         * Returns a raw HTTP response for `get /api/transactions/{id}`, but is otherwise the same
         * as [TransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /**
         * Returns a raw HTTP response for `patch /api/transactions/{id}`, but is otherwise the same
         * as [TransactionService.update].
         */
        @MustBeClosed
        fun update(
            params: TransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /**
         * Returns a raw HTTP response for `get /api/transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionListPage> =
            list(TransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/transactions/{id}`, but is otherwise the
         * same as [TransactionService.delete].
         */
        @MustBeClosed
        fun delete(
            params: TransactionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
