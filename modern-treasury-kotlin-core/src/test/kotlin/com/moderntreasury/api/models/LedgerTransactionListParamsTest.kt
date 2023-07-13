package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionListParamsTest {

    @Test
    fun createLedgerTransactionListParams() {
        LedgerTransactionListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .id(LedgerTransactionListParams.Id.builder().build())
            .metadata(LedgerTransactionListParams.Metadata.builder().build())
            .ledgerId("string")
            .ledgerAccountId("string")
            .effectiveAt(LedgerTransactionListParams.EffectiveAt.builder().build())
            .effectiveDate(LedgerTransactionListParams.EffectiveDate.builder().build())
            .postedAt(LedgerTransactionListParams.PostedAt.builder().build())
            .updatedAt(LedgerTransactionListParams.UpdatedAt.builder().build())
            .orderBy(
                LedgerTransactionListParams.OrderBy.builder()
                    .createdAt(LedgerTransactionListParams.OrderBy.CreatedAt.ASC)
                    .effectiveAt(LedgerTransactionListParams.OrderBy.EffectiveAt.ASC)
                    .build()
            )
            .status(LedgerTransactionListParams.Status.PENDING)
            .externalId("string")
            .ledgerAccountCategoryId("string")
            .reversesLedgerTransactionId("string")
            .ledgerableId("string")
            .ledgerableType(LedgerTransactionListParams.LedgerableType.COUNTERPARTY)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerTransactionListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .id(LedgerTransactionListParams.Id.builder().build())
                .metadata(LedgerTransactionListParams.Metadata.builder().build())
                .ledgerId("string")
                .ledgerAccountId("string")
                .effectiveAt(LedgerTransactionListParams.EffectiveAt.builder().build())
                .effectiveDate(LedgerTransactionListParams.EffectiveDate.builder().build())
                .postedAt(LedgerTransactionListParams.PostedAt.builder().build())
                .updatedAt(LedgerTransactionListParams.UpdatedAt.builder().build())
                .orderBy(
                    LedgerTransactionListParams.OrderBy.builder()
                        .createdAt(LedgerTransactionListParams.OrderBy.CreatedAt.ASC)
                        .effectiveAt(LedgerTransactionListParams.OrderBy.EffectiveAt.ASC)
                        .build()
                )
                .status(LedgerTransactionListParams.Status.PENDING)
                .externalId("string")
                .ledgerAccountCategoryId("string")
                .reversesLedgerTransactionId("string")
                .ledgerableId("string")
                .ledgerableType(LedgerTransactionListParams.LedgerableType.COUNTERPARTY)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        LedgerTransactionListParams.Id.builder().build().forEachQueryParam { key, values ->
            expected.put("id[$key]", values)
        }
        LedgerTransactionListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("ledger_id", listOf("string"))
        expected.put("ledger_account_id", listOf("string"))
        LedgerTransactionListParams.EffectiveAt.builder().build().forEachQueryParam { key, values ->
            expected.put("effective_at[$key]", values)
        }
        LedgerTransactionListParams.EffectiveDate.builder().build().forEachQueryParam { key, values
            ->
            expected.put("effective_date[$key]", values)
        }
        LedgerTransactionListParams.PostedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("posted_at[$key]", values)
        }
        LedgerTransactionListParams.UpdatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("updated_at[$key]", values)
        }
        LedgerTransactionListParams.OrderBy.builder()
            .createdAt(LedgerTransactionListParams.OrderBy.CreatedAt.ASC)
            .effectiveAt(LedgerTransactionListParams.OrderBy.EffectiveAt.ASC)
            .build()
            .forEachQueryParam { key, values -> expected.put("order_by[$key]", values) }
        expected.put("status", listOf(LedgerTransactionListParams.Status.PENDING.toString()))
        expected.put("external_id", listOf("string"))
        expected.put("ledger_account_category_id", listOf("string"))
        expected.put("reverses_ledger_transaction_id", listOf("string"))
        expected.put("ledgerable_id", listOf("string"))
        expected.put(
            "ledgerable_type",
            listOf(LedgerTransactionListParams.LedgerableType.COUNTERPARTY.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerTransactionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
