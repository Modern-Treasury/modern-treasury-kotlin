// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.CounterpartyListParams
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
                    .name("string")
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
                                            .accountNumber("string")
                                            .accountNumberType(
                                                CounterpartyCreateParams.Account.AccountDetail
                                                    .AccountNumberType
                                                    .IBAN
                                            )
                                            .build()
                                    )
                                )
                                .accountType(ExternalAccountType.CASH)
                                .contactDetails(
                                    listOf(
                                        CounterpartyCreateParams.Account.ContactDetailCreateRequest
                                            .builder()
                                            .contactIdentifier("string")
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
                                        .currency("string")
                                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .name("string")
                                        .normalBalance(TransactionDirection.CREDIT)
                                        .currencyExponent(123L)
                                        .description("string")
                                        .ledgerAccountCategoryIds(
                                            listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        )
                                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .ledgerableType(
                                            CounterpartyCreateParams.Account
                                                .LedgerAccountCreateRequest
                                                .LedgerableType
                                                .EXTERNAL_ACCOUNT
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
                                .name("string")
                                .partyAddress(
                                    CounterpartyCreateParams.Account.AddressRequest.builder()
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
                                .partyType(CounterpartyCreateParams.Account.PartyType.BUSINESS)
                                .plaidProcessorToken("string")
                                .routingDetails(
                                    listOf(
                                        CounterpartyCreateParams.Account.RoutingDetail.builder()
                                            .routingNumber("string")
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
                    .metadata(CounterpartyCreateParams.Metadata.builder().build())
                    .sendRemittanceAdvice(true)
                    .taxpayerIdentifier("string")
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
            counterpartyService.retrieve(CounterpartyRetrieveParams.builder().id("string").build())
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
                    .id("string")
                    .email("dev@stainlessapi.com")
                    .metadata(CounterpartyUpdateParams.Metadata.builder().build())
                    .name("string")
                    .sendRemittanceAdvice(true)
                    .taxpayerIdentifier("string")
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
        counterpartyService.delete(CounterpartyDeleteParams.builder().id("string").build())
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
                    .id("string")
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
