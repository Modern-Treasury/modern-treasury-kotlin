// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentAction
import com.moderntreasury.api.models.PaymentActionCreateParams
import com.moderntreasury.api.models.PaymentActionListPageAsync
import com.moderntreasury.api.models.PaymentActionListParams
import com.moderntreasury.api.models.PaymentActionRetrieveParams
import com.moderntreasury.api.models.PaymentActionUpdateParams

interface PaymentActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentActionServiceAsync

    /** Create a payment action. */
    suspend fun create(
        params: PaymentActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction

    /** Get details on a single payment action. */
    suspend fun retrieve(
        id: String,
        params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PaymentActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): PaymentAction =
        retrieve(id, PaymentActionRetrieveParams.none(), requestOptions)

    /** Update a single payment action. */
    suspend fun update(
        id: String,
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction

    /** Get a list of all payment actions. */
    suspend fun list(
        params: PaymentActionListParams = PaymentActionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentActionListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PaymentActionListPageAsync =
        list(PaymentActionListParams.none(), requestOptions)

    /**
     * A view of [PaymentActionServiceAsync] that provides access to raw HTTP responses for each
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
        ): PaymentActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_actions`, but is otherwise the same as
         * [PaymentActionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PaymentActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction>

        /**
         * Returns a raw HTTP response for `get /api/payment_actions/{id}`, but is otherwise the
         * same as [PaymentActionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentAction> =
            retrieve(id, PaymentActionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/payment_actions/{id}`, but is otherwise the
         * same as [PaymentActionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction>

        /**
         * Returns a raw HTTP response for `get /api/payment_actions`, but is otherwise the same as
         * [PaymentActionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PaymentActionListParams = PaymentActionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentActionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PaymentActionListPageAsync> =
            list(PaymentActionListParams.none(), requestOptions)
    }
}
