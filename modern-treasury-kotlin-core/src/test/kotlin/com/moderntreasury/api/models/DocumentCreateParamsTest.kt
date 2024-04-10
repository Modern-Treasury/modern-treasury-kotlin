// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.ContentTypes
import com.moderntreasury.api.core.MultipartFormValue
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentCreateParamsTest {

    @Test
    fun createDocumentCreateParams() {
        DocumentCreateParams.builder()
            .documentableId("string")
            .documentableType(DocumentCreateParams.DocumentableType.CASES)
            .file("some content".toByteArray())
            .documentType("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            DocumentCreateParams.builder()
                .documentableId("string")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .file("some content".toByteArray())
                .documentType("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .containsExactly(
                MultipartFormValue.fromString("documentableId", "string", ContentTypes.DefaultText),
                MultipartFormValue.fromEnum(
                    "documentableType",
                    DocumentCreateParams.DocumentableType.CASES,
                    ContentTypes.DefaultText
                ),
                MultipartFormValue.fromByteArray(
                    "file",
                    "some content".toByteArray(),
                    ContentTypes.DefaultBinary
                ),
                MultipartFormValue.fromString("documentType", "string", ContentTypes.DefaultText),
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            DocumentCreateParams.builder()
                .documentableId("string")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .file("some content".toByteArray())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body)
            .containsExactly(
                MultipartFormValue.fromString("documentableId", "string", ContentTypes.DefaultText),
                MultipartFormValue.fromEnum(
                    "documentableType",
                    DocumentCreateParams.DocumentableType.CASES,
                    ContentTypes.DefaultText
                ),
                MultipartFormValue.fromByteArray(
                    "file",
                    "some content".toByteArray(),
                    ContentTypes.DefaultBinary
                ),
                null,
            )
    }
}
