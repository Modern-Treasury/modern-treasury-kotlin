// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.Case
import com.moderntreasury.api.models.CaseListPageAsync
import com.moderntreasury.api.models.CaseListParams
import com.moderntreasury.api.models.CaseRetrieveParams

interface CaseServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CaseServiceAsync

    /** Get details on a single case. */
    suspend fun retrieve(
        id: String,
        params: CaseRetrieveParams = CaseRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Case = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CaseRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Case

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): Case =
        retrieve(id, CaseRetrieveParams.none(), requestOptions)

    /** Get a list of cases. */
    suspend fun list(
        params: CaseListParams = CaseListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CaseListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CaseListPageAsync =
        list(CaseListParams.none(), requestOptions)

    /** A view of [CaseServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CaseServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/cases/{id}`, but is otherwise the same as
         * [CaseServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: CaseRetrieveParams = CaseRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Case> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CaseRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Case>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Case> =
            retrieve(id, CaseRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/cases`, but is otherwise the same as
         * [CaseServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CaseListParams = CaseListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CaseListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CaseListPageAsync> =
            list(CaseListParams.none(), requestOptions)
    }
}
