// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Ledger
import com.moderntreasury.api.models.LedgerCreateParams
import com.moderntreasury.api.models.LedgerDeleteParams
import com.moderntreasury.api.models.LedgerListPageAsync
import com.moderntreasury.api.models.LedgerListParams
import com.moderntreasury.api.models.LedgerRetrieveParams
import com.moderntreasury.api.models.LedgerUpdateParams

interface LedgerServiceAsync {

    /** Create a ledger. */
    suspend fun create(
        params: LedgerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** Get details on a single ledger. */
    suspend fun retrieve(
        params: LedgerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** Update the details of a ledger. */
    suspend fun update(
        params: LedgerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger

    /** Get a list of ledgers. */
    suspend fun list(
        params: LedgerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerListPageAsync

    /** Delete a ledger. */
    suspend fun delete(
        params: LedgerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Ledger
}
