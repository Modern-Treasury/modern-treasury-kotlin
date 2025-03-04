// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async.internalAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BalanceReport
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportListPageAsync
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams

interface BalanceReportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create balance reports */
    suspend fun create(
        params: BalanceReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport

    /** Get a single balance report for a given internal account. */
    suspend fun retrieve(
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport

    /** Get all balance reports for a given internal account. */
    suspend fun list(
        params: BalanceReportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReportListPageAsync

    /** Deletes a given balance report. */
    suspend fun delete(
        params: BalanceReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [BalanceReportServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /api/internal_accounts/{internal_account_id}/balance_reports`, but is otherwise the same
         * as [BalanceReportServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BalanceReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReport>

        /**
         * Returns a raw HTTP response for `get
         * /api/internal_accounts/{internal_account_id}/balance_reports/{id}`, but is otherwise the
         * same as [BalanceReportServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: BalanceReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReport>

        /**
         * Returns a raw HTTP response for `get
         * /api/internal_accounts/{internal_account_id}/balance_reports`, but is otherwise the same
         * as [BalanceReportServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BalanceReportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReportListPageAsync>

        /**
         * Returns a raw HTTP response for `delete
         * /api/internal_accounts/{internal_account_id}/balance_reports/{id}`, but is otherwise the
         * same as [BalanceReportServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            params: BalanceReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
