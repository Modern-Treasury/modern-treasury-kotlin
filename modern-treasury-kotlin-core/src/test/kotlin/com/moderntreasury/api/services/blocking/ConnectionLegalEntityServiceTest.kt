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
                    .connectionId("connection_id")
                    .legalEntity(
                        ConnectionLegalEntityCreateParams.LegalEntity.builder()
                            .addresses(
                                listOf(
                                    ConnectionLegalEntityCreateParams.LegalEntity
                                        .LegalEntityAddressCreateRequest
                                        .builder()
                                        .country("country")
                                        .line1("line1")
                                        .locality("locality")
                                        .postalCode("postal_code")
                                        .region("region")
                                        .addressTypes(
                                            listOf(
                                                ConnectionLegalEntityCreateParams.LegalEntity
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
                                    ConnectionLegalEntityCreateParams.LegalEntity
                                        .IdentificationCreateRequest
                                        .builder()
                                        .idNumber("id_number")
                                        .idType(
                                            ConnectionLegalEntityCreateParams.LegalEntity
                                                .IdentificationCreateRequest
                                                .IdType
                                                .AR_CUIL
                                        )
                                        .issuingCountry("issuing_country")
                                        .build()
                                )
                            )
                            .lastName("last_name")
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
                                                            .country("country")
                                                            .line1("line1")
                                                            .locality("locality")
                                                            .postalCode("postal_code")
                                                            .region("region")
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
                                                        ConnectionLegalEntityCreateParams
                                                            .LegalEntity
                                                            .LegalEntityAssociationInlineCreateRequest
                                                            .ChildLegalEntityCreate
                                                            .IdentificationCreateRequest
                                                            .builder()
                                                            .idNumber("id_number")
                                                            .idType(
                                                                ConnectionLegalEntityCreateParams
                                                                    .LegalEntity
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
                                                            .phoneNumber("phone_number")
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
                                                .website("website")
                                                .build()
                                        )
                                        .childLegalEntityId("child_legal_entity_id")
                                        .ownershipPercentage(123L)
                                        .title("title")
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
                                        .phoneNumber("phone_number")
                                        .build()
                                )
                            )
                            .riskRating(
                                ConnectionLegalEntityCreateParams.LegalEntity.RiskRating.LOW
                            )
                            .website("website")
                            .build()
                    )
                    .legalEntityId("legal_entity_id")
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
                ConnectionLegalEntityRetrieveParams.builder().id("id").build()
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
                    .id("id")
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
