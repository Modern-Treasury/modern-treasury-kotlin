// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.PaymentOrder
import com.moderntreasury.api.models.PaymentOrderAsyncCreate
import com.moderntreasury.api.models.PaymentOrderCreateAsyncParams
import com.moderntreasury.api.models.PaymentOrderCreateParams
import com.moderntreasury.api.models.PaymentOrderListPageAsync
import com.moderntreasury.api.models.PaymentOrderListParams
import com.moderntreasury.api.models.PaymentOrderRetrieveParams
import com.moderntreasury.api.models.PaymentOrderUpdateParams
import com.moderntreasury.api.services.async.paymentOrders.ReversalServiceAsync

interface PaymentOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentOrderServiceAsync

    fun reversals(): ReversalServiceAsync

    /** Create a new Payment Order */
    suspend fun create(
        params: PaymentOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** Get details on a single payment order */
    suspend fun retrieve(
        id: String,
        params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PaymentOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): PaymentOrder =
        retrieve(id, PaymentOrderRetrieveParams.none(), requestOptions)

    /** Update a payment order */
    suspend fun update(
        id: String,
        params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: PaymentOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrder

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): PaymentOrder =
        update(id, PaymentOrderUpdateParams.none(), requestOptions)

    /** Get a list of all payment orders */
    suspend fun list(
        params: PaymentOrderListParams = PaymentOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentOrderListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PaymentOrderListPageAsync =
        list(PaymentOrderListParams.none(), requestOptions)

    /** Create a new payment order asynchronously */
    suspend fun createAsync(
        params: PaymentOrderCreateAsyncParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncResponse

    /** @see createAsync */
    suspend fun createAsync(
        paymentOrderAsyncCreate: PaymentOrderAsyncCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncResponse =
        createAsync(
            PaymentOrderCreateAsyncParams.builder()
                .paymentOrderAsyncCreate(paymentOrderAsyncCreate)
                .build(),
            requestOptions,
        )

    /**
     * A view of [PaymentOrderServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentOrderServiceAsync.WithRawResponse

        fun reversals(): ReversalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PaymentOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /**
         * Returns a raw HTTP response for `get /api/payment_orders/{id}`, but is otherwise the same
         * as [PaymentOrderServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: PaymentOrderRetrieveParams = PaymentOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentOrder> =
            retrieve(id, PaymentOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/payment_orders/{id}`, but is otherwise the
         * same as [PaymentOrderServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: PaymentOrderUpdateParams = PaymentOrderUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: PaymentOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrder>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentOrder> =
            update(id, PaymentOrderUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_orders`, but is otherwise the same as
         * [PaymentOrderServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PaymentOrderListParams = PaymentOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentOrderListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PaymentOrderListPageAsync> =
            list(PaymentOrderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/payment_orders/create_async`, but is otherwise
         * the same as [PaymentOrderServiceAsync.createAsync].
         */
        @MustBeClosed
        suspend fun createAsync(
            params: PaymentOrderCreateAsyncParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AsyncResponse>

        /** @see createAsync */
        @MustBeClosed
        suspend fun createAsync(
            paymentOrderAsyncCreate: PaymentOrderAsyncCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AsyncResponse> =
            createAsync(
                PaymentOrderCreateAsyncParams.builder()
                    .paymentOrderAsyncCreate(paymentOrderAsyncCreate)
                    .build(),
                requestOptions,
            )
    }
}
