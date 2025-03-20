// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountSettlementAccountEntryUpdateParamsTest {

    @Test
    fun create() {
        LedgerAccountSettlementAccountEntryUpdateParams.builder()
            .id("id")
            .addLedgerEntryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LedgerAccountSettlementAccountEntryUpdateParams.builder()
                .id("id")
                .addLedgerEntryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LedgerAccountSettlementAccountEntryUpdateParams.builder()
                .id("id")
                .addLedgerEntryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.ledgerEntryIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
