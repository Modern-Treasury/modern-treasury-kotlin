// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.EmbeddableFlow
import com.moderntreasury.api.models.EmbeddableFlowCreateParams
import com.moderntreasury.api.models.EmbeddableFlowListPage
import com.moderntreasury.api.models.EmbeddableFlowListParams
import com.moderntreasury.api.models.EmbeddableFlowRetrieveParams
import com.moderntreasury.api.models.EmbeddableFlowUpdateParams

interface EmbeddableFlowService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EmbeddableFlowService

    /** create embeddable_flow */
    fun create(
        params: EmbeddableFlowCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow

    /** get embeddable_flow */
    fun retrieve(
        id: String,
        params: EmbeddableFlowRetrieveParams = EmbeddableFlowRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: EmbeddableFlowRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): EmbeddableFlow =
        retrieve(id, EmbeddableFlowRetrieveParams.none(), requestOptions)

    /** update embeddable_flow */
    fun update(
        id: String,
        params: EmbeddableFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: EmbeddableFlowUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlow

    /** list embeddable_flows */
    fun list(
        params: EmbeddableFlowListParams = EmbeddableFlowListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EmbeddableFlowListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): EmbeddableFlowListPage =
        list(EmbeddableFlowListParams.none(), requestOptions)

    /**
     * A view of [EmbeddableFlowService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EmbeddableFlowService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/embeddable_flows`, but is otherwise the same
         * as [EmbeddableFlowService.create].
         */
        @MustBeClosed
        fun create(
            params: EmbeddableFlowCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow>

        /**
         * Returns a raw HTTP response for `get /api/embeddable_flows/{id}`, but is otherwise the
         * same as [EmbeddableFlowService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: EmbeddableFlowRetrieveParams = EmbeddableFlowRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: EmbeddableFlowRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<EmbeddableFlow> =
            retrieve(id, EmbeddableFlowRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/embeddable_flows/{id}`, but is otherwise the
         * same as [EmbeddableFlowService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: EmbeddableFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: EmbeddableFlowUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlow>

        /**
         * Returns a raw HTTP response for `get /api/embeddable_flows`, but is otherwise the same as
         * [EmbeddableFlowService.list].
         */
        @MustBeClosed
        fun list(
            params: EmbeddableFlowListParams = EmbeddableFlowListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EmbeddableFlowListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EmbeddableFlowListPage> =
            list(EmbeddableFlowListParams.none(), requestOptions)
    }
}
