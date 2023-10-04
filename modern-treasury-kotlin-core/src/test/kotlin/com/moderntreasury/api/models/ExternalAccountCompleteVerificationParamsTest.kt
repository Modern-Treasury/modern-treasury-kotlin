// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountCompleteVerificationParamsTest {

    @Test
    fun createExternalAccountCompleteVerificationParams() {
        ExternalAccountCompleteVerificationParams.builder()
            .id("string")
            .amounts(listOf(123L))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalAccountCompleteVerificationParams.builder()
                .id("string")
                .amounts(listOf(123L))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amounts()).isEqualTo(listOf(123L))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ExternalAccountCompleteVerificationParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = ExternalAccountCompleteVerificationParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
