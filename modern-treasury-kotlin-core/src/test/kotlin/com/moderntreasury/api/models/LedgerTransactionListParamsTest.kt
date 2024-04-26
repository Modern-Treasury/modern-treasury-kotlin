// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionListParamsTest {

    @Test
    fun createLedgerTransactionListParams() {
        LedgerTransactionListParams.builder()
            .id(listOf("string"))
            .afterCursor("string")
            .effectiveAt(LedgerTransactionListParams.EffectiveAt.builder().build())
            .effectiveDate(LedgerTransactionListParams.EffectiveDate.builder().build())
            .externalId("string")
            .ledgerAccountCategoryId("string")
            .ledgerAccountId("string")
            .ledgerAccountPayoutId("string")
            .ledgerAccountSettlementId("string")
            .ledgerId("string")
            .ledgerableId("string")
            .ledgerableType(LedgerTransactionListParams.LedgerableType.EXPECTED_PAYMENT)
            .metadata(LedgerTransactionListParams.Metadata.builder().build())
            .orderBy(
                LedgerTransactionListParams.OrderBy.builder()
                    .createdAt(LedgerTransactionListParams.OrderBy.CreatedAt.ASC)
                    .effectiveAt(LedgerTransactionListParams.OrderBy.EffectiveAt.ASC)
                    .build()
            )
            .perPage(123L)
            .postedAt(LedgerTransactionListParams.PostedAt.builder().build())
            .reversesLedgerTransactionId("string")
            .status(LedgerTransactionListParams.Status.PENDING)
            .updatedAt(LedgerTransactionListParams.UpdatedAt.builder().build())
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerTransactionListParams.builder()
                .id(listOf("string"))
                .afterCursor("string")
                .effectiveAt(LedgerTransactionListParams.EffectiveAt.builder().build())
                .effectiveDate(LedgerTransactionListParams.EffectiveDate.builder().build())
                .externalId("string")
                .ledgerAccountCategoryId("string")
                .ledgerAccountId("string")
                .ledgerAccountPayoutId("string")
                .ledgerAccountSettlementId("string")
                .ledgerId("string")
                .ledgerableId("string")
                .ledgerableType(LedgerTransactionListParams.LedgerableType.EXPECTED_PAYMENT)
                .metadata(LedgerTransactionListParams.Metadata.builder().build())
                .orderBy(
                    LedgerTransactionListParams.OrderBy.builder()
                        .createdAt(LedgerTransactionListParams.OrderBy.CreatedAt.ASC)
                        .effectiveAt(LedgerTransactionListParams.OrderBy.EffectiveAt.ASC)
                        .build()
                )
                .perPage(123L)
                .postedAt(LedgerTransactionListParams.PostedAt.builder().build())
                .reversesLedgerTransactionId("string")
                .status(LedgerTransactionListParams.Status.PENDING)
                .updatedAt(LedgerTransactionListParams.UpdatedAt.builder().build())
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("id[]", listOf("string"))
        expected.put("after_cursor", listOf("string"))
        LedgerTransactionListParams.EffectiveAt.builder().build().forEachQueryParam { key, values ->
            expected.put("effective_at[$key]", values)
        }
        LedgerTransactionListParams.EffectiveDate.builder().build().forEachQueryParam { key, values
            ->
            expected.put("effective_date[$key]", values)
        }
        expected.put("external_id", listOf("string"))
        expected.put("ledger_account_category_id", listOf("string"))
        expected.put("ledger_account_id", listOf("string"))
        expected.put("ledger_account_payout_id", listOf("string"))
        expected.put("ledger_account_settlement_id", listOf("string"))
        expected.put("ledger_id", listOf("string"))
        expected.put("ledgerable_id", listOf("string"))
        expected.put(
            "ledgerable_type",
            listOf(LedgerTransactionListParams.LedgerableType.EXPECTED_PAYMENT.toString())
        )
        LedgerTransactionListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        LedgerTransactionListParams.OrderBy.builder()
            .createdAt(LedgerTransactionListParams.OrderBy.CreatedAt.ASC)
            .effectiveAt(LedgerTransactionListParams.OrderBy.EffectiveAt.ASC)
            .build()
            .forEachQueryParam { key, values -> expected.put("order_by[$key]", values) }
        expected.put("per_page", listOf("123"))
        LedgerTransactionListParams.PostedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("posted_at[$key]", values)
        }
        expected.put("reverses_ledger_transaction_id", listOf("string"))
        expected.put("status", listOf(LedgerTransactionListParams.Status.PENDING.toString()))
        LedgerTransactionListParams.UpdatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("updated_at[$key]", values)
        }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerTransactionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
