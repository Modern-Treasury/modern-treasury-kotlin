// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.ConnectionLegalEntity
import com.moderntreasury.api.models.ConnectionLegalEntityCreateParams
import com.moderntreasury.api.models.ConnectionLegalEntityListPageAsync
import com.moderntreasury.api.models.ConnectionLegalEntityListParams
import com.moderntreasury.api.models.ConnectionLegalEntityRetrieveParams
import com.moderntreasury.api.models.ConnectionLegalEntityUpdateParams

interface ConnectionLegalEntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ConnectionLegalEntityServiceAsync

    /** Create a connection legal entity. */
    suspend fun create(
        params: ConnectionLegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity

    /** Get details on a single connection legal entity. */
    suspend fun retrieve(
        id: String,
        params: ConnectionLegalEntityRetrieveParams = ConnectionLegalEntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ConnectionLegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): ConnectionLegalEntity =
        retrieve(id, ConnectionLegalEntityRetrieveParams.none(), requestOptions)

    /** Update a connection legal entity. */
    suspend fun update(
        id: String,
        params: ConnectionLegalEntityUpdateParams = ConnectionLegalEntityUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: ConnectionLegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntity

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions): ConnectionLegalEntity =
        update(id, ConnectionLegalEntityUpdateParams.none(), requestOptions)

    /** Get a list of all connection legal entities. */
    suspend fun list(
        params: ConnectionLegalEntityListParams = ConnectionLegalEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ConnectionLegalEntityListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ConnectionLegalEntityListPageAsync =
        list(ConnectionLegalEntityListParams.none(), requestOptions)

    /**
     * A view of [ConnectionLegalEntityServiceAsync] that provides access to raw HTTP responses for
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
        ): ConnectionLegalEntityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/connection_legal_entities`, but is otherwise
         * the same as [ConnectionLegalEntityServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ConnectionLegalEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntity>

        /**
         * Returns a raw HTTP response for `get /api/connection_legal_entities/{id}`, but is
         * otherwise the same as [ConnectionLegalEntityServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: ConnectionLegalEntityRetrieveParams =
                ConnectionLegalEntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntity> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ConnectionLegalEntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntity>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionLegalEntity> =
            retrieve(id, ConnectionLegalEntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/connection_legal_entities/{id}`, but is
         * otherwise the same as [ConnectionLegalEntityServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: ConnectionLegalEntityUpdateParams = ConnectionLegalEntityUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntity> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: ConnectionLegalEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntity>

        /** @see update */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ConnectionLegalEntity> =
            update(id, ConnectionLegalEntityUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/connection_legal_entities`, but is otherwise
         * the same as [ConnectionLegalEntityServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ConnectionLegalEntityListParams = ConnectionLegalEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ConnectionLegalEntityListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ConnectionLegalEntityListPageAsync> =
            list(ConnectionLegalEntityListParams.none(), requestOptions)
    }
}
