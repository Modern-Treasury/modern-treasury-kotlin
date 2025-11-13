// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JournalEntryListParamsTest {

    @Test
    fun create() {
        JournalEntryListParams.builder()
            .journalReportId("journal_report_id")
            .page(0L)
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            JournalEntryListParams.builder()
                .journalReportId("journal_report_id")
                .page(0L)
                .perPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("journal_report_id", "journal_report_id")
                    .put("page", "0")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = JournalEntryListParams.builder().journalReportId("journal_report_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("journal_report_id", "journal_report_id").build())
    }
}
