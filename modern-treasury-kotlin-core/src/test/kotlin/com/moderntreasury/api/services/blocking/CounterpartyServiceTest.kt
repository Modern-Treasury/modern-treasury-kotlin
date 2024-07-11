// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.CounterpartyListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CounterpartyServiceTest {

    @Test
    fun callCreate() {
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
                    .accounts(
                        listOf(
                            CounterpartyCreateParams.Account.builder()
                                .accountDetails(
                                    listOf(
                                        CounterpartyCreateParams.Account.AccountDetail.builder()
                                            .accountNumber("account_number")
                                            .accountNumberType(
                                                CounterpartyCreateParams.Account.AccountDetail
                                                    .AccountNumberType
                                                    .AU_NUMBER
                                            )
                                            .build()
                                    )
                                )
                                .accountType(ExternalAccountType.CASH)
                                .contactDetails(
                                    listOf(
                                        CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                            .builder()
                                            .contactIdentifier("contact_identifier")
                                            .contactIdentifierType(
                                                CounterpartyCreateParams.Account
                                                    .ContactDetailCreateRequest
                                                    .ContactIdentifierType
                                                    .EMAIL
                                            )
                                            .build()
                                    )
                                )
                                .ledgerAccount(
                                    CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                        .builder()
                                        .currency("currency")
                                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("name")
                                        .normalBalance(TransactionDirection.CREDIT)
                                        .currencyExponent(123L)
                                        .description("description")
                                        .ledgerAccountCategoryIds(
                                            listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        )
                                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .ledgerableType(
                                            CounterpartyCreateParams.Account
                                                .LedgerAccountCreateRequest
                                                .LedgerableType
                                                .COUNTERPARTY
                                        )
                                        .metadata(
                                            CounterpartyCreateParams.Account
                                                .LedgerAccountCreateRequest
                                                .Metadata
                                                .builder()
                                                .build()
                                        )
                                        .build()
                                )
                                .metadata(
                                    CounterpartyCreateParams.Account.Metadata.builder().build()
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
                                .routingDetails(
                                    listOf(
                                        CounterpartyCreateParams.Account.RoutingDetail.builder()
                                            .routingNumber("routing_number")
                                            .routingNumberType(
                                                CounterpartyCreateParams.Account.RoutingDetail
                                                    .RoutingNumberType
                                                    .ABA
                                            )
                                            .paymentType(
                                                CounterpartyCreateParams.Account.RoutingDetail
                                                    .PaymentType
                                                    .ACH
                                            )
                                            .build()
                                    )
                                )
                                .build()
                        )
                    )
                    .email("dev@stainlessapi.com")
                    .ledgerType(CounterpartyCreateParams.LedgerType.CUSTOMER)
                    .legalEntity(
                        CounterpartyCreateParams.LegalEntityCreateRequest.builder()
                            .legalEntityType(
                                CounterpartyCreateParams.LegalEntityCreateRequest.LegalEntityType
                                    .BUSINESS
                            )
                            .addresses(
                                listOf(
                                    CounterpartyCreateParams.LegalEntityCreateRequest
                                        .LegalEntityAddressCreateRequest
                                        .builder()
                                        .country("country")
                                        .line1("line1")
                                        .locality("locality")
                                        .postalCode("postal_code")
                                        .region("region")
                                        .addressTypes(
                                            listOf(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
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
                            )
                            .lastName("last_name")
                            .legalEntityAssociations(
                                listOf(
                                    CounterpartyCreateParams.LegalEntityCreateRequest
                                        .LegalEntityAssociationInlineCreateRequest
                                        .builder()
                                        .relationshipTypes(
                                            listOf(
                                                CounterpartyCreateParams.LegalEntityCreateRequest
                                                    .LegalEntityAssociationInlineCreateRequest
                                                    .RelationshipType
                                                    .BENEFICIAL_OWNER
                                            )
                                        )
                                        .childLegalEntity(
                                            CounterpartyCreateParams.LegalEntityCreateRequest
                                                .LegalEntityAssociationInlineCreateRequest
                                                .ChildLegalEntityCreate
                                                .builder()
                                                .addresses(
                                                    listOf(
                                                        CounterpartyCreateParams
                                                            .LegalEntityCreateRequest
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
                                                                    CounterpartyCreateParams
                                                                        .LegalEntityCreateRequest
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
                                                        CounterpartyCreateParams
                                                            .LegalEntityCreateRequest
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
                                                )
                                                .lastName("last_name")
                                                .legalEntityType(
                                                    CounterpartyCreateParams
                                                        .LegalEntityCreateRequest
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .LegalEntityType
                                                        .BUSINESS
                                                )
                                                .legalStructure(
                                                    CounterpartyCreateParams
                                                        .LegalEntityCreateRequest
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .LegalStructure
                                                        .CORPORATION
                                                )
                                                .metadata(
                                                    CounterpartyCreateParams
                                                        .LegalEntityCreateRequest
                                                        .LegalEntityAssociationInlineCreateRequest
                                                        .ChildLegalEntityCreate
                                                        .Metadata
                                                        .builder()
                                                        .build()
                                                )
                                                .phoneNumbers(
                                                    listOf(
                                                        CounterpartyCreateParams
                                                            .LegalEntityCreateRequest
                                                            .LegalEntityAssociationInlineCreateRequest
                                                            .ChildLegalEntityCreate
                                                            .PhoneNumber
                                                            .builder()
                                                            .phoneNumber("phone_number")
                                                            .build()
                                                    )
                                                )
                                                .riskRating(
                                                    CounterpartyCreateParams
                                                        .LegalEntityCreateRequest
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
                            .legalStructure(
                                CounterpartyCreateParams.LegalEntityCreateRequest.LegalStructure
                                    .CORPORATION
                            )
                            .metadata(
                                CounterpartyCreateParams.LegalEntityCreateRequest.Metadata.builder()
                                    .build()
                            )
                            .phoneNumbers(
                                listOf(
                                    CounterpartyCreateParams.LegalEntityCreateRequest.PhoneNumber
                                        .builder()
                                        .phoneNumber("phone_number")
                                        .build()
                                )
                            )
                            .riskRating(
                                CounterpartyCreateParams.LegalEntityCreateRequest.RiskRating.LOW
                            )
                            .website("website")
                            .build()
                    )
                    .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(CounterpartyCreateParams.Metadata.builder().build())
                    .sendRemittanceAdvice(true)
                    .taxpayerIdentifier("taxpayer_identifier")
                    .verificationStatus(CounterpartyCreateParams.VerificationStatus.DENIED)
                    .build()
            )
        println(counterparty)
        counterparty.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val counterpartyService = client.counterparties()
        val counterparty =
            counterpartyService.retrieve(CounterpartyRetrieveParams.builder().id("id").build())
        println(counterparty)
        counterparty.validate()
    }

    @Test
    fun callUpdate() {
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
                    .email("dev@stainlessapi.com")
                    .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(CounterpartyUpdateParams.Metadata.builder().build())
                    .name("name")
                    .sendRemittanceAdvice(true)
                    .taxpayerIdentifier("taxpayer_identifier")
                    .build()
            )
        println(counterparty)
        counterparty.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val counterpartyService = client.counterparties()
        val response = counterpartyService.list(CounterpartyListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
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
    fun callCollectAccount() {
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
                    .fields(listOf(CounterpartyCollectAccountParams.Field.NAME))
                    .sendEmail(true)
                    .build()
            )
        println(counterpartyCollectAccountResponse)
        counterpartyCollectAccountResponse.validate()
    }
}
