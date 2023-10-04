// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerListParamsTest {

    @Test
    fun createLedgerEventHandlerListParams() {
        LedgerEventHandlerListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .metadata(LedgerEventHandlerListParams.Metadata.builder().build())
            .name("string")
            .createdAt(LedgerEventHandlerListParams.CreatedAt.builder().build())
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerEventHandlerListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .metadata(LedgerEventHandlerListParams.Metadata.builder().build())
                .name("string")
                .createdAt(LedgerEventHandlerListParams.CreatedAt.builder().build())
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        LedgerEventHandlerListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("name", listOf("string"))
        LedgerEventHandlerListParams.CreatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("created_at[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerEventHandlerListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
