// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerTransactionListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerTransactionServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionService = client.ledgerTransactions()
        val ledgerTransaction =
            ledgerTransactionService.create(
                LedgerTransactionCreateParams.builder()
                    .ledgerEntries(
                        listOf(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                                .amount(123L)
                                .direction(TransactionDirection.CREDIT)
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .metadata(
                                    LedgerTransactionCreateParams.LedgerEntryCreateRequest.Metadata
                                        .builder()
                                        .build()
                                )
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
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .externalId("external_id")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(LedgerTransactionCreateParams.LedgerableType.EXPECTED_PAYMENT)
                    .metadata(LedgerTransactionCreateParams.Metadata.builder().build())
                    .status(LedgerTransactionCreateParams.Status.ARCHIVED)
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionService = client.ledgerTransactions()
        val ledgerTransaction =
            ledgerTransactionService.retrieve(
                LedgerTransactionRetrieveParams.builder().id("id").build()
            )
        println(ledgerTransaction)
        ledgerTransaction.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionService = client.ledgerTransactions()
        val ledgerTransaction =
            ledgerTransactionService.update(
                LedgerTransactionUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .ledgerEntries(
                        listOf(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest.builder()
                                .amount(123L)
                                .direction(TransactionDirection.CREDIT)
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .metadata(
                                    LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Metadata
                                        .builder()
                                        .build()
                                )
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
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(LedgerTransactionUpdateParams.LedgerableType.EXPECTED_PAYMENT)
                    .metadata(LedgerTransactionUpdateParams.Metadata.builder().build())
                    .status(LedgerTransactionUpdateParams.Status.ARCHIVED)
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
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
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionService = client.ledgerTransactions()
        val ledgerTransaction =
            ledgerTransactionService.createReversal(
                LedgerTransactionCreateReversalParams.builder()
                    .id("id")
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalId("external_id")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        LedgerTransactionCreateReversalParams.LedgerableType.EXPECTED_PAYMENT
                    )
                    .metadata(LedgerTransactionCreateReversalParams.Metadata.builder().build())
                    .status(LedgerTransactionCreateReversalParams.Status.ARCHIVED)
                    .build()
            )
        println(ledgerTransaction)
        ledgerTransaction.validate()
    }
}
