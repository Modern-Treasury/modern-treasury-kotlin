// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentListParamsTest {

    @Test
    fun create() {
        DocumentListParams.builder()
            .afterCursor("after_cursor")
            .documentableId("documentable_id")
            .documentableType(DocumentListParams.DocumentableType.CASES)
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DocumentListParams.builder()
                .afterCursor("after_cursor")
                .documentableId("documentable_id")
                .documentableType(DocumentListParams.DocumentableType.CASES)
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("documentable_id", "documentable_id")
        expected.put("documentable_type", DocumentListParams.DocumentableType.CASES.toString())
        expected.put("per_page", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DocumentListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
