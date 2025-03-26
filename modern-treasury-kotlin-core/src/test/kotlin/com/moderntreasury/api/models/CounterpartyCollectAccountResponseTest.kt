// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

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
}
