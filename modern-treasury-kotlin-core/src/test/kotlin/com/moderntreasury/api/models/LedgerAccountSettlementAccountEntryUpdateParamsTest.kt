// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountSettlementAccountEntryUpdateParamsTest {

    @Test
    fun create() {
        LedgerAccountSettlementAccountEntryUpdateParams.builder()
            .id("id")
            .addLedgerEntryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            LedgerAccountSettlementAccountEntryUpdateParams.builder()
                .id("id")
                .addLedgerEntryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.ledgerEntryIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LedgerAccountSettlementAccountEntryUpdateParams.builder()
                .id("id")
                .addLedgerEntryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.ledgerEntryIds()).isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
    }

    @Test
    fun getPathParam() {
        val params =
            LedgerAccountSettlementAccountEntryUpdateParams.builder()
                .id("id")
                .addLedgerEntryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
