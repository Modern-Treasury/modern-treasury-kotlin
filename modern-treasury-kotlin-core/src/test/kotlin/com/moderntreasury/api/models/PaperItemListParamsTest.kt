// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaperItemListParamsTest {

    @Test
    fun createPaperItemListParams() {
        PaperItemListParams.builder()
            .afterCursor("after_cursor")
            .depositDateEnd(LocalDate.parse("2019-12-27"))
            .depositDateStart(LocalDate.parse("2019-12-27"))
            .lockboxNumber("lockbox_number")
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PaperItemListParams.builder()
                .afterCursor("after_cursor")
                .depositDateEnd(LocalDate.parse("2019-12-27"))
                .depositDateStart(LocalDate.parse("2019-12-27"))
                .lockboxNumber("lockbox_number")
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("deposit_date_end", listOf("2019-12-27"))
        expected.put("deposit_date_start", listOf("2019-12-27"))
        expected.put("lockbox_number", listOf("lockbox_number"))
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PaperItemListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
