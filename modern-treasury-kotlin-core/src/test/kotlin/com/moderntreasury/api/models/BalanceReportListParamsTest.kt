// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceReportListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("as_of_date", "2019-12-27")
                    .put("balance_report_type", "intraday")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BalanceReportListParams.builder().internalAccountId("internal_account_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
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
