// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentListParamsTest {

    @Test
    fun createDocumentListParams() {
        DocumentListParams.builder()
            .documentableId("string")
            .documentableType(DocumentListParams.DocumentableType.CASES)
            .afterCursor("string")
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DocumentListParams.builder()
                .documentableId("string")
                .documentableType(DocumentListParams.DocumentableType.CASES)
                .afterCursor("string")
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("documentable_id", listOf("string"))
        expected.put(
            "documentable_type",
            listOf(DocumentListParams.DocumentableType.CASES.toString())
        )
        expected.put("after_cursor", listOf("string"))
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
