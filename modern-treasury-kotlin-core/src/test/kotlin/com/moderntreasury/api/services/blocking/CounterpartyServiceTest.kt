// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.BankSettings
import com.moderntreasury.api.models.CounterpartyCollectAccountParams
import com.moderntreasury.api.models.CounterpartyCreateParams
import com.moderntreasury.api.models.CounterpartyDeleteParams
import com.moderntreasury.api.models.CounterpartyRetrieveParams
import com.moderntreasury.api.models.CounterpartyUpdateParams
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.LegalEntityComplianceDetail
import com.moderntreasury.api.models.LegalEntityIndustryClassification
import com.moderntreasury.api.models.TransactionDirection
import com.moderntreasury.api.models.WealthAndEmploymentDetails
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
                            .accountType(ExternalAccountType.CASH)
                            .addContactDetail(
                                CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                    .builder()
                                    .contactIdentifier("contact_identifier")
                                    .contactIdentifierType(
                                        CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                            .ContactIdentifierType
                                            .EMAIL
                                    )
                                    .build()
                            )
                            .ledgerAccount(
                                CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                    .builder()
                                    .currency("currency")
                                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .normalBalance(TransactionDirection.CREDIT)
                                    .currencyExponent(0L)
                                    .description("description")
                                    .addLedgerAccountCategoryId(
                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                    )
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                            .LedgerableType
                                            .COUNTERPARTY
                                    )
                                    .metadata(
                                        CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                            .Metadata
                                            .builder()
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
                                CounterpartyCreateParams.Account.AddressRequest.builder()
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
                    .ledgerType(CounterpartyCreateParams.LedgerType.CUSTOMER)
                    .legalEntity(
                        CounterpartyCreateParams.LegalEntityCreateRequest.builder()
                            .legalEntityType(
                                CounterpartyCreateParams.LegalEntityCreateRequest.LegalEntityType
                                    .BUSINESS
                            )
                            .addAddress(
                                CounterpartyCreateParams.LegalEntityCreateRequest
                                    .LegalEntityAddressCreateRequest
                                    .builder()
                                    .country("country")
                                    .line1("line1")
                                    .locality("locality")
                                    .postalCode("postal_code")
                                    .region("region")
                                    .addAddressType(
                                        CounterpartyCreateParams.LegalEntityCreateRequest
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
                            .dateFormed(LocalDate.parse("2019-12-27"))
                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                            .addDoingBusinessAsName("string")
                            .email("email")
                            .firstName("first_name")
                            .addIdentification(
                                CounterpartyCreateParams.LegalEntityCreateRequest
                                    .IdentificationCreateRequest
                                    .builder()
                                    .idNumber("id_number")
                                    .idType(
                                        CounterpartyCreateParams.LegalEntityCreateRequest
                                            .IdentificationCreateRequest
                                            .IdType
                                            .AR_CUIL
                                    )
                                    .issuingCountry("issuing_country")
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
                                CounterpartyCreateParams.LegalEntityCreateRequest
                                    .LegalEntityAssociationInlineCreateRequest
                                    .builder()
                                    .addRelationshipType(
                                        CounterpartyCreateParams.LegalEntityCreateRequest
                                            .LegalEntityAssociationInlineCreateRequest
                                            .RelationshipType
                                            .BENEFICIAL_OWNER
                                    )
                                    .childLegalEntity(
                                        CounterpartyCreateParams.LegalEntityCreateRequest
                                            .LegalEntityAssociationInlineCreateRequest
                                            .ChildLegalEntityCreate
                                            .builder()
                                            .addAddress(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
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
                                                        CounterpartyCreateParams
                                                            .LegalEntityCreateRequest
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
                                            .complianceDetails(
                                                LegalEntityComplianceDetail.builder()
                                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                                                    .issuer("issuer")
                                                    .liveMode(true)
                                                    .object_("object")
                                                    .tokenExpiresAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .tokenIssuedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .tokenUrl("token_url")
                                                    .updatedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .entityValidated(true)
                                                    .validatedAt(
                                                        OffsetDateTime.parse(
                                                            "2019-12-27T18:11:19.117Z"
                                                        )
                                                    )
                                                    .build()
                                            )
                                            .dateFormed(LocalDate.parse("2019-12-27"))
                                            .dateOfBirth(LocalDate.parse("2019-12-27"))
                                            .addDoingBusinessAsName("string")
                                            .email("email")
                                            .firstName("first_name")
                                            .addIdentification(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .IdentificationCreateRequest
                                                    .builder()
                                                    .idNumber("id_number")
                                                    .idType(
                                                        CounterpartyCreateParams
                                                            .LegalEntityCreateRequest
                                                            .LegalEntityAssociationInlineCreateRequest
                                                            .ChildLegalEntityCreate
                                                            .IdentificationCreateRequest
                                                            .IdType
                                                            .AR_CUIL
                                                    )
                                                    .issuingCountry("issuing_country")
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
                                            .lastName("last_name")
                                            .legalEntityType(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .LegalEntityType
                                                    .BUSINESS
                                            )
                                            .legalStructure(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .ChildLegalEntityCreate
                                                    .LegalStructure
                                                    .CORPORATION
                                            )
                                            .metadata(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
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
                                                CounterpartyCreateParams.LegalEntityCreateRequest
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
                                                CounterpartyCreateParams.LegalEntityCreateRequest
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
                            .addPhoneNumber(
                                CounterpartyCreateParams.LegalEntityCreateRequest.PhoneNumber
                                    .builder()
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .politicallyExposedPerson(true)
                            .preferredName("preferred_name")
                            .prefix("prefix")
                            .riskRating(
                                CounterpartyCreateParams.LegalEntityCreateRequest.RiskRating.LOW
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
                    .verificationStatus(CounterpartyCreateParams.VerificationStatus.DENIED)
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

        val counterparty =
            counterpartyService.retrieve(CounterpartyRetrieveParams.builder().id("id").build())

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

        counterpartyService.delete(CounterpartyDeleteParams.builder().id("id").build())
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
