// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PingResponseTest {

    @Test
    fun createPingResponse() {
        val pingResponse = PingResponse.builder().ping("pong").build()
        assertThat(pingResponse).isNotNull
        assertThat(pingResponse.ping()).isEqualTo("pong")
    }
}
