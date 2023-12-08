// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEntryListParamsTest {

    @Test
    fun createLedgerEntryListParams() {
        LedgerEntryListParams.builder()
            .id(listOf("string"))
            .afterCursor("string")
            .asOfLockVersion(123L)
            .direction(TransactionDirection.CREDIT)
            .effectiveAt(LedgerEntryListParams.EffectiveAt.builder().build())
            .effectiveDate(LedgerEntryListParams.EffectiveDate.builder().build())
            .ledgerAccountCategoryId("string")
            .ledgerAccountId("string")
            .ledgerAccountLockVersion(
                LedgerEntryListParams.LedgerAccountLockVersion.builder().build()
            )
            .ledgerAccountPayoutId("string")
            .ledgerAccountSettlementId("string")
            .ledgerAccountStatementId("string")
            .ledgerTransactionId("string")
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
                .afterCursor("string")
                .asOfLockVersion(123L)
                .direction(TransactionDirection.CREDIT)
                .effectiveAt(LedgerEntryListParams.EffectiveAt.builder().build())
                .effectiveDate(LedgerEntryListParams.EffectiveDate.builder().build())
                .ledgerAccountCategoryId("string")
                .ledgerAccountId("string")
                .ledgerAccountLockVersion(
                    LedgerEntryListParams.LedgerAccountLockVersion.builder().build()
                )
                .ledgerAccountPayoutId("string")
                .ledgerAccountSettlementId("string")
                .ledgerAccountStatementId("string")
                .ledgerTransactionId("string")
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
        val expected = mutableMapOf<String, List<String>>()
        expected.put("id[]", listOf("string"))
        expected.put("after_cursor", listOf("string"))
        expected.put("as_of_lock_version", listOf("123"))
        expected.put("direction", listOf(TransactionDirection.CREDIT.toString()))
        LedgerEntryListParams.EffectiveAt.builder().build().forEachQueryParam { key, values ->
            expected.put("effective_at[$key]", values)
        }
        LedgerEntryListParams.EffectiveDate.builder().build().forEachQueryParam { key, values ->
            expected.put("effective_date[$key]", values)
        }
        expected.put("ledger_account_category_id", listOf("string"))
        expected.put("ledger_account_id", listOf("string"))
        LedgerEntryListParams.LedgerAccountLockVersion.builder().build().forEachQueryParam {
            key,
            values ->
            expected.put("ledger_account_lock_version[$key]", values)
        }
        expected.put("ledger_account_payout_id", listOf("string"))
        expected.put("ledger_account_settlement_id", listOf("string"))
        expected.put("ledger_account_statement_id", listOf("string"))
        expected.put("ledger_transaction_id", listOf("string"))
        LedgerEntryListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        LedgerEntryListParams.OrderBy.builder()
            .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
            .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
            .build()
            .forEachQueryParam { key, values -> expected.put("order_by[$key]", values) }
        expected.put("per_page", listOf("123"))
        expected.put("show_balances", listOf("true"))
        expected.put("show_deleted", listOf("true"))
        expected.put("status", listOf(LedgerEntryListParams.Status.PENDING.toString()))
        LedgerEntryListParams.UpdatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("updated_at[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerEntryListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
