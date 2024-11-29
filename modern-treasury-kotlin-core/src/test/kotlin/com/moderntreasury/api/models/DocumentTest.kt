// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentTest {

    @Test
    fun createDocument() {
        val document =
            Document.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .documentDetails(
                    listOf(
                        Document.DocumentDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .documentIdentifier("document_identifier")
                            .documentIdentifierType("document_identifier_type")
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                )
                .documentType("document_type")
                .documentableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentableType(Document.DocumentableType.CASE)
                .file(
                    Document.File.builder()
                        .contentType("content_type")
                        .filename("filename")
                        .size(0L)
                        .build()
                )
                .liveMode(true)
                .object_("object")
                .source("source")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(document).isNotNull
        assertThat(document.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(document.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(document.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(document.documentDetails())
            .containsExactly(
                Document.DocumentDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .documentIdentifier("document_identifier")
                    .documentIdentifierType("document_identifier_type")
                    .liveMode(true)
                    .object_("object")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(document.documentType()).isEqualTo("document_type")
        assertThat(document.documentableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(document.documentableType()).isEqualTo(Document.DocumentableType.CASE)
        assertThat(document.file())
            .isEqualTo(
                Document.File.builder()
                    .contentType("content_type")
                    .filename("filename")
                    .size(0L)
                    .build()
            )
        assertThat(document.liveMode()).isEqualTo(true)
        assertThat(document.object_()).isEqualTo("object")
        assertThat(document.source()).isEqualTo("source")
        assertThat(document.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
