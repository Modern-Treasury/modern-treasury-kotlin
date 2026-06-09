// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerEntryCreateRequestTest {

    @Test
    fun create() {
        val ledgerEntryCreateRequest =
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

        assertThat(ledgerEntryCreateRequest.amount()).isEqualTo(0L)
        assertThat(ledgerEntryCreateRequest.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(ledgerEntryCreateRequest.ledgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEntryCreateRequest.availableBalanceAmount())
            .isEqualTo(
                LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(ledgerEntryCreateRequest.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEntryCreateRequest.lockVersion()).isEqualTo(0L)
        assertThat(ledgerEntryCreateRequest.metadata())
            .isEqualTo(
                LedgerEntryCreateRequest.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerEntryCreateRequest.pendingBalanceAmount())
            .isEqualTo(
                LedgerEntryCreateRequest.PendingBalanceAmount.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(ledgerEntryCreateRequest.postedBalanceAmount())
            .isEqualTo(
                LedgerEntryCreateRequest.PostedBalanceAmount.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(ledgerEntryCreateRequest.showResultingLedgerAccountBalances()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerEntryCreateRequest =
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

        val roundtrippedLedgerEntryCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerEntryCreateRequest),
                jacksonTypeRef<LedgerEntryCreateRequest>(),
            )

        assertThat(roundtrippedLedgerEntryCreateRequest).isEqualTo(ledgerEntryCreateRequest)
    }
}
