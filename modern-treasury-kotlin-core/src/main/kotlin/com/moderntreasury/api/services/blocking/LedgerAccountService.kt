// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccount
import com.moderntreasury.api.models.LedgerAccountCreateParams
import com.moderntreasury.api.models.LedgerAccountDeleteParams
import com.moderntreasury.api.models.LedgerAccountListPage
import com.moderntreasury.api.models.LedgerAccountListParams
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams

interface LedgerAccountService {

    /** Create a ledger account. */
    fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccount

    /** Get details on a single ledger account. */
    fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccount

    /** Update the details of a ledger account. */
    fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccount

    /** Get a list of ledger accounts. */
    fun list(
        params: LedgerAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountListPage

    /** Delete a ledger account. */
    fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccount
}
