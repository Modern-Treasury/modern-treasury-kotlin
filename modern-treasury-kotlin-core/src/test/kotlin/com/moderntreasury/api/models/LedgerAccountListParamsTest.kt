// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountListParamsTest {

    @Test
    fun create() {
        LedgerAccountListParams.builder()
            .addId("string")
            .afterCursor("after_cursor")
            .availableBalanceAmount(
                LedgerAccountListParams.AvailableBalanceAmount.builder()
                    .eq(0L)
                    .gt(0L)
                    .gte(0L)
                    .lt(0L)
                    .lte(0L)
                    .notEq(0L)
                    .build()
            )
            .balances(
                LedgerAccountListParams.Balances.builder()
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .createdAt(
                LedgerAccountListParams.CreatedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .currency("currency")
            .externalId("external_id")
            .ledgerAccountCategoryId("ledger_account_category_id")
            .ledgerId("ledger_id")
            .metadata(
                LedgerAccountListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .addName("string")
            .pendingBalanceAmount(
                LedgerAccountListParams.PendingBalanceAmount.builder()
                    .eq(0L)
                    .gt(0L)
                    .gte(0L)
                    .lt(0L)
                    .lte(0L)
                    .notEq(0L)
                    .build()
            )
            .perPage(0L)
            .postedBalanceAmount(
                LedgerAccountListParams.PostedBalanceAmount.builder()
                    .eq(0L)
                    .gt(0L)
                    .gte(0L)
                    .lt(0L)
                    .lte(0L)
                    .notEq(0L)
                    .build()
            )
            .updatedAt(
                LedgerAccountListParams.UpdatedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerAccountListParams.builder()
                .addId("string")
                .afterCursor("after_cursor")
                .availableBalanceAmount(
                    LedgerAccountListParams.AvailableBalanceAmount.builder()
                        .eq(0L)
                        .gt(0L)
                        .gte(0L)
                        .lt(0L)
                        .lte(0L)
                        .notEq(0L)
                        .build()
                )
                .balances(
                    LedgerAccountListParams.Balances.builder()
                        .asOfDate(LocalDate.parse("2019-12-27"))
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .createdAt(
                    LedgerAccountListParams.CreatedAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .currency("currency")
                .externalId("external_id")
                .ledgerAccountCategoryId("ledger_account_category_id")
                .ledgerId("ledger_id")
                .metadata(
                    LedgerAccountListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .addName("string")
                .pendingBalanceAmount(
                    LedgerAccountListParams.PendingBalanceAmount.builder()
                        .eq(0L)
                        .gt(0L)
                        .gte(0L)
                        .lt(0L)
                        .lte(0L)
                        .notEq(0L)
                        .build()
                )
                .perPage(0L)
                .postedBalanceAmount(
                    LedgerAccountListParams.PostedBalanceAmount.builder()
                        .eq(0L)
                        .gt(0L)
                        .gte(0L)
                        .lt(0L)
                        .lte(0L)
                        .notEq(0L)
                        .build()
                )
                .updatedAt(
                    LedgerAccountListParams.UpdatedAt.builder()
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
                    .put("available_balance_amount[eq]", "0")
                    .put("available_balance_amount[gt]", "0")
                    .put("available_balance_amount[gte]", "0")
                    .put("available_balance_amount[lt]", "0")
                    .put("available_balance_amount[lte]", "0")
                    .put("available_balance_amount[not_eq]", "0")
                    .put("balances[as_of_date]", "2019-12-27")
                    .put("balances[effective_at]", "2019-12-27T18:11:19.117Z")
                    .put("balances[effective_at_lower_bound]", "2019-12-27T18:11:19.117Z")
                    .put("balances[effective_at_upper_bound]", "2019-12-27T18:11:19.117Z")
                    .put("created_at[foo]", "2019-12-27T18:11:19.117Z")
                    .put("currency", "currency")
                    .put("external_id", "external_id")
                    .put("ledger_account_category_id", "ledger_account_category_id")
                    .put("ledger_id", "ledger_id")
                    .put("metadata[foo]", "string")
                    .put("name[]", "string")
                    .put("pending_balance_amount[eq]", "0")
                    .put("pending_balance_amount[gt]", "0")
                    .put("pending_balance_amount[gte]", "0")
                    .put("pending_balance_amount[lt]", "0")
                    .put("pending_balance_amount[lte]", "0")
                    .put("pending_balance_amount[not_eq]", "0")
                    .put("per_page", "0")
                    .put("posted_balance_amount[eq]", "0")
                    .put("posted_balance_amount[gt]", "0")
                    .put("posted_balance_amount[gte]", "0")
                    .put("posted_balance_amount[lt]", "0")
                    .put("posted_balance_amount[lte]", "0")
                    .put("posted_balance_amount[not_eq]", "0")
                    .put("updated_at[foo]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
