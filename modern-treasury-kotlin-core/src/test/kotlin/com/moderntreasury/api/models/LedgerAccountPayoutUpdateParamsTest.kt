package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountPayoutUpdateParamsTest {

    @Test
    fun createLedgerAccountPayoutUpdateParams() {
        LedgerAccountPayoutUpdateParams.builder()
            .id("string")
            .description("string")
            .metadata(LedgerAccountPayoutUpdateParams.Metadata.builder().build())
            .status(LedgerAccountPayoutUpdateParams.Status.POSTED)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountPayoutUpdateParams.builder()
                .id("string")
                .description("string")
                .metadata(LedgerAccountPayoutUpdateParams.Metadata.builder().build())
                .status(LedgerAccountPayoutUpdateParams.Status.POSTED)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountPayoutUpdateParams.Metadata.builder().build())
        assertThat(body.status()).isEqualTo(LedgerAccountPayoutUpdateParams.Status.POSTED)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerAccountPayoutUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountPayoutUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
