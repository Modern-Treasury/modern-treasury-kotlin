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
            .name("string")
            .customData(JsonNull.of())
            .description("string")
            .metadata(LedgerableEventCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerableEventCreateParams.builder()
                .name("string")
                .customData(JsonNull.of())
                .description("string")
                .metadata(LedgerableEventCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.customData()).isEqualTo(JsonNull.of())
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(LedgerableEventCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerableEventCreateParams.builder().name("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
    }
}
