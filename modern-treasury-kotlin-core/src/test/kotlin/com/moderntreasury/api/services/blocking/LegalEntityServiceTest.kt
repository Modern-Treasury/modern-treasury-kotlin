// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.ChildLegalEntityCreate
import com.moderntreasury.api.models.IdentificationCreateRequest
import com.moderntreasury.api.models.LegalEntityAddressCreateRequest
import com.moderntreasury.api.models.LegalEntityAssociationInlineCreate
import com.moderntreasury.api.models.LegalEntityCreateParams
import com.moderntreasury.api.models.LegalEntityIndustryClassification
import com.moderntreasury.api.models.LegalEntityUpdateParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
@Disabled("Prism doesn't generate valid recursive LegalEntityAssociation structures")
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
                        LegalEntityCreateParams.LegalEntityBankSetting.builder()
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
                    .businessDescription("business_description")
                    .businessName("business_name")
                    .citizenshipCountry("citizenship_country")
                    .connectionId("connection_id")
                    .countryOfIncorporation("country_of_incorporation")
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .addDoingBusinessAsName("string")
                    .email("email")
                    .expectedActivityVolume(0L)
                    .externalId("external_id")
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
                    .intendedUse("intended_use")
                    .lastName("last_name")
                    .addLegalEntityAssociation(
                        LegalEntityAssociationInlineCreate.builder()
                            .addRelationshipType(
                                LegalEntityAssociationInlineCreate.RelationshipType
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
                                        ChildLegalEntityCreate.LegalEntityBankSetting.builder()
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
                                    .businessDescription("business_description")
                                    .businessName("business_name")
                                    .citizenshipCountry("citizenship_country")
                                    .connectionId("connection_id")
                                    .countryOfIncorporation("country_of_incorporation")
                                    .dateFormed(LocalDate.parse("2019-12-27"))
                                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                                    .addDoingBusinessAsName("string")
                                    .email("email")
                                    .expectedActivityVolume(0L)
                                    .externalId("external_id")
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
                                    .intendedUse("intended_use")
                                    .lastName("last_name")
                                    .legalEntityAssociations(listOf())
                                    .legalEntityType(
                                        ChildLegalEntityCreate.LegalEntityType.BUSINESS
                                    )
                                    .legalStructure(
                                        ChildLegalEntityCreate.LegalStructure.CORPORATION
                                    )
                                    .listedExchange("listed_exchange")
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
                                    .addOperatingJurisdiction("string")
                                    .addPhoneNumber(
                                        ChildLegalEntityCreate.PhoneNumber.builder()
                                            .phoneNumber("phone_number")
                                            .build()
                                    )
                                    .politicallyExposedPerson(true)
                                    .preferredName("preferred_name")
                                    .prefix("prefix")
                                    .addPrimarySocialMediaSite("string")
                                    .addRegulator(
                                        ChildLegalEntityCreate.LegalEntityRegulator.builder()
                                            .jurisdiction("jurisdiction")
                                            .name("name")
                                            .registrationNumber("registration_number")
                                            .build()
                                    )
                                    .riskRating(ChildLegalEntityCreate.RiskRating.LOW)
                                    .status(ChildLegalEntityCreate.Status.ACTIVE)
                                    .suffix("suffix")
                                    .thirdPartyVerification(
                                        ChildLegalEntityCreate.ThirdPartyVerification.builder()
                                            .vendor(
                                                ChildLegalEntityCreate.ThirdPartyVerification.Vendor
                                                    .PERSONA
                                            )
                                            .vendorVerificationId("vendor_verification_id")
                                            .build()
                                    )
                                    .tickerSymbol("ticker_symbol")
                                    .wealthAndEmploymentDetails(
                                        ChildLegalEntityCreate.LegalEntityWealthEmploymentDetail
                                            .builder()
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
                                                ChildLegalEntityCreate
                                                    .LegalEntityWealthEmploymentDetail
                                                    .EmploymentStatus
                                                    .EMPLOYED
                                            )
                                            .incomeCountry("income_country")
                                            .incomeSource(
                                                ChildLegalEntityCreate
                                                    .LegalEntityWealthEmploymentDetail
                                                    .IncomeSource
                                                    .FAMILY_SUPPORT
                                            )
                                            .incomeState("income_state")
                                            .industry(
                                                ChildLegalEntityCreate
                                                    .LegalEntityWealthEmploymentDetail
                                                    .Industry
                                                    .ACCOUNTING
                                            )
                                            .liveMode(true)
                                            .object_("object")
                                            .occupation(
                                                ChildLegalEntityCreate
                                                    .LegalEntityWealthEmploymentDetail
                                                    .Occupation
                                                    .CONSULTING
                                            )
                                            .sourceOfFunds(
                                                ChildLegalEntityCreate
                                                    .LegalEntityWealthEmploymentDetail
                                                    .SourceOfFunds
                                                    .ALIMONY
                                            )
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .wealthSource(
                                                ChildLegalEntityCreate
                                                    .LegalEntityWealthEmploymentDetail
                                                    .WealthSource
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
                    .listedExchange("listed_exchange")
                    .metadata(
                        LegalEntityCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .middleName("middle_name")
                    .addOperatingJurisdiction("string")
                    .addPhoneNumber(
                        LegalEntityCreateParams.PhoneNumber.builder()
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .politicallyExposedPerson(true)
                    .preferredName("preferred_name")
                    .prefix("prefix")
                    .addPrimarySocialMediaSite("string")
                    .addRegulator(
                        LegalEntityCreateParams.LegalEntityRegulator.builder()
                            .jurisdiction("jurisdiction")
                            .name("name")
                            .registrationNumber("registration_number")
                            .build()
                    )
                    .riskRating(LegalEntityCreateParams.RiskRating.LOW)
                    .status(LegalEntityCreateParams.Status.ACTIVE)
                    .suffix("suffix")
                    .thirdPartyVerification(
                        LegalEntityCreateParams.ThirdPartyVerification.builder()
                            .vendor(LegalEntityCreateParams.ThirdPartyVerification.Vendor.PERSONA)
                            .vendorVerificationId("vendor_verification_id")
                            .build()
                    )
                    .tickerSymbol("ticker_symbol")
                    .wealthAndEmploymentDetails(
                        LegalEntityCreateParams.LegalEntityWealthEmploymentDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .annualIncome(0L)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .employerCountry("employer_country")
                            .employerName("employer_name")
                            .employerState("employer_state")
                            .employmentStatus(
                                LegalEntityCreateParams.LegalEntityWealthEmploymentDetail
                                    .EmploymentStatus
                                    .EMPLOYED
                            )
                            .incomeCountry("income_country")
                            .incomeSource(
                                LegalEntityCreateParams.LegalEntityWealthEmploymentDetail
                                    .IncomeSource
                                    .FAMILY_SUPPORT
                            )
                            .incomeState("income_state")
                            .industry(
                                LegalEntityCreateParams.LegalEntityWealthEmploymentDetail.Industry
                                    .ACCOUNTING
                            )
                            .liveMode(true)
                            .object_("object")
                            .occupation(
                                LegalEntityCreateParams.LegalEntityWealthEmploymentDetail.Occupation
                                    .CONSULTING
                            )
                            .sourceOfFunds(
                                LegalEntityCreateParams.LegalEntityWealthEmploymentDetail
                                    .SourceOfFunds
                                    .ALIMONY
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .wealthSource(
                                LegalEntityCreateParams.LegalEntityWealthEmploymentDetail
                                    .WealthSource
                                    .BUSINESS_SALE
                            )
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
                        LegalEntityUpdateParams.LegalEntityBankSetting.builder()
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
                    .businessDescription("business_description")
                    .businessName("business_name")
                    .citizenshipCountry("citizenship_country")
                    .countryOfIncorporation("country_of_incorporation")
                    .dateFormed(LocalDate.parse("2019-12-27"))
                    .dateOfBirth(LocalDate.parse("2019-12-27"))
                    .addDoingBusinessAsName("string")
                    .email("email")
                    .expectedActivityVolume(0L)
                    .externalId("external_id")
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
                    .intendedUse("intended_use")
                    .lastName("last_name")
                    .legalStructure(LegalEntityUpdateParams.LegalStructure.CORPORATION)
                    .listedExchange("listed_exchange")
                    .metadata(
                        LegalEntityUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .middleName("middle_name")
                    .addOperatingJurisdiction("string")
                    .addPhoneNumber(
                        LegalEntityUpdateParams.PhoneNumber.builder()
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .politicallyExposedPerson(true)
                    .preferredName("preferred_name")
                    .prefix("prefix")
                    .addPrimarySocialMediaSite("string")
                    .addRegulator(
                        LegalEntityUpdateParams.LegalEntityRegulator.builder()
                            .jurisdiction("jurisdiction")
                            .name("name")
                            .registrationNumber("registration_number")
                            .build()
                    )
                    .riskRating(LegalEntityUpdateParams.RiskRating.LOW)
                    .status(LegalEntityUpdateParams.Status.ACTIVE)
                    .suffix("suffix")
                    .thirdPartyVerification(
                        LegalEntityUpdateParams.ThirdPartyVerification.builder()
                            .vendor(LegalEntityUpdateParams.ThirdPartyVerification.Vendor.PERSONA)
                            .vendorVerificationId("vendor_verification_id")
                            .build()
                    )
                    .tickerSymbol("ticker_symbol")
                    .wealthAndEmploymentDetails(
                        LegalEntityUpdateParams.LegalEntityWealthEmploymentDetail.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .annualIncome(0L)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .employerCountry("employer_country")
                            .employerName("employer_name")
                            .employerState("employer_state")
                            .employmentStatus(
                                LegalEntityUpdateParams.LegalEntityWealthEmploymentDetail
                                    .EmploymentStatus
                                    .EMPLOYED
                            )
                            .incomeCountry("income_country")
                            .incomeSource(
                                LegalEntityUpdateParams.LegalEntityWealthEmploymentDetail
                                    .IncomeSource
                                    .FAMILY_SUPPORT
                            )
                            .incomeState("income_state")
                            .industry(
                                LegalEntityUpdateParams.LegalEntityWealthEmploymentDetail.Industry
                                    .ACCOUNTING
                            )
                            .liveMode(true)
                            .object_("object")
                            .occupation(
                                LegalEntityUpdateParams.LegalEntityWealthEmploymentDetail.Occupation
                                    .CONSULTING
                            )
                            .sourceOfFunds(
                                LegalEntityUpdateParams.LegalEntityWealthEmploymentDetail
                                    .SourceOfFunds
                                    .ALIMONY
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .wealthSource(
                                LegalEntityUpdateParams.LegalEntityWealthEmploymentDetail
                                    .WealthSource
                                    .BUSINESS_SALE
                            )
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
