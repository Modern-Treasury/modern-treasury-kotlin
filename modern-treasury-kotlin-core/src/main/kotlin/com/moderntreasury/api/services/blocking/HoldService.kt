// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.HoldCreateParams
import com.moderntreasury.api.models.HoldCreateResponse
import com.moderntreasury.api.models.HoldListPage
import com.moderntreasury.api.models.HoldListParams
import com.moderntreasury.api.models.HoldRetrieveParams
import com.moderntreasury.api.models.HoldRetrieveResponse
import com.moderntreasury.api.models.HoldUpdateParams
import com.moderntreasury.api.models.HoldUpdateResponse

interface HoldService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HoldService

    /** Create a new hold */
    fun create(
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldCreateResponse

    /** Get a specific hold */
    fun retrieve(
        id: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: HoldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldRetrieveResponse

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): HoldRetrieveResponse =
        retrieve(id, HoldRetrieveParams.none(), requestOptions)

    /** Update a hold */
    fun update(
        id: String,
        params: HoldUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldUpdateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: HoldUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldUpdateResponse

    /** Get a list of holds. */
    fun list(
        params: HoldListParams = HoldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HoldListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): HoldListPage =
        list(HoldListParams.none(), requestOptions)

    /** A view of [HoldService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): HoldService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/holds`, but is otherwise the same as
         * [HoldService.create].
         */
        @MustBeClosed
        fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/holds/{id}`, but is otherwise the same as
         * [HoldService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HoldRetrieveResponse> =
            retrieve(id, HoldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/holds/{id}`, but is otherwise the same as
         * [HoldService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: HoldUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: HoldUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /api/holds`, but is otherwise the same as
         * [HoldService.list].
         */
        @MustBeClosed
        fun list(
            params: HoldListParams = HoldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<HoldListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<HoldListPage> =
            list(HoldListParams.none(), requestOptions)
    }
}
