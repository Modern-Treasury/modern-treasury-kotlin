// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.EmbeddableFlow
import com.moderntreasury.api.models.EmbeddableFlowCreateParams
import com.moderntreasury.api.models.EmbeddableFlowListPageAsync
import com.moderntreasury.api.models.EmbeddableFlowListParams
import com.moderntreasury.api.models.EmbeddableFlowRetrieveParams
import com.moderntreasury.api.models.EmbeddableFlowUpdateParams

interface EmbeddableFlowServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmbeddableFlowServiceAsync

    /** create embeddable_flow */
    suspend fun create(
        params: EmbeddableFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow

    /** get embeddable_flow */
    suspend fun retrieve(
        id: String,
        params: EmbeddableFlowRetrieveParams = EmbeddableFlowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: EmbeddableFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): EmbeddableFlow =
        retrieve(id, EmbeddableFlowRetrieveParams.none(), requestOptions)

    /** update embeddable_flow */
    suspend fun update(
        id: String,
        params: EmbeddableFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: EmbeddableFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow

    /** list embeddable_flows */
    suspend fun list(
        params: EmbeddableFlowListParams = EmbeddableFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlowListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): EmbeddableFlowListPageAsync =
        list(EmbeddableFlowListParams.none(), requestOptions)

    /**
     * A view of [EmbeddableFlowServiceAsync] that provides access to raw HTTP responses for each
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
        ): EmbeddableFlowServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/embeddable_flows`, but is otherwise the same
         * as [EmbeddableFlowServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: EmbeddableFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow>

        /**
         * Returns a raw HTTP response for `get /api/embeddable_flows/{id}`, but is otherwise the
         * same as [EmbeddableFlowServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: EmbeddableFlowRetrieveParams = EmbeddableFlowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: EmbeddableFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EmbeddableFlow> =
            retrieve(id, EmbeddableFlowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/embeddable_flows/{id}`, but is otherwise the
         * same as [EmbeddableFlowServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: EmbeddableFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: EmbeddableFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow>

        /**
         * Returns a raw HTTP response for `get /api/embeddable_flows`, but is otherwise the same as
         * [EmbeddableFlowServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EmbeddableFlowListParams = EmbeddableFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlowListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<EmbeddableFlowListPageAsync> =
            list(EmbeddableFlowListParams.none(), requestOptions)
    }
}
