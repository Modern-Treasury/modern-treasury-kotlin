// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountCompleteVerificationParamsTest {

    @Test
    fun create() {
        ExternalAccountCompleteVerificationParams.builder()
            .id("id")
            .addAmount(2L)
            .addAmount(4L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ExternalAccountCompleteVerificationParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalAccountCompleteVerificationParams.builder()
                .id("id")
                .addAmount(2L)
                .addAmount(4L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amounts()).containsExactly(2L, 4L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExternalAccountCompleteVerificationParams.builder().id("id").build()

        val body = params._body()

        assertNotNull(body)
    }
}
