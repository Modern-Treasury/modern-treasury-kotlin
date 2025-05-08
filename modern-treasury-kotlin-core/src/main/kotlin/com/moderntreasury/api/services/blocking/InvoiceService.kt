// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Invoice
import com.moderntreasury.api.models.InvoiceAddPaymentOrderParams
import com.moderntreasury.api.models.InvoiceCreateParams
import com.moderntreasury.api.models.InvoiceListPage
import com.moderntreasury.api.models.InvoiceListParams
import com.moderntreasury.api.models.InvoiceRetrieveParams
import com.moderntreasury.api.models.InvoiceUpdateParams
import com.moderntreasury.api.services.blocking.invoices.LineItemService

interface InvoiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun lineItems(): LineItemService

    /** create invoice */
    fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** get invoice */
    fun retrieve(
        id: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): Invoice =
        retrieve(id, InvoiceRetrieveParams.none(), requestOptions)

    /** update invoice */
    fun update(
        id: String,
        params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): Invoice =
        update(id, InvoiceUpdateParams.none(), requestOptions)

    /** list invoices */
    fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InvoiceListPage =
        list(InvoiceListParams.none(), requestOptions)

    /** Add a payment order to an invoice. */
    fun addPaymentOrder(
        paymentOrderId: String,
        params: InvoiceAddPaymentOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addPaymentOrder(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

    /** @see [addPaymentOrder] */
    fun addPaymentOrder(
        params: InvoiceAddPaymentOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [InvoiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun lineItems(): LineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/invoices`, but is otherwise the same as
         * [InvoiceService.create].
         */
        @MustBeClosed
        fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /api/invoices/{id}`, but is otherwise the same as
         * [InvoiceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            retrieve(id, InvoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/invoices/{id}`, but is otherwise the same as
         * [InvoiceService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            update(id, InvoiceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/invoices`, but is otherwise the same as
         * [InvoiceService.list].
         */
        @MustBeClosed
        fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPage> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /api/invoices/{id}/payment_orders/{payment_order_id}`, but is otherwise the same as
         * [InvoiceService.addPaymentOrder].
         */
        @MustBeClosed
        fun addPaymentOrder(
            paymentOrderId: String,
            params: InvoiceAddPaymentOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            addPaymentOrder(
                params.toBuilder().paymentOrderId(paymentOrderId).build(),
                requestOptions,
            )

        /** @see [addPaymentOrder] */
        @MustBeClosed
        fun addPaymentOrder(
            params: InvoiceAddPaymentOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
