// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountSettlementListParamsTest {

    @Test
    fun createLedgerAccountSettlementListParams() {
        LedgerAccountSettlementListParams.builder()
            .id(listOf("string"))
            .afterCursor("string")
            .metadata(LedgerAccountSettlementListParams.Metadata.builder().build())
            .perPage(123L)
            .settledLedgerAccountId("string")
            .settlementEntryDirection("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountSettlementListParams.builder()
                .id(listOf("string"))
                .afterCursor("string")
                .metadata(LedgerAccountSettlementListParams.Metadata.builder().build())
                .perPage(123L)
                .settledLedgerAccountId("string")
                .settlementEntryDirection("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("id[]", listOf("string"))
        expected.put("after_cursor", listOf("string"))
        LedgerAccountSettlementListParams.Metadata.builder().build().forEachQueryParam { key, values
            ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", listOf("123"))
        expected.put("settled_ledger_account_id", listOf("string"))
        expected.put("settlement_entry_direction", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountSettlementListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
