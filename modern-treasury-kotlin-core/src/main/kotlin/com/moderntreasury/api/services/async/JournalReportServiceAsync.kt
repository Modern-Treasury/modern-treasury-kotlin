// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.models.JournalReportListParams
import com.moderntreasury.api.models.JournalReportRetrieveParams
import com.moderntreasury.api.models.JournalReportUpdateParams

interface JournalReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JournalReportServiceAsync

    /** Retrieve a specific journal report */
    suspend fun retrieve(
        id: String,
        params: JournalReportRetrieveParams = JournalReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: JournalReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, JournalReportRetrieveParams.none(), requestOptions)

    /** Update a journal report */
    suspend fun update(
        id: String,
        params: JournalReportUpdateParams = JournalReportUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: JournalReportUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    suspend fun update(id: String, requestOptions: RequestOptions) =
        update(id, JournalReportUpdateParams.none(), requestOptions)

    /** Retrieve a list of journal reports */
    suspend fun list(
        params: JournalReportListParams = JournalReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    suspend fun list(requestOptions: RequestOptions) =
        list(JournalReportListParams.none(), requestOptions)

    /**
     * A view of [JournalReportServiceAsync] that provides access to raw HTTP responses for each
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
        ): JournalReportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/journal_reports/{id}`, but is otherwise the
         * same as [JournalReportServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: JournalReportRetrieveParams = JournalReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: JournalReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, JournalReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/journal_reports/{id}`, but is otherwise the
         * same as [JournalReportServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            id: String,
            params: JournalReportUpdateParams = JournalReportUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: JournalReportUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        suspend fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, JournalReportUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/journal_reports`, but is otherwise the same as
         * [JournalReportServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: JournalReportListParams = JournalReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponse =
            list(JournalReportListParams.none(), requestOptions)
    }
}
