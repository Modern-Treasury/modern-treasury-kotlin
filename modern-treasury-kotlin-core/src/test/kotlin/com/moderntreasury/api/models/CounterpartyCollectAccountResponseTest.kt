// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterpartyCollectAccountResponseTest {

    @Test
    fun create() {
        val counterpartyCollectAccountResponse =
            CounterpartyCollectAccountResponse.builder()
                .id("id")
                .formLink("https://example.com")
                .isResend(true)
                .build()

        assertThat(counterpartyCollectAccountResponse.id()).isEqualTo("id")
        assertThat(counterpartyCollectAccountResponse.formLink()).isEqualTo("https://example.com")
        assertThat(counterpartyCollectAccountResponse.isResend()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val counterpartyCollectAccountResponse =
            CounterpartyCollectAccountResponse.builder()
                .id("id")
                .formLink("https://example.com")
                .isResend(true)
                .build()

        val roundtrippedCounterpartyCollectAccountResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(counterpartyCollectAccountResponse),
                jacksonTypeRef<CounterpartyCollectAccountResponse>(),
            )

        assertThat(roundtrippedCounterpartyCollectAccountResponse)
            .isEqualTo(counterpartyCollectAccountResponse)
    }
}
