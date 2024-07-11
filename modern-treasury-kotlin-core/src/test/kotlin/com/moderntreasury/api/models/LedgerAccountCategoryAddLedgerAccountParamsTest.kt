// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryAddLedgerAccountParamsTest {

    @Test
    fun createLedgerAccountCategoryAddLedgerAccountParams() {
        LedgerAccountCategoryAddLedgerAccountParams.builder()
            .id("id")
            .ledgerAccountId("ledger_account_id")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            LedgerAccountCategoryAddLedgerAccountParams.builder()
                .id("id")
                .ledgerAccountId("ledger_account_id")
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // path param "ledgerAccountId"
        assertThat(params.getPathParam(1)).isEqualTo("ledger_account_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
