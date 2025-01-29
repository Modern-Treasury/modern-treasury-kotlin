// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionVersionListParamsTest {

    @Test
    fun createLedgerTransactionVersionListParams() {
        LedgerTransactionVersionListParams.builder()
            .afterCursor("after_cursor")
            .createdAt(
                LedgerTransactionVersionListParams.CreatedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .ledgerAccountStatementId("ledger_account_statement_id")
            .ledgerTransactionId("ledger_transaction_id")
            .perPage(0L)
            .version(
                LedgerTransactionVersionListParams.Version.builder()
                    .putAdditionalProperty("foo", "0")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerTransactionVersionListParams.builder()
                .afterCursor("after_cursor")
                .createdAt(
                    LedgerTransactionVersionListParams.CreatedAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .ledgerAccountStatementId("ledger_account_statement_id")
                .ledgerTransactionId("ledger_transaction_id")
                .perPage(0L)
                .version(
                    LedgerTransactionVersionListParams.Version.builder()
                        .putAdditionalProperty("foo", "0")
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        LedgerTransactionVersionListParams.CreatedAt.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at[$key]", values) }
        expected.put("ledger_account_statement_id", "ledger_account_statement_id")
        expected.put("ledger_transaction_id", "ledger_transaction_id")
        expected.put("per_page", "0")
        LedgerTransactionVersionListParams.Version.builder()
            .putAdditionalProperty("foo", "0")
            .build()
            .forEachQueryParam { key, values -> expected.put("version[$key]", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerTransactionVersionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
