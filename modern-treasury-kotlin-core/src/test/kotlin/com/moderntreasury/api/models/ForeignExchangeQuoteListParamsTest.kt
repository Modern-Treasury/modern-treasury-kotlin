// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ForeignExchangeQuoteListParamsTest {

    @Test
    fun create() {
        ForeignExchangeQuoteListParams.builder()
            .afterCursor("after_cursor")
            .baseCurrency("base_currency")
            .effectiveAtEnd(LocalDate.parse("2019-12-27"))
            .effectiveAtStart(LocalDate.parse("2019-12-27"))
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .internalAccountId("internal_account_id")
            .metadata(
                ForeignExchangeQuoteListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .perPage(0L)
            .targetCurrency("target_currency")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ForeignExchangeQuoteListParams.builder()
                .afterCursor("after_cursor")
                .baseCurrency("base_currency")
                .effectiveAtEnd(LocalDate.parse("2019-12-27"))
                .effectiveAtStart(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .internalAccountId("internal_account_id")
                .metadata(
                    ForeignExchangeQuoteListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .perPage(0L)
                .targetCurrency("target_currency")
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("base_currency", "base_currency")
        expected.put("effective_at_end", "2019-12-27")
        expected.put("effective_at_start", "2019-12-27")
        expected.put("expires_at", "2019-12-27T18:11:19.117Z")
        expected.put("internal_account_id", "internal_account_id")
        ForeignExchangeQuoteListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("per_page", "0")
        expected.put("target_currency", "target_currency")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ForeignExchangeQuoteListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
