// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.ledgerAccountSettlements

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountSettlementAccountEntryDeleteParams
import com.moderntreasury.api.models.LedgerAccountSettlementAccountEntryUpdateParams

interface AccountEntryService {

    /** Add ledger entries to a draft ledger account settlement. */
    fun update(
        params: LedgerAccountSettlementAccountEntryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Remove ledger entries from a draft ledger account settlement. */
    fun delete(
        params: LedgerAccountSettlementAccountEntryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
