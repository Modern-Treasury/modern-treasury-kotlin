// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Identification
import com.moderntreasury.api.models.IdentificationCreateParams
import com.moderntreasury.api.models.IdentificationRetrieveParams
import com.moderntreasury.api.models.IdentificationUpdateParams

interface IdentificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IdentificationServiceAsync

    /** Create an Identification for a Legal Entity. */
    suspend fun create(
        params: IdentificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Identification

    /** Get an existing Identification. */
    suspend fun retrieve(
        id: String,
        params: IdentificationRetrieveParams = IdentificationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Identification = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: IdentificationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Identification

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Identification =
        retrieve(id, IdentificationRetrieveParams.none(), requestOptions)

    /** Update an existing Identification. */
    suspend fun update(
        id: String,
        params: IdentificationUpdateParams = IdentificationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Identification = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: IdentificationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Identification

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): Identification =
        update(id, IdentificationUpdateParams.none(), requestOptions)

    /**
     * A view of [IdentificationServiceAsync] that provides access to raw HTTP responses for each
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
        ): IdentificationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/identifications`, but is otherwise the same as
         * [IdentificationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: IdentificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Identification>

        /**
         * Returns a raw HTTP response for `get /api/identifications/{id}`, but is otherwise the
         * same as [IdentificationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: IdentificationRetrieveParams = IdentificationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Identification> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: IdentificationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Identification>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Identification> =
            retrieve(id, IdentificationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/identifications/{id}`, but is otherwise the
         * same as [IdentificationServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: IdentificationUpdateParams = IdentificationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Identification> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: IdentificationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Identification>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Identification> =
            update(id, IdentificationUpdateParams.none(), requestOptions)
    }
}
