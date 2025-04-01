// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PingResponseTest {

    @Test
    fun create() {
        val pingResponse = PingResponse.builder().ping("pong").build()

        assertThat(pingResponse.ping()).isEqualTo("pong")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pingResponse = PingResponse.builder().ping("pong").build()

        val roundtrippedPingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pingResponse),
                jacksonTypeRef<PingResponse>(),
            )

        assertThat(roundtrippedPingResponse).isEqualTo(pingResponse)
    }
}
