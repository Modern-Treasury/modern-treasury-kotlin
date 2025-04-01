// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerTransactionVersionTest {

    @Test
    fun create() {
        val ledgerTransactionVersion =
            LedgerTransactionVersion.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .externalId("external_id")
                .addLedgerEntry(
                    LedgerTransactionVersion.LedgerEntryOfTransactionVersion.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountCurrency("ledger_account_currency")
                        .ledgerAccountCurrencyExponent(0L)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerAccountLockVersion(0L)
                        .ledgerTransactionId("ledger_transaction_id")
                        .liveMode(true)
                        .metadata(
                            LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .object_("object")
                        .resultingLedgerAccountBalances(
                            LedgerTransactionVersion.LedgerEntryOfTransactionVersion.LedgerBalances
                                .builder()
                                .availableBalance(
                                    LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                        .LedgerBalances
                                        .LedgerBalance
                                        .builder()
                                        .amount(0L)
                                        .credits(0L)
                                        .currency("currency")
                                        .currencyExponent(0L)
                                        .debits(0L)
                                        .build()
                                )
                                .pendingBalance(
                                    LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                        .LedgerBalances
                                        .LedgerBalance
                                        .builder()
                                        .amount(0L)
                                        .credits(0L)
                                        .currency("currency")
                                        .currencyExponent(0L)
                                        .debits(0L)
                                        .build()
                                )
                                .postedBalance(
                                    LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                        .LedgerBalances
                                        .LedgerBalance
                                        .builder()
                                        .amount(0L)
                                        .credits(0L)
                                        .currency("currency")
                                        .currencyExponent(0L)
                                        .debits(0L)
                                        .build()
                                )
                                .build()
                        )
                        .status(
                            LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Status.ARCHIVED
                        )
                        .build()
                )
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerTransactionVersion.LedgerableType.EXPECTED_PAYMENT)
                .liveMode(true)
                .metadata(
                    LedgerTransactionVersion.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .partiallyPostsLedgerTransactionId("partially_posts_ledger_transaction_id")
                .postedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reversedByLedgerTransactionId("reversed_by_ledger_transaction_id")
                .reversesLedgerTransactionId("reverses_ledger_transaction_id")
                .status(LedgerTransactionVersion.Status.ARCHIVED)
                .version(0L)
                .build()

        assertThat(ledgerTransactionVersion.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionVersion.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerTransactionVersion.description()).isEqualTo("description")
        assertThat(ledgerTransactionVersion.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerTransactionVersion.effectiveDate())
            .isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(ledgerTransactionVersion.externalId()).isEqualTo("external_id")
        assertThat(ledgerTransactionVersion.ledgerEntries())
            .containsExactly(
                LedgerTransactionVersion.LedgerEntryOfTransactionVersion.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .direction(TransactionDirection.CREDIT)
                    .ledgerAccountCurrency("ledger_account_currency")
                    .ledgerAccountCurrencyExponent(0L)
                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerAccountLockVersion(0L)
                    .ledgerTransactionId("ledger_transaction_id")
                    .liveMode(true)
                    .metadata(
                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .object_("object")
                    .resultingLedgerAccountBalances(
                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion.LedgerBalances
                            .builder()
                            .availableBalance(
                                LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                    .LedgerBalances
                                    .LedgerBalance
                                    .builder()
                                    .amount(0L)
                                    .credits(0L)
                                    .currency("currency")
                                    .currencyExponent(0L)
                                    .debits(0L)
                                    .build()
                            )
                            .pendingBalance(
                                LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                    .LedgerBalances
                                    .LedgerBalance
                                    .builder()
                                    .amount(0L)
                                    .credits(0L)
                                    .currency("currency")
                                    .currencyExponent(0L)
                                    .debits(0L)
                                    .build()
                            )
                            .postedBalance(
                                LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                    .LedgerBalances
                                    .LedgerBalance
                                    .builder()
                                    .amount(0L)
                                    .credits(0L)
                                    .currency("currency")
                                    .currencyExponent(0L)
                                    .debits(0L)
                                    .build()
                            )
                            .build()
                    )
                    .status(
                        LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Status.ARCHIVED
                    )
                    .build()
            )
        assertThat(ledgerTransactionVersion.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionVersion.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionVersion.ledgerableId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerTransactionVersion.ledgerableType())
            .isEqualTo(LedgerTransactionVersion.LedgerableType.EXPECTED_PAYMENT)
        assertThat(ledgerTransactionVersion.liveMode()).isEqualTo(true)
        assertThat(ledgerTransactionVersion.metadata())
            .isEqualTo(
                LedgerTransactionVersion.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerTransactionVersion.object_()).isEqualTo("object")
        assertThat(ledgerTransactionVersion.partiallyPostsLedgerTransactionId())
            .isEqualTo("partially_posts_ledger_transaction_id")
        assertThat(ledgerTransactionVersion.postedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerTransactionVersion.reversedByLedgerTransactionId())
            .isEqualTo("reversed_by_ledger_transaction_id")
        assertThat(ledgerTransactionVersion.reversesLedgerTransactionId())
            .isEqualTo("reverses_ledger_transaction_id")
        assertThat(ledgerTransactionVersion.status())
            .isEqualTo(LedgerTransactionVersion.Status.ARCHIVED)
        assertThat(ledgerTransactionVersion.version()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerTransactionVersion =
            LedgerTransactionVersion.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .externalId("external_id")
                .addLedgerEntry(
                    LedgerTransactionVersion.LedgerEntryOfTransactionVersion.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(TransactionDirection.CREDIT)
                        .ledgerAccountCurrency("ledger_account_currency")
                        .ledgerAccountCurrencyExponent(0L)
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerAccountLockVersion(0L)
                        .ledgerTransactionId("ledger_transaction_id")
                        .liveMode(true)
                        .metadata(
                            LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .object_("object")
                        .resultingLedgerAccountBalances(
                            LedgerTransactionVersion.LedgerEntryOfTransactionVersion.LedgerBalances
                                .builder()
                                .availableBalance(
                                    LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                        .LedgerBalances
                                        .LedgerBalance
                                        .builder()
                                        .amount(0L)
                                        .credits(0L)
                                        .currency("currency")
                                        .currencyExponent(0L)
                                        .debits(0L)
                                        .build()
                                )
                                .pendingBalance(
                                    LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                        .LedgerBalances
                                        .LedgerBalance
                                        .builder()
                                        .amount(0L)
                                        .credits(0L)
                                        .currency("currency")
                                        .currencyExponent(0L)
                                        .debits(0L)
                                        .build()
                                )
                                .postedBalance(
                                    LedgerTransactionVersion.LedgerEntryOfTransactionVersion
                                        .LedgerBalances
                                        .LedgerBalance
                                        .builder()
                                        .amount(0L)
                                        .credits(0L)
                                        .currency("currency")
                                        .currencyExponent(0L)
                                        .debits(0L)
                                        .build()
                                )
                                .build()
                        )
                        .status(
                            LedgerTransactionVersion.LedgerEntryOfTransactionVersion.Status.ARCHIVED
                        )
                        .build()
                )
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerTransactionVersion.LedgerableType.EXPECTED_PAYMENT)
                .liveMode(true)
                .metadata(
                    LedgerTransactionVersion.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .partiallyPostsLedgerTransactionId("partially_posts_ledger_transaction_id")
                .postedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .reversedByLedgerTransactionId("reversed_by_ledger_transaction_id")
                .reversesLedgerTransactionId("reverses_ledger_transaction_id")
                .status(LedgerTransactionVersion.Status.ARCHIVED)
                .version(0L)
                .build()

        val roundtrippedLedgerTransactionVersion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerTransactionVersion),
                jacksonTypeRef<LedgerTransactionVersion>(),
            )

        assertThat(roundtrippedLedgerTransactionVersion).isEqualTo(ledgerTransactionVersion)
    }
}
