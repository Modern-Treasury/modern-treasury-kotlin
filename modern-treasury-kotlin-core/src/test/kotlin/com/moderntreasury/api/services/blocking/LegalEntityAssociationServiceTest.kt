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
                    .relationshipTypes(
                        listOf(LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER)
                    )
                    .associatedLegalEntity(
                        LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate.builder()
                            .addresses(
                                listOf(
                                    LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                        .LegalEntityAddressCreateRequest
                                        .builder()
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
                                    LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                        .IdentificationCreateRequest
                                        .builder()
                                        .idNumber("string")
                                        .idType(
                                            LegalEntityAssociationCreateParams
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
                                LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                    .LegalEntityType
                                    .BUSINESS
                            )
                            .metadata(
                                LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
                                    .Metadata
                                    .builder()
                                    .build()
                            )
                            .phoneNumbers(
                                listOf(
                                    LegalEntityAssociationCreateParams.AssociatedLegalEntityCreate
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
                    .associatorLegalEntityId("string")
                    .ownershipPercentage(123L)
                    .title("string")
                    .build()
            )
        println(legalEntityAssociation)
        legalEntityAssociation.validate()
    }
}
