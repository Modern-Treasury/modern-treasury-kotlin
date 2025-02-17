// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerEntry
import com.moderntreasury.api.models.LedgerEntryListPage
import com.moderntreasury.api.models.LedgerEntryListParams
import com.moderntreasury.api.models.LedgerEntryRetrieveParams
import com.moderntreasury.api.models.LedgerEntryUpdateParams

interface LedgerEntryService {

    /** Get details on a single ledger entry. */
    fun retrieve(
        params: LedgerEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntry

    /** Update the details of a ledger entry. */
    fun update(
        params: LedgerEntryUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntry

    /** Get a list of all ledger entries. */
    fun list(
        params: LedgerEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerEntryListPage
}
