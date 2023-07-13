package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryDeleteParamsTest {

    @Test
    fun createLedgerAccountCategoryDeleteParams() {
        LedgerAccountCategoryDeleteParams.builder()
            .id("string")
            .balances(
                LedgerAccountCategoryDeleteParams.Balances.builder()
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountCategoryDeleteParams.builder()
                .id("string")
                .balances(
                    LedgerAccountCategoryDeleteParams.Balances.builder()
                        .asOfDate(LocalDate.parse("2019-12-27"))
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        LedgerAccountCategoryDeleteParams.Balances.builder()
            .asOfDate(LocalDate.parse("2019-12-27"))
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("balances[$key]", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountCategoryDeleteParams.builder().id("string").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountCategoryDeleteParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
