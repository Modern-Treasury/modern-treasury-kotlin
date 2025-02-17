// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.ContentTypes
import com.moderntreasury.api.core.MultipartFormValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentCreateParamsTest {

    @Test
    fun create() {
        DocumentCreateParams.builder()
            .documentableId("documentable_id")
            .documentableType(DocumentCreateParams.DocumentableType.CASES)
            .file("some content".toByteArray())
            .documentType("document_type")
            .build()
    }

    @Test
    fun body() {
        val params =
            DocumentCreateParams.builder()
                .documentableId("documentable_id")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .file("some content".toByteArray())
                .documentType("document_type")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.filterNotNull())
            .containsExactlyInAnyOrder(
                MultipartFormValue.fromString(
                    "documentableId",
                    "documentable_id",
                    ContentTypes.DefaultText,
                ),
                MultipartFormValue.fromEnum(
                    "documentableType",
                    DocumentCreateParams.DocumentableType.CASES,
                    ContentTypes.DefaultText,
                ),
                MultipartFormValue.fromByteArray(
                    "file",
                    "some content".toByteArray(),
                    ContentTypes.DefaultBinary,
                ),
                MultipartFormValue.fromString(
                    "documentType",
                    "document_type",
                    ContentTypes.DefaultText,
                ),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentCreateParams.builder()
                .documentableId("documentable_id")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .file("some content".toByteArray())
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.filterNotNull())
            .containsExactlyInAnyOrder(
                MultipartFormValue.fromString(
                    "documentableId",
                    "documentable_id",
                    ContentTypes.DefaultText,
                ),
                MultipartFormValue.fromEnum(
                    "documentableType",
                    DocumentCreateParams.DocumentableType.CASES,
                    ContentTypes.DefaultText,
                ),
                MultipartFormValue.fromByteArray(
                    "file",
                    "some content".toByteArray(),
                    ContentTypes.DefaultBinary,
                ),
            )
    }
}
