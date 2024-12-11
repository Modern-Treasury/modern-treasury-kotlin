// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyUpdateParamsTest {

    @Test
    fun createCounterpartyUpdateParams() {
        CounterpartyUpdateParams.builder()
            .id("id")
            .email("dev@stainlessapi.com")
            .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(
                CounterpartyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .sendRemittanceAdvice(true)
            .taxpayerIdentifier("taxpayer_identifier")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CounterpartyUpdateParams.builder()
                .id("id")
                .email("dev@stainlessapi.com")
                .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    CounterpartyUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .sendRemittanceAdvice(true)
                .taxpayerIdentifier("taxpayer_identifier")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("dev@stainlessapi.com")
        assertThat(body.legalEntityId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .isEqualTo(
                CounterpartyUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(body.taxpayerIdentifier()).isEqualTo("taxpayer_identifier")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = CounterpartyUpdateParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = CounterpartyUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
