package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyCollectAccountParamsTest {

    @Test
    fun createCounterpartyCollectAccountParams() {
        CounterpartyCollectAccountParams.builder()
            .id("string")
            .direction(CounterpartyCollectAccountParams.Direction.CREDIT)
            .customRedirect("https://example.com")
            .fields(listOf(CounterpartyCollectAccountParams.Field.NAME))
            .sendEmail(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            CounterpartyCollectAccountParams.builder()
                .id("string")
                .direction(CounterpartyCollectAccountParams.Direction.CREDIT)
                .customRedirect("https://example.com")
                .fields(listOf(CounterpartyCollectAccountParams.Field.NAME))
                .sendEmail(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.direction()).isEqualTo(CounterpartyCollectAccountParams.Direction.CREDIT)
        assertThat(body.customRedirect()).isEqualTo("https://example.com")
        assertThat(body.fields()).isEqualTo(listOf(CounterpartyCollectAccountParams.Field.NAME))
        assertThat(body.sendEmail()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            CounterpartyCollectAccountParams.builder()
                .id("string")
                .direction(CounterpartyCollectAccountParams.Direction.CREDIT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.direction()).isEqualTo(CounterpartyCollectAccountParams.Direction.CREDIT)
    }

    @Test
    fun getPathParam() {
        val params =
            CounterpartyCollectAccountParams.builder()
                .id("string")
                .direction(CounterpartyCollectAccountParams.Direction.CREDIT)
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
