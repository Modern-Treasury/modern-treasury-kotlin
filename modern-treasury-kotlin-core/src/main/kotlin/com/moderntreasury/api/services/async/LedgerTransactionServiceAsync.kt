// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.LedgerTransaction
import com.moderntreasury.api.models.LedgerTransactionCreateParams
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionListPageAsync
import com.moderntreasury.api.models.LedgerTransactionListParams
import com.moderntreasury.api.models.LedgerTransactionRetrieveParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.services.async.ledgerTransactions.VersionServiceAsync

interface LedgerTransactionServiceAsync {

    fun versions(): VersionServiceAsync

    /** Create a ledger transaction. */
    suspend fun create(
        params: LedgerTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransaction

    /** Get details on a single ledger transaction. */
    suspend fun retrieve(
        params: LedgerTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransaction

    /** Update the details of a ledger transaction. */
    suspend fun update(
        params: LedgerTransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransaction

    /** Get a list of ledger transactions. */
    suspend fun list(
        params: LedgerTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransactionListPageAsync

    /** Create a ledger transaction reversal. */
    suspend fun createReversal(
        params: LedgerTransactionCreateReversalParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): LedgerTransaction
}
