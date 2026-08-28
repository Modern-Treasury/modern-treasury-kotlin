// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Case
import com.moderntreasury.api.models.CaseListPage
import com.moderntreasury.api.models.CaseListParams
import com.moderntreasury.api.models.CaseRetrieveParams

interface CaseService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CaseService

    /** Get details on a single case. */
    fun retrieve(
        id: String,
        params: CaseRetrieveParams = CaseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Case = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Case

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Case =
        retrieve(id, CaseRetrieveParams.none(), requestOptions)

    /** Get a list of cases. */
    fun list(
        params: CaseListParams = CaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CaseListPage =
        list(CaseListParams.none(), requestOptions)

    /** A view of [CaseService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CaseService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/cases/{id}`, but is otherwise the same as
         * [CaseService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CaseRetrieveParams = CaseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Case> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Case>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Case> =
            retrieve(id, CaseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/cases`, but is otherwise the same as
         * [CaseService.list].
         */
        @MustBeClosed
        fun list(
            params: CaseListParams = CaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CaseListPage> =
            list(CaseListParams.none(), requestOptions)
    }
}
