// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.internalAccounts

import com.moderntreasury.api.core.RequestOptions
import com.moderntreasury.api.models.BalanceReport
import com.moderntreasury.api.models.BalanceReportCreateParams
import com.moderntreasury.api.models.BalanceReportDeleteParams
import com.moderntreasury.api.models.BalanceReportListPage
import com.moderntreasury.api.models.BalanceReportListParams
import com.moderntreasury.api.models.BalanceReportRetrieveParams

interface BalanceReportService {

    /** create balance reports */
    fun create(
        params: BalanceReportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport

    /** Get a single balance report for a given internal account. */
    fun retrieve(
        params: BalanceReportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReport

    /** Get all balance reports for a given internal account. */
    fun list(
        params: BalanceReportListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceReportListPage

    /** Deletes a given balance report. */
    fun delete(
        params: BalanceReportDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
