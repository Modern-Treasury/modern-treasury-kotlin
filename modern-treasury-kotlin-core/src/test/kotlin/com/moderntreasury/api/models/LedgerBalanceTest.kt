// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerBalanceTest {

    @Test
    fun create() {
        val ledgerBalance =
            LedgerBalance.builder()
                .amount(0L)
                .credits(0L)
                .currency("currency")
                .currencyExponent(0L)
                .debits(0L)
                .build()

        assertThat(ledgerBalance.amount()).isEqualTo(0L)
        assertThat(ledgerBalance.credits()).isEqualTo(0L)
        assertThat(ledgerBalance.currency()).isEqualTo("currency")
        assertThat(ledgerBalance.currencyExponent()).isEqualTo(0L)
        assertThat(ledgerBalance.debits()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerBalance =
            LedgerBalance.builder()
                .amount(0L)
                .credits(0L)
                .currency("currency")
                .currencyExponent(0L)
                .debits(0L)
                .build()

        val roundtrippedLedgerBalance =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerBalance),
                jacksonTypeRef<LedgerBalance>(),
            )

        assertThat(roundtrippedLedgerBalance).isEqualTo(ledgerBalance)
    }
}
