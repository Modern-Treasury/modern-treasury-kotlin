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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val counterpartyService = client.counterparties()
        val counterparty =
            counterpartyService.create(
                CounterpartyCreateParams.builder()
                    .name("string")
                    .accounts(
                        listOf(
                            CounterpartyCreateParams.Account.builder()
                                .accountType(ExternalAccountType.CASH)
                                .partyType(CounterpartyCreateParams.Account.PartyType.BUSINESS)
                                .partyAddress(
                                    CounterpartyCreateParams.Account.AddressRequest.builder()
                                        .line1("string")
                                        .line2("string")
                                        .locality("string")
                                        .region("string")
                                        .postalCode("string")
                                        .country("string")
                                        .build()
                                )
                                .name("string")
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
                                .metadata(
                                    CounterpartyCreateParams.Account.Metadata.builder().build()
                                )
                                .partyName("string")
                                .partyIdentifier("string")
                                .ledgerAccount(
                                    CounterpartyCreateParams.Account.LedgerAccountCreateRequest
                                        .builder()
                                        .name("string")
                                        .description("string")
                                        .normalBalance(
                                            CounterpartyCreateParams.Account
                                                .LedgerAccountCreateRequest
                                                .NormalBalance
                                                .CREDIT
                                        )
                                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .currency("string")
                                        .currencyExponent(123L)
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
                                .plaidProcessorToken("string")
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
                                .build()
                        )
                    )
                    .email("dev@stainlessapi.com")
                    .metadata(CounterpartyCreateParams.Metadata.builder().build())
                    .sendRemittanceAdvice(true)
                    .verificationStatus(CounterpartyCreateParams.VerificationStatus.DENIED)
                    .accounting(
                        CounterpartyCreateParams.Accounting.builder()
                            .type(CounterpartyCreateParams.Accounting.Type.CUSTOMER)
                            .build()
                    )
                    .ledgerType(CounterpartyCreateParams.LedgerType.CUSTOMER)
                    .taxpayerIdentifier("string")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val counterpartyService = client.counterparties()
        val counterparty =
            counterpartyService.update(
                CounterpartyUpdateParams.builder()
                    .id("string")
                    .name("string")
                    .email("dev@stainlessapi.com")
                    .metadata(CounterpartyUpdateParams.Metadata.builder().build())
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val counterpartyService = client.counterparties()
        counterpartyService.delete(CounterpartyDeleteParams.builder().id("string").build())
    }

    @Test
    fun callCollectAccount() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val counterpartyService = client.counterparties()
        val counterpartyCollectAccountResponse =
            counterpartyService.collectAccount(
                CounterpartyCollectAccountParams.builder()
                    .id("string")
                    .direction(CounterpartyCollectAccountParams.Direction.CREDIT)
                    .sendEmail(true)
                    .fields(listOf(CounterpartyCollectAccountParams.Field.NAME))
                    .customRedirect("https://example.com")
                    .build()
            )
        println(counterpartyCollectAccountResponse)
        counterpartyCollectAccountResponse.validate()
    }
}
