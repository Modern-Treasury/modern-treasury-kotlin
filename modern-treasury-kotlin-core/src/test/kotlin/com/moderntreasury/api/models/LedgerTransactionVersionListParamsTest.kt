// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionVersionListParamsTest {

    @Test
    fun createLedgerTransactionVersionListParams() {
        LedgerTransactionVersionListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .createdAt(LedgerTransactionVersionListParams.CreatedAt.builder().build())
            .version(LedgerTransactionVersionListParams.Version.builder().build())
            .ledgerTransactionId("string")
            .ledgerAccountStatementId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerTransactionVersionListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .createdAt(LedgerTransactionVersionListParams.CreatedAt.builder().build())
                .version(LedgerTransactionVersionListParams.Version.builder().build())
                .ledgerTransactionId("string")
                .ledgerAccountStatementId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        LedgerTransactionVersionListParams.CreatedAt.builder().build().forEachQueryParam {
            key,
            values ->
            expected.put("created_at[$key]", values)
        }
        LedgerTransactionVersionListParams.Version.builder().build().forEachQueryParam { key, values
            ->
            expected.put("version[$key]", values)
        }
        expected.put("ledger_transaction_id", listOf("string"))
        expected.put("ledger_account_statement_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerTransactionVersionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
