// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPageAsync
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams

interface LegalEntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create legal_entity */
    suspend fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** Get details on a single legal entity. */
    suspend fun retrieve(
        id: String,
        params: LegalEntityRetrieveParams = LegalEntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** @see [retrieve] */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): LegalEntity =
        retrieve(id, LegalEntityRetrieveParams.none(), requestOptions)

    /** Update a legal entity. */
    suspend fun update(
        id: String,
        params: LegalEntityUpdateParams = LegalEntityUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** @see [update] */
    suspend fun update(id: String, requestOptions: RequestOptions): LegalEntity =
        update(id, LegalEntityUpdateParams.none(), requestOptions)

    /** Get a list of all legal entities. */
    suspend fun list(
        params: LegalEntityListParams = LegalEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntityListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): LegalEntityListPageAsync =
        list(LegalEntityListParams.none(), requestOptions)

    /**
     * A view of [LegalEntityServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/legal_entities`, but is otherwise the same as
         * [LegalEntityServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: LegalEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities/{id}`, but is otherwise the same
         * as [LegalEntityServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: LegalEntityRetrieveParams = LegalEntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: LegalEntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LegalEntity> =
            retrieve(id, LegalEntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/legal_entities/{id}`, but is otherwise the
         * same as [LegalEntityServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: LegalEntityUpdateParams = LegalEntityUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: LegalEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LegalEntity> = update(id, LegalEntityUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/legal_entities`, but is otherwise the same as
         * [LegalEntityServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: LegalEntityListParams = LegalEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntityListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<LegalEntityListPageAsync> =
            list(LegalEntityListParams.none(), requestOptions)
    }
}
