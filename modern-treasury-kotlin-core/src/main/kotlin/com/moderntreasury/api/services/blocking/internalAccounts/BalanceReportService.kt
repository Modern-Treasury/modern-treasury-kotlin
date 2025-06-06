// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.internalAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.core.http.HttpResponse
import com.moderntreasury.api.core.http.HttpResponseFor
import com.moderntreasury.api.models.BalanceReport
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportListPage
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams

interface BalanceReportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** create balance reports */
    fun create(
        internalAccountId: String,
        params: BalanceReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport =
        create(params.toBuilder().internalAccountId(internalAccountId).build(), requestOptions)

    /** @see [create] */
    fun create(
        params: BalanceReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport

    /** Get a single balance report for a given internal account. */
    fun retrieve(
        id: BalanceReportRetrieveParams.Id,
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport

    /** Get all balance reports for a given internal account. */
    fun list(
        internalAccountId: String,
        params: BalanceReportListParams = BalanceReportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReportListPage =
        list(params.toBuilder().internalAccountId(internalAccountId).build(), requestOptions)

    /** @see [list] */
    fun list(
        params: BalanceReportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReportListPage

    /** @see [list] */
    fun list(internalAccountId: String, requestOptions: RequestOptions): BalanceReportListPage =
        list(internalAccountId, BalanceReportListParams.none(), requestOptions)

    /** Deletes a given balance report. */
    fun delete(
        id: String,
        params: BalanceReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        params: BalanceReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [BalanceReportService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /api/internal_accounts/{internal_account_id}/balance_reports`, but is otherwise the same
         * as [BalanceReportService.create].
         */
        @MustBeClosed
        fun create(
            internalAccountId: String,
            params: BalanceReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReport> =
            create(params.toBuilder().internalAccountId(internalAccountId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BalanceReportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReport>

        /**
         * Returns a raw HTTP response for `get
         * /api/internal_accounts/{internal_account_id}/balance_reports/{id}`, but is otherwise the
         * same as [BalanceReportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: BalanceReportRetrieveParams.Id,
            params: BalanceReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReport> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BalanceReportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReport>

        /**
         * Returns a raw HTTP response for `get
         * /api/internal_accounts/{internal_account_id}/balance_reports`, but is otherwise the same
         * as [BalanceReportService.list].
         */
        @MustBeClosed
        fun list(
            internalAccountId: String,
            params: BalanceReportListParams = BalanceReportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReportListPage> =
            list(params.toBuilder().internalAccountId(internalAccountId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BalanceReportListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceReportListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            internalAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceReportListPage> =
            list(internalAccountId, BalanceReportListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /api/internal_accounts/{internal_account_id}/balance_reports/{id}`, but is otherwise the
         * same as [BalanceReportService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: BalanceReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BalanceReportDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
