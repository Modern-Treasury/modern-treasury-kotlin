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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id[]", "string")
                    .put("after_cursor", "after_cursor")
                    .put("effective_at[foo]", "2019-12-27T18:11:19.117Z")
                    .put("effective_date[foo]", "2019-12-27T18:11:19.117Z")
                    .put("external_id", "external_id")
                    .put("ledger_account_category_id", "ledger_account_category_id")
                    .put("ledger_account_id", "ledger_account_id")
                    .put("ledger_account_settlement_id", "ledger_account_settlement_id")
                    .put("ledger_id", "ledger_id")
                    .put("ledgerable_id", "ledgerable_id")
                    .put("ledgerable_type", "expected_payment")
                    .put("metadata[foo]", "string")
                    .put("order_by[created_at]", "asc")
                    .put("order_by[effective_at]", "asc")
                    .put(
                        "partially_posts_ledger_transaction_id",
                        "partially_posts_ledger_transaction_id",
                    )
                    .put("per_page", "0")
                    .put("posted_at[foo]", "2019-12-27T18:11:19.117Z")
                    .put("reverses_ledger_transaction_id", "reverses_ledger_transaction_id")
                    .put("status", "pending")
                    .put("updated_at[foo]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerTransactionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
