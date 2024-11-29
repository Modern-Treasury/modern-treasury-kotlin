// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.ExternalAccountListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExternalAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountService = client.externalAccounts()
        val externalAccount =
            externalAccountService.create(
                ExternalAccountCreateParams.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountDetails(
                        listOf(
                            ExternalAccountCreateParams.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                        .AU_NUMBER
                                )
                                .build()
                        )
                    )
                    .accountType(ExternalAccountType.CASH)
                    .contactDetails(
                        listOf(
                            ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                                .contactIdentifier("contact_identifier")
                                .contactIdentifierType(
                                    ExternalAccountCreateParams.ContactDetailCreateRequest
                                        .ContactIdentifierType
                                        .EMAIL
                                )
                                .build()
                        )
                    )
                    .ledgerAccount(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                            .currency("currency")
                            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .normalBalance(TransactionDirection.CREDIT)
                            .currencyExponent(0L)
                            .description("description")
                            .ledgerAccountCategoryIds(
                                listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            )
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                ExternalAccountCreateParams.LedgerAccountCreateRequest
                                    .LedgerableType
                                    .COUNTERPARTY
                            )
                            .metadata(
                                ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                    .metadata(ExternalAccountCreateParams.Metadata.builder().build())
                    .name("name")
                    .partyAddress(
                        ExternalAccountCreateParams.AddressRequest.builder()
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
                    .partyType(ExternalAccountCreateParams.PartyType.BUSINESS)
                    .plaidProcessorToken("plaid_processor_token")
                    .routingDetails(
                        listOf(
                            ExternalAccountCreateParams.RoutingDetail.builder()
                                .routingNumber("routing_number")
                                .routingNumberType(
                                    ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                                )
                                .paymentType(
                                    ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH
                                )
                                .build()
                        )
                    )
                    .build()
            )
        println(externalAccount)
        externalAccount.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountService = client.externalAccounts()
        val externalAccount =
            externalAccountService.retrieve(
                ExternalAccountRetrieveParams.builder().id("id").build()
            )
        println(externalAccount)
        externalAccount.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountService = client.externalAccounts()
        val externalAccount =
            externalAccountService.update(
                ExternalAccountUpdateParams.builder()
                    .id("id")
                    .accountType(ExternalAccountType.CASH)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(ExternalAccountUpdateParams.Metadata.builder().build())
                    .name("name")
                    .partyAddress(
                        ExternalAccountUpdateParams.AddressRequest.builder()
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .build()
                    )
                    .partyName("party_name")
                    .partyType(ExternalAccountUpdateParams.PartyType.BUSINESS)
                    .build()
            )
        println(externalAccount)
        externalAccount.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountService = client.externalAccounts()
        val response = externalAccountService.list(ExternalAccountListParams.builder().build())
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
        val externalAccountService = client.externalAccounts()
        externalAccountService.delete(ExternalAccountDeleteParams.builder().id("id").build())
    }

    @Test
    fun callCompleteVerification() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountService = client.externalAccounts()
        val externalAccount =
            externalAccountService.completeVerification(
                ExternalAccountCompleteVerificationParams.builder()
                    .id("id")
                    .amounts(listOf(0L))
                    .build()
            )
        println(externalAccount)
        externalAccount.validate()
    }

    @Test
    fun callVerify() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val externalAccountService = client.externalAccounts()
        val externalAccountVerifyResponse =
            externalAccountService.verify(
                ExternalAccountVerifyParams.builder()
                    .id("id")
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
                    .currency(Currency.AED)
                    .fallbackType(ExternalAccountVerifyParams.FallbackType.ACH)
                    .priority(ExternalAccountVerifyParams.Priority.HIGH)
                    .build()
            )
        println(externalAccountVerifyResponse)
    }
}
