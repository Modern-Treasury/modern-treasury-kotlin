// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountPayout
import com.moderntreasury.api.models.LedgerAccountPayoutCreateParams
import com.moderntreasury.api.models.LedgerAccountPayoutListPage
import com.moderntreasury.api.models.LedgerAccountPayoutListParams
import com.moderntreasury.api.models.LedgerAccountPayoutRetireveParams
import com.moderntreasury.api.models.LedgerAccountPayoutRetrieveParams
import com.moderntreasury.api.models.LedgerAccountPayoutUpdateParams

interface LedgerAccountPayoutService {

    /** Create a ledger account payout. */
    fun create(
        params: LedgerAccountPayoutCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountPayout

    /** Get details on a single ledger account payout. */
    fun retrieve(
        params: LedgerAccountPayoutRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountPayout

    /** Update the details of a ledger account payout. */
    fun update(
        params: LedgerAccountPayoutUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountPayout

    /** Get a list of ledger account payouts. */
    fun list(
        params: LedgerAccountPayoutListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountPayoutListPage

    /** Get details on a single ledger account payout. */
    @Deprecated("use `retrieve` instead")
    fun retireve(
        params: LedgerAccountPayoutRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountPayout
}
