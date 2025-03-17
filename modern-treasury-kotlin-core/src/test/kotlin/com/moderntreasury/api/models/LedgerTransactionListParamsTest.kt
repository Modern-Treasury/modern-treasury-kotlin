// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerTransactionListParamsTest {

    @Test
    fun create() {
        LedgerTransactionListParams.builder()
            .addId("string")
            .afterCursor("after_cursor")
            .effectiveAt(
                LedgerTransactionListParams.EffectiveAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .effectiveDate(
                LedgerTransactionListParams.EffectiveDate.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .externalId("external_id")
            .ledgerAccountCategoryId("ledger_account_category_id")
            .ledgerAccountId("ledger_account_id")
            .ledgerAccountSettlementId("ledger_account_settlement_id")
            .ledgerId("ledger_id")
            .ledgerableId("ledgerable_id")
            .ledgerableType(LedgerTransactionListParams.LedgerableType.EXPECTED_PAYMENT)
            .metadata(
                LedgerTransactionListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .orderBy(
                LedgerTransactionListParams.OrderBy.builder()
                    .createdAt(LedgerTransactionListParams.OrderBy.CreatedAt.ASC)
                    .effectiveAt(LedgerTransactionListParams.OrderBy.EffectiveAt.ASC)
                    .build()
            )
            .partiallyPostsLedgerTransactionId("partially_posts_ledger_transaction_id")
            .perPage(0L)
            .postedAt(
                LedgerTransactionListParams.PostedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .reversesLedgerTransactionId("reverses_ledger_transaction_id")
            .status(LedgerTransactionListParams.Status.PENDING)
            .updatedAt(
                LedgerTransactionListParams.UpdatedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerTransactionListParams.builder()
                .addId("string")
                .afterCursor("after_cursor")
                .effectiveAt(
                    LedgerTransactionListParams.EffectiveAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .effectiveDate(
                    LedgerTransactionListParams.EffectiveDate.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .externalId("external_id")
                .ledgerAccountCategoryId("ledger_account_category_id")
                .ledgerAccountId("ledger_account_id")
                .ledgerAccountSettlementId("ledger_account_settlement_id")
                .ledgerId("ledger_id")
                .ledgerableId("ledgerable_id")
                .ledgerableType(LedgerTransactionListParams.LedgerableType.EXPECTED_PAYMENT)
                .metadata(
                    LedgerTransactionListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .orderBy(
                    LedgerTransactionListParams.OrderBy.builder()
                        .createdAt(LedgerTransactionListParams.OrderBy.CreatedAt.ASC)
                        .effectiveAt(LedgerTransactionListParams.OrderBy.EffectiveAt.ASC)
                        .build()
                )
                .partiallyPostsLedgerTransactionId("partially_posts_ledger_transaction_id")
                .perPage(0L)
                .postedAt(
                    LedgerTransactionListParams.PostedAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .reversesLedgerTransactionId("reverses_ledger_transaction_id")
                .status(LedgerTransactionListParams.Status.PENDING)
                .updatedAt(
                    LedgerTransactionListParams.UpdatedAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .build()
        val expected = QueryParams.builder()
        expected.put("id[]", "string")
        expected.put("after_cursor", "after_cursor")
        LedgerTransactionListParams.EffectiveAt.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("effective_at[$key]", values) }
        LedgerTransactionListParams.EffectiveDate.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("effective_date[$key]", values) }
        expected.put("external_id", "external_id")
        expected.put("ledger_account_category_id", "ledger_account_category_id")
        expected.put("ledger_account_id", "ledger_account_id")
        expected.put("ledger_account_settlement_id", "ledger_account_settlement_id")
        expected.put("ledger_id", "ledger_id")
        expected.put("ledgerable_id", "ledgerable_id")
        expected.put(
            "ledgerable_type",
            LedgerTransactionListParams.LedgerableType.EXPECTED_PAYMENT.toString(),
        )
        LedgerTransactionListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        LedgerTransactionListParams.OrderBy.builder()
            .createdAt(LedgerTransactionListParams.OrderBy.CreatedAt.ASC)
            .effectiveAt(LedgerTransactionListParams.OrderBy.EffectiveAt.ASC)
            .build()
            .forEachQueryParam { key, values -> expected.put("order_by[$key]", values) }
        expected.put(
            "partially_posts_ledger_transaction_id",
            "partially_posts_ledger_transaction_id",
        )
        expected.put("per_page", "0")
        LedgerTransactionListParams.PostedAt.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("posted_at[$key]", values) }
        expected.put("reverses_ledger_transaction_id", "reverses_ledger_transaction_id")
        expected.put("status", LedgerTransactionListParams.Status.PENDING.toString())
        LedgerTransactionListParams.UpdatedAt.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("updated_at[$key]", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerTransactionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
