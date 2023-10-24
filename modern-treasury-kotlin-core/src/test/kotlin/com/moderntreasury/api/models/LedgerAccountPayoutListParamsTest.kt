// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountPayoutListParamsTest {

    @Test
    fun createLedgerAccountPayoutListParams() {
        LedgerAccountPayoutListParams.builder()
            .id(listOf("string"))
            .afterCursor("string")
            .metadata(LedgerAccountPayoutListParams.Metadata.builder().build())
            .payoutEntryDirection("string")
            .payoutLedgerAccountId("string")
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountPayoutListParams.builder()
                .id(listOf("string"))
                .afterCursor("string")
                .metadata(LedgerAccountPayoutListParams.Metadata.builder().build())
                .payoutEntryDirection("string")
                .payoutLedgerAccountId("string")
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("id[]", listOf("string"))
        expected.put("after_cursor", listOf("string"))
        LedgerAccountPayoutListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("payout_entry_direction", listOf("string"))
        expected.put("payout_ledger_account_id", listOf("string"))
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountPayoutListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
