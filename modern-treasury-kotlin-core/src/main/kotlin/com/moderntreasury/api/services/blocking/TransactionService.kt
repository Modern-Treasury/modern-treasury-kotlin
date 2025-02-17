// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Transaction
import com.moderntreasury.api.models.TransactionCreateParams
import com.moderntreasury.api.models.TransactionDeleteParams
import com.moderntreasury.api.models.TransactionListPage
import com.moderntreasury.api.models.TransactionListParams
import com.moderntreasury.api.models.TransactionRetrieveParams
import com.moderntreasury.api.models.TransactionUpdateParams
import com.moderntreasury.api.services.blocking.transactions.LineItemService

interface TransactionService {

    fun lineItems(): LineItemService

    /** create transaction */
    fun create(
        params: TransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** Get details on a single transaction. */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** Update a single transaction. */
    fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** Get a list of all transactions. */
    fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListPage

    /** delete transaction */
    fun delete(
        params: TransactionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
