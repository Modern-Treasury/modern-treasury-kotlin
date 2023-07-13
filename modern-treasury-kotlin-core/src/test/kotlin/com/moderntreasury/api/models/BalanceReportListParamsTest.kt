package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BalanceReportListParamsTest {

    @Test
    fun createBalanceReportListParams() {
        BalanceReportListParams.builder()
            .internalAccountId("string")
            .asOfDate(LocalDate.parse("2019-12-27"))
            .balanceReportType(BalanceReportListParams.BalanceReportType.INTRADAY)
            .afterCursor("string")
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            BalanceReportListParams.builder()
                .internalAccountId("string")
                .asOfDate(LocalDate.parse("2019-12-27"))
                .balanceReportType(BalanceReportListParams.BalanceReportType.INTRADAY)
                .afterCursor("string")
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("as_of_date", listOf("2019-12-27"))
        expected.put(
            "balance_report_type",
            listOf(BalanceReportListParams.BalanceReportType.INTRADAY.toString())
        )
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BalanceReportListParams.builder().internalAccountId("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = BalanceReportListParams.builder().internalAccountId("string").build()
        assertThat(params).isNotNull
        // path param "internalAccountId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
