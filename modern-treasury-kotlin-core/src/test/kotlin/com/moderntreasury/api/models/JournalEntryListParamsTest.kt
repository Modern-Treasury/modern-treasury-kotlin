// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JournalEntryListParamsTest {

    @Test
    fun create() {
        JournalEntryListParams.builder().journalReportId("journal_report_id").build()
    }

    @Test
    fun queryParams() {
        val params = JournalEntryListParams.builder().journalReportId("journal_report_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("journal_report_id", "journal_report_id").build())
    }
}
