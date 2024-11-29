// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerListParamsTest {

    @Test
    fun createLedgerListParams() {
        LedgerListParams.builder()
            .id(listOf("string"))
            .afterCursor("after_cursor")
            .metadata(LedgerListParams.Metadata.builder().build())
            .perPage(0L)
            .updatedAt(LedgerListParams.UpdatedAt.builder().build())
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerListParams.builder()
                .id(listOf("string"))
                .afterCursor("after_cursor")
                .metadata(LedgerListParams.Metadata.builder().build())
                .perPage(0L)
                .updatedAt(LedgerListParams.UpdatedAt.builder().build())
                .build()
        val expected = QueryParams.builder()
        expected.put("id[]", "string")
        expected.put("after_cursor", "after_cursor")
        LedgerListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", "0")
        LedgerListParams.UpdatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("updated_at[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
