// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.models.JournalEntryListParams
import com.moderntreasury.api.models.JournalEntryRetrieveParams

interface JournalEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JournalEntryServiceAsync

    /** Retrieve a specific journal entry */
    suspend fun retrieve(
        id: String,
        params: JournalEntryRetrieveParams = JournalEntryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: JournalEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, JournalEntryRetrieveParams.none(), requestOptions)

    /** Retrieve a list of journal entries */
    suspend fun list(
        params: JournalEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [JournalEntryServiceAsync] that provides access to raw HTTP responses for each
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
        ): JournalEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/journal_entries/{id}`, but is otherwise the
         * same as [JournalEntryServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: JournalEntryRetrieveParams = JournalEntryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: JournalEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, JournalEntryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/journal_entries`, but is otherwise the same as
         * [JournalEntryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: JournalEntryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
