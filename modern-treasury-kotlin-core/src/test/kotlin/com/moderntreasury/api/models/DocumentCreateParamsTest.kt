// File generated from our OpenAPI spec by Stainless.

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
            .file("file.txt")
            .documentType("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DocumentCreateParams.builder()
                .documentableId("string")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .file("file.txt")
                .documentType("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.documentableId()).isEqualTo("string")
        assertThat(body.documentableType()).isEqualTo(DocumentCreateParams.DocumentableType.CASES)
        assertThat(body.file()).isEqualTo("file.txt")
        assertThat(body.documentType()).isEqualTo("string")
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
