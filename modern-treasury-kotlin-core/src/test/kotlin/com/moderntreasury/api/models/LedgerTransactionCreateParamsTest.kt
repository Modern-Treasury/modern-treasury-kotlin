// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
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
                        .amount(0L)
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .AvailableBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .lockVersion(0L)
                        .metadata(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest.Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .pendingBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .PendingBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .postedBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .PostedBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
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
            .metadata(
                LedgerTransactionCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
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
                            .amount(0L)
                            .direction(TransactionDirection.CREDIT)
                            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .availableBalanceAmount(
                                LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                    .AvailableBalanceAmount
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .lockVersion(0L)
                            .metadata(
                                LedgerTransactionCreateParams.LedgerEntryCreateRequest.Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .pendingBalanceAmount(
                                LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                    .PendingBalanceAmount
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .postedBalanceAmount(
                                LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                    .PostedBalanceAmount
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
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
                .metadata(
                    LedgerTransactionCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .status(LedgerTransactionCreateParams.Status.ARCHIVED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ledgerEntries())
            .isEqualTo(
                listOf(
                    LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                        .amount(0L)
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .AvailableBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .lockVersion(0L)
                        .metadata(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest.Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .pendingBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .PendingBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .postedBalanceAmount(
                            LedgerTransactionCreateParams.LedgerEntryCreateRequest
                                .PostedBalanceAmount
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .showResultingLedgerAccountBalances(true)
                        .build()
                )
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.effectiveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.externalId()).isEqualTo("external_id")
        assertThat(body.ledgerableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.ledgerableType())
            .isEqualTo(LedgerTransactionCreateParams.LedgerableType.EXPECTED_PAYMENT)
        assertThat(body.metadata())
            .isEqualTo(
                LedgerTransactionCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.status()).isEqualTo(LedgerTransactionCreateParams.Status.ARCHIVED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerTransactionCreateParams.builder()
                .ledgerEntries(
                    listOf(
                        LedgerTransactionCreateParams.LedgerEntryCreateRequest.builder()
                            .amount(0L)
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
                        .amount(0L)
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }
}
