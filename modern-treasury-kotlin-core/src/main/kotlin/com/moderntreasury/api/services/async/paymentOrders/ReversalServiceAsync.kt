// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.paymentOrders

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalListPageAsync
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.Reversal

interface ReversalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReversalServiceAsync

    /** Create a reversal for a payment order. */
    suspend fun create(
        paymentOrderId: String,
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reversal = create(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: PaymentOrderReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reversal

    /** Get details on a single reversal of a payment order. */
    suspend fun retrieve(
        reversalId: String,
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reversal = retrieve(params.toBuilder().reversalId(reversalId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: PaymentOrderReversalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Reversal

    /** Get a list of all reversals of a payment order. */
    suspend fun list(
        paymentOrderId: String,
        params: PaymentOrderReversalListParams = PaymentOrderReversalListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrderReversalListPageAsync =
        list(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: PaymentOrderReversalListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrderReversalListPageAsync

    /** @see [list] */
    suspend fun list(
        paymentOrderId: String,
        requestOptions: RequestOptions,
    ): PaymentOrderReversalListPageAsync =
        list(paymentOrderId, PaymentOrderReversalListParams.none(), requestOptions)

    /**
     * A view of [ReversalServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReversalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_orders/{payment_order_id}/reversals`,
         * but is otherwise the same as [ReversalServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            paymentOrderId: String,
            params: PaymentOrderReversalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reversal> =
            create(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: PaymentOrderReversalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reversal>

        /**
         * Returns a raw HTTP response for `get
         * /api/payment_orders/{payment_order_id}/reversals/{reversal_id}`, but is otherwise the
         * same as [ReversalServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            reversalId: String,
            params: PaymentOrderReversalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reversal> =
            retrieve(params.toBuilder().reversalId(reversalId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentOrderReversalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Reversal>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders/{payment_order_id}/reversals`,
         * but is otherwise the same as [ReversalServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            paymentOrderId: String,
            params: PaymentOrderReversalListParams = PaymentOrderReversalListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrderReversalListPageAsync> =
            list(params.toBuilder().paymentOrderId(paymentOrderId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: PaymentOrderReversalListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrderReversalListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            paymentOrderId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentOrderReversalListPageAsync> =
            list(paymentOrderId, PaymentOrderReversalListParams.none(), requestOptions)
    }
}
