// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentFlow
import com.moderntreasury.api.models.PaymentFlowCreateParams
import com.moderntreasury.api.models.PaymentFlowListPageAsync
import com.moderntreasury.api.models.PaymentFlowListParams
import com.moderntreasury.api.models.PaymentFlowRetrieveParams
import com.moderntreasury.api.models.PaymentFlowUpdateParams

interface PaymentFlowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentFlowServiceAsync

    /** create payment_flow */
    suspend fun create(
        params: PaymentFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow

    /** get payment_flow */
    suspend fun retrieve(
        id: String,
        params: PaymentFlowRetrieveParams = PaymentFlowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PaymentFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): PaymentFlow =
        retrieve(id, PaymentFlowRetrieveParams.none(), requestOptions)

    /** update payment_flow */
    suspend fun update(
        id: String,
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: PaymentFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlow

    /** list payment_flows */
    suspend fun list(
        params: PaymentFlowListParams = PaymentFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentFlowListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PaymentFlowListPageAsync =
        list(PaymentFlowListParams.none(), requestOptions)

    /**
     * A view of [PaymentFlowServiceAsync] that provides access to raw HTTP responses for each
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
        ): PaymentFlowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_flows`, but is otherwise the same as
         * [PaymentFlowServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PaymentFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlow>

        /**
         * Returns a raw HTTP response for `get /api/payment_flows/{id}`, but is otherwise the same
         * as [PaymentFlowServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: PaymentFlowRetrieveParams = PaymentFlowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlow> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlow>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentFlow> =
            retrieve(id, PaymentFlowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/payment_flows/{id}`, but is otherwise the
         * same as [PaymentFlowServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: PaymentFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlow> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: PaymentFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlow>

        /**
         * Returns a raw HTTP response for `get /api/payment_flows`, but is otherwise the same as
         * [PaymentFlowServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PaymentFlowListParams = PaymentFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentFlowListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PaymentFlowListPageAsync> =
            list(PaymentFlowListParams.none(), requestOptions)
    }
}
