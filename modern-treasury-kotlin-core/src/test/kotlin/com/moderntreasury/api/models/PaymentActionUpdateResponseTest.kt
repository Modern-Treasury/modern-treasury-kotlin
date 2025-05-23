// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentActionUpdateResponseTest {

    @Test
    fun create() {
        val paymentActionUpdateResponse =
            PaymentActionUpdateResponse.builder()
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

        assertThat(paymentActionUpdateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionUpdateResponse.actionableId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionUpdateResponse.actionableType()).isEqualTo("actionable_type")
        assertThat(paymentActionUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentActionUpdateResponse._details())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentActionUpdateResponse.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionUpdateResponse.liveMode()).isEqualTo(true)
        assertThat(paymentActionUpdateResponse.object_()).isEqualTo("object")
        assertThat(paymentActionUpdateResponse.status()).isEqualTo("status")
        assertThat(paymentActionUpdateResponse.type()).isEqualTo("type")
        assertThat(paymentActionUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentActionUpdateResponse =
            PaymentActionUpdateResponse.builder()
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

        val roundtrippedPaymentActionUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentActionUpdateResponse),
                jacksonTypeRef<PaymentActionUpdateResponse>(),
            )

        assertThat(roundtrippedPaymentActionUpdateResponse).isEqualTo(paymentActionUpdateResponse)
    }
}
