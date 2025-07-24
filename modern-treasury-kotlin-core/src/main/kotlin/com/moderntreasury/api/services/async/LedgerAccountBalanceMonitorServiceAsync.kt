// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): LedgerAccountBalanceMonitorServiceAsync

    /** Create a ledger account balance monitor. */
    suspend fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get details on a single ledger account balance monitor. */
    suspend fun retrieve(
        id: String,
        params: LedgerAccountBalanceMonitorRetrieveParams =
            LedgerAccountBalanceMonitorRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): LedgerAccountBalanceMonitor =
        retrieve(id, LedgerAccountBalanceMonitorRetrieveParams.none(), requestOptions)

    /** Update a ledger account balance monitor. */
    suspend fun update(
        id: String,
        params: LedgerAccountBalanceMonitorUpdateParams =
            LedgerAccountBalanceMonitorUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): LedgerAccountBalanceMonitor =
        update(id, LedgerAccountBalanceMonitorUpdateParams.none(), requestOptions)

    /** Get a list of ledger account balance monitors. */
    suspend fun list(
        params: LedgerAccountBalanceMonitorListParams =
            LedgerAccountBalanceMonitorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitorListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): LedgerAccountBalanceMonitorListPageAsync =
        list(LedgerAccountBalanceMonitorListParams.none(), requestOptions)

    /** Delete a ledger account balance monitor. */
    suspend fun delete(
        id: String,
        params: LedgerAccountBalanceMonitorDeleteParams =
            LedgerAccountBalanceMonitorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** @see delete */
    suspend fun delete(id: String, requestOptions: RequestOptions): LedgerAccountBalanceMonitor =
        delete(id, LedgerAccountBalanceMonitorDeleteParams.none(), requestOptions)

    /**
     * A view of [LedgerAccountBalanceMonitorServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LedgerAccountBalanceMonitorServiceAsync.WithRawResponse

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
            id: String,
            params: LedgerAccountBalanceMonitorRetrieveParams =
                LedgerAccountBalanceMonitorRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: LedgerAccountBalanceMonitorRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountBalanceMonitor> =
            retrieve(id, LedgerAccountBalanceMonitorRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/ledger_account_balance_monitors/{id}`, but is
         * otherwise the same as [LedgerAccountBalanceMonitorServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LedgerAccountBalanceMonitorUpdateParams =
                LedgerAccountBalanceMonitorUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: LedgerAccountBalanceMonitorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountBalanceMonitor> =
            update(id, LedgerAccountBalanceMonitorUpdateParams.none(), requestOptions)

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

        /** @see list */
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
            id: String,
            params: LedgerAccountBalanceMonitorDeleteParams =
                LedgerAccountBalanceMonitorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: LedgerAccountBalanceMonitorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerAccountBalanceMonitor>

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LedgerAccountBalanceMonitor> =
            delete(id, LedgerAccountBalanceMonitorDeleteParams.none(), requestOptions)
    }
}
