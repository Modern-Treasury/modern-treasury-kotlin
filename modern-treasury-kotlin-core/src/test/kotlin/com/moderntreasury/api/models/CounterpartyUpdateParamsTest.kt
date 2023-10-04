// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyUpdateParamsTest {

    @Test
    fun createCounterpartyUpdateParams() {
        CounterpartyUpdateParams.builder()
            .id("string")
            .email("dev@stainlessapi.com")
            .metadata(CounterpartyUpdateParams.Metadata.builder().build())
            .name("string")
            .sendRemittanceAdvice(true)
            .taxpayerIdentifier("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CounterpartyUpdateParams.builder()
                .id("string")
                .email("dev@stainlessapi.com")
                .metadata(CounterpartyUpdateParams.Metadata.builder().build())
                .name("string")
                .sendRemittanceAdvice(true)
                .taxpayerIdentifier("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("dev@stainlessapi.com")
        assertThat(body.metadata()).isEqualTo(CounterpartyUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(body.taxpayerIdentifier()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CounterpartyUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CounterpartyUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
