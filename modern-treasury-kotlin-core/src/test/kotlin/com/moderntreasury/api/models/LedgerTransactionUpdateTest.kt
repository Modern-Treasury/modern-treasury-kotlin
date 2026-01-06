// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerTransactionUpdateTest {

    @Test
    fun create() {
        val ledgerTransactionUpdate =
            LedgerTransactionUpdate.builder()
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addLedgerEntry(
                    LedgerEntryCreateRequest.builder()
                        .amount(0L)
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lockVersion(0L)
                        .metadata(
                            LedgerEntryCreateRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .pendingBalanceAmount(
                            LedgerEntryCreateRequest.PendingBalanceAmount.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .postedBalanceAmount(
                            LedgerEntryCreateRequest.PostedBalanceAmount.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .showResultingLedgerAccountBalances(true)
                        .build()
                )
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerTransactionUpdate.LedgerableType.EXPECTED_PAYMENT)
                .metadata(
                    LedgerTransactionUpdate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .status(LedgerTransactionUpdate.Status.ARCHIVED)
                .build()

        assertThat(ledgerTransactionUpdate.description()).isEqualTo("description")
        assertThat(ledgerTransactionUpdate.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerTransactionUpdate.ledgerEntries())
            .containsExactly(
                LedgerEntryCreateRequest.builder()
                    .amount(0L)
                    .direction(TransactionDirection.CREDIT)
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .availableBalanceAmount(
                        LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lockVersion(0L)
                    .metadata(
                        LedgerEntryCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .pendingBalanceAmount(
                        LedgerEntryCreateRequest.PendingBalanceAmount.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .postedBalanceAmount(
                        LedgerEntryCreateRequest.PostedBalanceAmount.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .showResultingLedgerAccountBalances(true)
                    .build()
            )
        assertThat(ledgerTransactionUpdate.ledgerableId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionUpdate.ledgerableType())
            .isEqualTo(LedgerTransactionUpdate.LedgerableType.EXPECTED_PAYMENT)
        assertThat(ledgerTransactionUpdate.metadata())
            .isEqualTo(
                LedgerTransactionUpdate.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerTransactionUpdate.status())
            .isEqualTo(LedgerTransactionUpdate.Status.ARCHIVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerTransactionUpdate =
            LedgerTransactionUpdate.builder()
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addLedgerEntry(
                    LedgerEntryCreateRequest.builder()
                        .amount(0L)
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lockVersion(0L)
                        .metadata(
                            LedgerEntryCreateRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .pendingBalanceAmount(
                            LedgerEntryCreateRequest.PendingBalanceAmount.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .postedBalanceAmount(
                            LedgerEntryCreateRequest.PostedBalanceAmount.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .showResultingLedgerAccountBalances(true)
                        .build()
                )
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerTransactionUpdate.LedgerableType.EXPECTED_PAYMENT)
                .metadata(
                    LedgerTransactionUpdate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .status(LedgerTransactionUpdate.Status.ARCHIVED)
                .build()

        val roundtrippedLedgerTransactionUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerTransactionUpdate),
                jacksonTypeRef<LedgerTransactionUpdate>(),
            )

        assertThat(roundtrippedLedgerTransactionUpdate).isEqualTo(ledgerTransactionUpdate)
    }
}
