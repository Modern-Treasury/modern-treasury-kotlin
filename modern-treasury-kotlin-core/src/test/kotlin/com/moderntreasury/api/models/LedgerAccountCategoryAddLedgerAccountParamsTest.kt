// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountCategoryAddLedgerAccountParamsTest {

    @Test
    fun create() {
        LedgerAccountCategoryAddLedgerAccountParams.builder()
            .id("id")
            .ledgerAccountId("ledger_account_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LedgerAccountCategoryAddLedgerAccountParams.builder()
                .id("id")
                .ledgerAccountId("ledger_account_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("ledger_account_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
