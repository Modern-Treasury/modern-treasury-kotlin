// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountBalanceMonitorTest {

    @Test
    fun createLedgerAccountBalanceMonitor() {
        val ledgerAccountBalanceMonitor =
            LedgerAccountBalanceMonitor.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .alertCondition(
                    LedgerAccountBalanceMonitor.AlertCondition.builder()
                        .field("field")
                        .operator("operator")
                        .value(0L)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currentLedgerAccountBalanceState(
                    LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState.builder()
                        .balances(
                            LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
                                .LedgerBalances
                                .builder()
                                .availableBalance(
                                    LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
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
                                    LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
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
                                    LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
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
                        .ledgerAccountLockVersion(0L)
                        .triggered(true)
                        .build()
                )
                .description("description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerAccountId("ledger_account_id")
                .liveMode(true)
                .metadata(
                    LedgerAccountBalanceMonitor.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerAccountBalanceMonitor).isNotNull
        assertThat(ledgerAccountBalanceMonitor.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountBalanceMonitor.alertCondition())
            .isEqualTo(
                LedgerAccountBalanceMonitor.AlertCondition.builder()
                    .field("field")
                    .operator("operator")
                    .value(0L)
                    .build()
            )
        assertThat(ledgerAccountBalanceMonitor.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountBalanceMonitor.currentLedgerAccountBalanceState())
            .isEqualTo(
                LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState.builder()
                    .balances(
                        LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState.LedgerBalances
                            .builder()
                            .availableBalance(
                                LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
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
                                LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
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
                                LedgerAccountBalanceMonitor.CurrentLedgerAccountBalanceState
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
                    .ledgerAccountLockVersion(0L)
                    .triggered(true)
                    .build()
            )
        assertThat(ledgerAccountBalanceMonitor.description()).isEqualTo("description")
        assertThat(ledgerAccountBalanceMonitor.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountBalanceMonitor.ledgerAccountId()).isEqualTo("ledger_account_id")
        assertThat(ledgerAccountBalanceMonitor.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountBalanceMonitor.metadata())
            .isEqualTo(
                LedgerAccountBalanceMonitor.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerAccountBalanceMonitor.object_()).isEqualTo("object")
        assertThat(ledgerAccountBalanceMonitor.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
