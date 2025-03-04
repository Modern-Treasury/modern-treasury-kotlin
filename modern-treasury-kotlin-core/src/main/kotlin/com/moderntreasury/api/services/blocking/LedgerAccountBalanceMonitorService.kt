// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPage
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams

interface LedgerAccountBalanceMonitorService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ledger account balance monitor. */
    fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get details on a single ledger account balance monitor. */
    fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Update a ledger account balance monitor. */
    fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get a list of ledger account balance monitors. */
    fun list(
        params: LedgerAccountBalanceMonitorListParams =
            LedgerAccountBalanceMonitorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitorListPage

    /** Get a list of ledger account balance monitors. */
    fun list(requestOptions: RequestOptions): LedgerAccountBalanceMonitorListPage =
        list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

    /** Delete a ledger account balance monitor. */
    fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /**
     * A view of [LedgerAccountBalanceMonitorService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorService.create].
         */
        @MustBeClosed
        fun create(
            params: LedgerAccountBalanceMonitorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorService.update].
         */
        @MustBeClosed
        fun update(
            params: LedgerAccountBalanceMonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorService.list].
         */
        @MustBeClosed
        fun list(
            params: LedgerAccountBalanceMonitorListParams =
                LedgerAccountBalanceMonitorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitorListPage>

        /**
         * Returns a raw HTTP response for `get /api/ledger_account_balance_monitors`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorService.list].
         */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerAccountBalanceMonitorListPage> =
            list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/ledger_account_balance_monitors/{id}`, but
         * is otherwise the same as [LedgerAccountBalanceMonitorService.delete].
         */
        @MustBeClosed
        fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>
    }
}
