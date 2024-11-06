// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEntryListParamsTest {

    @Test
    fun createLedgerEntryListParams() {
        LedgerEntryListParams.builder()
            .id(listOf("string"))
            .afterCursor("after_cursor")
            .asOfLockVersion(123L)
            .direction(TransactionDirection.CREDIT)
            .effectiveAt(LedgerEntryListParams.EffectiveAt.builder().build())
            .effectiveDate(LedgerEntryListParams.EffectiveDate.builder().build())
            .ledgerAccountCategoryId("ledger_account_category_id")
            .ledgerAccountId("ledger_account_id")
            .ledgerAccountLockVersion(
                LedgerEntryListParams.LedgerAccountLockVersion.builder().build()
            )
            .ledgerAccountPayoutId("ledger_account_payout_id")
            .ledgerAccountSettlementId("ledger_account_settlement_id")
            .ledgerAccountStatementId("ledger_account_statement_id")
            .ledgerTransactionId("ledger_transaction_id")
            .metadata(LedgerEntryListParams.Metadata.builder().build())
            .orderBy(
                LedgerEntryListParams.OrderBy.builder()
                    .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
                    .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
                    .build()
            )
            .perPage(123L)
            .showBalances(true)
            .showDeleted(true)
            .status(LedgerEntryListParams.Status.PENDING)
            .updatedAt(LedgerEntryListParams.UpdatedAt.builder().build())
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerEntryListParams.builder()
                .id(listOf("string"))
                .afterCursor("after_cursor")
                .asOfLockVersion(123L)
                .direction(TransactionDirection.CREDIT)
                .effectiveAt(LedgerEntryListParams.EffectiveAt.builder().build())
                .effectiveDate(LedgerEntryListParams.EffectiveDate.builder().build())
                .ledgerAccountCategoryId("ledger_account_category_id")
                .ledgerAccountId("ledger_account_id")
                .ledgerAccountLockVersion(
                    LedgerEntryListParams.LedgerAccountLockVersion.builder().build()
                )
                .ledgerAccountPayoutId("ledger_account_payout_id")
                .ledgerAccountSettlementId("ledger_account_settlement_id")
                .ledgerAccountStatementId("ledger_account_statement_id")
                .ledgerTransactionId("ledger_transaction_id")
                .metadata(LedgerEntryListParams.Metadata.builder().build())
                .orderBy(
                    LedgerEntryListParams.OrderBy.builder()
                        .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
                        .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
                        .build()
                )
                .perPage(123L)
                .showBalances(true)
                .showDeleted(true)
                .status(LedgerEntryListParams.Status.PENDING)
                .updatedAt(LedgerEntryListParams.UpdatedAt.builder().build())
                .build()
        val expected = QueryParams.builder()
        expected.put("id[]", "string")
        expected.put("after_cursor", "after_cursor")
        expected.put("as_of_lock_version", "123")
        expected.put("direction", TransactionDirection.CREDIT.toString())
        LedgerEntryListParams.EffectiveAt.builder().build().forEachQueryParam { key, values ->
            expected.put("effective_at[$key]", values)
        }
        LedgerEntryListParams.EffectiveDate.builder().build().forEachQueryParam { key, values ->
            expected.put("effective_date[$key]", values)
        }
        expected.put("ledger_account_category_id", "ledger_account_category_id")
        expected.put("ledger_account_id", "ledger_account_id")
        LedgerEntryListParams.LedgerAccountLockVersion.builder().build().forEachQueryParam {
            key,
            values ->
            expected.put("ledger_account_lock_version[$key]", values)
        }
        expected.put("ledger_account_payout_id", "ledger_account_payout_id")
        expected.put("ledger_account_settlement_id", "ledger_account_settlement_id")
        expected.put("ledger_account_statement_id", "ledger_account_statement_id")
        expected.put("ledger_transaction_id", "ledger_transaction_id")
        LedgerEntryListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        LedgerEntryListParams.OrderBy.builder()
            .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
            .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
            .build()
            .forEachQueryParam { key, values -> expected.put("order_by[$key]", values) }
        expected.put("per_page", "123")
        expected.put("show_balances", "true")
        expected.put("show_deleted", "true")
        expected.put("status", LedgerEntryListParams.Status.PENDING.toString())
        LedgerEntryListParams.UpdatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("updated_at[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerEntryListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
