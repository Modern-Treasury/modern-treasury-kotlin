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
                                .addressTypes(
                                    listOf(
                                        LegalEntityCreateParams.LegalEntityAddressCreateRequest
                                            .AddressType
                                            .BUSINESS
                                    )
                                )
                                .line2("string")
                                .build()
                        )
                    )
                    .businessName("string")
                    .dateFormed(LocalDate.parse("2019-12-27"))
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
                    .legalEntityAssociations(
                        listOf(
                            LegalEntityCreateParams.LegalEntityAssociationInlineCreateRequest
                                .builder()
                                .relationshipTypes(
                                    listOf(
                                        LegalEntityCreateParams
                                            .LegalEntityAssociationInlineCreateRequest
                                            .RelationshipType
                                            .BENEFICIAL_OWNER
                                    )
                                )
                                .associatedLegalEntity(
                                    LegalEntityCreateParams
                                        .LegalEntityAssociationInlineCreateRequest
                                        .AssociatedLegalEntityCreate
                                        .builder()
                                        .addresses(
                                            listOf(
                                                LegalEntityCreateParams
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .AssociatedLegalEntityCreate
                                                    .LegalEntityAddressCreateRequest
                                                    .builder()
                                                    .country("string")
                                                    .line1("string")
                                                    .locality("string")
                                                    .postalCode("string")
                                                    .region("string")
                                                    .addressTypes(
                                                        listOf(
                                                            LegalEntityCreateParams
                                                                .LegalEntityAssociationInlineCreateRequest
                                                                .AssociatedLegalEntityCreate
                                                                .LegalEntityAddressCreateRequest
                                                                .AddressType
                                                                .BUSINESS
                                                        )
                                                    )
                                                    .line2("string")
                                                    .build()
                                            )
                                        )
                                        .businessName("string")
                                        .dateFormed(LocalDate.parse("2019-12-27"))
                                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                                        .doingBusinessAsNames(listOf("string"))
                                        .email("string")
                                        .firstName("string")
                                        .identifications(
                                            listOf(
                                                LegalEntityCreateParams
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .AssociatedLegalEntityCreate
                                                    .IdentificationCreateRequest
                                                    .builder()
                                                    .idNumber("string")
                                                    .idType(
                                                        LegalEntityCreateParams
                                                            .LegalEntityAssociationInlineCreateRequest
                                                            .AssociatedLegalEntityCreate
                                                            .IdentificationCreateRequest
                                                            .IdType
                                                            .AR_CUIL
                                                    )
                                                    .issuingCountry("string")
                                                    .build()
                                            )
                                        )
                                        .lastName("string")
                                        .legalEntityType(
                                            LegalEntityCreateParams
                                                .LegalEntityAssociationInlineCreateRequest
                                                .AssociatedLegalEntityCreate
                                                .LegalEntityType
                                                .BUSINESS
                                        )
                                        .legalStructure(
                                            LegalEntityCreateParams
                                                .LegalEntityAssociationInlineCreateRequest
                                                .AssociatedLegalEntityCreate
                                                .LegalStructure
                                                .CORPORATION
                                        )
                                        .metadata(
                                            LegalEntityCreateParams
                                                .LegalEntityAssociationInlineCreateRequest
                                                .AssociatedLegalEntityCreate
                                                .Metadata
                                                .builder()
                                                .build()
                                        )
                                        .phoneNumbers(
                                            listOf(
                                                LegalEntityCreateParams
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .AssociatedLegalEntityCreate
                                                    .PhoneNumber
                                                    .builder()
                                                    .phoneNumber("string")
                                                    .build()
                                            )
                                        )
                                        .website("string")
                                        .build()
                                )
                                .associatedLegalEntityId("string")
                                .ownershipPercentage(123L)
                                .title("string")
                                .build()
                        )
                    )
                    .legalStructure(LegalEntityCreateParams.LegalStructure.CORPORATION)
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
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("string")
                    .firstName("string")
                    .lastName("string")
                    .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
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
