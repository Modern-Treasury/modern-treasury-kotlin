// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerListParamsTest {

    @Test
    fun createLedgerEventHandlerListParams() {
        LedgerEventHandlerListParams.builder()
            .afterCursor("after_cursor")
            .createdAt(LedgerEventHandlerListParams.CreatedAt.builder().build())
            .metadata(LedgerEventHandlerListParams.Metadata.builder().build())
            .name("name")
            .perPage(0L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerEventHandlerListParams.builder()
                .afterCursor("after_cursor")
                .createdAt(LedgerEventHandlerListParams.CreatedAt.builder().build())
                .metadata(LedgerEventHandlerListParams.Metadata.builder().build())
                .name("name")
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        LedgerEventHandlerListParams.CreatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("created_at[$key]", values)
        }
        LedgerEventHandlerListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("name", "name")
        expected.put("per_page", "0")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerEventHandlerListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
