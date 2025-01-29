// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountListParamsTest {

    @Test
    fun createLedgerAccountListParams() {
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
        val expected = QueryParams.builder()
        expected.put("id[]", "string")
        expected.put("after_cursor", "after_cursor")
        LedgerAccountListParams.AvailableBalanceAmount.builder()
            .eq(0L)
            .gt(0L)
            .gte(0L)
            .lt(0L)
            .lte(0L)
            .notEq(0L)
            .build()
            .forEachQueryParam { key, values ->
                expected.put("available_balance_amount[$key]", values)
            }
        LedgerAccountListParams.Balances.builder()
            .asOfDate(LocalDate.parse("2019-12-27"))
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("balances[$key]", values) }
        LedgerAccountListParams.CreatedAt.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at[$key]", values) }
        expected.put("currency", "currency")
        expected.put("ledger_account_category_id", "ledger_account_category_id")
        expected.put("ledger_id", "ledger_id")
        LedgerAccountListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("name[]", "string")
        LedgerAccountListParams.PendingBalanceAmount.builder()
            .eq(0L)
            .gt(0L)
            .gte(0L)
            .lt(0L)
            .lte(0L)
            .notEq(0L)
            .build()
            .forEachQueryParam { key, values ->
                expected.put("pending_balance_amount[$key]", values)
            }
        expected.put("per_page", "0")
        LedgerAccountListParams.PostedBalanceAmount.builder()
            .eq(0L)
            .gt(0L)
            .gte(0L)
            .lt(0L)
            .lte(0L)
            .notEq(0L)
            .build()
            .forEachQueryParam { key, values ->
                expected.put("posted_balance_amount[$key]", values)
            }
        LedgerAccountListParams.UpdatedAt.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("updated_at[$key]", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerAccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
