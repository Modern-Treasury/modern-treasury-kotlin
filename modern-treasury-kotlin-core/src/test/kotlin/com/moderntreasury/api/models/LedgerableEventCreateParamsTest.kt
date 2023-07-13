package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerableEventCreateParamsTest {

    @Test
    fun createLedgerableEventCreateParams() {
        LedgerableEventCreateParams.builder()
            .name("string")
            .description("string")
            .direction("string")
            .originatingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .receivingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .amount(123L)
            .currency("string")
            .currencyExponent(123L)
            .customData(JsonNull.of())
            .metadata(LedgerableEventCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerableEventCreateParams.builder()
                .name("string")
                .description("string")
                .direction("string")
                .originatingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .currency("string")
                .currencyExponent(123L)
                .customData(JsonNull.of())
                .metadata(LedgerableEventCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.direction()).isEqualTo("string")
        assertThat(body.originatingLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.receivingLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.currencyExponent()).isEqualTo(123L)
        assertThat(body.customData()).isEqualTo(JsonNull.of())
        assertThat(body.metadata())
            .isEqualTo(LedgerableEventCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerableEventCreateParams.builder().name("string").amount(123L).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
    }
}
