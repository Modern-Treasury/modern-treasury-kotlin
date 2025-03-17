// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountBalanceMonitorListParamsTest {

    @Test
    fun create() {
        LedgerAccountBalanceMonitorListParams.builder()
            .addId("string")
            .afterCursor("after_cursor")
            .ledgerAccountId("ledger_account_id")
            .metadata(
                LedgerAccountBalanceMonitorListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerAccountBalanceMonitorListParams.builder()
                .addId("string")
                .afterCursor("after_cursor")
                .ledgerAccountId("ledger_account_id")
                .metadata(
                    LedgerAccountBalanceMonitorListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .perPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id[]", "string")
                    .put("after_cursor", "after_cursor")
                    .put("ledger_account_id", "ledger_account_id")
                    .put("metadata[foo]", "string")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerAccountBalanceMonitorListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
