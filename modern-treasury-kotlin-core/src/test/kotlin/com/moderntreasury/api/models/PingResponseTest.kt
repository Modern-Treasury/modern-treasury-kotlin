// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PingResponseTest {

    @Test
    fun create() {
        val pingResponse = PingResponse.builder().ping("pong").build()

        assertThat(pingResponse.ping()).isEqualTo("pong")
    }
}
