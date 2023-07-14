package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionCreateParamsTest {

    @Test
    fun createLedgerTransactionCreateParams() {
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
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest.Direction.CREDIT
                        )
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .AvailableBalanceAmount
                                .builder()
                                .build()
                        )
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
                        .showResultingLedgerAccountBalances(true)
                        .build()
                )
            )
            .externalId("string")
            .ledgerableType(LedgerTransactionCreateParams.LedgerableType.COUNTERPARTY)
            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
                            .availableBalanceAmount(
                                LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                    .AvailableBalanceAmount
                                    .builder()
                                    .build()
                            )
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
                            .showResultingLedgerAccountBalances(true)
                            .build()
                    )
                )
                .externalId("string")
                .ledgerableType(LedgerTransactionCreateParams.LedgerableType.COUNTERPARTY)
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.status()).isEqualTo(LedgerTransactionCreateParams.Status.ARCHIVED)
        assertThat(body.metadata())
            .isEqualTo(LedgerTransactionCreateParams.Metadata.builder().build())
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.ledgerEntries())
            .isEqualTo(
                listOf(
                    LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                        .amount(123L)
                        .direction(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest.Direction.CREDIT
                        )
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .AvailableBalanceAmount
                                .builder()
                                .build()
                        )
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
                        .showResultingLedgerAccountBalances(true)
                        .build()
                )
            )
        assertThat(body.externalId()).isEqualTo("string")
        assertThat(body.ledgerableType())
            .isEqualTo(LedgerTransactionCreateParams.LedgerableType.COUNTERPARTY)
        assertThat(body.ledgerableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerTransactionCreateParams.builder()
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
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.ledgerEntries())
            .isEqualTo(
                listOf(
                    LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                        .amount(123L)
                        .direction(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest.Direction.CREDIT
                        )
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }
}
