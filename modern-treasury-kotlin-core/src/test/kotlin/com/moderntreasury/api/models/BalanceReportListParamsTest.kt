// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceReportListParamsTest {

    @Test
    fun create() {
        BalanceReportListParams.builder()
            .internalAccountId("internal_account_id")
            .afterCursor("after_cursor")
            .asOfDate(LocalDate.parse("2019-12-27"))
            .balanceReportType(BalanceReportListParams.BalanceReportType.INTRADAY)
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BalanceReportListParams.builder()
                .internalAccountId("internal_account_id")
                .afterCursor("after_cursor")
                .asOfDate(LocalDate.parse("2019-12-27"))
                .balanceReportType(BalanceReportListParams.BalanceReportType.INTRADAY)
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("as_of_date", "2019-12-27")
        expected.put(
            "balance_report_type",
            BalanceReportListParams.BalanceReportType.INTRADAY.toString()
        )
        expected.put("per_page", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceReportListParams.builder().internalAccountId("internal_account_id").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getPathParam() {
        val params =
            BalanceReportListParams.builder().internalAccountId("internal_account_id").build()
        assertThat(params).isNotNull
        // path param "internalAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("internal_account_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
