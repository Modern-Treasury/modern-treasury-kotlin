package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerListParamsTest {

    @Test
    fun createLedgerListParams() {
        LedgerListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .metadata(LedgerListParams.Metadata.builder().build())
            .updatedAt(LedgerListParams.UpdatedAt.builder().build())
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .metadata(LedgerListParams.Metadata.builder().build())
                .updatedAt(LedgerListParams.UpdatedAt.builder().build())
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        LedgerListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        LedgerListParams.UpdatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("updated_at[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
