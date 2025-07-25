// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentActionCreateParams
import com.moderntreasury.api.models.PaymentActionCreateResponse
import com.moderntreasury.api.models.PaymentActionListPage
import com.moderntreasury.api.models.PaymentActionListParams
import com.moderntreasury.api.models.PaymentActionRetrieveParams
import com.moderntreasury.api.models.PaymentActionRetrieveResponse
import com.moderntreasury.api.models.PaymentActionUpdateParams
import com.moderntreasury.api.models.PaymentActionUpdateResponse

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
    ): PaymentActionCreateResponse

    /** Get details on a single payment action. */
    fun retrieve(
        id: String,
        params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentActionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: PaymentActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentActionRetrieveResponse

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): PaymentActionRetrieveResponse =
        retrieve(id, PaymentActionRetrieveParams.none(), requestOptions)

    /** Update a single payment action. */
    fun update(
        id: String,
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentActionUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: PaymentActionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentActionUpdateResponse

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
        ): HttpResponseFor<PaymentActionCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/payment_actions/{id}`, but is otherwise the
         * same as [PaymentActionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentActionRetrieveParams = PaymentActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentActionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PaymentActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentActionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentActionRetrieveResponse> =
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
        ): HttpResponseFor<PaymentActionUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: PaymentActionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentActionUpdateResponse>

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
