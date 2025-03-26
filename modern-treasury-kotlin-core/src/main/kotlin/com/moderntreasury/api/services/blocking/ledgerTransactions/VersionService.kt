// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.ledgerTransactions

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LedgerTransactionVersionListPage
import com.moderntreasury.api.models.LedgerTransactionVersionListParams

interface VersionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a list of ledger transaction versions. */
    fun list(
        params: LedgerTransactionVersionListParams = LedgerTransactionVersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransactionVersionListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LedgerTransactionVersionListPage =
        list(LedgerTransactionVersionListParams.none(), requestOptions)

    /** A view of [VersionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/ledger_transaction_versions`, but is otherwise
         * the same as [VersionService.list].
         */
        @MustBeClosed
        fun list(
            params: LedgerTransactionVersionListParams = LedgerTransactionVersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LedgerTransactionVersionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LedgerTransactionVersionListPage> =
            list(LedgerTransactionVersionListParams.none(), requestOptions)
    }
}
