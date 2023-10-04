// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyCollectAccountResponseTest {

    @Test
    fun createCounterpartyCollectAccountResponse() {
        val counterpartyCollectAccountResponse =
            CounterpartyCollectAccountResponse.builder()
                .id("string")
                .formLink("https://example.com")
                .isResend(true)
                .build()
        assertThat(counterpartyCollectAccountResponse).isNotNull
        assertThat(counterpartyCollectAccountResponse.id()).isEqualTo("string")
        assertThat(counterpartyCollectAccountResponse.formLink()).isEqualTo("https://example.com")
        assertThat(counterpartyCollectAccountResponse.isResend()).isEqualTo(true)
    }
}
