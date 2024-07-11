// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentListParamsTest {

    @Test
    fun createDocumentListParams() {
        DocumentListParams.builder()
            .afterCursor("after_cursor")
            .documentableId("documentable_id")
            .documentableType(DocumentListParams.DocumentableType.CASES)
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DocumentListParams.builder()
                .afterCursor("after_cursor")
                .documentableId("documentable_id")
                .documentableType(DocumentListParams.DocumentableType.CASES)
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("documentable_id", listOf("documentable_id"))
        expected.put(
            "documentable_type",
            listOf(DocumentListParams.DocumentableType.CASES.toString())
        )
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = DocumentListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
