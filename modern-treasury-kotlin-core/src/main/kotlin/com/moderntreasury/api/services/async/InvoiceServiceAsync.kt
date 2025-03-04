// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Invoice
import com.moderntreasury.api.models.InvoiceAddPaymentOrderParams
import com.moderntreasury.api.models.InvoiceCreateParams
import com.moderntreasury.api.models.InvoiceListPageAsync
import com.moderntreasury.api.models.InvoiceListParams
import com.moderntreasury.api.models.InvoiceRetrieveParams
import com.moderntreasury.api.models.InvoiceUpdateParams
import com.moderntreasury.api.services.async.invoices.LineItemServiceAsync

interface InvoiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun lineItems(): LineItemServiceAsync

    /** create invoice */
    suspend fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** get invoice */
    suspend fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** update invoice */
    suspend fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** list invoices */
    suspend fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPageAsync

    /** list invoices */
    suspend fun list(requestOptions: RequestOptions): InvoiceListPageAsync =
        list(InvoiceListParams.none(), requestOptions)

    /** Add a payment order to an invoice. */
    suspend fun addPaymentOrder(
        params: InvoiceAddPaymentOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun lineItems(): LineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: InvoiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /api/invoices/{id}`, but is otherwise the same as
         * [InvoiceServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `patch /api/invoices/{id}`, but is otherwise the same as
         * [InvoiceServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /**
         * Returns a raw HTTP response for `get /api/invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPageAsync>

        /**
         * Returns a raw HTTP response for `get /api/invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<InvoiceListPageAsync> =
            list(InvoiceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /api/invoices/{id}/payment_orders/{payment_order_id}`, but is otherwise the same as
         * [InvoiceServiceAsync.addPaymentOrder].
         */
        @MustBeClosed
        suspend fun addPaymentOrder(
            params: InvoiceAddPaymentOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
