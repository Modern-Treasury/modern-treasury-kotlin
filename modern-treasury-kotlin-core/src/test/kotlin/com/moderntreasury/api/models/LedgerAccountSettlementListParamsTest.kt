// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountSettlementListParamsTest {

    @Test
    fun create() {
        LedgerAccountSettlementListParams.builder()
            .addId("string")
            .afterCursor("after_cursor")
            .createdAt(
                LedgerAccountSettlementListParams.CreatedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .ledgerId("ledger_id")
            .ledgerTransactionId("ledger_transaction_id")
            .metadata(
                LedgerAccountSettlementListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .perPage(0L)
            .settledLedgerAccountId("settled_ledger_account_id")
            .settlementEntryDirection("settlement_entry_direction")
            .updatedAt(
                LedgerAccountSettlementListParams.UpdatedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerAccountSettlementListParams.builder()
                .addId("string")
                .afterCursor("after_cursor")
                .createdAt(
                    LedgerAccountSettlementListParams.CreatedAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .ledgerId("ledger_id")
                .ledgerTransactionId("ledger_transaction_id")
                .metadata(
                    LedgerAccountSettlementListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .perPage(0L)
                .settledLedgerAccountId("settled_ledger_account_id")
                .settlementEntryDirection("settlement_entry_direction")
                .updatedAt(
                    LedgerAccountSettlementListParams.UpdatedAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id[]", "string")
                    .put("after_cursor", "after_cursor")
                    .put("created_at[foo]", "2019-12-27T18:11:19.117Z")
                    .put("ledger_id", "ledger_id")
                    .put("ledger_transaction_id", "ledger_transaction_id")
                    .put("metadata[foo]", "string")
                    .put("per_page", "0")
                    .put("settled_ledger_account_id", "settled_ledger_account_id")
                    .put("settlement_entry_direction", "settlement_entry_direction")
                    .put("updated_at[foo]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerAccountSettlementListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
