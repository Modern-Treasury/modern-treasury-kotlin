// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccount
import com.moderntreasury.api.models.LedgerAccountCreateParams
import com.moderntreasury.api.models.LedgerAccountDeleteParams
import com.moderntreasury.api.models.LedgerAccountListPageAsync
import com.moderntreasury.api.models.LedgerAccountListParams
import com.moderntreasury.api.models.LedgerAccountRetrieveParams
import com.moderntreasury.api.models.LedgerAccountUpdateParams

interface LedgerAccountServiceAsync {

    /** Create a ledger account. */
    suspend fun create(
        params: LedgerAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccount

    /** Get details on a single ledger account. */
    suspend fun retrieve(
        params: LedgerAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccount

    /** Update the details of a ledger account. */
    suspend fun update(
        params: LedgerAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccount

    /** Get a list of ledger accounts. */
    suspend fun list(
        params: LedgerAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccountListPageAsync

    /** Delete a ledger account. */
    suspend fun delete(
        params: LedgerAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerAccount
}
