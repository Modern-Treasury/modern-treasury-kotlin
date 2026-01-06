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
            .documentCreate(
                DocumentCreate.builder()
                    .documentableId("documentable_id")
                    .documentableType(DocumentCreate.DocumentableType.COUNTERPARTIES)
                    .file("some content")
                    .documentType("document_type")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DocumentCreateParams.builder()
                .documentCreate(
                    DocumentCreate.builder()
                        .documentableId("documentable_id")
                        .documentableType(DocumentCreate.DocumentableType.COUNTERPARTIES)
                        .file("some content")
                        .documentType("document_type")
                        .build()
                )
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
                        "document_create" to
                            MultipartField.builder<DocumentCreate>()
                                .value(
                                    DocumentCreate.builder()
                                        .documentableId("documentable_id")
                                        .documentableType(
                                            DocumentCreate.DocumentableType.COUNTERPARTIES
                                        )
                                        .file("some content")
                                        .documentType("document_type")
                                        .build()
                                )
                                .contentType("application/octet-stream")
                                .build()
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
                .documentCreate(
                    DocumentCreate.builder()
                        .documentableId("documentable_id")
                        .documentableType(DocumentCreate.DocumentableType.COUNTERPARTIES)
                        .file("some content")
                        .build()
                )
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
                        "document_create" to
                            MultipartField.builder<DocumentCreate>()
                                .value(
                                    DocumentCreate.builder()
                                        .documentableId("documentable_id")
                                        .documentableType(
                                            DocumentCreate.DocumentableType.COUNTERPARTIES
                                        )
                                        .file("some content")
                                        .build()
                                )
                                .contentType("application/octet-stream")
                                .build()
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
