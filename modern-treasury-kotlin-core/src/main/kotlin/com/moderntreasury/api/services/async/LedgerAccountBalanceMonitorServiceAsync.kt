// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerAccountBalanceMonitor
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorCreateParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorDeleteParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListPageAsync
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorListParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorRetrieveParams
import com.moderntreasury.api.models.LedgerAccountBalanceMonitorUpdateParams

interface LedgerAccountBalanceMonitorServiceAsync {

    /** Create a ledger account balance monitor. */
    suspend fun create(
        params: LedgerAccountBalanceMonitorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get details on a single ledger account balance monitor. */
    suspend fun retrieve(
        params: LedgerAccountBalanceMonitorRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Update a ledger account balance monitor. */
    suspend fun update(
        params: LedgerAccountBalanceMonitorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor

    /** Get a list of ledger account balance monitors. */
    suspend fun list(
        params: LedgerAccountBalanceMonitorListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitorListPageAsync

    /** Delete a ledger account balance monitor. */
    suspend fun delete(
        params: LedgerAccountBalanceMonitorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LedgerAccountBalanceMonitor
}
