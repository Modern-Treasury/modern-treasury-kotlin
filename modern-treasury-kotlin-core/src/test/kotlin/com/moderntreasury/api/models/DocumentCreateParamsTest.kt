// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.MultipartField
import java.io.InputStream
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentCreateParamsTest {

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
        assertThat(
                body
                    .filterValues { !it.value.isNull() }
                    .mapValues { (_, field) ->
                        field.map { if (it is InputStream) it.readBytes() else it }
                    }
            )
            .isEqualTo(
                mapOf(
                    "documentable_id" to MultipartField.of("documentable_id"),
                    "documentable_type" to
                        MultipartField.of(DocumentCreateParams.DocumentableType.CASES),
                    "file" to MultipartField.of("some content".toByteArray()),
                    "document_type" to MultipartField.of("document_type"),
                )
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
        assertThat(
                body
                    .filterValues { !it.value.isNull() }
                    .mapValues { (_, field) ->
                        field.map { if (it is InputStream) it.readBytes() else it }
                    }
            )
            .isEqualTo(
                mapOf(
                    "documentable_id" to MultipartField.of("documentable_id"),
                    "documentable_type" to
                        MultipartField.of(DocumentCreateParams.DocumentableType.CASES),
                    "file" to MultipartField.of("some content".toByteArray()),
                )
            )
    }
}
