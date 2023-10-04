// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking.ledgerTransactions

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerTransactionVersionListPage
import com.moderntreasury.api.models.LedgerTransactionVersionListParams

interface VersionService {

    /** Get a list of ledger transaction versions. */
    fun list(
        params: LedgerTransactionVersionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransactionVersionListPage
}
