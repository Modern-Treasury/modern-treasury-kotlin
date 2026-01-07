// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentActionListResponseTest {

    @Test
    fun create() {
        val paymentActionListResponse =
            PaymentActionListResponse.builder()
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

        assertThat(paymentActionListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionListResponse.actionableId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionListResponse.actionableType()).isEqualTo("actionable_type")
        assertThat(paymentActionListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentActionListResponse._details())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentActionListResponse.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionListResponse.liveMode()).isEqualTo(true)
        assertThat(paymentActionListResponse.object_()).isEqualTo("object")
        assertThat(paymentActionListResponse.status()).isEqualTo("status")
        assertThat(paymentActionListResponse.type()).isEqualTo("type")
        assertThat(paymentActionListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentActionListResponse =
            PaymentActionListResponse.builder()
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

        val roundtrippedPaymentActionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentActionListResponse),
                jacksonTypeRef<PaymentActionListResponse>(),
            )

        assertThat(roundtrippedPaymentActionListResponse).isEqualTo(paymentActionListResponse)
    }
}
