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
                                .accountNumber("string")
                                .accountNumberType(
                                    ExternalAccountCreateParams.AccountDetail.AccountNumberType.IBAN
                                )
                                .build()
                        )
                    )
                    .accountType(ExternalAccountType.CASH)
                    .contactDetails(
                        listOf(
                            ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                                .contactIdentifier("string")
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
                            .currency("string")
                            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("string")
                            .normalBalance(
                                ExternalAccountCreateParams.LedgerAccountCreateRequest.NormalBalance
                                    .CREDIT
                            )
                            .currencyExponent(123L)
                            .description("string")
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                ExternalAccountCreateParams.LedgerAccountCreateRequest
                                    .LedgerableType
                                    .EXTERNAL_ACCOUNT
                            )
                            .metadata(
                                ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata
                                    .builder()
                                    .build()
                            )
                            .build()
                    )
                    .metadata(ExternalAccountCreateParams.Metadata.builder().build())
                    .name("string")
                    .partyAddress(
                        ExternalAccountCreateParams.AddressRequest.builder()
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .postalCode("string")
                            .region("string")
                            .build()
                    )
                    .partyIdentifier("string")
                    .partyName("string")
                    .partyType(ExternalAccountCreateParams.PartyType.BUSINESS)
                    .plaidProcessorToken("string")
                    .routingDetails(
                        listOf(
                            ExternalAccountCreateParams.RoutingDetail.builder()
                                .routingNumber("string")
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
                ExternalAccountRetrieveParams.builder().id("string").build()
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
                    .id("string")
                    .accountType(ExternalAccountType.CASH)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(ExternalAccountUpdateParams.Metadata.builder().build())
                    .name("string")
                    .partyAddress(
                        ExternalAccountUpdateParams.AddressRequest.builder()
                            .country("string")
                            .line1("string")
                            .line2("string")
                            .locality("string")
                            .postalCode("string")
                            .region("string")
                            .build()
                    )
                    .partyName("string")
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
        externalAccountService.delete(ExternalAccountDeleteParams.builder().id("string").build())
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
                    .id("string")
                    .amounts(listOf(123L))
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
        val externalAccount =
            externalAccountService.verify(
                ExternalAccountVerifyParams.builder()
                    .id("string")
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
                    .currency(Currency.AED)
                    .build()
            )
        println(externalAccount)
        externalAccount.validate()
    }
}
