// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerEntryListParamsTest {

    @Test
    fun create() {
        LedgerEntryListParams.builder()
            .addId("string")
            .afterCursor("after_cursor")
            .asOfLockVersion(0L)
            .direction(TransactionDirection.CREDIT)
            .effectiveAt(
                LedgerEntryListParams.EffectiveAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .effectiveDate(
                LedgerEntryListParams.EffectiveDate.builder()
                    .putAdditionalProperty("foo", "2019-12-27")
                    .build()
            )
            .ledgerAccountCategoryId("ledger_account_category_id")
            .ledgerAccountId("ledger_account_id")
            .ledgerAccountLockVersion(
                LedgerEntryListParams.LedgerAccountLockVersion.builder()
                    .putAdditionalProperty("foo", "0")
                    .build()
            )
            .ledgerAccountPayoutId("ledger_account_payout_id")
            .ledgerAccountSettlementId("ledger_account_settlement_id")
            .ledgerAccountStatementId("ledger_account_statement_id")
            .ledgerTransactionId("ledger_transaction_id")
            .metadata(
                LedgerEntryListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .orderBy(
                LedgerEntryListParams.OrderBy.builder()
                    .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
                    .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
                    .build()
            )
            .perPage(0L)
            .showBalances(true)
            .showDeleted(true)
            .addStatus(LedgerEntryListParams.Status.PENDING)
            .updatedAt(
                LedgerEntryListParams.UpdatedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerEntryListParams.builder()
                .addId("string")
                .afterCursor("after_cursor")
                .asOfLockVersion(0L)
                .direction(TransactionDirection.CREDIT)
                .effectiveAt(
                    LedgerEntryListParams.EffectiveAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .effectiveDate(
                    LedgerEntryListParams.EffectiveDate.builder()
                        .putAdditionalProperty("foo", "2019-12-27")
                        .build()
                )
                .ledgerAccountCategoryId("ledger_account_category_id")
                .ledgerAccountId("ledger_account_id")
                .ledgerAccountLockVersion(
                    LedgerEntryListParams.LedgerAccountLockVersion.builder()
                        .putAdditionalProperty("foo", "0")
                        .build()
                )
                .ledgerAccountPayoutId("ledger_account_payout_id")
                .ledgerAccountSettlementId("ledger_account_settlement_id")
                .ledgerAccountStatementId("ledger_account_statement_id")
                .ledgerTransactionId("ledger_transaction_id")
                .metadata(
                    LedgerEntryListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .orderBy(
                    LedgerEntryListParams.OrderBy.builder()
                        .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
                        .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
                        .build()
                )
                .perPage(0L)
                .showBalances(true)
                .showDeleted(true)
                .addStatus(LedgerEntryListParams.Status.PENDING)
                .updatedAt(
                    LedgerEntryListParams.UpdatedAt.builder()
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
                    .put("as_of_lock_version", "0")
                    .put("direction", "credit")
                    .put("effective_at[foo]", "2019-12-27T18:11:19.117Z")
                    .put("effective_date[foo]", "2019-12-27")
                    .put("ledger_account_category_id", "ledger_account_category_id")
                    .put("ledger_account_id", "ledger_account_id")
                    .put("ledger_account_lock_version[foo]", "0")
                    .put("ledger_account_payout_id", "ledger_account_payout_id")
                    .put("ledger_account_settlement_id", "ledger_account_settlement_id")
                    .put("ledger_account_statement_id", "ledger_account_statement_id")
                    .put("ledger_transaction_id", "ledger_transaction_id")
                    .put("metadata[foo]", "string")
                    .put("order_by[created_at]", "asc")
                    .put("order_by[effective_at]", "asc")
                    .put("per_page", "0")
                    .put("show_balances", "true")
                    .put("show_deleted", "true")
                    .put("status[]", "pending")
                    .put("updated_at[foo]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerEntryListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
