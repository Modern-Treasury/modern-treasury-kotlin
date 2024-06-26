// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.ConnectionLegalEntityListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ConnectionLegalEntityServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val connectionLegalEntityService = client.connectionLegalEntities()
        val connectionLegalEntity =
            connectionLegalEntityService.create(
                ConnectionLegalEntityCreateParams.builder()
                    .connectionId("string")
                    .legalEntity(
                        ConnectionLegalEntityCreateParams.LegalEntity.builder()
                            .addresses(
                                listOf(
                                    ConnectionLegalEntityCreateParams.LegalEntity
                                        .LegalEntityAddressCreateRequest
                                        .builder()
                                        .country("string")
                                        .line1("string")
                                        .locality("string")
                                        .postalCode("string")
                                        .region("string")
                                        .addressTypes(
                                            listOf(
                                                ConnectionLegalEntityCreateParams.LegalEntity
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
                                    ConnectionLegalEntityCreateParams.LegalEntity
                                        .IdentificationCreateRequest
                                        .builder()
                                        .idNumber("string")
                                        .idType(
                                            ConnectionLegalEntityCreateParams.LegalEntity
                                                .IdentificationCreateRequest
                                                .IdType
                                                .AR_CUIL
                                        )
                                        .issuingCountry("string")
                                        .build()
                                )
                            )
                            .lastName("string")
                            .legalEntityAssociations(
                                listOf(
                                    ConnectionLegalEntityCreateParams.LegalEntity
                                        .LegalEntityAssociationInlineCreateRequest
                                        .builder()
                                        .relationshipTypes(
                                            listOf(
                                                ConnectionLegalEntityCreateParams.LegalEntity
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .RelationshipType
                                                    .BENEFICIAL_OWNER
                                            )
                                        )
                                        .childLegalEntity(
                                            ConnectionLegalEntityCreateParams.LegalEntity
                                                .LegalEntityAssociationInlineCreateRequest
                                                .ChildLegalEntityCreate
                                                .builder()
                                                .addresses(
                                                    listOf(
                                                        ConnectionLegalEntityCreateParams
                                                            .LegalEntity
                                                            .LegalEntityAssociationInlineCreateRequest
                                                            .ChildLegalEntityCreate
                                                            .LegalEntityAddressCreateRequest
                                                            .builder()
                                                            .country("string")
                                                            .line1("string")
                                                            .locality("string")
                                                            .postalCode("string")
                                                            .region("string")
                                                            .addressTypes(
                                                                listOf(
                                                                    ConnectionLegalEntityCreateParams
                                                                        .LegalEntity
                                                                        .LegalEntityAssociationInlineCreateRequest
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
                                                        ConnectionLegalEntityCreateParams
                                                            .LegalEntity
                                                            .LegalEntityAssociationInlineCreateRequest
                                                            .ChildLegalEntityCreate
                                                            .IdentificationCreateRequest
                                                            .builder()
                                                            .idNumber("string")
                                                            .idType(
                                                                ConnectionLegalEntityCreateParams
                                                                    .LegalEntity
                                                                    .LegalEntityAssociationInlineCreateRequest
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
                                                    ConnectionLegalEntityCreateParams.LegalEntity
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .LegalEntityType
                                                        .BUSINESS
                                                )
                                                .legalStructure(
                                                    ConnectionLegalEntityCreateParams.LegalEntity
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .LegalStructure
                                                        .CORPORATION
                                                )
                                                .metadata(
                                                    ConnectionLegalEntityCreateParams.LegalEntity
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .Metadata
                                                        .builder()
                                                        .build()
                                                )
                                                .phoneNumbers(
                                                    listOf(
                                                        ConnectionLegalEntityCreateParams
                                                            .LegalEntity
                                                            .LegalEntityAssociationInlineCreateRequest
                                                            .ChildLegalEntityCreate
                                                            .PhoneNumber
                                                            .builder()
                                                            .phoneNumber("string")
                                                            .build()
                                                    )
                                                )
                                                .riskRating(
                                                    ConnectionLegalEntityCreateParams.LegalEntity
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .RiskRating
                                                        .LOW
                                                )
                                                .website("string")
                                                .build()
                                        )
                                        .childLegalEntityId("string")
                                        .ownershipPercentage(123L)
                                        .title("string")
                                        .build()
                                )
                            )
                            .legalEntityType(
                                ConnectionLegalEntityCreateParams.LegalEntity.LegalEntityType
                                    .BUSINESS
                            )
                            .legalStructure(
                                ConnectionLegalEntityCreateParams.LegalEntity.LegalStructure
                                    .CORPORATION
                            )
                            .metadata(
                                ConnectionLegalEntityCreateParams.LegalEntity.Metadata.builder()
                                    .build()
                            )
                            .phoneNumbers(
                                listOf(
                                    ConnectionLegalEntityCreateParams.LegalEntity.PhoneNumber
                                        .builder()
                                        .phoneNumber("string")
                                        .build()
                                )
                            )
                            .riskRating(
                                ConnectionLegalEntityCreateParams.LegalEntity.RiskRating.LOW
                            )
                            .website("string")
                            .build()
                    )
                    .legalEntityId("string")
                    .build()
            )
        println(connectionLegalEntity)
        connectionLegalEntity.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val connectionLegalEntityService = client.connectionLegalEntities()
        val connectionLegalEntity =
            connectionLegalEntityService.retrieve(
                ConnectionLegalEntityRetrieveParams.builder().id("string").build()
            )
        println(connectionLegalEntity)
        connectionLegalEntity.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val connectionLegalEntityService = client.connectionLegalEntities()
        val connectionLegalEntity =
            connectionLegalEntityService.update(
                ConnectionLegalEntityUpdateParams.builder()
                    .id("string")
                    .status(ConnectionLegalEntityUpdateParams.Status.PROCESSING)
                    .build()
            )
        println(connectionLegalEntity)
        connectionLegalEntity.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val connectionLegalEntityService = client.connectionLegalEntities()
        val response =
            connectionLegalEntityService.list(ConnectionLegalEntityListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
