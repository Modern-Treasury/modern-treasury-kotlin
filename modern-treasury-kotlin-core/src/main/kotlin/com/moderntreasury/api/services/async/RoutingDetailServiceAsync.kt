// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.RoutingDetail
import com.moderntreasury.api.models.RoutingDetailCreateParams
import com.moderntreasury.api.models.RoutingDetailDeleteParams
import com.moderntreasury.api.models.RoutingDetailListPageAsync
import com.moderntreasury.api.models.RoutingDetailListParams
import com.moderntreasury.api.models.RoutingDetailRetrieveParams

interface RoutingDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a routing detail for a single external account. */
    suspend fun create(
        accountId: String,
        params: RoutingDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingDetail = create(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [create] */
    suspend fun create(
        params: RoutingDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingDetail

    /** Get a single routing detail for a single internal or external account. */
    suspend fun retrieve(
        id: String,
        params: RoutingDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingDetail = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: RoutingDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingDetail

    /** Get a list of routing details for a single internal or external account. */
    suspend fun list(
        accountId: String,
        params: RoutingDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingDetailListPageAsync =
        list(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [list] */
    suspend fun list(
        params: RoutingDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingDetailListPageAsync

    /** Delete a routing detail for a single external account. */
    suspend fun delete(
        id: String,
        params: RoutingDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    suspend fun delete(
        params: RoutingDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [RoutingDetailServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/{accounts_type}/{account_id}/routing_details`,
         * but is otherwise the same as [RoutingDetailServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            accountId: String,
            params: RoutingDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingDetail> =
            create(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        suspend fun create(
            params: RoutingDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingDetail>

        /**
         * Returns a raw HTTP response for `get
         * /api/{accounts_type}/{account_id}/routing_details/{id}`, but is otherwise the same as
         * [RoutingDetailServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: RoutingDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingDetail> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: RoutingDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingDetail>

        /**
         * Returns a raw HTTP response for `get /api/{accounts_type}/{account_id}/routing_details`,
         * but is otherwise the same as [RoutingDetailServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            accountId: String,
            params: RoutingDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingDetailListPageAsync> =
            list(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            params: RoutingDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingDetailListPageAsync>

        /**
         * Returns a raw HTTP response for `delete
         * /api/{accounts_type}/{account_id}/routing_details/{id}`, but is otherwise the same as
         * [RoutingDetailServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            id: String,
            params: RoutingDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        suspend fun delete(
            params: RoutingDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
