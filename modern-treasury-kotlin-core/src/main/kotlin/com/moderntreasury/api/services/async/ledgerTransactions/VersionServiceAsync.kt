// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.ledgerTransactions

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerTransactionVersionListPageAsync
import com.moderntreasury.api.models.LedgerTransactionVersionListParams

interface VersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VersionServiceAsync

    /** Get a list of ledger transaction versions. */
    suspend fun list(
        params: LedgerTransactionVersionListParams = LedgerTransactionVersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransactionVersionListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): LedgerTransactionVersionListPageAsync =
        list(LedgerTransactionVersionListParams.none(), requestOptions)

    /**
     * A view of [VersionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): VersionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/ledger_transaction_versions`, but is otherwise
         * the same as [VersionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LedgerTransactionVersionListParams = LedgerTransactionVersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransactionVersionListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerTransactionVersionListPageAsync> =
            list(LedgerTransactionVersionListParams.none(), requestOptions)
    }
}
