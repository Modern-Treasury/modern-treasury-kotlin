// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionCreateParamsTest {

    @Test
    fun createLedgerTransactionCreateParams() {
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
            .description("string")
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .externalId("string")
            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ledgerableType(LedgerTransactionCreateParams.LedgerableType.COUNTERPARTY)
            .metadata(LedgerTransactionCreateParams.Metadata.builder().build())
            .status(LedgerTransactionCreateParams.Status.ARCHIVED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
                .description("string")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .externalId("string")
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerTransactionCreateParams.LedgerableType.COUNTERPARTY)
                .metadata(LedgerTransactionCreateParams.Metadata.builder().build())
                .status(LedgerTransactionCreateParams.Status.ARCHIVED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ledgerEntries())
            .isEqualTo(
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
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.effectiveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.externalId()).isEqualTo("string")
        assertThat(body.ledgerableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.ledgerableType())
            .isEqualTo(LedgerTransactionCreateParams.LedgerableType.COUNTERPARTY)
        assertThat(body.metadata())
            .isEqualTo(LedgerTransactionCreateParams.Metadata.builder().build())
        assertThat(body.status()).isEqualTo(LedgerTransactionCreateParams.Status.ARCHIVED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerTransactionCreateParams.builder()
                .ledgerEntries(
                    listOf(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                            .amount(123L)
                            .direction(TransactionDirection.CREDIT)
                            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ledgerEntries())
            .isEqualTo(
                listOf(
                    LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                        .amount(123L)
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }
}
