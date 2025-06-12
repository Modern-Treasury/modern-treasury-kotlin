// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InvoiceServiceAsync

    fun lineItems(): LineItemServiceAsync

    /** create invoice */
    suspend fun create(
        params: InvoiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** get invoice */
    suspend fun retrieve(
        id: String,
        params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: InvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Invoice =
        retrieve(id, InvoiceRetrieveParams.none(), requestOptions)

    /** update invoice */
    suspend fun update(
        id: String,
        params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: InvoiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invoice

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): Invoice =
        update(id, InvoiceUpdateParams.none(), requestOptions)

    /** list invoices */
    suspend fun list(
        params: InvoiceListParams = InvoiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): InvoiceListPageAsync =
        list(InvoiceListParams.none(), requestOptions)

    /** Add a payment order to an invoice. */
    suspend fun addPaymentOrder(
        paymentOrderId: String,
        params: InvoiceAddPaymentOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = addPaymentOrder(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

    /** @see [addPaymentOrder] */
    suspend fun addPaymentOrder(
        params: InvoiceAddPaymentOrderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [InvoiceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InvoiceServiceAsync.WithRawResponse

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
            id: String,
            params: InvoiceRetrieveParams = InvoiceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: InvoiceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            retrieve(id, InvoiceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/invoices/{id}`, but is otherwise the same as
         * [InvoiceServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: InvoiceUpdateParams = InvoiceUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: InvoiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Invoice>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Invoice> =
            update(id, InvoiceUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/invoices`, but is otherwise the same as
         * [InvoiceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InvoiceListParams = InvoiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvoiceListPageAsync>

        /** @see [list] */
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
        suspend fun addPaymentOrder(
            params: InvoiceAddPaymentOrderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
