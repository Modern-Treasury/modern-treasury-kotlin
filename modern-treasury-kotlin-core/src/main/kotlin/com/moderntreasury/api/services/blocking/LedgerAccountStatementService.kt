@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementCreateResponse
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveResponse

interface LedgerAccountStatementService {

    /** Create a ledger account statement. */
    fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountStatementCreateResponse

    /** Get details on a single ledger account statement. */
    fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountStatementRetrieveResponse
}
