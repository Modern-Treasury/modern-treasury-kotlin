// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.models.JournalSourceListParams
import com.moderntreasury.api.models.JournalSourceRetrieveParams

interface JournalSourceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JournalSourceService

    /** Retrieve a specific journal source */
    fun retrieve(
        id: String,
        params: JournalSourceRetrieveParams = JournalSourceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: JournalSourceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, JournalSourceRetrieveParams.none(), requestOptions)

    /** Retrieve a list of journal sources */
    fun list(
        params: JournalSourceListParams = JournalSourceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(JournalSourceListParams.none(), requestOptions)

    /**
     * A view of [JournalSourceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): JournalSourceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/journal_sources/{id}`, but is otherwise the
         * same as [JournalSourceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: JournalSourceRetrieveParams = JournalSourceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JournalSourceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, JournalSourceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/journal_sources`, but is otherwise the same as
         * [JournalSourceService.list].
         */
        @MustBeClosed
        fun list(
            params: JournalSourceListParams = JournalSourceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(JournalSourceListParams.none(), requestOptions)
    }
}
