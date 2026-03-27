// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JournalReportListParamsTest {

    @Test
    fun create() {
        JournalReportListParams.builder().status(JournalReportListParams.Status.DRAFT).build()
    }

    @Test
    fun queryParams() {
        val params =
            JournalReportListParams.builder().status(JournalReportListParams.Status.DRAFT).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("status", "draft").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = JournalReportListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
