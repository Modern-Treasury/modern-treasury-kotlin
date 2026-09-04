// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.IdentificationCreateParams
import com.moderntreasury.api.models.IdentificationUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IdentificationServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val identificationServiceAsync = client.identifications()

        val identification =
            identificationServiceAsync.create(
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
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val identificationServiceAsync = client.identifications()

        val identification = identificationServiceAsync.retrieve("id")

        identification.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val identificationServiceAsync = client.identifications()

        val identification =
            identificationServiceAsync.update(
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
