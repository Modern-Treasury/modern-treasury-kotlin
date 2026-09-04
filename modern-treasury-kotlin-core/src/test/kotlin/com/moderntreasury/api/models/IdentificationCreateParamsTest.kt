// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdentificationCreateParamsTest {

    @Test
    fun create() {
        IdentificationCreateParams.builder()
            .idNumber("id_number")
            .idType(IdentificationCreateParams.IdType.AR_CUIL)
            .legalEntityId("legal_entity_id")
            .addDocument(
                IdentificationCreateParams.Document.builder()
                    .documentType(
                        IdentificationCreateParams.Document.DocumentType.ARTICLES_OF_INCORPORATION
                    )
                    .fileData("file_data")
                    .filename("filename")
                    .build()
            )
            .expirationDate(LocalDate.parse("2019-12-27"))
            .issuingCountry("issuing_country")
            .issuingRegion("issuing_region")
            .build()
    }

    @Test
    fun body() {
        val params =
            IdentificationCreateParams.builder()
                .idNumber("id_number")
                .idType(IdentificationCreateParams.IdType.AR_CUIL)
                .legalEntityId("legal_entity_id")
                .addDocument(
                    IdentificationCreateParams.Document.builder()
                        .documentType(
                            IdentificationCreateParams.Document.DocumentType
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

        val body = params._body()

        assertThat(body.idNumber()).isEqualTo("id_number")
        assertThat(body.idType()).isEqualTo(IdentificationCreateParams.IdType.AR_CUIL)
        assertThat(body.legalEntityId()).isEqualTo("legal_entity_id")
        assertThat(body.documents())
            .containsExactly(
                IdentificationCreateParams.Document.builder()
                    .documentType(
                        IdentificationCreateParams.Document.DocumentType.ARTICLES_OF_INCORPORATION
                    )
                    .fileData("file_data")
                    .filename("filename")
                    .build()
            )
        assertThat(body.expirationDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.issuingCountry()).isEqualTo("issuing_country")
        assertThat(body.issuingRegion()).isEqualTo("issuing_region")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IdentificationCreateParams.builder()
                .idNumber("id_number")
                .idType(IdentificationCreateParams.IdType.AR_CUIL)
                .legalEntityId("legal_entity_id")
                .build()

        val body = params._body()

        assertThat(body.idNumber()).isEqualTo("id_number")
        assertThat(body.idType()).isEqualTo(IdentificationCreateParams.IdType.AR_CUIL)
        assertThat(body.legalEntityId()).isEqualTo("legal_entity_id")
    }
}
