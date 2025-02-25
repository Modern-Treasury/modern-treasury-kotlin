// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.BankSettings
import com.moderntreasury.api.models.ConnectionLegalEntityCreateParams
import com.moderntreasury.api.models.ConnectionLegalEntityRetrieveParams
import com.moderntreasury.api.models.ConnectionLegalEntityUpdateParams
import com.moderntreasury.api.models.WealthAndEmploymentDetails
import java.time.LocalDate
import java.time.OffsetDateTime
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
                            .addAddress(
                                ConnectionLegalEntityCreateParams.LegalEntity
                                    .LegalEntityAddressCreateRequest
                                    .builder()
                                    .country("country")
                                    .line1("line1")
                                    .locality("locality")
                                    .postalCode("postal_code")
                                    .region("region")
                                    .addAddressType(
                                        ConnectionLegalEntityCreateParams.LegalEntity
                                            .LegalEntityAddressCreateRequest
                                            .AddressType
                                            .BUSINESS
                                    )
                                    .line2("line2")
                                    .build()
                            )
                            .bankSettings(
                                BankSettings.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .backupWithholdingPercentage(0L)
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .enableBackupWithholding(true)
                                    .liveMode(true)
                                    .object_("object")
                                    .privacyOptOut(true)
                                    .regulationO(true)
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .businessName("business_name")
                            .citizenshipCountry("citizenship_country")
                            .dateFormed(LocalDate.parse("2019-12-27"))
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .addDoingBusinessAsName("string")
                            .email("email")
                            .firstName("first_name")
                            .addIdentification(
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
                            .lastName("last_name")
                            .addLegalEntityAssociation(
                                ConnectionLegalEntityCreateParams.LegalEntity
                                    .LegalEntityAssociationInlineCreateRequest
                                    .builder()
                                    .addRelationshipType(
                                        ConnectionLegalEntityCreateParams.LegalEntity
                                            .LegalEntityAssociationInlineCreateRequest
                                            .RelationshipType
                                            .BENEFICIAL_OWNER
                                    )
                                    .childLegalEntity(
                                        ConnectionLegalEntityCreateParams.LegalEntity
                                            .LegalEntityAssociationInlineCreateRequest
                                            .ChildLegalEntityCreate
                                            .builder()
                                            .addAddress(
                                                ConnectionLegalEntityCreateParams.LegalEntity
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .LegalEntityAddressCreateRequest
                                                    .builder()
                                                    .country("country")
                                                    .line1("line1")
                                                    .locality("locality")
                                                    .postalCode("postal_code")
                                                    .region("region")
                                                    .addAddressType(
                                                        ConnectionLegalEntityCreateParams
                                                            .LegalEntity
                                                            .LegalEntityAssociationInlineCreateRequest
                                                            .ChildLegalEntityCreate
                                                            .LegalEntityAddressCreateRequest
                                                            .AddressType
                                                            .BUSINESS
                                                    )
                                                    .line2("line2")
                                                    .build()
                                            )
                                            .bankSettings(
                                                BankSettings.builder()
                                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                    .backupWithholdingPercentage(0L)
                                                    .createdAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .discardedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .enableBackupWithholding(true)
                                                    .liveMode(true)
                                                    .object_("object")
                                                    .privacyOptOut(true)
                                                    .regulationO(true)
                                                    .updatedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .build()
                                            )
                                            .businessName("business_name")
                                            .citizenshipCountry("citizenship_country")
                                            .dateFormed(LocalDate.parse("2019-12-27"))
                                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                                            .addDoingBusinessAsName("string")
                                            .email("email")
                                            .firstName("first_name")
                                            .addIdentification(
                                                ConnectionLegalEntityCreateParams.LegalEntity
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
                                                    .putAdditionalProperty(
                                                        "key",
                                                        JsonValue.from("value"),
                                                    )
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .putAdditionalProperty(
                                                        "modern",
                                                        JsonValue.from("treasury"),
                                                    )
                                                    .build()
                                            )
                                            .middleName("middle_name")
                                            .addPhoneNumber(
                                                ConnectionLegalEntityCreateParams.LegalEntity
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .PhoneNumber
                                                    .builder()
                                                    .phoneNumber("phone_number")
                                                    .build()
                                            )
                                            .politicallyExposedPerson(true)
                                            .preferredName("preferred_name")
                                            .prefix("prefix")
                                            .riskRating(
                                                ConnectionLegalEntityCreateParams.LegalEntity
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .RiskRating
                                                    .LOW
                                            )
                                            .suffix("suffix")
                                            .wealthAndEmploymentDetails(
                                                WealthAndEmploymentDetails.builder()
                                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                    .annualIncome(0L)
                                                    .createdAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .discardedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .employerCountry("employer_country")
                                                    .employerName("employer_name")
                                                    .employerState("employer_state")
                                                    .employmentStatus(
                                                        WealthAndEmploymentDetails.EmploymentStatus
                                                            .EMPLOYED
                                                    )
                                                    .incomeCountry("income_country")
                                                    .incomeSource(
                                                        WealthAndEmploymentDetails.IncomeSource
                                                            .FAMILY_SUPPORT
                                                    )
                                                    .incomeState("income_state")
                                                    .industry(
                                                        WealthAndEmploymentDetails.Industry
                                                            .ACCOUNTING
                                                    )
                                                    .liveMode(true)
                                                    .object_("object")
                                                    .occupation(
                                                        WealthAndEmploymentDetails.Occupation
                                                            .CONSULTING
                                                    )
                                                    .sourceOfFunds(
                                                        WealthAndEmploymentDetails.SourceOfFunds
                                                            .ALIMONY
                                                    )
                                                    .updatedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .wealthSource(
                                                        WealthAndEmploymentDetails.WealthSource
                                                            .BUSINESS_SALE
                                                    )
                                                    .build()
                                            )
                                            .website("website")
                                            .build()
                                    )
                                    .childLegalEntityId("child_legal_entity_id")
                                    .ownershipPercentage(0L)
                                    .title("title")
                                    .build()
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
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .middleName("middle_name")
                            .addPhoneNumber(
                                ConnectionLegalEntityCreateParams.LegalEntity.PhoneNumber.builder()
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .politicallyExposedPerson(true)
                            .preferredName("preferred_name")
                            .prefix("prefix")
                            .riskRating(
                                ConnectionLegalEntityCreateParams.LegalEntity.RiskRating.LOW
                            )
                            .suffix("suffix")
                            .wealthAndEmploymentDetails(
                                WealthAndEmploymentDetails.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .annualIncome(0L)
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .employerCountry("employer_country")
                                    .employerName("employer_name")
                                    .employerState("employer_state")
                                    .employmentStatus(
                                        WealthAndEmploymentDetails.EmploymentStatus.EMPLOYED
                                    )
                                    .incomeCountry("income_country")
                                    .incomeSource(
                                        WealthAndEmploymentDetails.IncomeSource.FAMILY_SUPPORT
                                    )
                                    .incomeState("income_state")
                                    .industry(WealthAndEmploymentDetails.Industry.ACCOUNTING)
                                    .liveMode(true)
                                    .object_("object")
                                    .occupation(WealthAndEmploymentDetails.Occupation.CONSULTING)
                                    .sourceOfFunds(WealthAndEmploymentDetails.SourceOfFunds.ALIMONY)
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .wealthSource(
                                        WealthAndEmploymentDetails.WealthSource.BUSINESS_SALE
                                    )
                                    .build()
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
        val response = connectionLegalEntityService.list()
        println(response)
        response.items().forEach { it.validate() }
    }
}
