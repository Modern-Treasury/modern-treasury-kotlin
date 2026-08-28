// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.models.JournalSourceListParams
import com.moderntreasury.api.models.JournalSourceRetrieveParams

interface JournalSourceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JournalSourceServiceAsync

    /** Retrieve a specific journal source */
    suspend fun retrieve(
        id: String,
        params: JournalSourceRetrieveParams = JournalSourceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: JournalSourceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, JournalSourceRetrieveParams.none(), requestOptions)

    /** Retrieve a list of journal sources */
    suspend fun list(
        params: JournalSourceListParams = JournalSourceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    suspend fun list(requestOptions: RequestOptions) =
        list(JournalSourceListParams.none(), requestOptions)

    /**
     * A view of [JournalSourceServiceAsync] that provides access to raw HTTP responses for each
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
        ): JournalSourceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/journal_sources/{id}`, but is otherwise the
         * same as [JournalSourceServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: JournalSourceRetrieveParams = JournalSourceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: JournalSourceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, JournalSourceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/journal_sources`, but is otherwise the same as
         * [JournalSourceServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: JournalSourceListParams = JournalSourceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponse =
            list(JournalSourceListParams.none(), requestOptions)
    }
}
