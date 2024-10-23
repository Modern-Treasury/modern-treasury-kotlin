// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.Invoice
import com.moderntreasury.api.models.InvoiceAddPaymentOrderParams
import com.moderntreasury.api.models.InvoiceCreateParams
import com.moderntreasury.api.models.InvoiceListPageAsync
import com.moderntreasury.api.models.InvoiceListParams
import com.moderntreasury.api.models.InvoiceRetrieveParams
import com.moderntreasury.api.models.InvoiceUpdateParams
import com.moderntreasury.api.services.async.invoices.LineItemServiceAsync

interface InvoiceServiceAsync {

    fun lineItems(): LineItemServiceAsync

    /** create invoice */
    suspend fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Invoice

    /** get invoice */
    suspend fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Invoice

    /** update invoice */
    suspend fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Invoice

    /** list invoices */
    suspend fun list(
        params: InvoiceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InvoiceListPageAsync

    /** Add a payment order to an invoice. */
    suspend fun addPaymentOrder(
        params: InvoiceAddPaymentOrderParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
