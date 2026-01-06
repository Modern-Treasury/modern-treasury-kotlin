// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentActionTest {

    @Test
    fun create() {
        val paymentAction =
            PaymentAction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actionableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actionableType("actionable_type")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .details(JsonValue.from(mapOf<String, Any>()))
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .status("status")
                .type("type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(paymentAction.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentAction.actionableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentAction.actionableType()).isEqualTo("actionable_type")
        assertThat(paymentAction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentAction._details()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentAction.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentAction.liveMode()).isEqualTo(true)
        assertThat(paymentAction.object_()).isEqualTo("object")
        assertThat(paymentAction.status()).isEqualTo("status")
        assertThat(paymentAction.type()).isEqualTo("type")
        assertThat(paymentAction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentAction =
            PaymentAction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actionableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .actionableType("actionable_type")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .details(JsonValue.from(mapOf<String, Any>()))
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .status("status")
                .type("type")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPaymentAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentAction),
                jacksonTypeRef<PaymentAction>(),
            )

        assertThat(roundtrippedPaymentAction).isEqualTo(paymentAction)
    }
}
