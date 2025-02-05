// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEntryListParamsTest {

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
            .status(LedgerEntryListParams.Status.PENDING)
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
                .status(LedgerEntryListParams.Status.PENDING)
                .updatedAt(
                    LedgerEntryListParams.UpdatedAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("id[]", "string")
        expected.put("after_cursor", "after_cursor")
        expected.put("as_of_lock_version", "0")
        expected.put("direction", TransactionDirection.CREDIT.toString())
        LedgerEntryListParams.EffectiveAt.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("effective_at[$key]", values) }
        LedgerEntryListParams.EffectiveDate.builder()
            .putAdditionalProperty("foo", "2019-12-27")
            .build()
            .forEachQueryParam { key, values -> expected.put("effective_date[$key]", values) }
        expected.put("ledger_account_category_id", "ledger_account_category_id")
        expected.put("ledger_account_id", "ledger_account_id")
        LedgerEntryListParams.LedgerAccountLockVersion.builder()
            .putAdditionalProperty("foo", "0")
            .build()
            .forEachQueryParam { key, values ->
                expected.put("ledger_account_lock_version[$key]", values)
            }
        expected.put("ledger_account_payout_id", "ledger_account_payout_id")
        expected.put("ledger_account_settlement_id", "ledger_account_settlement_id")
        expected.put("ledger_account_statement_id", "ledger_account_statement_id")
        expected.put("ledger_transaction_id", "ledger_transaction_id")
        LedgerEntryListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        LedgerEntryListParams.OrderBy.builder()
            .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
            .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
            .build()
            .forEachQueryParam { key, values -> expected.put("order_by[$key]", values) }
        expected.put("per_page", "0")
        expected.put("show_balances", "true")
        expected.put("show_deleted", "true")
        expected.put("status", LedgerEntryListParams.Status.PENDING.toString())
        LedgerEntryListParams.UpdatedAt.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("updated_at[$key]", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerEntryListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
