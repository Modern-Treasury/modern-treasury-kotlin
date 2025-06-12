// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPage
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams

interface PaymentReferenceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentReferenceService

    /** get payment_reference */
    fun retrieve(
        id: String,
        params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): PaymentReference =
        retrieve(id, PaymentReferenceRetrieveParams.none(), requestOptions)

    /** list payment_references */
    fun list(
        params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReferenceListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PaymentReferenceListPage =
        list(PaymentReferenceListParams.none(), requestOptions)

    /** get payment_reference */
    @Deprecated("use `retrieve` instead")
    fun retireve(
        id: String,
        params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference = retireve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference

    /** @see [retireve] */
    @Deprecated("use `retrieve` instead")
    fun retireve(id: String, requestOptions: RequestOptions): PaymentReference =
        retireve(id, PaymentReferenceRetireveParams.none(), requestOptions)

    /**
     * A view of [PaymentReferenceService] that provides access to raw HTTP responses for each
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
        ): PaymentReferenceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentReferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> =
            retrieve(id, PaymentReferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_references`, but is otherwise the same
         * as [PaymentReferenceService.list].
         */
        @MustBeClosed
        fun list(
            params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReferenceListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentReferenceListPage> =
            list(PaymentReferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceService.retireve].
         */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            id: String,
            params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference> =
            retireve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            params: PaymentReferenceRetireveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference>

        /** @see [retireve] */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        fun retireve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> =
            retireve(id, PaymentReferenceRetireveParams.none(), requestOptions)
    }
}
