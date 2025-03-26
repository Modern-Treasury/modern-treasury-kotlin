// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
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

    /** get payment_reference */
    suspend fun retrieve(
        params: PaymentReferenceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference

    /** list payment_references */
    suspend fun list(
        params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReferenceListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): PaymentReferenceListPageAsync =
        list(PaymentReferenceListParams.none(), requestOptions)

    /** get payment_reference */
    @Deprecated("use `retrieve` instead")
    suspend fun retireve(
        params: PaymentReferenceRetireveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentReference

    /**
     * A view of [PaymentReferenceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/payment_references/{id}`, but is otherwise the
         * same as [PaymentReferenceServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: PaymentReferenceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference>

        /**
         * Returns a raw HTTP response for `get /api/payment_references`, but is otherwise the same
         * as [PaymentReferenceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PaymentReferenceListParams = PaymentReferenceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReferenceListPageAsync>

        /** @see [list] */
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
            params: PaymentReferenceRetireveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentReference>
    }
}
