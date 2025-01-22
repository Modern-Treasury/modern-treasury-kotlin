// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountSettlementAccountEntryDeleteParamsTest {

    @Test
    fun createLedgerAccountSettlementAccountEntryDeleteParams() {
        LedgerAccountSettlementAccountEntryDeleteParams.builder()
            .id("id")
            .addLedgerEntryId(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountSettlementAccountEntryDeleteParams.builder()
                .id("id")
                .addLedgerEntryId(JsonValue.from(mapOf<String, Any>()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ledgerEntryIds()).isEqualTo(listOf(JsonValue.from(mapOf<String, Any>())))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountSettlementAccountEntryDeleteParams.builder()
                .id("id")
                .addLedgerEntryId(JsonValue.from(mapOf<String, Any>()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ledgerEntryIds()).isEqualTo(listOf(JsonValue.from(mapOf<String, Any>())))
    }

    @Test
    fun getPathParam() {
        val params =
            LedgerAccountSettlementAccountEntryDeleteParams.builder()
                .id("id")
                .addLedgerEntryId(JsonValue.from(mapOf<String, Any>()))
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
