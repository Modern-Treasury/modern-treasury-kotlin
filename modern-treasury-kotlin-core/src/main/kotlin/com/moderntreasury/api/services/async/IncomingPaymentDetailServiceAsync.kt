// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.IncomingPaymentDetail
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailListPageAsync
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams

interface IncomingPaymentDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get an existing Incoming Payment Detail. */
    suspend fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail

    /** Update an existing Incoming Payment Detail. */
    suspend fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail

    /** Get a list of Incoming Payment Details. */
    suspend fun list(
        params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetailListPageAsync

    /** Get a list of Incoming Payment Details. */
    suspend fun list(requestOptions: RequestOptions): IncomingPaymentDetailListPageAsync =
        list(IncomingPaymentDetailListParams.none(), requestOptions)

    /** Simulate Incoming Payment Detail */
    suspend fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams =
            IncomingPaymentDetailCreateAsyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncResponse

    /** Simulate Incoming Payment Detail */
    suspend fun createAsync(requestOptions: RequestOptions): AsyncResponse =
        createAsync(IncomingPaymentDetailCreateAsyncParams.none(), requestOptions)

    /**
     * A view of [IncomingPaymentDetailServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details/{id}`, but is
         * otherwise the same as [IncomingPaymentDetailServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: IncomingPaymentDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetail>

        /**
         * Returns a raw HTTP response for `patch /api/incoming_payment_details/{id}`, but is
         * otherwise the same as [IncomingPaymentDetailServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: IncomingPaymentDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetail>

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details`, but is otherwise the
         * same as [IncomingPaymentDetailServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetailListPageAsync>

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details`, but is otherwise the
         * same as [IncomingPaymentDetailServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<IncomingPaymentDetailListPageAsync> =
            list(IncomingPaymentDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/simulations/incoming_payment_details/create_async`, but is otherwise the same as
         * [IncomingPaymentDetailServiceAsync.createAsync].
         */
        @MustBeClosed
        suspend fun createAsync(
            params: IncomingPaymentDetailCreateAsyncParams =
                IncomingPaymentDetailCreateAsyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AsyncResponse>

        /**
         * Returns a raw HTTP response for `post
         * /api/simulations/incoming_payment_details/create_async`, but is otherwise the same as
         * [IncomingPaymentDetailServiceAsync.createAsync].
         */
        @MustBeClosed
        suspend fun createAsync(requestOptions: RequestOptions): HttpResponseFor<AsyncResponse> =
            createAsync(IncomingPaymentDetailCreateAsyncParams.none(), requestOptions)
    }
}
