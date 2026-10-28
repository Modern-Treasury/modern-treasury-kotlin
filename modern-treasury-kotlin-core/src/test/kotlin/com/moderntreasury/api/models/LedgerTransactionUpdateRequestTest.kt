// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerTransactionUpdateRequestTest {

    @Test
    fun create() {
        val ledgerTransactionUpdateRequest =
            LedgerTransactionUpdateRequest.builder()
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .addLedgerEntry(
                    LedgerEntryCreateRequest.builder()
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .amountString("amount_string")
                        .availableBalanceAmount(
                            LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lockVersion(0L)
                        .metadata(
                            LedgerEntryCreateRequest.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("key", JsonValue.from("value"))
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
                .ledgerableType(LedgerTransactionUpdateRequest.LedgerableType.EXPECTED_PAYMENT)
                .metadata(
                    LedgerTransactionUpdateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .status(LedgerTransactionUpdateRequest.Status.ARCHIVED)
                .build()

        assertThat(ledgerTransactionUpdateRequest.description()).isEqualTo("description")
        assertThat(ledgerTransactionUpdateRequest.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerTransactionUpdateRequest.externalId()).isEqualTo("external_id")
        assertThat(ledgerTransactionUpdateRequest.ledgerEntries())
            .containsExactly(
                LedgerEntryCreateRequest.builder()
                    .direction(TransactionDirection.CREDIT)
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .amountString("amount_string")
                    .availableBalanceAmount(
                        LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lockVersion(0L)
                    .metadata(
                        LedgerEntryCreateRequest.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("key", JsonValue.from("value"))
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
        assertThat(ledgerTransactionUpdateRequest.ledgerableId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionUpdateRequest.ledgerableType())
            .isEqualTo(LedgerTransactionUpdateRequest.LedgerableType.EXPECTED_PAYMENT)
        assertThat(ledgerTransactionUpdateRequest.metadata())
            .isEqualTo(
                LedgerTransactionUpdateRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerTransactionUpdateRequest.status())
            .isEqualTo(LedgerTransactionUpdateRequest.Status.ARCHIVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerTransactionUpdateRequest =
            LedgerTransactionUpdateRequest.builder()
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .addLedgerEntry(
                    LedgerEntryCreateRequest.builder()
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .amountString("amount_string")
                        .availableBalanceAmount(
                            LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lockVersion(0L)
                        .metadata(
                            LedgerEntryCreateRequest.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("key", JsonValue.from("value"))
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
                .ledgerableType(LedgerTransactionUpdateRequest.LedgerableType.EXPECTED_PAYMENT)
                .metadata(
                    LedgerTransactionUpdateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .status(LedgerTransactionUpdateRequest.Status.ARCHIVED)
                .build()

        val roundtrippedLedgerTransactionUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerTransactionUpdateRequest),
                jacksonTypeRef<LedgerTransactionUpdateRequest>(),
            )

        assertThat(roundtrippedLedgerTransactionUpdateRequest)
            .isEqualTo(ledgerTransactionUpdateRequest)
    }
}
