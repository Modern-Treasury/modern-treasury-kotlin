// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountBalanceMonitorUpdateParamsTest {

    @Test
    fun createLedgerAccountBalanceMonitorUpdateParams() {
        LedgerAccountBalanceMonitorUpdateParams.builder()
            .id("id")
            .description("description")
            .metadata(LedgerAccountBalanceMonitorUpdateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountBalanceMonitorUpdateParams.builder()
                .id("id")
                .description("description")
                .metadata(LedgerAccountBalanceMonitorUpdateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountBalanceMonitorUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerAccountBalanceMonitorUpdateParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LedgerAccountBalanceMonitorUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
