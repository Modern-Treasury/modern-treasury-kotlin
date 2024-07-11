// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ForeignExchangeQuoteListParamsTest {

    @Test
    fun createForeignExchangeQuoteListParams() {
        ForeignExchangeQuoteListParams.builder()
            .afterCursor("after_cursor")
            .baseCurrency("base_currency")
            .effectiveAtEnd(LocalDate.parse("2019-12-27"))
            .effectiveAtStart(LocalDate.parse("2019-12-27"))
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .internalAccountId("internal_account_id")
            .metadata(ForeignExchangeQuoteListParams.Metadata.builder().build())
            .perPage(123L)
            .targetCurrency("target_currency")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ForeignExchangeQuoteListParams.builder()
                .afterCursor("after_cursor")
                .baseCurrency("base_currency")
                .effectiveAtEnd(LocalDate.parse("2019-12-27"))
                .effectiveAtStart(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .internalAccountId("internal_account_id")
                .metadata(ForeignExchangeQuoteListParams.Metadata.builder().build())
                .perPage(123L)
                .targetCurrency("target_currency")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("base_currency", listOf("base_currency"))
        expected.put("effective_at_end", listOf("2019-12-27"))
        expected.put("effective_at_start", listOf("2019-12-27"))
        expected.put("expires_at", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("internal_account_id", listOf("internal_account_id"))
        ForeignExchangeQuoteListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", listOf("123"))
        expected.put("target_currency", listOf("target_currency"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ForeignExchangeQuoteListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
