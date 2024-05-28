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
                    .parentLegalEntityId("string")
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
                                        .country("string")
                                        .line1("string")
                                        .locality("string")
                                        .postalCode("string")
                                        .region("string")
                                        .addressTypes(
                                            listOf(
                                                LegalEntityAssociationCreateParams
                                                    .ChildLegalEntityCreate
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
                                    LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                        .IdentificationCreateRequest
                                        .builder()
                                        .idNumber("string")
                                        .idType(
                                            LegalEntityAssociationCreateParams
                                                .ChildLegalEntityCreate
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
                                        .phoneNumber("string")
                                        .build()
                                )
                            )
                            .website("string")
                            .build()
                    )
                    .childLegalEntityId("string")
                    .ownershipPercentage(123L)
                    .title("string")
                    .build()
            )
        println(legalEntityAssociation)
        legalEntityAssociation.validate()
    }
}
