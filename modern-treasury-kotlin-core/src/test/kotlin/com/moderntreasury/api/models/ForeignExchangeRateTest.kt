// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ForeignExchangeRateTest {

    @Test
    fun create() {
        val foreignExchangeRate =
            ForeignExchangeRate.builder()
                .baseAmount(0L)
                .baseCurrency(Currency.AED)
                .exponent(0L)
                .rateString("rate_string")
                .targetAmount(0L)
                .targetCurrency(Currency.AED)
                .value(0L)
                .build()

        assertThat(foreignExchangeRate.baseAmount()).isEqualTo(0L)
        assertThat(foreignExchangeRate.baseCurrency()).isEqualTo(Currency.AED)
        assertThat(foreignExchangeRate.exponent()).isEqualTo(0L)
        assertThat(foreignExchangeRate.rateString()).isEqualTo("rate_string")
        assertThat(foreignExchangeRate.targetAmount()).isEqualTo(0L)
        assertThat(foreignExchangeRate.targetCurrency()).isEqualTo(Currency.AED)
        assertThat(foreignExchangeRate.value()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val foreignExchangeRate =
            ForeignExchangeRate.builder()
                .baseAmount(0L)
                .baseCurrency(Currency.AED)
                .exponent(0L)
                .rateString("rate_string")
                .targetAmount(0L)
                .targetCurrency(Currency.AED)
                .value(0L)
                .build()

        val roundtrippedForeignExchangeRate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(foreignExchangeRate),
                jacksonTypeRef<ForeignExchangeRate>(),
            )

        assertThat(roundtrippedForeignExchangeRate).isEqualTo(foreignExchangeRate)
    }
}
