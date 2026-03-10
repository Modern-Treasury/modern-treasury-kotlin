// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentificationCreateRequestTest {

    @Test
    fun create() {
        val identificationCreateRequest =
            IdentificationCreateRequest.builder()
                .idNumber("id_number")
                .idType(IdentificationCreateRequest.IdType.AR_CUIL)
                .addDocument(
                    IdentificationCreateRequest.Document.builder()
                        .documentType(
                            IdentificationCreateRequest.Document.DocumentType
                                .ARTICLES_OF_INCORPORATION
                        )
                        .fileData("file_data")
                        .filename("filename")
                        .build()
                )
                .expirationDate(LocalDate.parse("2019-12-27"))
                .issuingCountry("issuing_country")
                .issuingRegion("issuing_region")
                .build()

        assertThat(identificationCreateRequest.idNumber()).isEqualTo("id_number")
        assertThat(identificationCreateRequest.idType())
            .isEqualTo(IdentificationCreateRequest.IdType.AR_CUIL)
        assertThat(identificationCreateRequest.documents())
            .containsExactly(
                IdentificationCreateRequest.Document.builder()
                    .documentType(
                        IdentificationCreateRequest.Document.DocumentType.ARTICLES_OF_INCORPORATION
                    )
                    .fileData("file_data")
                    .filename("filename")
                    .build()
            )
        assertThat(identificationCreateRequest.expirationDate())
            .isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(identificationCreateRequest.issuingCountry()).isEqualTo("issuing_country")
        assertThat(identificationCreateRequest.issuingRegion()).isEqualTo("issuing_region")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val identificationCreateRequest =
            IdentificationCreateRequest.builder()
                .idNumber("id_number")
                .idType(IdentificationCreateRequest.IdType.AR_CUIL)
                .addDocument(
                    IdentificationCreateRequest.Document.builder()
                        .documentType(
                            IdentificationCreateRequest.Document.DocumentType
                                .ARTICLES_OF_INCORPORATION
                        )
                        .fileData("file_data")
                        .filename("filename")
                        .build()
                )
                .expirationDate(LocalDate.parse("2019-12-27"))
                .issuingCountry("issuing_country")
                .issuingRegion("issuing_region")
                .build()

        val roundtrippedIdentificationCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(identificationCreateRequest),
                jacksonTypeRef<IdentificationCreateRequest>(),
            )

        assertThat(roundtrippedIdentificationCreateRequest).isEqualTo(identificationCreateRequest)
    }
}
