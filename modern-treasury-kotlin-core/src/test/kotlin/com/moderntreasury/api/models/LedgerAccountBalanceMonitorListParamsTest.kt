// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountBalanceMonitorListParamsTest {

    @Test
    fun createLedgerAccountBalanceMonitorListParams() {
        LedgerAccountBalanceMonitorListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .metadata(LedgerAccountBalanceMonitorListParams.Metadata.builder().build())
            .id(listOf("string"))
            .ledgerAccountId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountBalanceMonitorListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .metadata(LedgerAccountBalanceMonitorListParams.Metadata.builder().build())
                .id(listOf("string"))
                .ledgerAccountId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        LedgerAccountBalanceMonitorListParams.Metadata.builder().build().forEachQueryParam {
            key,
            values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("id[]", listOf("string"))
        expected.put("ledger_account_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountBalanceMonitorListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
