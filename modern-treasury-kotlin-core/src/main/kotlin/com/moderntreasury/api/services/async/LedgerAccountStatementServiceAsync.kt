// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountStatementCreateParams
import com.moderntreasury.api.models.LedgerAccountStatementCreateResponse
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountStatementRetrieveResponse

interface LedgerAccountStatementServiceAsync {

    /** Create a ledger account statement. */
    suspend fun create(
        params: LedgerAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatementCreateResponse

    /** Get details on a single ledger account statement. */
    suspend fun retrieve(
        params: LedgerAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountStatementRetrieveResponse
}
