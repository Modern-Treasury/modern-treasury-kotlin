// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentificationTest {

    @Test
    fun create() {
        val identification =
            Identification.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDocument(
                    Document.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .documentType("document_type")
                        .documentableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .documentableType(Document.DocumentableType.CONNECTION)
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
                )
                .expirationDate(LocalDate.parse("2019-12-27"))
                .idType(Identification.IdType.AR_CUIL)
                .issuingCountry("issuing_country")
                .issuingRegion("issuing_region")
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(identification.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(identification.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(identification.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(identification.documents())
            .containsExactly(
                Document.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .documentType("document_type")
                    .documentableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .documentableType(Document.DocumentableType.CONNECTION)
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
            )
        assertThat(identification.expirationDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(identification.idType()).isEqualTo(Identification.IdType.AR_CUIL)
        assertThat(identification.issuingCountry()).isEqualTo("issuing_country")
        assertThat(identification.issuingRegion()).isEqualTo("issuing_region")
        assertThat(identification.liveMode()).isEqualTo(true)
        assertThat(identification.object_()).isEqualTo("object")
        assertThat(identification.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val identification =
            Identification.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addDocument(
                    Document.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .documentType("document_type")
                        .documentableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .documentableType(Document.DocumentableType.CONNECTION)
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
                )
                .expirationDate(LocalDate.parse("2019-12-27"))
                .idType(Identification.IdType.AR_CUIL)
                .issuingCountry("issuing_country")
                .issuingRegion("issuing_region")
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedIdentification =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(identification),
                jacksonTypeRef<Identification>(),
            )

        assertThat(roundtrippedIdentification).isEqualTo(identification)
    }
}
