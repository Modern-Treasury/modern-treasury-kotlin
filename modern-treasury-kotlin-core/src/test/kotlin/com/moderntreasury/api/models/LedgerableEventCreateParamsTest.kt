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
            .name("name")
            .customData(JsonNull.of())
            .description("description")
            .metadata(LedgerableEventCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerableEventCreateParams.builder()
                .name("name")
                .customData(JsonNull.of())
                .description("description")
                .metadata(LedgerableEventCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.customData()).isEqualTo(JsonNull.of())
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata())
            .isEqualTo(LedgerableEventCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerableEventCreateParams.builder().name("name").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
    }
}
