// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerableEventCreateParamsTest {

    @Test
    fun createLedgerableEventCreateParams() {
        LedgerableEventCreateParams.builder()
            .amount(123L)
            .name("string")
            .currency("string")
            .currencyExponent(123L)
            .customData(JsonNull.of())
            .description("string")
            .direction("string")
            .metadata(LedgerableEventCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerableEventCreateParams.builder()
                .amount(123L)
                .name("string")
                .currency("string")
                .currencyExponent(123L)
                .customData(JsonNull.of())
                .description("string")
                .direction("string")
                .metadata(LedgerableEventCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.currencyExponent()).isEqualTo(123L)
        assertThat(body.customData()).isEqualTo(JsonNull.of())
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.direction()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(LedgerableEventCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerableEventCreateParams.builder().amount(123L).name("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.name()).isEqualTo("string")
    }
}
