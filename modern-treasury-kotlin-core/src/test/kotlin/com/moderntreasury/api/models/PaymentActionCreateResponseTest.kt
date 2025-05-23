// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentActionCreateResponseTest {

    @Test
    fun create() {
        val paymentActionCreateResponse =
            PaymentActionCreateResponse.builder()
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

        assertThat(paymentActionCreateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionCreateResponse.actionableId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionCreateResponse.actionableType()).isEqualTo("actionable_type")
        assertThat(paymentActionCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentActionCreateResponse._details())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentActionCreateResponse.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionCreateResponse.liveMode()).isEqualTo(true)
        assertThat(paymentActionCreateResponse.object_()).isEqualTo("object")
        assertThat(paymentActionCreateResponse.status()).isEqualTo("status")
        assertThat(paymentActionCreateResponse.type()).isEqualTo("type")
        assertThat(paymentActionCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentActionCreateResponse =
            PaymentActionCreateResponse.builder()
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

        val roundtrippedPaymentActionCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentActionCreateResponse),
                jacksonTypeRef<PaymentActionCreateResponse>(),
            )

        assertThat(roundtrippedPaymentActionCreateResponse).isEqualTo(paymentActionCreateResponse)
    }
}
