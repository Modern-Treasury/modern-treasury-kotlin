package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentCreateParamsTest {

    @Test
    fun createDocumentCreateParams() {
        DocumentCreateParams.builder()
            .documentableId("string")
            .documentableType(DocumentCreateParams.DocumentableType.CASES)
            .documentType("string")
            .file("file.txt")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DocumentCreateParams.builder()
                .documentableId("string")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .documentType("string")
                .file("file.txt")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.documentableId()).isEqualTo("string")
        assertThat(body.documentableType()).isEqualTo(DocumentCreateParams.DocumentableType.CASES)
        assertThat(body.documentType()).isEqualTo("string")
        assertThat(body.file()).isEqualTo("file.txt")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DocumentCreateParams.builder()
                .documentableId("string")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .file("file.txt")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.documentableId()).isEqualTo("string")
        assertThat(body.documentableType()).isEqualTo(DocumentCreateParams.DocumentableType.CASES)
        assertThat(body.file()).isEqualTo("file.txt")
    }
}
