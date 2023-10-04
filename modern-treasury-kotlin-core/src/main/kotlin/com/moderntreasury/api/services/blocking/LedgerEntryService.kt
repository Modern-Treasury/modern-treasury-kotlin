// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerEntry
import com.moderntreasury.api.models.LedgerEntryListPage
import com.moderntreasury.api.models.LedgerEntryListParams
import com.moderntreasury.api.models.LedgerEntryRetrieveParams

interface LedgerEntryService {

    /** Get details on a single ledger entry. */
    fun retrieve(
        params: LedgerEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerEntry

    /** Get a list of all ledger entries. */
    fun list(
        params: LedgerEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerEntryListPage
}
