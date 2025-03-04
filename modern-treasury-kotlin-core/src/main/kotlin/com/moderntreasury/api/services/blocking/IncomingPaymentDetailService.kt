// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.AsyncResponse
import com.moderntreasury.api.models.IncomingPaymentDetail
import com.moderntreasury.api.models.IncomingPaymentDetailCreateAsyncParams
import com.moderntreasury.api.models.IncomingPaymentDetailListPage
import com.moderntreasury.api.models.IncomingPaymentDetailListParams
import com.moderntreasury.api.models.IncomingPaymentDetailRetrieveParams
import com.moderntreasury.api.models.IncomingPaymentDetailUpdateParams

interface IncomingPaymentDetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get an existing Incoming Payment Detail. */
    fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail

    /** Update an existing Incoming Payment Detail. */
    fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail

    /** Get a list of Incoming Payment Details. */
    fun list(
        params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetailListPage

    /** Get a list of Incoming Payment Details. */
    fun list(requestOptions: RequestOptions): IncomingPaymentDetailListPage =
        list(IncomingPaymentDetailListParams.none(), requestOptions)

    /** Simulate Incoming Payment Detail */
    fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams =
            IncomingPaymentDetailCreateAsyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncResponse

    /** Simulate Incoming Payment Detail */
    fun createAsync(requestOptions: RequestOptions): AsyncResponse =
        createAsync(IncomingPaymentDetailCreateAsyncParams.none(), requestOptions)

    /**
     * A view of [IncomingPaymentDetailService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details/{id}`, but is
         * otherwise the same as [IncomingPaymentDetailService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: IncomingPaymentDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetail>

        /**
         * Returns a raw HTTP response for `patch /api/incoming_payment_details/{id}`, but is
         * otherwise the same as [IncomingPaymentDetailService.update].
         */
        @MustBeClosed
        fun update(
            params: IncomingPaymentDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetail>

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details`, but is otherwise the
         * same as [IncomingPaymentDetailService.list].
         */
        @MustBeClosed
        fun list(
            params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetailListPage>

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details`, but is otherwise the
         * same as [IncomingPaymentDetailService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IncomingPaymentDetailListPage> =
            list(IncomingPaymentDetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /api/simulations/incoming_payment_details/create_async`, but is otherwise the same as
         * [IncomingPaymentDetailService.createAsync].
         */
        @MustBeClosed
        fun createAsync(
            params: IncomingPaymentDetailCreateAsyncParams =
                IncomingPaymentDetailCreateAsyncParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AsyncResponse>

        /**
         * Returns a raw HTTP response for `post
         * /api/simulations/incoming_payment_details/create_async`, but is otherwise the same as
         * [IncomingPaymentDetailService.createAsync].
         */
        @MustBeClosed
        fun createAsync(requestOptions: RequestOptions): HttpResponseFor<AsyncResponse> =
            createAsync(IncomingPaymentDetailCreateAsyncParams.none(), requestOptions)
    }
}
