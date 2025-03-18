// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountSettlementAccountEntryDeleteParamsTest {

    @Test
    fun create() {
        LedgerAccountSettlementAccountEntryDeleteParams.builder()
            .id("id")
            .addLedgerEntryId(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LedgerAccountSettlementAccountEntryDeleteParams.builder()
                .id("id")
                .addLedgerEntryId(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LedgerAccountSettlementAccountEntryDeleteParams.builder()
                .id("id")
                .addLedgerEntryId(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.ledgerEntryIds()).containsExactly(JsonValue.from(mapOf<String, Any>()))
    }
}
