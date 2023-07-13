package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerTransactionListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerTransactionServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val ledgerTransactionService = client.ledgerTransactions()
        val ledgerTransaction =
            ledgerTransactionService.create(
                LedgerTransactionCreateParams.builder()
                    .description("string")
                    .status(LedgerTransactionCreateParams.Status.ARCHIVED)
                    .metadata(LedgerTransactionCreateParams.Metadata.builder().build())
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .ledgerEntries(
                        listOf(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                                .amount(123L)
                                .direction(
                                    LedgerTransactionCreateParams.LedgerEntryCreateRequest.Direction
                                        .CREDIT
                                )
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .lockVersion(123L)
                                .pendingBalanceAmount(
                                    LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                        .PostedBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .availableBalanceAmount(
                                    LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .externalId("string")
                    .ledgerableType(LedgerTransactionCreateParams.LedgerableType.COUNTERPARTY)
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(ledgerTransaction)
        ledgerTransaction.validate()
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
        val ledgerTransactionService = client.ledgerTransactions()
        val ledgerTransaction =
            ledgerTransactionService.retrieve(
                LedgerTransactionRetrieveParams.builder().id("string").build()
            )
        println(ledgerTransaction)
        ledgerTransaction.validate()
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
        val ledgerTransactionService = client.ledgerTransactions()
        val ledgerTransaction =
            ledgerTransactionService.update(
                LedgerTransactionUpdateParams.builder()
                    .id("string")
                    .description("string")
                    .status(LedgerTransactionUpdateParams.Status.ARCHIVED)
                    .metadata(LedgerTransactionUpdateParams.Metadata.builder().build())
                    .ledgerEntries(
                        listOf(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest.builder()
                                .amount(123L)
                                .direction(
                                    LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Direction
                                        .CREDIT
                                )
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .lockVersion(123L)
                                .pendingBalanceAmount(
                                    LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                        .PostedBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .availableBalanceAmount(
                                    LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .build()
            )
        println(ledgerTransaction)
        ledgerTransaction.validate()
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
        val ledgerTransactionService = client.ledgerTransactions()
        val response = ledgerTransactionService.list(LedgerTransactionListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callCreateReversal() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val ledgerTransactionService = client.ledgerTransactions()
        val ledgerTransaction =
            ledgerTransactionService.createReversal(
                LedgerTransactionCreateReversalParams.builder()
                    .ledgerTransactionId("string")
                    .description("string")
                    .status(LedgerTransactionCreateReversalParams.Status.ARCHIVED)
                    .metadata(LedgerTransactionCreateReversalParams.Metadata.builder().build())
                    .effectiveAt(LocalDate.parse("2019-12-27"))
                    .externalId("string")
                    .ledgerableType(
                        LedgerTransactionCreateReversalParams.LedgerableType.COUNTERPARTY
                    )
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(ledgerTransaction)
        ledgerTransaction.validate()
    }
}
