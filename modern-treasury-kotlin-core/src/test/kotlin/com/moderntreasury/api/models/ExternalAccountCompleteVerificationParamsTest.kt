// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountCompleteVerificationParamsTest {

    @Test
    fun createExternalAccountCompleteVerificationParams() {
        ExternalAccountCompleteVerificationParams.builder().id("id").amounts(listOf(2L, 4L)).build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalAccountCompleteVerificationParams.builder()
                .id("id")
                .amounts(listOf(2L, 4L))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amounts()).isEqualTo(listOf(2L, 4L))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ExternalAccountCompleteVerificationParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
