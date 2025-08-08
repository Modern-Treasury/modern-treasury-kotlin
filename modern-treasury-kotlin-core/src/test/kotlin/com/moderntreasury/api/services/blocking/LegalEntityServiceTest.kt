// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.BankSettings
import com.moderntreasury.api.models.ChildLegalEntityCreate
import com.moderntreasury.api.models.IdentificationCreateRequest
import com.moderntreasury.api.models.LegalEntityAddressCreateRequest
import com.moderntreasury.api.models.LegalEntityComplianceDetail
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityIndustryClassification
import com.moderntreasury.api.models.LegalEntityUpdateParams
import com.moderntreasury.api.models.WealthAndEmploymentDetails
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LegalEntityServiceTest {

    @Test
    fun create() {
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
                    .addAddress(
                        LegalEntityAddressCreateRequest.builder()
                            .country("country")
                            .line1("line1")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .addAddressType(LegalEntityAddressCreateRequest.AddressType.BUSINESS)
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
                    .complianceDetails(
                        LegalEntityComplianceDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .issuer("issuer")
                            .liveMode(true)
                            .object_("object")
                            .tokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .tokenIssuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .tokenUrl("token_url")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .entityValidated(true)
                            .validatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .addDoingBusinessAsName("string")
                    .email("email")
                    .firstName("first_name")
                    .addIdentification(
                        IdentificationCreateRequest.builder()
                            .idNumber("id_number")
                            .idType(IdentificationCreateRequest.IdType.AR_CUIL)
                            .expirationDate(LocalDate.parse("2019-12-27"))
                            .issuingCountry("issuing_country")
                            .issuingRegion("issuing_region")
                            .build()
                    )
                    .addIndustryClassification(
                        LegalEntityIndustryClassification.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addClassificationCode("string")
                            .classificationType(
                                LegalEntityIndustryClassification.ClassificationType.ANZSIC
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .lastName("last_name")
                    .addLegalEntityAssociation(
                        LegalEntityCreateParams.LegalEntityAssociationInlineCreateRequest.builder()
                            .addRelationshipType(
                                LegalEntityCreateParams.LegalEntityAssociationInlineCreateRequest
                                    .RelationshipType
                                    .AUTHORIZED_SIGNER
                            )
                            .childLegalEntity(
                                ChildLegalEntityCreate.builder()
                                    .addAddress(
                                        LegalEntityAddressCreateRequest.builder()
                                            .country("country")
                                            .line1("line1")
                                            .locality("locality")
                                            .postalCode("postal_code")
                                            .region("region")
                                            .addAddressType(
                                                LegalEntityAddressCreateRequest.AddressType.BUSINESS
                                            )
                                            .line2("line2")
                                            .build()
                                    )
                                    .bankSettings(
                                        BankSettings.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .backupWithholdingPercentage(0L)
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .discardedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .enableBackupWithholding(true)
                                            .liveMode(true)
                                            .object_("object")
                                            .privacyOptOut(true)
                                            .regulationO(true)
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .businessName("business_name")
                                    .citizenshipCountry("citizenship_country")
                                    .complianceDetails(
                                        LegalEntityComplianceDetail.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .discardedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .issuer("issuer")
                                            .liveMode(true)
                                            .object_("object")
                                            .tokenExpiresAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .tokenIssuedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .tokenUrl("token_url")
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .entityValidated(true)
                                            .validatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .dateFormed(LocalDate.parse("2019-12-27"))
                                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                                    .addDoingBusinessAsName("string")
                                    .email("email")
                                    .firstName("first_name")
                                    .addIdentification(
                                        IdentificationCreateRequest.builder()
                                            .idNumber("id_number")
                                            .idType(IdentificationCreateRequest.IdType.AR_CUIL)
                                            .expirationDate(LocalDate.parse("2019-12-27"))
                                            .issuingCountry("issuing_country")
                                            .issuingRegion("issuing_region")
                                            .build()
                                    )
                                    .addIndustryClassification(
                                        LegalEntityIndustryClassification.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .addClassificationCode("string")
                                            .classificationType(
                                                LegalEntityIndustryClassification.ClassificationType
                                                    .ANZSIC
                                            )
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .discardedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .liveMode(true)
                                            .object_("object")
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .build()
                                    )
                                    .lastName("last_name")
                                    .legalEntityType(
                                        ChildLegalEntityCreate.LegalEntityType.BUSINESS
                                    )
                                    .legalStructure(
                                        ChildLegalEntityCreate.LegalStructure.CORPORATION
                                    )
                                    .metadata(
                                        ChildLegalEntityCreate.Metadata.builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
                                            .build()
                                    )
                                    .middleName("middle_name")
                                    .addPhoneNumber(
                                        ChildLegalEntityCreate.PhoneNumber.builder()
                                            .phoneNumber("phone_number")
                                            .build()
                                    )
                                    .politicallyExposedPerson(true)
                                    .preferredName("preferred_name")
                                    .prefix("prefix")
                                    .riskRating(ChildLegalEntityCreate.RiskRating.LOW)
                                    .suffix("suffix")
                                    .wealthAndEmploymentDetails(
                                        WealthAndEmploymentDetails.builder()
                                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .annualIncome(0L)
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .discardedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .employerCountry("employer_country")
                                            .employerName("employer_name")
                                            .employerState("employer_state")
                                            .employmentStatus(
                                                WealthAndEmploymentDetails.EmploymentStatus.EMPLOYED
                                            )
                                            .incomeCountry("income_country")
                                            .incomeSource(
                                                WealthAndEmploymentDetails.IncomeSource
                                                    .FAMILY_SUPPORT
                                            )
                                            .incomeState("income_state")
                                            .industry(
                                                WealthAndEmploymentDetails.Industry.ACCOUNTING
                                            )
                                            .liveMode(true)
                                            .object_("object")
                                            .occupation(
                                                WealthAndEmploymentDetails.Occupation.CONSULTING
                                            )
                                            .sourceOfFunds(
                                                WealthAndEmploymentDetails.SourceOfFunds.ALIMONY
                                            )
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
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
                    .legalStructure(LegalEntityCreateParams.LegalStructure.CORPORATION)
                    .metadata(
                        LegalEntityCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .middleName("middle_name")
                    .addPhoneNumber(
                        LegalEntityCreateParams.PhoneNumber.builder()
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .politicallyExposedPerson(true)
                    .preferredName("preferred_name")
                    .prefix("prefix")
                    .riskRating(LegalEntityCreateParams.RiskRating.LOW)
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
                            .employmentStatus(WealthAndEmploymentDetails.EmploymentStatus.EMPLOYED)
                            .incomeCountry("income_country")
                            .incomeSource(WealthAndEmploymentDetails.IncomeSource.FAMILY_SUPPORT)
                            .incomeState("income_state")
                            .industry(WealthAndEmploymentDetails.Industry.ACCOUNTING)
                            .liveMode(true)
                            .object_("object")
                            .occupation(WealthAndEmploymentDetails.Occupation.CONSULTING)
                            .sourceOfFunds(WealthAndEmploymentDetails.SourceOfFunds.ALIMONY)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .wealthSource(WealthAndEmploymentDetails.WealthSource.BUSINESS_SALE)
                            .build()
                    )
                    .website("website")
                    .build()
            )

        legalEntity.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityService = client.legalEntities()

        val legalEntity = legalEntityService.retrieve("id")

        legalEntity.validate()
    }

    @Test
    fun update() {
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
                    .addAddress(
                        LegalEntityAddressCreateRequest.builder()
                            .country("country")
                            .line1("line1")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .addAddressType(LegalEntityAddressCreateRequest.AddressType.BUSINESS)
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
                    .complianceDetails(
                        LegalEntityComplianceDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .issuer("issuer")
                            .liveMode(true)
                            .object_("object")
                            .tokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .tokenIssuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .tokenUrl("token_url")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .entityValidated(true)
                            .validatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .addDoingBusinessAsName("string")
                    .email("email")
                    .firstName("first_name")
                    .addIdentification(
                        IdentificationCreateRequest.builder()
                            .idNumber("id_number")
                            .idType(IdentificationCreateRequest.IdType.AR_CUIL)
                            .expirationDate(LocalDate.parse("2019-12-27"))
                            .issuingCountry("issuing_country")
                            .issuingRegion("issuing_region")
                            .build()
                    )
                    .addIndustryClassification(
                        LegalEntityIndustryClassification.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addClassificationCode("string")
                            .classificationType(
                                LegalEntityIndustryClassification.ClassificationType.ANZSIC
                            )
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .lastName("last_name")
                    .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
                    .metadata(
                        LegalEntityUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .middleName("middle_name")
                    .addPhoneNumber(
                        LegalEntityUpdateParams.PhoneNumber.builder()
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .politicallyExposedPerson(true)
                    .preferredName("preferred_name")
                    .prefix("prefix")
                    .riskRating(LegalEntityUpdateParams.RiskRating.LOW)
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
                            .employmentStatus(WealthAndEmploymentDetails.EmploymentStatus.EMPLOYED)
                            .incomeCountry("income_country")
                            .incomeSource(WealthAndEmploymentDetails.IncomeSource.FAMILY_SUPPORT)
                            .incomeState("income_state")
                            .industry(WealthAndEmploymentDetails.Industry.ACCOUNTING)
                            .liveMode(true)
                            .object_("object")
                            .occupation(WealthAndEmploymentDetails.Occupation.CONSULTING)
                            .sourceOfFunds(WealthAndEmploymentDetails.SourceOfFunds.ALIMONY)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .wealthSource(WealthAndEmploymentDetails.WealthSource.BUSINESS_SALE)
                            .build()
                    )
                    .website("website")
                    .build()
            )

        legalEntity.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityService = client.legalEntities()

        val page = legalEntityService.list()

        page.items().forEach { it.validate() }
    }
}
