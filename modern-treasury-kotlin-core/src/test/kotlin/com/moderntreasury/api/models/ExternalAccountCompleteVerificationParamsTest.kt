// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountCompleteVerificationParamsTest {

    @Test
    fun create() {
        ExternalAccountCompleteVerificationParams.builder()
            .id("id")
            .addAmount(2L)
            .addAmount(4L)
            .build()
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
        assertThat(body.amounts()).isEqualTo(listOf(2L, 4L))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExternalAccountCompleteVerificationParams.builder().id("id").build()
        val body = params._body()
        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = ExternalAccountCompleteVerificationParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
