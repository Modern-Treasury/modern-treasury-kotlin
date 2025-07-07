// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerBalancesTest {

    @Test
    fun create() {
        val ledgerBalances =
            LedgerBalances.builder()
                .availableBalance(
                    LedgerBalance.builder()
                        .amount(0L)
                        .credits(0L)
                        .currency("currency")
                        .currencyExponent(0L)
                        .debits(0L)
                        .build()
                )
                .pendingBalance(
                    LedgerBalance.builder()
                        .amount(0L)
                        .credits(0L)
                        .currency("currency")
                        .currencyExponent(0L)
                        .debits(0L)
                        .build()
                )
                .postedBalance(
                    LedgerBalance.builder()
                        .amount(0L)
                        .credits(0L)
                        .currency("currency")
                        .currencyExponent(0L)
                        .debits(0L)
                        .build()
                )
                .build()

        assertThat(ledgerBalances.availableBalance())
            .isEqualTo(
                LedgerBalance.builder()
                    .amount(0L)
                    .credits(0L)
                    .currency("currency")
                    .currencyExponent(0L)
                    .debits(0L)
                    .build()
            )
        assertThat(ledgerBalances.pendingBalance())
            .isEqualTo(
                LedgerBalance.builder()
                    .amount(0L)
                    .credits(0L)
                    .currency("currency")
                    .currencyExponent(0L)
                    .debits(0L)
                    .build()
            )
        assertThat(ledgerBalances.postedBalance())
            .isEqualTo(
                LedgerBalance.builder()
                    .amount(0L)
                    .credits(0L)
                    .currency("currency")
                    .currencyExponent(0L)
                    .debits(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerBalances =
            LedgerBalances.builder()
                .availableBalance(
                    LedgerBalance.builder()
                        .amount(0L)
                        .credits(0L)
                        .currency("currency")
                        .currencyExponent(0L)
                        .debits(0L)
                        .build()
                )
                .pendingBalance(
                    LedgerBalance.builder()
                        .amount(0L)
                        .credits(0L)
                        .currency("currency")
                        .currencyExponent(0L)
                        .debits(0L)
                        .build()
                )
                .postedBalance(
                    LedgerBalance.builder()
                        .amount(0L)
                        .credits(0L)
                        .currency("currency")
                        .currencyExponent(0L)
                        .debits(0L)
                        .build()
                )
                .build()

        val roundtrippedLedgerBalances =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerBalances),
                jacksonTypeRef<LedgerBalances>(),
            )

        assertThat(roundtrippedLedgerBalances).isEqualTo(ledgerBalances)
    }
}
