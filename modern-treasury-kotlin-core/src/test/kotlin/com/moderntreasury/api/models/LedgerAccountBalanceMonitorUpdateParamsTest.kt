package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountBalanceMonitorUpdateParamsTest {

    @Test
    fun createLedgerAccountBalanceMonitorUpdateParams() {
        LedgerAccountBalanceMonitorUpdateParams.builder()
            .id("string")
            .description("string")
            .metadata(LedgerAccountBalanceMonitorUpdateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountBalanceMonitorUpdateParams.builder()
                .id("string")
                .description("string")
                .metadata(LedgerAccountBalanceMonitorUpdateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountBalanceMonitorUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerAccountBalanceMonitorUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountBalanceMonitorUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
