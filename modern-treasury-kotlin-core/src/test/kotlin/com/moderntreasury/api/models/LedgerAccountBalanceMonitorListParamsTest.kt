// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountBalanceMonitorListParamsTest {

    @Test
    fun createLedgerAccountBalanceMonitorListParams() {
        LedgerAccountBalanceMonitorListParams.builder()
            .id(listOf("string"))
            .afterCursor("after_cursor")
            .ledgerAccountId("ledger_account_id")
            .metadata(
                LedgerAccountBalanceMonitorListParams.Metadata.builder()
                    .putAdditionalProperty("foo", listOf("string"))
                    .build()
            )
            .perPage(0L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountBalanceMonitorListParams.builder()
                .id(listOf("string"))
                .afterCursor("after_cursor")
                .ledgerAccountId("ledger_account_id")
                .metadata(
                    LedgerAccountBalanceMonitorListParams.Metadata.builder()
                        .putAdditionalProperty("foo", listOf("string"))
                        .build()
                )
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("id[]", "string")
        expected.put("after_cursor", "after_cursor")
        expected.put("ledger_account_id", "ledger_account_id")
        LedgerAccountBalanceMonitorListParams.Metadata.builder()
            .putAdditionalProperty("foo", listOf("string"))
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("per_page", "0")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountBalanceMonitorListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
