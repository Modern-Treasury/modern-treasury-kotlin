@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.async.transactions

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.TransactionLineItem
import com.moderntreasury.api.models.TransactionLineItemListPageAsync
import com.moderntreasury.api.models.TransactionLineItemListParams
import com.moderntreasury.api.models.TransactionLineItemRetrieveParams

interface LineItemServiceAsync {

    /** get transaction line item */
    suspend fun retrieve(
        params: TransactionLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionLineItem

    /** list transaction_line_items */
    suspend fun list(
        params: TransactionLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionLineItemListPageAsync
}
