// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentCreateTest {

    @Test
    fun create() {
        val documentCreate =
            DocumentCreate.builder()
                .documentableId("documentable_id")
                .documentableType(DocumentCreate.DocumentableType.COUNTERPARTIES)
                .file("some content")
                .documentType("document_type")
                .build()

        assertThat(documentCreate.documentableId()).isEqualTo("documentable_id")
        assertThat(documentCreate.documentableType())
            .isEqualTo(DocumentCreate.DocumentableType.COUNTERPARTIES)
        assertThat(documentCreate.file()).isEqualTo("some content")
        assertThat(documentCreate.documentType()).isEqualTo("document_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentCreate =
            DocumentCreate.builder()
                .documentableId("documentable_id")
                .documentableType(DocumentCreate.DocumentableType.COUNTERPARTIES)
                .file("some content")
                .documentType("document_type")
                .build()

        val roundtrippedDocumentCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentCreate),
                jacksonTypeRef<DocumentCreate>(),
            )

        assertThat(roundtrippedDocumentCreate).isEqualTo(documentCreate)
    }
}
