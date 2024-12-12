// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryListParamsTest {

    @Test
    fun createLedgerAccountCategoryListParams() {
        LedgerAccountCategoryListParams.builder()
            .id(listOf("string"))
            .afterCursor("after_cursor")
            .balances(
                LedgerAccountCategoryListParams.Balances.builder()
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .currency("currency")
            .ledgerAccountId("ledger_account_id")
            .ledgerId("ledger_id")
            .metadata(
                LedgerAccountCategoryListParams.Metadata.builder()
                    .putAdditionalProperty("foo", listOf("string"))
                    .build()
            )
            .name("name")
            .parentLedgerAccountCategoryId("parent_ledger_account_category_id")
            .perPage(0L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountCategoryListParams.builder()
                .id(listOf("string"))
                .afterCursor("after_cursor")
                .balances(
                    LedgerAccountCategoryListParams.Balances.builder()
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .currency("currency")
                .ledgerAccountId("ledger_account_id")
                .ledgerId("ledger_id")
                .metadata(
                    LedgerAccountCategoryListParams.Metadata.builder()
                        .putAdditionalProperty("foo", listOf("string"))
                        .build()
                )
                .name("name")
                .parentLedgerAccountCategoryId("parent_ledger_account_category_id")
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("id[]", "string")
        expected.put("after_cursor", "after_cursor")
        LedgerAccountCategoryListParams.Balances.builder()
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("balances[$key]", values) }
        expected.put("currency", "currency")
        expected.put("ledger_account_id", "ledger_account_id")
        expected.put("ledger_id", "ledger_id")
        LedgerAccountCategoryListParams.Metadata.builder()
            .putAdditionalProperty("foo", listOf("string"))
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("name", "name")
        expected.put("parent_ledger_account_category_id", "parent_ledger_account_category_id")
        expected.put("per_page", "0")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountCategoryListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
