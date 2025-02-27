// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.ledgerTransactions

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerTransactionVersionListPageAsync
import com.moderntreasury.api.models.LedgerTransactionVersionListParams

interface VersionServiceAsync {

    /** Get a list of ledger transaction versions. */
    suspend fun list(
        params: LedgerTransactionVersionListParams = LedgerTransactionVersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerTransactionVersionListPageAsync

    /** Get a list of ledger transaction versions. */
    suspend fun list(requestOptions: RequestOptions): LedgerTransactionVersionListPageAsync =
        list(LedgerTransactionVersionListParams.none(), requestOptions)
}
