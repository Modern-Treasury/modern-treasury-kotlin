// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Transaction
import com.moderntreasury.api.models.TransactionListPageAsync
import com.moderntreasury.api.models.TransactionListParams
import com.moderntreasury.api.models.TransactionRetrieveParams
import com.moderntreasury.api.models.TransactionUpdateParams
import com.moderntreasury.api.services.async.transactions.LineItemServiceAsync

interface TransactionServiceAsync {

    fun lineItems(): LineItemServiceAsync

    /** Get details on a single transaction. */
    suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction

    /** Update a single transaction. */
    suspend fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction

    /** Get a list of all transactions. */
    suspend fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionListPageAsync
}
