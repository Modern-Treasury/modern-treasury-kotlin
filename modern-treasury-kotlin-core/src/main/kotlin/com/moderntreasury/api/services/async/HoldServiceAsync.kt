// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Hold
import com.moderntreasury.api.models.HoldCreateParams
import com.moderntreasury.api.models.HoldListPageAsync
import com.moderntreasury.api.models.HoldListParams
import com.moderntreasury.api.models.HoldRetrieveParams
import com.moderntreasury.api.models.HoldUpdateParams

interface HoldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HoldServiceAsync

    /** Create a new hold */
    suspend fun create(
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold

    /** Get a specific hold */
    suspend fun retrieve(
        id: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: HoldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Hold =
        retrieve(id, HoldRetrieveParams.none(), requestOptions)

    /** Update a hold */
    suspend fun update(
        id: String,
        params: HoldUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: HoldUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Hold

    /** Get a list of holds. */
    suspend fun list(
        params: HoldListParams = HoldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): HoldListPageAsync =
        list(HoldListParams.none(), requestOptions)

    /** A view of [HoldServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HoldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/holds`, but is otherwise the same as
         * [HoldServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold>

        /**
         * Returns a raw HTTP response for `get /api/holds/{id}`, but is otherwise the same as
         * [HoldServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Hold> =
            retrieve(id, HoldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/holds/{id}`, but is otherwise the same as
         * [HoldServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: HoldUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: HoldUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Hold>

        /**
         * Returns a raw HTTP response for `get /api/holds`, but is otherwise the same as
         * [HoldServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: HoldListParams = HoldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<HoldListPageAsync> =
            list(HoldListParams.none(), requestOptions)
    }
}
