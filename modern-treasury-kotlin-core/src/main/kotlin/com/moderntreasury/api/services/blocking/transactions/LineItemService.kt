// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.transactions

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.TransactionLineItem
import com.moderntreasury.api.models.TransactionLineItemCreateParams
import com.moderntreasury.api.models.TransactionLineItemDeleteParams
import com.moderntreasury.api.models.TransactionLineItemListPage
import com.moderntreasury.api.models.TransactionLineItemListParams
import com.moderntreasury.api.models.TransactionLineItemRetrieveParams

interface LineItemService {

    /** create transaction line items */
    fun create(
        params: TransactionLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** get transaction line item */
    fun retrieve(
        params: TransactionLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItem

    /** list transaction_line_items */
    fun list(
        params: TransactionLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionLineItemListPage

    /** delete transaction line item */
    fun delete(
        params: TransactionLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
