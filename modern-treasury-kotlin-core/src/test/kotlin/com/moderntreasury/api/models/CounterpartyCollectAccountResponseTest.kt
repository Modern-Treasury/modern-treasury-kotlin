package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyCollectAccountResponseTest {

    @Test
    fun createCounterpartyCollectAccountResponse() {
        val counterpartyCollectAccountResponse =
            CounterpartyCollectAccountResponse.builder()
                .id("string")
                .isResend(true)
                .formLink("https://example.com")
                .build()
        assertThat(counterpartyCollectAccountResponse).isNotNull
        assertThat(counterpartyCollectAccountResponse.id()).isEqualTo("string")
        assertThat(counterpartyCollectAccountResponse.isResend()).isEqualTo(true)
        assertThat(counterpartyCollectAccountResponse.formLink()).isEqualTo("https://example.com")
    }
}
