// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
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

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IncomingPaymentDetailServiceAsync

    /** Get an existing Incoming Payment Detail. */
    suspend fun retrieve(
        id: String,
        params: IncomingPaymentDetailRetrieveParams = IncomingPaymentDetailRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: IncomingPaymentDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): IncomingPaymentDetail =
        retrieve(id, IncomingPaymentDetailRetrieveParams.none(), requestOptions)

    /** Update an existing Incoming Payment Detail. */
    suspend fun update(
        id: String,
        params: IncomingPaymentDetailUpdateParams = IncomingPaymentDetailUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: IncomingPaymentDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetail

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): IncomingPaymentDetail =
        update(id, IncomingPaymentDetailUpdateParams.none(), requestOptions)

    /** Get a list of Incoming Payment Details. */
    suspend fun list(
        params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IncomingPaymentDetailListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): IncomingPaymentDetailListPageAsync =
        list(IncomingPaymentDetailListParams.none(), requestOptions)

    /** Simulate Incoming Payment Detail */
    suspend fun createAsync(
        params: IncomingPaymentDetailCreateAsyncParams =
            IncomingPaymentDetailCreateAsyncParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AsyncResponse

    /** @see [createAsync] */
    suspend fun createAsync(requestOptions: RequestOptions): AsyncResponse =
        createAsync(IncomingPaymentDetailCreateAsyncParams.none(), requestOptions)

    /**
     * A view of [IncomingPaymentDetailServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): IncomingPaymentDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details/{id}`, but is
         * otherwise the same as [IncomingPaymentDetailServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: IncomingPaymentDetailRetrieveParams =
                IncomingPaymentDetailRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetail> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: IncomingPaymentDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetail>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IncomingPaymentDetail> =
            retrieve(id, IncomingPaymentDetailRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/incoming_payment_details/{id}`, but is
         * otherwise the same as [IncomingPaymentDetailServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: IncomingPaymentDetailUpdateParams = IncomingPaymentDetailUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetail> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: IncomingPaymentDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetail>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IncomingPaymentDetail> =
            update(id, IncomingPaymentDetailUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/incoming_payment_details`, but is otherwise the
         * same as [IncomingPaymentDetailServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: IncomingPaymentDetailListParams = IncomingPaymentDetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IncomingPaymentDetailListPageAsync>

        /** @see [list] */
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

        /** @see [createAsync] */
        @MustBeClosed
        suspend fun createAsync(requestOptions: RequestOptions): HttpResponseFor<AsyncResponse> =
            createAsync(IncomingPaymentDetailCreateAsyncParams.none(), requestOptions)
    }
}
