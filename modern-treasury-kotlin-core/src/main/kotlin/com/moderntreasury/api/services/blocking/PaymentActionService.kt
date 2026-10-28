// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentAction
import com.moderntreasury.api.models.PaymentActionCreateParams
import com.moderntreasury.api.models.PaymentActionListPage
import com.moderntreasury.api.models.PaymentActionListParams
import com.moderntreasury.api.models.PaymentActionRetrieveParams
import com.moderntreasury.api.models.PaymentActionUpdateParams

interface PaymentActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentActionService

    /** Create a payment action. */
    fun create(
        params: PaymentActionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction

    /** Get details on a single payment action. */
    fun retrieve(
        id: String,
        params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PaymentActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PaymentAction =
        retrieve(id, PaymentActionRetrieveParams.none(), requestOptions)

    /** Update a single payment action. */
    fun update(
        id: String,
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentAction

    /** Get a list of all payment actions. */
    fun list(
        params: PaymentActionListParams = PaymentActionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentActionListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): PaymentActionListPage =
        list(PaymentActionListParams.none(), requestOptions)

    /**
     * A view of [PaymentActionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PaymentActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/payment_actions`, but is otherwise the same as
         * [PaymentActionService.create].
         */
        @MustBeClosed
        fun create(
            params: PaymentActionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction>

        /**
         * Returns a raw HTTP response for `get /api/payment_actions/{id}`, but is otherwise the
         * same as [PaymentActionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PaymentActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<PaymentAction> =
            retrieve(id, PaymentActionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/payment_actions/{id}`, but is otherwise the
         * same as [PaymentActionService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentAction>

        /**
         * Returns a raw HTTP response for `get /api/payment_actions`, but is otherwise the same as
         * [PaymentActionService.list].
         */
        @MustBeClosed
        fun list(
            params: PaymentActionListParams = PaymentActionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentActionListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentActionListPage> =
            list(PaymentActionListParams.none(), requestOptions)
    }
}
