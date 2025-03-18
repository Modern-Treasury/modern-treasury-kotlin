// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterpartyCollectAccountParamsTest {

    @Test
    fun create() {
        CounterpartyCollectAccountParams.builder()
            .id("id")
            .direction(TransactionDirection.CREDIT)
            .customRedirect("https://example.com")
            .addField(CounterpartyCollectAccountParams.Field.NAME)
            .sendEmail(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CounterpartyCollectAccountParams.builder()
                .id("id")
                .direction(TransactionDirection.CREDIT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CounterpartyCollectAccountParams.builder()
                .id("id")
                .direction(TransactionDirection.CREDIT)
                .customRedirect("https://example.com")
                .addField(CounterpartyCollectAccountParams.Field.NAME)
                .sendEmail(true)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(body.customRedirect()).isEqualTo("https://example.com")
        assertThat(body.fields()).containsExactly(CounterpartyCollectAccountParams.Field.NAME)
        assertThat(body.sendEmail()).isEqualTo(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CounterpartyCollectAccountParams.builder()
                .id("id")
                .direction(TransactionDirection.CREDIT)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.direction()).isEqualTo(TransactionDirection.CREDIT)
    }
}
