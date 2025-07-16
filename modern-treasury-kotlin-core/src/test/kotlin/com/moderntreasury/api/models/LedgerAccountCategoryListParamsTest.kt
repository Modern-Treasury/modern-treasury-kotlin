// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountCategoryListParamsTest {

    @Test
    fun create() {
        LedgerAccountCategoryListParams.builder()
            .addId("string")
            .afterCursor("after_cursor")
            .balances(
                LedgerAccountCategoryListParams.Balances.builder()
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .currency("currency")
            .externalId("external_id")
            .ledgerAccountId("ledger_account_id")
            .ledgerId("ledger_id")
            .metadata(
                LedgerAccountCategoryListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .addName("string")
            .parentLedgerAccountCategoryId("parent_ledger_account_category_id")
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerAccountCategoryListParams.builder()
                .addId("string")
                .afterCursor("after_cursor")
                .balances(
                    LedgerAccountCategoryListParams.Balances.builder()
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .currency("currency")
                .externalId("external_id")
                .ledgerAccountId("ledger_account_id")
                .ledgerId("ledger_id")
                .metadata(
                    LedgerAccountCategoryListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .addName("string")
                .parentLedgerAccountCategoryId("parent_ledger_account_category_id")
                .perPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id[]", "string")
                    .put("after_cursor", "after_cursor")
                    .put("balances[effective_at]", "2019-12-27T18:11:19.117Z")
                    .put("currency", "currency")
                    .put("external_id", "external_id")
                    .put("ledger_account_id", "ledger_account_id")
                    .put("ledger_id", "ledger_id")
                    .put("metadata[foo]", "string")
                    .put("name[]", "string")
                    .put("parent_ledger_account_category_id", "parent_ledger_account_category_id")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerAccountCategoryListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
