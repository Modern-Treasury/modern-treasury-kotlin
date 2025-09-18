// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerTransaction
import com.moderntreasury.api.models.LedgerTransactionCreateParams
import com.moderntreasury.api.models.LedgerTransactionCreatePartialPostParams
import com.moderntreasury.api.models.LedgerTransactionCreateRequest
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionListPageAsync
import com.moderntreasury.api.models.LedgerTransactionListParams
import com.moderntreasury.api.models.LedgerTransactionRetrieveParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.services.async.ledgerTransactions.VersionServiceAsync

interface LedgerTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerTransactionServiceAsync

    fun versions(): VersionServiceAsync

    /** Create a ledger transaction. */
    suspend fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** @see create */
    suspend fun create(
        ledgerTransactionCreateRequest: LedgerTransactionCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction =
        create(
            LedgerTransactionCreateParams.builder()
                .ledgerTransactionCreateRequest(ledgerTransactionCreateRequest)
                .build(),
            requestOptions,
        )

    /** Get details on a single ledger transaction. */
    suspend fun retrieve(
        id: String,
        params: LedgerTransactionRetrieveParams = LedgerTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): LedgerTransaction =
        retrieve(id, LedgerTransactionRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger transaction. */
    suspend fun update(
        id: String,
        params: LedgerTransactionUpdateParams = LedgerTransactionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): LedgerTransaction =
        update(id, LedgerTransactionUpdateParams.none(), requestOptions)

    /** Get a list of ledger transactions. */
    suspend fun list(
        params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransactionListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): LedgerTransactionListPageAsync =
        list(LedgerTransactionListParams.none(), requestOptions)

    /** Create a ledger transaction that partially posts another ledger transaction. */
    suspend fun createPartialPost(
        id: String,
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction = createPartialPost(params.toBuilder().id(id).build(), requestOptions)

    /** @see createPartialPost */
    suspend fun createPartialPost(
        params: LedgerTransactionCreatePartialPostParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** Create a ledger transaction reversal. */
    suspend fun createReversal(
        id: String,
        params: LedgerTransactionCreateReversalParams =
            LedgerTransactionCreateReversalParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction = createReversal(params.toBuilder().id(id).build(), requestOptions)

    /** @see createReversal */
    suspend fun createReversal(
        params: LedgerTransactionCreateReversalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransaction

    /** @see createReversal */
    suspend fun createReversal(id: String, requestOptions: RequestOptions): LedgerTransaction =
        createReversal(id, LedgerTransactionCreateReversalParams.none(), requestOptions)

    /**
     * A view of [LedgerTransactionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerTransactionServiceAsync.WithRawResponse

        fun versions(): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions`, but is otherwise the
         * same as [LedgerTransactionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LedgerTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            ledgerTransactionCreateRequest: LedgerTransactionCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction> =
            create(
                LedgerTransactionCreateParams.builder()
                    .ledgerTransactionCreateRequest(ledgerTransactionCreateRequest)
                    .build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions/{id}`, but is otherwise the
         * same as [LedgerTransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LedgerTransactionRetrieveParams = LedgerTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> =
            retrieve(id, LedgerTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_transactions/{id}`, but is otherwise
         * the same as [LedgerTransactionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LedgerTransactionUpdateParams = LedgerTransactionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: LedgerTransactionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> =
            update(id, LedgerTransactionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_transactions`, but is otherwise the same
         * as [LedgerTransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerTransactionListParams = LedgerTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransactionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerTransactionListPageAsync> =
            list(LedgerTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/partial_post`, but is
         * otherwise the same as [LedgerTransactionServiceAsync.createPartialPost].
         */
        @MustBeClosed
        suspend fun createPartialPost(
            id: String,
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction> =
            createPartialPost(params.toBuilder().id(id).build(), requestOptions)

        /** @see createPartialPost */
        @MustBeClosed
        suspend fun createPartialPost(
            params: LedgerTransactionCreatePartialPostParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /**
         * Returns a raw HTTP response for `post /api/ledger_transactions/{id}/reversal`, but is
         * otherwise the same as [LedgerTransactionServiceAsync.createReversal].
         */
        @MustBeClosed
        suspend fun createReversal(
            id: String,
            params: LedgerTransactionCreateReversalParams =
                LedgerTransactionCreateReversalParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction> =
            createReversal(params.toBuilder().id(id).build(), requestOptions)

        /** @see createReversal */
        @MustBeClosed
        suspend fun createReversal(
            params: LedgerTransactionCreateReversalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransaction>

        /** @see createReversal */
        @MustBeClosed
        suspend fun createReversal(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerTransaction> =
            createReversal(id, LedgerTransactionCreateReversalParams.none(), requestOptions)
    }
}
