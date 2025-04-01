// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ForeignExchangeQuoteTest {

    @Test
    fun create() {
        val foreignExchangeQuote =
            ForeignExchangeQuote.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .foreignExchangeIndicator("foreign_exchange_indicator")
                .foreignExchangeRate(
                    ForeignExchangeQuote.ForeignExchangeRate.builder()
                        .baseAmount(0L)
                        .baseCurrency(Currency.AED)
                        .exponent(0L)
                        .rateString("rate_string")
                        .targetAmount(0L)
                        .targetCurrency(Currency.AED)
                        .value(0L)
                        .build()
                )
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    ForeignExchangeQuote.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorId("vendor_id")
                .build()

        assertThat(foreignExchangeQuote.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(foreignExchangeQuote.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(foreignExchangeQuote.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(foreignExchangeQuote.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(foreignExchangeQuote.foreignExchangeIndicator())
            .isEqualTo("foreign_exchange_indicator")
        assertThat(foreignExchangeQuote.foreignExchangeRate())
            .isEqualTo(
                ForeignExchangeQuote.ForeignExchangeRate.builder()
                    .baseAmount(0L)
                    .baseCurrency(Currency.AED)
                    .exponent(0L)
                    .rateString("rate_string")
                    .targetAmount(0L)
                    .targetCurrency(Currency.AED)
                    .value(0L)
                    .build()
            )
        assertThat(foreignExchangeQuote.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(foreignExchangeQuote.liveMode()).isEqualTo(true)
        assertThat(foreignExchangeQuote.metadata())
            .isEqualTo(
                ForeignExchangeQuote.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(foreignExchangeQuote.object_()).isEqualTo("object")
        assertThat(foreignExchangeQuote.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(foreignExchangeQuote.vendorId()).isEqualTo("vendor_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val foreignExchangeQuote =
            ForeignExchangeQuote.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .foreignExchangeIndicator("foreign_exchange_indicator")
                .foreignExchangeRate(
                    ForeignExchangeQuote.ForeignExchangeRate.builder()
                        .baseAmount(0L)
                        .baseCurrency(Currency.AED)
                        .exponent(0L)
                        .rateString("rate_string")
                        .targetAmount(0L)
                        .targetCurrency(Currency.AED)
                        .value(0L)
                        .build()
                )
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    ForeignExchangeQuote.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorId("vendor_id")
                .build()

        val roundtrippedForeignExchangeQuote =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(foreignExchangeQuote),
                jacksonTypeRef<ForeignExchangeQuote>(),
            )

        assertThat(roundtrippedForeignExchangeQuote).isEqualTo(foreignExchangeQuote)
    }
}
