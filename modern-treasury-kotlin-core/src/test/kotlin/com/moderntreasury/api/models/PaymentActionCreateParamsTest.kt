// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentActionCreateParamsTest {

    @Test
    fun create() {
        PaymentActionCreateParams.builder()
            .type("type")
            .actionableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .actionableType("actionable_type")
            .details(JsonValue.from(mapOf<String, Any>()))
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentActionCreateParams.builder()
                .type("type")
                .actionableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actionableType("actionable_type")
                .details(JsonValue.from(mapOf<String, Any>()))
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo("type")
        assertThat(body.actionableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.actionableType()).isEqualTo("actionable_type")
        assertThat(body._details()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PaymentActionCreateParams.builder().type("type").build()

        val body = params._body()

        assertThat(body.type()).isEqualTo("type")
    }
}
