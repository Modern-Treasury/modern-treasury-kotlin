// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.PaymentReference
import com.moderntreasury.api.models.PaymentReferenceListPageAsync
import com.moderntreasury.api.models.PaymentReferenceListParams
import com.moderntreasury.api.models.PaymentReferenceRetireveParams
import com.moderntreasury.api.models.PaymentReferenceRetrieveParams

interface PaymentReferenceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PaymentReferenceServiceAsync

    /** get payment_reference */
    suspend fun retrieve(
        id: String,
        params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): PaymentReference =
        retrieve(id, PaymentReferenceRetrieveParams.none(), requestOptions)

    /** list payment_references */
    suspend fun list(
        params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReferenceListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PaymentReferenceListPageAsync =
        list(PaymentReferenceListParams.none(), requestOptions)

    /** get payment_reference */
    @Deprecated("use `retrieve` instead")
    suspend fun retireve(
        id: String,
        params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference = retireve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retireve */
    @Deprecated("use `retrieve` instead")
    suspend fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference

    /** @see retireve */
    @Deprecated("use `retrieve` instead")
    suspend fun retireve(id: String, requestOptions: RequestOptions): PaymentReference =
        retireve(id, PaymentReferenceRetireveParams.none(), requestOptions)

    /**
     * A view of [PaymentReferenceServiceAsync] that provides access to raw HTTP responses for each
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
        ): PaymentReferenceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: PaymentReferenceRetrieveParams = PaymentReferenceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentReferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> =
            retrieve(id, PaymentReferenceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_references`, but is otherwise the same
         * as [PaymentReferenceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReferenceListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PaymentReferenceListPageAsync> =
            list(PaymentReferenceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceServiceAsync.retireve].
         */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        suspend fun retireve(
            id: String,
            params: PaymentReferenceRetireveParams = PaymentReferenceRetireveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference> =
            retireve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retireve */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        suspend fun retireve(
            params: PaymentReferenceRetireveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference>

        /** @see retireve */
        @Deprecated("use `retrieve` instead")
        @MustBeClosed
        suspend fun retireve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentReference> =
            retireve(id, PaymentReferenceRetireveParams.none(), requestOptions)
    }
}
