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
                                .country("country")
                                .line1("line1")
                                .locality("locality")
                                .postalCode("postal_code")
                                .region("region")
                                .addressTypes(
                                    listOf(
                                        LegalEntityCreateParams.LegalEntityAddressCreateRequest
                                            .AddressType
                                            .BUSINESS
                                    )
                                )
                                .line2("line2")
                                .build()
                        )
                    )
                    .businessName("business_name")
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("email")
                    .firstName("first_name")
                    .identifications(
                        listOf(
                            LegalEntityCreateParams.IdentificationCreateRequest.builder()
                                .idNumber("id_number")
                                .idType(
                                    LegalEntityCreateParams.IdentificationCreateRequest.IdType
                                        .AR_CUIL
                                )
                                .issuingCountry("issuing_country")
                                .build()
                        )
                    )
                    .lastName("last_name")
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
                                .childLegalEntity(
                                    LegalEntityCreateParams
                                        .LegalEntityAssociationInlineCreateRequest
                                        .ChildLegalEntityCreate
                                        .builder()
                                        .addresses(
                                            listOf(
                                                LegalEntityCreateParams
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .LegalEntityAddressCreateRequest
                                                    .builder()
                                                    .country("country")
                                                    .line1("line1")
                                                    .locality("locality")
                                                    .postalCode("postal_code")
                                                    .region("region")
                                                    .addressTypes(
                                                        listOf(
                                                            LegalEntityCreateParams
                                                                .LegalEntityAssociationInlineCreateRequest
                                                                .ChildLegalEntityCreate
                                                                .LegalEntityAddressCreateRequest
                                                                .AddressType
                                                                .BUSINESS
                                                        )
                                                    )
                                                    .line2("line2")
                                                    .build()
                                            )
                                        )
                                        .businessName("business_name")
                                        .dateFormed(LocalDate.parse("2019-12-27"))
                                        .dateOfBirth(LocalDate.parse("2019-12-27"))
                                        .doingBusinessAsNames(listOf("string"))
                                        .email("email")
                                        .firstName("first_name")
                                        .identifications(
                                            listOf(
                                                LegalEntityCreateParams
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .IdentificationCreateRequest
                                                    .builder()
                                                    .idNumber("id_number")
                                                    .idType(
                                                        LegalEntityCreateParams
                                                            .LegalEntityAssociationInlineCreateRequest
                                                            .ChildLegalEntityCreate
                                                            .IdentificationCreateRequest
                                                            .IdType
                                                            .AR_CUIL
                                                    )
                                                    .issuingCountry("issuing_country")
                                                    .build()
                                            )
                                        )
                                        .lastName("last_name")
                                        .legalEntityType(
                                            LegalEntityCreateParams
                                                .LegalEntityAssociationInlineCreateRequest
                                                .ChildLegalEntityCreate
                                                .LegalEntityType
                                                .BUSINESS
                                        )
                                        .legalStructure(
                                            LegalEntityCreateParams
                                                .LegalEntityAssociationInlineCreateRequest
                                                .ChildLegalEntityCreate
                                                .LegalStructure
                                                .CORPORATION
                                        )
                                        .metadata(
                                            LegalEntityCreateParams
                                                .LegalEntityAssociationInlineCreateRequest
                                                .ChildLegalEntityCreate
                                                .Metadata
                                                .builder()
                                                .build()
                                        )
                                        .phoneNumbers(
                                            listOf(
                                                LegalEntityCreateParams
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .PhoneNumber
                                                    .builder()
                                                    .phoneNumber("phone_number")
                                                    .build()
                                            )
                                        )
                                        .riskRating(
                                            LegalEntityCreateParams
                                                .LegalEntityAssociationInlineCreateRequest
                                                .ChildLegalEntityCreate
                                                .RiskRating
                                                .LOW
                                        )
                                        .website("website")
                                        .build()
                                )
                                .childLegalEntityId("child_legal_entity_id")
                                .ownershipPercentage(123L)
                                .title("title")
                                .build()
                        )
                    )
                    .legalStructure(LegalEntityCreateParams.LegalStructure.CORPORATION)
                    .metadata(LegalEntityCreateParams.Metadata.builder().build())
                    .phoneNumbers(
                        listOf(
                            LegalEntityCreateParams.PhoneNumber.builder()
                                .phoneNumber("phone_number")
                                .build()
                        )
                    )
                    .riskRating(LegalEntityCreateParams.RiskRating.LOW)
                    .website("website")
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
            legalEntityService.retrieve(LegalEntityRetrieveParams.builder().id("id").build())
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
                    .id("id")
                    .businessName("business_name")
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .doingBusinessAsNames(listOf("string"))
                    .email("email")
                    .firstName("first_name")
                    .lastName("last_name")
                    .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
                    .metadata(LegalEntityUpdateParams.Metadata.builder().build())
                    .phoneNumbers(
                        listOf(
                            LegalEntityUpdateParams.PhoneNumber.builder()
                                .phoneNumber("phone_number")
                                .build()
                        )
                    )
                    .riskRating(LegalEntityUpdateParams.RiskRating.LOW)
                    .website("website")
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
