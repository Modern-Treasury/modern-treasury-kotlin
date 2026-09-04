// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.IdentificationCreateParams
import com.moderntreasury.api.models.IdentificationUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IdentificationServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val identificationService = client.identifications()

        val identification =
            identificationService.create(
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
            )

        identification.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val identificationService = client.identifications()

        val identification = identificationService.retrieve("id")

        identification.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val identificationService = client.identifications()

        val identification =
            identificationService.update(
                IdentificationUpdateParams.builder()
                    .id("id")
                    .expirationDate(LocalDate.parse("2019-12-27"))
                    .idNumber("id_number")
                    .idType(IdentificationUpdateParams.IdType.AR_CUIL)
                    .issuingCountry("issuing_country")
                    .issuingRegion("issuing_region")
                    .build()
            )

        identification.validate()
    }
}
