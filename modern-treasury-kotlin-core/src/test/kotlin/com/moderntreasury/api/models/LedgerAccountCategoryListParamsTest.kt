// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryListParamsTest {

    @Test
    fun createLedgerAccountCategoryListParams() {
        LedgerAccountCategoryListParams.builder()
            .id(listOf("string"))
            .afterCursor("string")
            .balances(
                LedgerAccountCategoryListParams.Balances.builder()
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .currency("string")
            .ledgerAccountId("string")
            .ledgerId("string")
            .metadata(LedgerAccountCategoryListParams.Metadata.builder().build())
            .name("string")
            .parentLedgerAccountCategoryId("string")
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountCategoryListParams.builder()
                .id(listOf("string"))
                .afterCursor("string")
                .balances(
                    LedgerAccountCategoryListParams.Balances.builder()
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .currency("string")
                .ledgerAccountId("string")
                .ledgerId("string")
                .metadata(LedgerAccountCategoryListParams.Metadata.builder().build())
                .name("string")
                .parentLedgerAccountCategoryId("string")
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("id[]", listOf("string"))
        expected.put("after_cursor", listOf("string"))
        LedgerAccountCategoryListParams.Balances.builder()
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("balances[$key]", values) }
        expected.put("currency", listOf("string"))
        expected.put("ledger_account_id", listOf("string"))
        expected.put("ledger_id", listOf("string"))
        LedgerAccountCategoryListParams.Metadata.builder().build().forEachQueryParam { key, values
            ->
            expected.put("metadata[$key]", values)
        }
        expected.put("name", listOf("string"))
        expected.put("parent_ledger_account_category_id", listOf("string"))
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountCategoryListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
