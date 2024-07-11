// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LegalEntityAssociationServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityAssociationService = client.legalEntityAssociations()
        val legalEntityAssociation =
            legalEntityAssociationService.create(
                LegalEntityAssociationCreateParams.builder()
                    .parentLegalEntityId("parent_legal_entity_id")
                    .relationshipTypes(
                        listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER)
                    )
                    .childLegalEntity(
                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate.builder()
                            .addresses(
                                listOf(
                                    LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                        .LegalEntityAddressCreateRequest
                                        .builder()
                                        .country("country")
                                        .line1("line1")
                                        .locality("locality")
                                        .postalCode("postal_code")
                                        .region("region")
                                        .addressTypes(
                                            listOf(
                                                LegalEntityAssociationCreateParams
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
                                    LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                        .IdentificationCreateRequest
                                        .builder()
                                        .idNumber("id_number")
                                        .idType(
                                            LegalEntityAssociationCreateParams
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
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                    .LegalEntityType
                                    .BUSINESS
                            )
                            .legalStructure(
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                    .LegalStructure
                                    .CORPORATION
                            )
                            .metadata(
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate.Metadata
                                    .builder()
                                    .build()
                            )
                            .phoneNumbers(
                                listOf(
                                    LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                        .PhoneNumber
                                        .builder()
                                        .phoneNumber("phone_number")
                                        .build()
                                )
                            )
                            .riskRating(
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate.RiskRating
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
        println(legalEntityAssociation)
        legalEntityAssociation.validate()
    }
}
