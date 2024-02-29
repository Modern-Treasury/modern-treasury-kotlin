// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LegalEntityListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LegalEntityServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityService = client.legalEntities()
        val legalEntity =
            legalEntityService.create(
                LegalEntityCreateParams.builder()
                    .legalEntityType(LegalEntityCreateParams.LegalEntityType.BUSINESS)
                    .addresses(
                        listOf(
                            LegalEntityCreateParams.LegalEntityAddressCreateRequest.builder()
                                .country("string")
                                .line1("string")
                                .locality("string")
                                .postalCode("string")
                                .region("string")
                                .addressTypes(listOf("string"))
                                .line2("string")
                                .build()
                        )
                    )
                    .businessName("string")
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("string")
                    .firstName("string")
                    .identifications(
                        listOf(
                            LegalEntityCreateParams.IdentificationCreateRequest.builder()
                                .idNumber("string")
                                .idType(
                                    LegalEntityCreateParams.IdentificationCreateRequest.IdType
                                        .AR_CUIL
                                )
                                .issuingCountry("string")
                                .build()
                        )
                    )
                    .lastName("string")
                    .metadata(LegalEntityCreateParams.Metadata.builder().build())
                    .phoneNumbers(
                        listOf(
                            LegalEntityCreateParams.PhoneNumber.builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .website("string")
                    .build()
            )
        println(legalEntity)
        legalEntity.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityService = client.legalEntities()
        val legalEntity =
            legalEntityService.retrieve(LegalEntityRetrieveParams.builder().id("string").build())
        println(legalEntity)
        legalEntity.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityService = client.legalEntities()
        val legalEntity =
            legalEntityService.update(
                LegalEntityUpdateParams.builder()
                    .id("string")
                    .businessName("string")
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("string")
                    .firstName("string")
                    .lastName("string")
                    .metadata(LegalEntityUpdateParams.Metadata.builder().build())
                    .phoneNumbers(
                        listOf(
                            LegalEntityUpdateParams.PhoneNumber.builder()
                                .phoneNumber("string")
                                .build()
                        )
                    )
                    .website("string")
                    .build()
            )
        println(legalEntity)
        legalEntity.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityService = client.legalEntities()
        val response = legalEntityService.list(LegalEntityListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
