// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.AddressRequest
import com.moderntreasury.api.models.ChildLegalEntityCreate
import com.moderntreasury.api.models.ContactDetailCreateRequest
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyUpdateParams
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.IdentificationCreateRequest
import com.moderntreasury.api.models.LedgerAccountCreateRequest
import com.moderntreasury.api.models.LegalEntityAddressCreateRequest
import com.moderntreasury.api.models.LegalEntityAssociationInlineCreate
import com.moderntreasury.api.models.LegalEntityIndustryClassification
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CounterpartyServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val counterpartyService = client.counterparties()

        val counterparty =
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
                                        CounterpartyCreateParams.Account.AccountDetail
                                            .AccountNumberType
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
                                    .externalId("external_id")
                                    .addLedgerAccountCategoryId(
                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                    )
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY
                                    )
                                    .metadata(
                                        LedgerAccountCreateRequest.Metadata.builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
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
                                        CounterpartyCreateParams.Account.RoutingDetail
                                            .RoutingNumberType
                                            .ABA
                                    )
                                    .paymentType(
                                        CounterpartyCreateParams.Account.RoutingDetail.PaymentType
                                            .ACH
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
                                CounterpartyCreateParams.LegalEntityCreateRequest
                                    .LegalEntityBankSetting
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
                                                ChildLegalEntityCreate.LegalEntityBankSetting
                                                    .builder()
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
                                            .firstName("first_name")
                                            .addIdentification(
                                                IdentificationCreateRequest.builder()
                                                    .idNumber("id_number")
                                                    .idType(
                                                        IdentificationCreateRequest.IdType.AR_CUIL
                                                    )
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
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .discardedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .liveMode(true)
                                                    .object_("object")
                                                    .updatedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
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
                                                ChildLegalEntityCreate.LegalEntityRegulator
                                                    .builder()
                                                    .jurisdiction("jurisdiction")
                                                    .name("name")
                                                    .registrationNumber("registration_number")
                                                    .build()
                                            )
                                            .riskRating(ChildLegalEntityCreate.RiskRating.LOW)
                                            .status(ChildLegalEntityCreate.Status.ACTIVE)
                                            .suffix("suffix")
                                            .thirdPartyVerification(
                                                ChildLegalEntityCreate.ThirdPartyVerification
                                                    .builder()
                                                    .vendor(
                                                        ChildLegalEntityCreate
                                                            .ThirdPartyVerification
                                                            .Vendor
                                                            .PERSONA
                                                    )
                                                    .vendorVerificationId("vendor_verification_id")
                                                    .build()
                                            )
                                            .tickerSymbol("ticker_symbol")
                                            .wealthAndEmploymentDetails(
                                                ChildLegalEntityCreate
                                                    .LegalEntityWealthEmploymentDetail
                                                    .builder()
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
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
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
                            .listedExchange("listed_exchange")
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
                                CounterpartyCreateParams.LegalEntityCreateRequest.PhoneNumber
                                    .builder()
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .politicallyExposedPerson(true)
                            .preferredName("preferred_name")
                            .prefix("prefix")
                            .addPrimarySocialMediaSite("string")
                            .addRegulator(
                                CounterpartyCreateParams.LegalEntityCreateRequest
                                    .LegalEntityRegulator
                                    .builder()
                                    .jurisdiction("jurisdiction")
                                    .name("name")
                                    .registrationNumber("registration_number")
                                    .build()
                            )
                            .riskRating(
                                CounterpartyCreateParams.LegalEntityCreateRequest.RiskRating.LOW
                            )
                            .status(CounterpartyCreateParams.LegalEntityCreateRequest.Status.ACTIVE)
                            .suffix("suffix")
                            .thirdPartyVerification(
                                CounterpartyCreateParams.LegalEntityCreateRequest
                                    .ThirdPartyVerification
                                    .builder()
                                    .vendor(
                                        CounterpartyCreateParams.LegalEntityCreateRequest
                                            .ThirdPartyVerification
                                            .Vendor
                                            .PERSONA
                                    )
                                    .vendorVerificationId("vendor_verification_id")
                                    .build()
                            )
                            .tickerSymbol("ticker_symbol")
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
                    .build()
            )

        counterparty.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val counterpartyService = client.counterparties()

        val counterparty = counterpartyService.retrieve("id")

        counterparty.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val counterpartyService = client.counterparties()

        val counterparty =
            counterpartyService.update(
                CounterpartyUpdateParams.builder()
                    .id("id")
                    .email("dev@stainless.com")
                    .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(
                        CounterpartyUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .sendRemittanceAdvice(true)
                    .taxpayerIdentifier("taxpayer_identifier")
                    .build()
            )

        counterparty.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val counterpartyService = client.counterparties()

        val page = counterpartyService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun delete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val counterpartyService = client.counterparties()

        counterpartyService.delete("id")
    }

    @Test
    fun collectAccount() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val counterpartyService = client.counterparties()

        val counterpartyCollectAccountResponse =
            counterpartyService.collectAccount(
                CounterpartyCollectAccountParams.builder()
                    .id("id")
                    .direction(TransactionDirection.CREDIT)
                    .customRedirect("https://example.com")
                    .addField(CounterpartyCollectAccountParams.Field.NAME)
                    .sendEmail(true)
                    .build()
            )

        counterpartyCollectAccountResponse.validate()
    }
}
