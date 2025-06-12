// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.LegalEntity
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityListPage
import com.moderntreasury.api.models.LegalEntityListParams
import com.moderntreasury.api.models.LegalEntityRetrieveParams
import com.moderntreasury.api.models.LegalEntityUpdateParams

interface LegalEntityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LegalEntityService

    /** create legal_entity */
    fun create(
        params: LegalEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** Get details on a single legal entity. */
    fun retrieve(
        id: String,
        params: LegalEntityRetrieveParams = LegalEntityRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: LegalEntityRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): LegalEntity =
        retrieve(id, LegalEntityRetrieveParams.none(), requestOptions)

    /** Update a legal entity. */
    fun update(
        id: String,
        params: LegalEntityUpdateParams = LegalEntityUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: LegalEntityUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntity

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): LegalEntity =
        update(id, LegalEntityUpdateParams.none(), requestOptions)

    /** Get a list of all legal entities. */
    fun list(
        params: LegalEntityListParams = LegalEntityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LegalEntityListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): LegalEntityListPage =
        list(LegalEntityListParams.none(), requestOptions)

    /**
     * A view of [LegalEntityService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LegalEntityService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/legal_entities`, but is otherwise the same as
         * [LegalEntityService.create].
         */
        @MustBeClosed
        fun create(
            params: LegalEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity>

        /**
         * Returns a raw HTTP response for `get /api/legal_entities/{id}`, but is otherwise the same
         * as [LegalEntityService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LegalEntityRetrieveParams = LegalEntityRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LegalEntityRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<LegalEntity> =
            retrieve(id, LegalEntityRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/legal_entities/{id}`, but is otherwise the
         * same as [LegalEntityService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LegalEntityUpdateParams = LegalEntityUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LegalEntityUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntity>

        /** @see [update] */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<LegalEntity> =
            update(id, LegalEntityUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/legal_entities`, but is otherwise the same as
         * [LegalEntityService.list].
         */
        @MustBeClosed
        fun list(
            params: LegalEntityListParams = LegalEntityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LegalEntityListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LegalEntityListPage> =
            list(LegalEntityListParams.none(), requestOptions)
    }
}
