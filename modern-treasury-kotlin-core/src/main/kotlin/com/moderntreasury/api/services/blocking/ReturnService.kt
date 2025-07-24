// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ReturnCreateParams
import com.moderntreasury.api.models.ReturnListPage
import com.moderntreasury.api.models.ReturnListParams
import com.moderntreasury.api.models.ReturnObject
import com.moderntreasury.api.models.ReturnRetrieveParams

interface ReturnService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReturnService

    /** Create a return. */
    fun create(
        params: ReturnCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject

    /** Get a single return. */
    fun retrieve(
        id: String,
        params: ReturnRetrieveParams = ReturnRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ReturnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnObject

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): ReturnObject =
        retrieve(id, ReturnRetrieveParams.none(), requestOptions)

    /** Get a list of returns. */
    fun list(
        params: ReturnListParams = ReturnListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReturnListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): ReturnListPage =
        list(ReturnListParams.none(), requestOptions)

    /** A view of [ReturnService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ReturnService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/returns`, but is otherwise the same as
         * [ReturnService.create].
         */
        @MustBeClosed
        fun create(
            params: ReturnCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReturnObject>

        /**
         * Returns a raw HTTP response for `get /api/returns/{id}`, but is otherwise the same as
         * [ReturnService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ReturnRetrieveParams = ReturnRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReturnObject> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReturnRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReturnObject>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<ReturnObject> =
            retrieve(id, ReturnRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/returns`, but is otherwise the same as
         * [ReturnService.list].
         */
        @MustBeClosed
        fun list(
            params: ReturnListParams = ReturnListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReturnListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ReturnListPage> =
            list(ReturnListParams.none(), requestOptions)
    }
}
