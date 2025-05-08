// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerTransaction
import com.moderntreasury.api.models.LedgerTransactionCreateParams
import com.moderntreasury.api.models.LedgerTransactionCreatePartialPostParams
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionListPage
import com.moderntreasury.api.models.LedgerTransactionListParams
import com.moderntreasury.api.models.LedgerTransactionRetrieveParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.services.blocking.ledgerTransactions.VersionService

interface LedgerTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun versions(): VersionService

    /** Create a ledger transaction. */
    fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Get details on a single ledger transaction. */
    fun retrieve(
        id: String,
        params: LedgerTransactionRetrieveParams = LedgerTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): LedgerTransaction =
        retrieve(id, LedgerTransactionRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger transaction. */
    fun update(
        id: String,
        params: LedgerTransactionUpdateParams = LedgerTransactionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): LedgerTransaction =
        update(id, LedgerTransactionUpdateParams.none(), requestOptions)

    /** Get a list of ledger transactions. */
    fun list(
        params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransactionListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerTransactionListPage =
        list(LedgerTransactionListParams.none(), requestOptions)

    /** Create a ledger transaction that partially posts another ledger transaction. */
    fun createPartialPost(
        id: String,
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction = createPartialPost(params.toBuilder().id(id).build(), requestOptions)

    /** @see [createPartialPost] */
    fun createPartialPost(
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Create a ledger transaction reversal. */
    fun createReversal(
        id: String,
        params: LedgerTransactionCreateReversalParams =
            LedgerTransactionCreateReversalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction = createReversal(params.toBuilder().id(id).build(), requestOptions)

    /** @see [createReversal] */
    fun createReversal(
        params: LedgerTransactionCreateReversalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** @see [createReversal] */
    fun createReversal(id: String, requestOptions: RequestOptions): LedgerTransaction =
        createReversal(id, LedgerTransactionCreateReversalParams.none(), requestOptions)

    /**
     * A view of [LedgerTransactionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun versions(): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions`, but is otherwise the
         * same as [LedgerTransactionService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions/{id}`, but is otherwise the
         * same as [LedgerTransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LedgerTransactionRetrieveParams = LedgerTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LedgerTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> =
            retrieve(id, LedgerTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_transactions/{id}`, but is otherwise
         * the same as [LedgerTransactionService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LedgerTransactionUpdateParams = LedgerTransactionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LedgerTransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<LedgerTransaction> =
            update(id, LedgerTransactionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions`, but is otherwise the same
         * as [LedgerTransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LedgerTransactionListPage> =
            list(LedgerTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/partial_post`, but is
         * otherwise the same as [LedgerTransactionService.createPartialPost].
         */
        @MustBeClosed
        fun createPartialPost(
            id: String,
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction> =
            createPartialPost(params.toBuilder().id(id).build(), requestOptions)

        /** @see [createPartialPost] */
        @MustBeClosed
        fun createPartialPost(
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/reversal`, but is
         * otherwise the same as [LedgerTransactionService.createReversal].
         */
        @MustBeClosed
        fun createReversal(
            id: String,
            params: LedgerTransactionCreateReversalParams =
                LedgerTransactionCreateReversalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction> =
            createReversal(params.toBuilder().id(id).build(), requestOptions)

        /** @see [createReversal] */
        @MustBeClosed
        fun createReversal(
            params: LedgerTransactionCreateReversalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /** @see [createReversal] */
        @MustBeClosed
        fun createReversal(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> =
            createReversal(id, LedgerTransactionCreateReversalParams.none(), requestOptions)
    }
}
