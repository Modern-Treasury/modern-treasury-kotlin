// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.moderntreasury.api.client.ModernTreasuryClient
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.AddressRequest
import com.moderntreasury.api.models.ChildLegalEntityCreate
import com.moderntreasury.api.models.ContactDetailCreateRequest
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.IdentificationCreateRequest
import com.moderntreasury.api.models.LedgerAccountCreateRequest
import com.moderntreasury.api.models.LegalEntityAddressCreateRequest
import com.moderntreasury.api.models.LegalEntityAssociationInlineCreate
import com.moderntreasury.api.models.LegalEntityComplianceDetail
import com.moderntreasury.api.models.LegalEntityIndustryClassification
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: ModernTreasuryClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
    }

    @Test
    fun create() {
        val counterpartyService = client.counterparties()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        counterpartyService.create(
            CounterpartyCreateParams.builder()
                .name("name")
                .accounting(
                    CounterpartyCreateParams.Accounting.builder()
                        .type(CounterpartyCreateParams.Accounting.Type.CUSTOMER)
                        .build()
                )
                .addAccount(
                    CounterpartyCreateParams.Account.builder()
                        .addAccountDetail(
                            CounterpartyCreateParams.Account.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    CounterpartyCreateParams.Account.AccountDetail.AccountNumberType
                                        .AU_NUMBER
                                )
                                .build()
                        )
                        .accountType(ExternalAccountType.BASE_WALLET)
                        .addContactDetail(
                            ContactDetailCreateRequest.builder()
                                .contactIdentifier("contact_identifier")
                                .contactIdentifierType(
                                    ContactDetailCreateRequest.ContactIdentifierType.EMAIL
                                )
                                .build()
                        )
                        .externalId("external_id")
                        .ledgerAccount(
                            LedgerAccountCreateRequest.builder()
                                .currency("currency")
                                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .normalBalance(TransactionDirection.CREDIT)
                                .currencyExponent(0L)
                                .description("description")
                                .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableType(
                                    LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY
                                )
                                .metadata(
                                    LedgerAccountCreateRequest.Metadata.builder()
                                        .putAdditionalProperty("key", JsonValue.from("value"))
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                        .build()
                                )
                                .build()
                        )
                        .metadata(
                            CounterpartyCreateParams.Account.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .name("name")
                        .partyAddress(
                            AddressRequest.builder()
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .locality("locality")
                                .postalCode("postal_code")
                                .region("region")
                                .build()
                        )
                        .partyIdentifier("party_identifier")
                        .partyName("party_name")
                        .partyType(CounterpartyCreateParams.Account.PartyType.BUSINESS)
                        .plaidProcessorToken("plaid_processor_token")
                        .addRoutingDetail(
                            CounterpartyCreateParams.Account.RoutingDetail.builder()
                                .routingNumber("routing_number")
                                .routingNumberType(
                                    CounterpartyCreateParams.Account.RoutingDetail.RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    CounterpartyCreateParams.Account.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                        .build()
                )
                .email("dev@stainless.com")
                .externalId("external_id")
                .ledgerType(CounterpartyCreateParams.LedgerType.CUSTOMER)
                .legalEntity(
                    CounterpartyCreateParams.LegalEntityCreateRequest.builder()
                        .legalEntityType(
                            CounterpartyCreateParams.LegalEntityCreateRequest.LegalEntityType
                                .BUSINESS
                        )
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
                            CounterpartyCreateParams.LegalEntityCreateRequest.LegalEntityBankSetting
                                .builder()
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
                                .tokenExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .tokenIssuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .tokenUrl("token_url")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .entityValidated(true)
                                .validatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .connectionId("connection_id")
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
                                                    LegalEntityAddressCreateRequest.AddressType
                                                        .BUSINESS
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
                                        .connectionId("connection_id")
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
                                                    LegalEntityIndustryClassification
                                                        .ClassificationType
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
                                        .metadata(
                                            ChildLegalEntityCreate.Metadata.builder()
                                                .putAdditionalProperty(
                                                    "key",
                                                    JsonValue.from("value"),
                                                )
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
                                        .riskRating(ChildLegalEntityCreate.RiskRating.LOW)
                                        .suffix("suffix")
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
                        .legalStructure(
                            CounterpartyCreateParams.LegalEntityCreateRequest.LegalStructure
                                .CORPORATION
                        )
                        .metadata(
                            CounterpartyCreateParams.LegalEntityCreateRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .middleName("middle_name")
                        .addOperatingJurisdiction("string")
                        .addPhoneNumber(
                            CounterpartyCreateParams.LegalEntityCreateRequest.PhoneNumber.builder()
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .politicallyExposedPerson(true)
                        .preferredName("preferred_name")
                        .prefix("prefix")
                        .addPrimarySocialMediaSite("string")
                        .riskRating(
                            CounterpartyCreateParams.LegalEntityCreateRequest.RiskRating.LOW
                        )
                        .suffix("suffix")
                        .wealthAndEmploymentDetails(
                            CounterpartyCreateParams.LegalEntityCreateRequest
                                .LegalEntityWealthEmploymentDetail
                                .builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .annualIncome(0L)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .employerCountry("employer_country")
                                .employerName("employer_name")
                                .employerState("employer_state")
                                .employmentStatus(
                                    CounterpartyCreateParams.LegalEntityCreateRequest
                                        .LegalEntityWealthEmploymentDetail
                                        .EmploymentStatus
                                        .EMPLOYED
                                )
                                .incomeCountry("income_country")
                                .incomeSource(
                                    CounterpartyCreateParams.LegalEntityCreateRequest
                                        .LegalEntityWealthEmploymentDetail
                                        .IncomeSource
                                        .FAMILY_SUPPORT
                                )
                                .incomeState("income_state")
                                .industry(
                                    CounterpartyCreateParams.LegalEntityCreateRequest
                                        .LegalEntityWealthEmploymentDetail
                                        .Industry
                                        .ACCOUNTING
                                )
                                .liveMode(true)
                                .object_("object")
                                .occupation(
                                    CounterpartyCreateParams.LegalEntityCreateRequest
                                        .LegalEntityWealthEmploymentDetail
                                        .Occupation
                                        .CONSULTING
                                )
                                .sourceOfFunds(
                                    CounterpartyCreateParams.LegalEntityCreateRequest
                                        .LegalEntityWealthEmploymentDetail
                                        .SourceOfFunds
                                        .ALIMONY
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .wealthSource(
                                    CounterpartyCreateParams.LegalEntityCreateRequest
                                        .LegalEntityWealthEmploymentDetail
                                        .WealthSource
                                        .BUSINESS_SALE
                                )
                                .build()
                        )
                        .website("website")
                        .build()
                )
                .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    CounterpartyCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .sendRemittanceAdvice(true)
                .taxpayerIdentifier("taxpayer_identifier")
                .verificationStatus("verification_status")
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}
