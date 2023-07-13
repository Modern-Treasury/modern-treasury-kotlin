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
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .documentType("string")
                .source("string")
                .documentableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .documentableType(Document.DocumentableType.CASE)
                .documentDetails(
                    listOf(
                        Document.DocumentDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .object_("string")
                            .liveMode(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .documentIdentifierType("string")
                            .documentIdentifier("string")
                            .build()
                    )
                )
                .file(
                    Document.File.builder()
                        .size(123L)
                        .filename("string")
                        .contentType("string")
                        .build()
                )
                .build()
        assertThat(document).isNotNull
        assertThat(document.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(document.object_()).isEqualTo("string")
        assertThat(document.liveMode()).isEqualTo(true)
        assertThat(document.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(document.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(document.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(document.documentType()).isEqualTo("string")
        assertThat(document.source()).isEqualTo("string")
        assertThat(document.documentableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(document.documentableType()).isEqualTo(Document.DocumentableType.CASE)
        assertThat(document.documentDetails())
            .containsExactly(
                Document.DocumentDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .object_("string")
                    .liveMode(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .documentIdentifierType("string")
                    .documentIdentifier("string")
                    .build()
            )
        assertThat(document.file())
            .isEqualTo(
                Document.File.builder().size(123L).filename("string").contentType("string").build()
            )
    }
}
