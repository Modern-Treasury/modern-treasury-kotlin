// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerTransactionVersionListParamsTest {

    @Test
    fun create() {
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("created_at[foo]", "2019-12-27T18:11:19.117Z")
                    .put("ledger_account_statement_id", "ledger_account_statement_id")
                    .put("ledger_transaction_id", "ledger_transaction_id")
                    .put("per_page", "0")
                    .put("version[foo]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerTransactionVersionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
