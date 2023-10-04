// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountListParamsTest {

    @Test
    fun createLedgerAccountListParams() {
        LedgerAccountListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .metadata(LedgerAccountListParams.Metadata.builder().build())
            .id(listOf("string"))
            .name("string")
            .ledgerId("string")
            .currency("string")
            .balances(
                LedgerAccountListParams.Balances.builder()
                    .asOfDate(LocalDate.parse("2019-12-27"))
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .pendingBalanceAmount(
                LedgerAccountListParams.PendingBalanceAmount.builder()
                    .eq(123L)
                    .gt(123L)
                    .gte(123L)
                    .lt(123L)
                    .lte(123L)
                    .notEq(123L)
                    .build()
            )
            .postedBalanceAmount(
                LedgerAccountListParams.PostedBalanceAmount.builder()
                    .eq(123L)
                    .gt(123L)
                    .gte(123L)
                    .lt(123L)
                    .lte(123L)
                    .notEq(123L)
                    .build()
            )
            .availableBalanceAmount(
                LedgerAccountListParams.AvailableBalanceAmount.builder()
                    .eq(123L)
                    .gt(123L)
                    .gte(123L)
                    .lt(123L)
                    .lte(123L)
                    .notEq(123L)
                    .build()
            )
            .createdAt(LedgerAccountListParams.CreatedAt.builder().build())
            .updatedAt(LedgerAccountListParams.UpdatedAt.builder().build())
            .ledgerAccountCategoryId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LedgerAccountListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .metadata(LedgerAccountListParams.Metadata.builder().build())
                .id(listOf("string"))
                .name("string")
                .ledgerId("string")
                .currency("string")
                .balances(
                    LedgerAccountListParams.Balances.builder()
                        .asOfDate(LocalDate.parse("2019-12-27"))
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .pendingBalanceAmount(
                    LedgerAccountListParams.PendingBalanceAmount.builder()
                        .eq(123L)
                        .gt(123L)
                        .gte(123L)
                        .lt(123L)
                        .lte(123L)
                        .notEq(123L)
                        .build()
                )
                .postedBalanceAmount(
                    LedgerAccountListParams.PostedBalanceAmount.builder()
                        .eq(123L)
                        .gt(123L)
                        .gte(123L)
                        .lt(123L)
                        .lte(123L)
                        .notEq(123L)
                        .build()
                )
                .availableBalanceAmount(
                    LedgerAccountListParams.AvailableBalanceAmount.builder()
                        .eq(123L)
                        .gt(123L)
                        .gte(123L)
                        .lt(123L)
                        .lte(123L)
                        .notEq(123L)
                        .build()
                )
                .createdAt(LedgerAccountListParams.CreatedAt.builder().build())
                .updatedAt(LedgerAccountListParams.UpdatedAt.builder().build())
                .ledgerAccountCategoryId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        LedgerAccountListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("id[]", listOf("string"))
        expected.put("name", listOf("string"))
        expected.put("ledger_id", listOf("string"))
        expected.put("currency", listOf("string"))
        LedgerAccountListParams.Balances.builder()
            .asOfDate(LocalDate.parse("2019-12-27"))
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("balances[$key]", values) }
        LedgerAccountListParams.PendingBalanceAmount.builder()
            .eq(123L)
            .gt(123L)
            .gte(123L)
            .lt(123L)
            .lte(123L)
            .notEq(123L)
            .build()
            .forEachQueryParam { key, values ->
                expected.put("pending_balance_amount[$key]", values)
            }
        LedgerAccountListParams.PostedBalanceAmount.builder()
            .eq(123L)
            .gt(123L)
            .gte(123L)
            .lt(123L)
            .lte(123L)
            .notEq(123L)
            .build()
            .forEachQueryParam { key, values ->
                expected.put("posted_balance_amount[$key]", values)
            }
        LedgerAccountListParams.AvailableBalanceAmount.builder()
            .eq(123L)
            .gt(123L)
            .gte(123L)
            .lt(123L)
            .lte(123L)
            .notEq(123L)
            .build()
            .forEachQueryParam { key, values ->
                expected.put("available_balance_amount[$key]", values)
            }
        LedgerAccountListParams.CreatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("created_at[$key]", values)
        }
        LedgerAccountListParams.UpdatedAt.builder().build().forEachQueryParam { key, values ->
            expected.put("updated_at[$key]", values)
        }
        expected.put("ledger_account_category_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = LedgerAccountListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
