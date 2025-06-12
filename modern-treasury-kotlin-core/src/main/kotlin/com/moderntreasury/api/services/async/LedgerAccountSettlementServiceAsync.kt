// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPageAsync
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import com.moderntreasury.api.services.async.ledgerAccountSettlements.AccountEntryServiceAsync

interface LedgerAccountSettlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LedgerAccountSettlementServiceAsync

    fun accountEntries(): AccountEntryServiceAsync

    /** Create a ledger account settlement. */
    suspend fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Get details on a single ledger account settlement. */
    suspend fun retrieve(
        id: String,
        params: LedgerAccountSettlementRetrieveParams =
            LedgerAccountSettlementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): LedgerAccountSettlement =
        retrieve(id, LedgerAccountSettlementRetrieveParams.none(), requestOptions)

    /** Update the details of a ledger account settlement. */
    suspend fun update(
        id: String,
        params: LedgerAccountSettlementUpdateParams = LedgerAccountSettlementUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): LedgerAccountSettlement =
        update(id, LedgerAccountSettlementUpdateParams.none(), requestOptions)

    /** Get a list of ledger account settlements. */
    suspend fun list(
        params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlementListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): LedgerAccountSettlementListPageAsync =
        list(LedgerAccountSettlementListParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountSettlementServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerAccountSettlementServiceAsync.WithRawResponse

        fun accountEntries(): AccountEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LedgerAccountSettlementCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements/{id}`, but is
         * otherwise the same as [LedgerAccountSettlementServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LedgerAccountSettlementRetrieveParams =
                LedgerAccountSettlementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerAccountSettlementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountSettlement> =
            retrieve(id, LedgerAccountSettlementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_settlements/{id}`, but is
         * otherwise the same as [LedgerAccountSettlementServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LedgerAccountSettlementUpdateParams =
                LedgerAccountSettlementUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: LedgerAccountSettlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountSettlement> =
            update(id, LedgerAccountSettlementUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlementListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerAccountSettlementListPageAsync> =
            list(LedgerAccountSettlementListParams.none(), requestOptions)
    }
}
