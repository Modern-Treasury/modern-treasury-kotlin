// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JournalSourceListParamsTest {

    @Test
    fun create() {
        JournalSourceListParams.builder()
            .journalEntryId("journal_entry_id")
            .journalReportId("journal_report_id")
            .page(0L)
            .perPage(0L)
            .sourceId("source_id")
            .sourceType("source_type")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            JournalSourceListParams.builder()
                .journalEntryId("journal_entry_id")
                .journalReportId("journal_report_id")
                .page(0L)
                .perPage(0L)
                .sourceId("source_id")
                .sourceType("source_type")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("journal_entry_id", "journal_entry_id")
                    .put("journal_report_id", "journal_report_id")
                    .put("page", "0")
                    .put("per_page", "0")
                    .put("source_id", "source_id")
                    .put("source_type", "source_type")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = JournalSourceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
