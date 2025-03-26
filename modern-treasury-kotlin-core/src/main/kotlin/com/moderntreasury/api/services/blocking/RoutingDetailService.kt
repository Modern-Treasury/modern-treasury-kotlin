// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.RoutingDetail
import com.moderntreasury.api.models.RoutingDetailCreateParams
import com.moderntreasury.api.models.RoutingDetailDeleteParams
import com.moderntreasury.api.models.RoutingDetailListPage
import com.moderntreasury.api.models.RoutingDetailListParams
import com.moderntreasury.api.models.RoutingDetailRetrieveParams

interface RoutingDetailService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a routing detail for a single external account. */
    fun create(
        params: RoutingDetailCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingDetail

    /** Get a single routing detail for a single internal or external account. */
    fun retrieve(
        params: RoutingDetailRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingDetail

    /** Get a list of routing details for a single internal or external account. */
    fun list(
        params: RoutingDetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RoutingDetailListPage

    /** Delete a routing detail for a single external account. */
    fun delete(
        params: RoutingDetailDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [RoutingDetailService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /api/{accounts_type}/{account_id}/routing_details`,
         * but is otherwise the same as [RoutingDetailService.create].
         */
        @MustBeClosed
        fun create(
            params: RoutingDetailCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingDetail>

        /**
         * Returns a raw HTTP response for `get
         * /api/{accounts_type}/{account_id}/routing_details/{id}`, but is otherwise the same as
         * [RoutingDetailService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: RoutingDetailRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingDetail>

        /**
         * Returns a raw HTTP response for `get /api/{accounts_type}/{account_id}/routing_details`,
         * but is otherwise the same as [RoutingDetailService.list].
         */
        @MustBeClosed
        fun list(
            params: RoutingDetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RoutingDetailListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /api/{accounts_type}/{account_id}/routing_details/{id}`, but is otherwise the same as
         * [RoutingDetailService.delete].
         */
        @MustBeClosed
        fun delete(
            params: RoutingDetailDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
