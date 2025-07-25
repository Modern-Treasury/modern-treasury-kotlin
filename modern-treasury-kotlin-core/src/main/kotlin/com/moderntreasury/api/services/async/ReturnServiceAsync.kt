// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ReturnCreateParams
import com.moderntreasury.api.models.ReturnListPageAsync
import com.moderntreasury.api.models.ReturnListParams
import com.moderntreasury.api.models.ReturnObject
import com.moderntreasury.api.models.ReturnRetrieveParams

interface ReturnServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReturnServiceAsync

    /** Create a return. */
    suspend fun create(
        params: ReturnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject

    /** Get a single return. */
    suspend fun retrieve(
        id: String,
        params: ReturnRetrieveParams = ReturnRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ReturnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): ReturnObject =
        retrieve(id, ReturnRetrieveParams.none(), requestOptions)

    /** Get a list of returns. */
    suspend fun list(
        params: ReturnListParams = ReturnListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ReturnListPageAsync =
        list(ReturnListParams.none(), requestOptions)

    /**
     * A view of [ReturnServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ReturnServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/returns`, but is otherwise the same as
         * [ReturnServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ReturnCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReturnObject>

        /**
         * Returns a raw HTTP response for `get /api/returns/{id}`, but is otherwise the same as
         * [ReturnServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: ReturnRetrieveParams = ReturnRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReturnObject> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ReturnRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReturnObject>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReturnObject> = retrieve(id, ReturnRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/returns`, but is otherwise the same as
         * [ReturnServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ReturnListParams = ReturnListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReturnListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ReturnListPageAsync> =
            list(ReturnListParams.none(), requestOptions)
    }
}
