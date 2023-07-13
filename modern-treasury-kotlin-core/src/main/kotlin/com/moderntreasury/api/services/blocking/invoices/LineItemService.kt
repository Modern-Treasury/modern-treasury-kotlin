@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.moderntreasury.api.services.blocking.invoices

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.InvoiceLineItem
import com.moderntreasury.api.models.InvoiceLineItemCreateParams
import com.moderntreasury.api.models.InvoiceLineItemDeleteParams
import com.moderntreasury.api.models.InvoiceLineItemListPage
import com.moderntreasury.api.models.InvoiceLineItemListParams
import com.moderntreasury.api.models.InvoiceLineItemRetrieveParams
import com.moderntreasury.api.models.InvoiceLineItemUpdateParams

interface LineItemService {

    /** create invoice_line_item */
    fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InvoiceLineItem

    /** get invoice_line_item */
    fun retrieve(
        params: InvoiceLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InvoiceLineItem

    /** update invoice_line_item */
    fun update(
        params: InvoiceLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InvoiceLineItem

    /** list invoice_line_items */
    fun list(
        params: InvoiceLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InvoiceLineItemListPage

    /** delete invoice_line_item */
    fun delete(
        params: InvoiceLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InvoiceLineItem
}
