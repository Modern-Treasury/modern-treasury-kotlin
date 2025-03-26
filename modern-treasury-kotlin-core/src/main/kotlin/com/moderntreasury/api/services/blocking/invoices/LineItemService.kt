// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.invoices

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.InvoiceLineItem
import com.moderntreasury.api.models.InvoiceLineItemCreateParams
import com.moderntreasury.api.models.InvoiceLineItemDeleteParams
import com.moderntreasury.api.models.InvoiceLineItemListPage
import com.moderntreasury.api.models.InvoiceLineItemListParams
import com.moderntreasury.api.models.InvoiceLineItemRetrieveParams
import com.moderntreasury.api.models.InvoiceLineItemUpdateParams

interface LineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create invoice_line_item */
    fun create(
        params: InvoiceLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceLineItem

    /** get invoice_line_item */
    fun retrieve(
        params: InvoiceLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceLineItem

    /** update invoice_line_item */
    fun update(
        params: InvoiceLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceLineItem

    /** list invoice_line_items */
    fun list(
        params: InvoiceLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceLineItemListPage

    /** delete invoice_line_item */
    fun delete(
        params: InvoiceLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceLineItem

    /** A view of [LineItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/invoices/{invoice_id}/invoice_line_items`, but
         * is otherwise the same as [LineItemService.create].
         */
        @MustBeClosed
        fun create(
            params: InvoiceLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceLineItem>

        /**
         * Returns a raw HTTP response for `get /api/invoices/{invoice_id}/invoice_line_items/{id}`,
         * but is otherwise the same as [LineItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: InvoiceLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceLineItem>

        /**
         * Returns a raw HTTP response for `patch
         * /api/invoices/{invoice_id}/invoice_line_items/{id}`, but is otherwise the same as
         * [LineItemService.update].
         */
        @MustBeClosed
        fun update(
            params: InvoiceLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceLineItem>

        /**
         * Returns a raw HTTP response for `get /api/invoices/{invoice_id}/invoice_line_items`, but
         * is otherwise the same as [LineItemService.list].
         */
        @MustBeClosed
        fun list(
            params: InvoiceLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceLineItemListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /api/invoices/{invoice_id}/invoice_line_items/{id}`, but is otherwise the same as
         * [LineItemService.delete].
         */
        @MustBeClosed
        fun delete(
            params: InvoiceLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceLineItem>
    }
}
