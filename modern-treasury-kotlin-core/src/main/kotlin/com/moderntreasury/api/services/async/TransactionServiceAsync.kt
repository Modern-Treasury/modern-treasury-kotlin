// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Transaction
import com.moderntreasury.api.models.TransactionCreateParams
import com.moderntreasury.api.models.TransactionDeleteParams
import com.moderntreasury.api.models.TransactionListPageAsync
import com.moderntreasury.api.models.TransactionListParams
import com.moderntreasury.api.models.TransactionRetrieveParams
import com.moderntreasury.api.models.TransactionUpdateParams
import com.moderntreasury.api.services.async.transactions.LineItemServiceAsync

interface TransactionServiceAsync {

    fun lineItems(): LineItemServiceAsync

    /** create transaction */
    suspend fun create(
        params: TransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** Get details on a single transaction. */
    suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** Update a single transaction. */
    suspend fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** Get a list of all transactions. */
    suspend fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListPageAsync

    /** delete transaction */
    suspend fun delete(
        params: TransactionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
