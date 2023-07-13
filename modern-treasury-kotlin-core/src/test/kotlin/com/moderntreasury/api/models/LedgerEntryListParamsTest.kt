package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEntryListParamsTest {

    @Test
    fun createLedgerEntryListParams() {
        LedgerEntryListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .id(LedgerEntryListParams.Id.builder().build())
            .ledgerAccountId("string")
            .ledgerTransactionId("string")
            .effectiveDate(LedgerEntryListParams.EffectiveDate.builder().build())
            .effectiveAt(LedgerEntryListParams.EffectiveAt.builder().build())
            .updatedAt(LedgerEntryListParams.UpdatedAt.builder().build())
            .asOfLockVersion(123L)
            .ledgerAccountLockVersion(
                LedgerEntryListParams.LedgerAccountLockVersion.builder().build()
            )
            .ledgerAccountCategoryId("string")
            .ledgerAccountStatementId("string")
            .showDeleted(true)
            .direction(LedgerEntryListParams.Direction.CREDIT)
            .status(LedgerEntryListParams.Status.PENDING)
            .orderBy(
                LedgerEntryListParams.OrderBy.builder()
                    .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
                    .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
                    .build()
            )
            .showBalances(true)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerEntryListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .id(LedgerEntryListParams.Id.builder().build())
                .ledgerAccountId("string")
                .ledgerTransactionId("string")
                .effectiveDate(LedgerEntryListParams.EffectiveDate.builder().build())
                .effectiveAt(LedgerEntryListParams.EffectiveAt.builder().build())
                .updatedAt(LedgerEntryListParams.UpdatedAt.builder().build())
                .asOfLockVersion(123L)
                .ledgerAccountLockVersion(
                    LedgerEntryListParams.LedgerAccountLockVersion.builder().build()
                )
                .ledgerAccountCategoryId("string")
                .ledgerAccountStatementId("string")
                .showDeleted(true)
                .direction(LedgerEntryListParams.Direction.CREDIT)
                .status(LedgerEntryListParams.Status.PENDING)
                .orderBy(
                    LedgerEntryListParams.OrderBy.builder()
                        .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
                        .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
                        .build()
                )
                .showBalances(true)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        LedgerEntryListParams.Id.builder().build().forEachQueryParam { key, values ->
            expected.put("id[$key]", values)
        }
        expected.put("ledger_account_id", listOf("string"))
        expected.put("ledger_transaction_id", listOf("string"))
        LedgerEntryListParams.EffectiveDate.builder().build().forEachQueryParam { key, values ->
            expected.put("effective_date[$key]", values)
        }
        LedgerEntryListParams.EffectiveAt.builder().build().forEachQueryParam { key, values ->
            expected.put("effective_at[$key]", values)
        }
        LedgerEntryListParams.UpdatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("updated_at[$key]", values)
        }
        expected.put("as_of_lock_version", listOf("123"))
        LedgerEntryListParams.LedgerAccountLockVersion.builder().build().forEachQueryParam {
            key,
            values ->
            expected.put("ledger_account_lock_version[$key]", values)
        }
        expected.put("ledger_account_category_id", listOf("string"))
        expected.put("ledger_account_statement_id", listOf("string"))
        expected.put("show_deleted", listOf("true"))
        expected.put("direction", listOf(LedgerEntryListParams.Direction.CREDIT.toString()))
        expected.put("status", listOf(LedgerEntryListParams.Status.PENDING.toString()))
        LedgerEntryListParams.OrderBy.builder()
            .createdAt(LedgerEntryListParams.OrderBy.CreatedAt.ASC)
            .effectiveAt(LedgerEntryListParams.OrderBy.EffectiveAt.ASC)
            .build()
            .forEachQueryParam { key, values -> expected.put("order_by[$key]", values) }
        expected.put("show_balances", listOf("true"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerEntryListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
