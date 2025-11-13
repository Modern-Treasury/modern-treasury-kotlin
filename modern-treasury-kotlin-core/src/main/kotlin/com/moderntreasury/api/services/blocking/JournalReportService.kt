// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.ClientOptions
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.models.JournalReportListParams
import com.moderntreasury.api.models.JournalReportRetrieveParams
import com.moderntreasury.api.models.JournalReportUpdateParams

interface JournalReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): JournalReportService

    /** Retrieve a specific journal report */
    fun retrieve(
        id: String,
        params: JournalReportRetrieveParams = JournalReportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: JournalReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions) =
        retrieve(id, JournalReportRetrieveParams.none(), requestOptions)

    /** Update a journal report */
    fun update(
        id: String,
        params: JournalReportUpdateParams = JournalReportUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: JournalReportUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, JournalReportUpdateParams.none(), requestOptions)

    /** Retrieve a list of journal reports */
    fun list(
        params: JournalReportListParams = JournalReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see list */
    fun list(requestOptions: RequestOptions) = list(JournalReportListParams.none(), requestOptions)

    /**
     * A view of [JournalReportService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): JournalReportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/journal_reports/{id}`, but is otherwise the
         * same as [JournalReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: JournalReportRetrieveParams = JournalReportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: JournalReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponse =
            retrieve(id, JournalReportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/journal_reports/{id}`, but is otherwise the
         * same as [JournalReportService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: JournalReportUpdateParams = JournalReportUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: JournalReportUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, JournalReportUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/journal_reports`, but is otherwise the same as
         * [JournalReportService.list].
         */
        @MustBeClosed
        fun list(
            params: JournalReportListParams = JournalReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(JournalReportListParams.none(), requestOptions)
    }
}
