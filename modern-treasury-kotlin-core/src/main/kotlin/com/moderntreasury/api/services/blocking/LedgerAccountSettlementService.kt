// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountSettlement
import com.moderntreasury.api.models.LedgerAccountSettlementCreateParams
import com.moderntreasury.api.models.LedgerAccountSettlementListPage
import com.moderntreasury.api.models.LedgerAccountSettlementListParams
import com.moderntreasury.api.models.LedgerAccountSettlementRetrieveParams
import com.moderntreasury.api.models.LedgerAccountSettlementUpdateParams
import com.moderntreasury.api.services.blocking.ledgerAccountSettlements.AccountEntryService

interface LedgerAccountSettlementService {

    fun accountEntries(): AccountEntryService

    /** Create a ledger account settlement. */
    fun create(
        params: LedgerAccountSettlementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Get details on a single ledger account settlement. */
    fun retrieve(
        params: LedgerAccountSettlementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Update the details of a ledger account settlement. */
    fun update(
        params: LedgerAccountSettlementUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlement

    /** Get a list of ledger account settlements. */
    fun list(
        params: LedgerAccountSettlementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountSettlementListPage
}
