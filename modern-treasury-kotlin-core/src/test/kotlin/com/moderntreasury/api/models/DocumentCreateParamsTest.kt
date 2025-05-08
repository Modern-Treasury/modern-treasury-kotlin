// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentCreateParamsTest {

    @Test
    fun create() {
        DocumentCreateParams.builder()
            .documentableId("documentable_id")
            .documentableType(DocumentCreateParams.DocumentableType.CASES)
            .file("some content".byteInputStream())
            .documentType("document_type")
            .build()
    }

    @Test
    fun body() {
        val params =
            DocumentCreateParams.builder()
                .documentableId("documentable_id")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .file("some content".byteInputStream())
                .documentType("document_type")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "documentable_id" to MultipartField.of("documentable_id"),
                        "documentable_type" to
                            MultipartField.of(DocumentCreateParams.DocumentableType.CASES),
                        "file" to MultipartField.of("some content".byteInputStream()),
                        "document_type" to MultipartField.of("document_type"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentCreateParams.builder()
                .documentableId("documentable_id")
                .documentableType(DocumentCreateParams.DocumentableType.CASES)
                .file("some content".byteInputStream())
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "documentable_id" to MultipartField.of("documentable_id"),
                        "documentable_type" to
                            MultipartField.of(DocumentCreateParams.DocumentableType.CASES),
                        "file" to MultipartField.of("some content".byteInputStream()),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
