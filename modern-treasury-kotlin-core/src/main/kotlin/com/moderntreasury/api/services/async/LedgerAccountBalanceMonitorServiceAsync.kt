// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPageAsync
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams

interface LedgerAccountBalanceMonitorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account balance monitor. */
    suspend fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get details on a single ledger account balance monitor. */
    suspend fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Update a ledger account balance monitor. */
    suspend fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get a list of ledger account balance monitors. */
    suspend fun list(
        params: LedgerAccountBalanceMonitorListParams =
            LedgerAccountBalanceMonitorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitorListPageAsync

    /** Get a list of ledger account balance monitors. */
    suspend fun list(requestOptions: RequestOptions): LedgerAccountBalanceMonitorListPageAsync =
        list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

    /** Delete a ledger account balance monitor. */
    suspend fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /**
     * A view of [LedgerAccountBalanceMonitorServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LedgerAccountBalanceMonitorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: LedgerAccountBalanceMonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerAccountBalanceMonitorListParams =
                LedgerAccountBalanceMonitorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerAccountBalanceMonitorListPageAsync> =
            list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_balance_monitors/{id}`, but
         * is otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>
    }
}
