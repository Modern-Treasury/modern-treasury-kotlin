@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking.transactions

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.TransactionLineItemListPage
import com.moderntreasury.api.models.TransactionLineItemListParams

interface LineItemService {

    /** list transaction_line_items */
    fun list(
        params: TransactionLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionLineItemListPage
}
