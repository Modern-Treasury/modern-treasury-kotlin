// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountSettlementUpdateParamsTest {

    @Test
    fun createLedgerAccountSettlementUpdateParams() {
        LedgerAccountSettlementUpdateParams.builder()
            .id("string")
            .description("string")
            .metadata(LedgerAccountSettlementUpdateParams.Metadata.builder().build())
            .status(LedgerAccountSettlementUpdateParams.Status.POSTED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountSettlementUpdateParams.builder()
                .id("string")
                .description("string")
                .metadata(LedgerAccountSettlementUpdateParams.Metadata.builder().build())
                .status(LedgerAccountSettlementUpdateParams.Status.POSTED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountSettlementUpdateParams.Metadata.builder().build())
        assertThat(body.status()).isEqualTo(LedgerAccountSettlementUpdateParams.Status.POSTED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerAccountSettlementUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountSettlementUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
