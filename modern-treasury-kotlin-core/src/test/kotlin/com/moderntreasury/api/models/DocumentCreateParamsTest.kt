package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentCreateParamsTest {

    @Test
    fun createDocumentCreateParams() {
        DocumentCreateParams.builder()
            .documentType("string")
            .file("file.txt")
            .documentableId("string")
            .documentableType(DocumentCreateParams.DocumentableType.CASES)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            DocumentCreateParams.builder()
                .documentType("string")
                .file("file.txt")
                .documentableId("string")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("documentable_id", listOf("string"))
        expected.put(
            "documentable_type",
            listOf(DocumentCreateParams.DocumentableType.CASES.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            DocumentCreateParams.builder()
                .file("file.txt")
                .documentableId("string")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("documentable_id", listOf("string"))
        expected.put(
            "documentable_type",
            listOf(DocumentCreateParams.DocumentableType.CASES.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getBody() {
        val params =
            DocumentCreateParams.builder()
                .documentType("string")
                .file("file.txt")
                .documentableId("string")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.documentType()).isEqualTo("string")
        assertThat(body.file()).isEqualTo("file.txt")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DocumentCreateParams.builder()
                .file("file.txt")
                .documentableId("string")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.file()).isEqualTo("file.txt")
    }
}
