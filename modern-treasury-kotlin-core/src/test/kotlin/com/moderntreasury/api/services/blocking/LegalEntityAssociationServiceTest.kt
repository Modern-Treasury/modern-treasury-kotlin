// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.BankSettings
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams
import com.moderntreasury.api.models.WealthAndEmploymentDetails
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
                        LegalEntityAssociationCreateParams.RelationshipType.BENEFICIAL_OWNER
                    )
                    .childLegalEntity(
                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate.builder()
                            .addAddress(
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                    .LegalEntityAddressCreateRequest
                                    .builder()
                                    .country("country")
                                    .line1("line1")
                                    .locality("locality")
                                    .postalCode("postal_code")
                                    .region("region")
                                    .addAddressType(
                                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate
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
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                    .IdentificationCreateRequest
                                    .builder()
                                    .idNumber("id_number")
                                    .idType(
                                        LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                            .IdentificationCreateRequest
                                            .IdType
                                            .AR_CUIL
                                    )
                                    .issuingCountry("issuing_country")
                                    .build()
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
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .middleName("middle_name")
                            .addPhoneNumber(
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate
                                    .PhoneNumber
                                    .builder()
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .politicallyExposedPerson(true)
                            .preferredName("preferred_name")
                            .prefix("prefix")
                            .riskRating(
                                LegalEntityAssociationCreateParams.ChildLegalEntityCreate.RiskRating
                                    .LOW
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
                    .childLegalEntityId("child_legal_entity_id")
                    .ownershipPercentage(0L)
                    .title("title")
                    .build()
            )

        legalEntityAssociation.validate()
    }
}
