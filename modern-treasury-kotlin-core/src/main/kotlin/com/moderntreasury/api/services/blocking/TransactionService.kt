@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Transaction
import com.moderntreasury.api.models.TransactionListPage
import com.moderntreasury.api.models.TransactionListParams
import com.moderntreasury.api.models.TransactionRetrieveParams
import com.moderntreasury.api.models.TransactionUpdateParams
import com.moderntreasury.api.services.blocking.transactions.LineItemService

interface TransactionService {

    fun lineItems(): LineItemService

    /** Get details on a single transaction. */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction

    /** Update a single transaction. */
    fun update(
        params: TransactionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction

    /** Get a list of all transactions. */
    fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionListPage
}
