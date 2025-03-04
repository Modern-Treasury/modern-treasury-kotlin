// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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

    fun accountEntries(): AccountEntryServiceAsync

    /** Create a ledger account settlement. */
    suspend fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Get details on a single ledger account settlement. */
    suspend fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Update the details of a ledger account settlement. */
    suspend fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Get a list of ledger account settlements. */
    suspend fun list(
        params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlementListPageAsync

    /** Get a list of ledger account settlements. */
    suspend fun list(requestOptions: RequestOptions): LedgerAccountSettlementListPageAsync =
        list(LedgerAccountSettlementListParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountSettlementServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

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
            params: LedgerAccountSettlementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_settlements/{id}`, but is
         * otherwise the same as [LedgerAccountSettlementServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: LedgerAccountSettlementUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlement>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerAccountSettlementListParams = LedgerAccountSettlementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountSettlementListPageAsync>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_settlements`, but is otherwise
         * the same as [LedgerAccountSettlementServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerAccountSettlementListPageAsync> =
            list(LedgerAccountSettlementListParams.none(), requestOptions)
    }
}
