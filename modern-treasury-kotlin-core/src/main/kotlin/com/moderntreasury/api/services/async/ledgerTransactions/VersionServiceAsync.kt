@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async.ledgerTransactions

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerTransactionVersionListPageAsync
import com.moderntreasury.api.models.LedgerTransactionVersionListParams

interface VersionServiceAsync {

    /** Get a list of ledger transaction versions. */
    suspend fun list(
        params: LedgerTransactionVersionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransactionVersionListPageAsync
}
