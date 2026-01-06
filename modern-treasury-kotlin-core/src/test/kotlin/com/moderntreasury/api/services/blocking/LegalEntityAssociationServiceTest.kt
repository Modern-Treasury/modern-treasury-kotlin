// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.ChildLegalEntityCreate
import com.moderntreasury.api.models.IdentificationCreateRequest
import com.moderntreasury.api.models.LegalEntityAddressCreateRequest
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams
import com.moderntreasury.api.models.LegalEntityAssociationInlineCreate
import com.moderntreasury.api.models.LegalEntityComplianceDetail
import com.moderntreasury.api.models.LegalEntityIndustryClassification
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LegalEntityAssociationServiceTest {

    @Test
    fun create() {
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
                    .addRelationshipType(
                        LegalEntityAssociationCreateParams.RelationshipType.AUTHORIZED_SIGNER
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
                            .complianceDetails(
                                LegalEntityComplianceDetail.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .issuer("issuer")
                                    .liveMode(true)
                                    .object_("object")
                                    .tokenExpiresAt(
                                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                    )
                                    .tokenIssuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .tokenUrl("token_url")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .entityValidated(true)
                                    .validatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .countryOfIncorporation("country_of_incorporation")
                            .dateFormed(LocalDate.parse("2019-12-27"))
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .addDoingBusinessAsName("string")
                            .email("email")
                            .expectedActivityVolume(0L)
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
                                    .childLegalEntityId("child_legal_entity_id")
                                    .ownershipPercentage(0L)
                                    .title("title")
                                    .build()
                            )
                            .legalEntityType(ChildLegalEntityCreate.LegalEntityType.BUSINESS)
                            .legalStructure(ChildLegalEntityCreate.LegalStructure.CORPORATION)
                            .metadata(
                                ChildLegalEntityCreate.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
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
                            .riskRating(ChildLegalEntityCreate.RiskRating.LOW)
                            .suffix("suffix")
                            .wealthAndEmploymentDetails(
                                ChildLegalEntityCreate.LegalEntityWealthEmploymentDetail.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .annualIncome(0L)
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .employerCountry("employer_country")
                                    .employerName("employer_name")
                                    .employerState("employer_state")
                                    .employmentStatus(
                                        ChildLegalEntityCreate.LegalEntityWealthEmploymentDetail
                                            .EmploymentStatus
                                            .EMPLOYED
                                    )
                                    .incomeCountry("income_country")
                                    .incomeSource(
                                        ChildLegalEntityCreate.LegalEntityWealthEmploymentDetail
                                            .IncomeSource
                                            .FAMILY_SUPPORT
                                    )
                                    .incomeState("income_state")
                                    .industry(
                                        ChildLegalEntityCreate.LegalEntityWealthEmploymentDetail
                                            .Industry
                                            .ACCOUNTING
                                    )
                                    .liveMode(true)
                                    .object_("object")
                                    .occupation(
                                        ChildLegalEntityCreate.LegalEntityWealthEmploymentDetail
                                            .Occupation
                                            .CONSULTING
                                    )
                                    .sourceOfFunds(
                                        ChildLegalEntityCreate.LegalEntityWealthEmploymentDetail
                                            .SourceOfFunds
                                            .ALIMONY
                                    )
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .wealthSource(
                                        ChildLegalEntityCreate.LegalEntityWealthEmploymentDetail
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

        legalEntityAssociation.validate()
    }
}
