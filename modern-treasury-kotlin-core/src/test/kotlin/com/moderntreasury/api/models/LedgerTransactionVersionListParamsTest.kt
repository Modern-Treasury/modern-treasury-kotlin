// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionVersionListParamsTest {

    @Test
    fun createLedgerTransactionVersionListParams() {
        LedgerTransactionVersionListParams.builder()
            .afterCursor("after_cursor")
            .createdAt(LedgerTransactionVersionListParams.CreatedAt.builder().build())
            .ledgerAccountStatementId("ledger_account_statement_id")
            .ledgerTransactionId("ledger_transaction_id")
            .perPage(123L)
            .version(LedgerTransactionVersionListParams.Version.builder().build())
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerTransactionVersionListParams.builder()
                .afterCursor("after_cursor")
                .createdAt(LedgerTransactionVersionListParams.CreatedAt.builder().build())
                .ledgerAccountStatementId("ledger_account_statement_id")
                .ledgerTransactionId("ledger_transaction_id")
                .perPage(123L)
                .version(LedgerTransactionVersionListParams.Version.builder().build())
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        LedgerTransactionVersionListParams.CreatedAt.builder().build().forEachQueryParam {
            key,
            values ->
            expected.put("created_at[$key]", values)
        }
        expected.put("ledger_account_statement_id", listOf("ledger_account_statement_id"))
        expected.put("ledger_transaction_id", listOf("ledger_transaction_id"))
        expected.put("per_page", listOf("123"))
        LedgerTransactionVersionListParams.Version.builder().build().forEachQueryParam { key, values
            ->
            expected.put("version[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerTransactionVersionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
