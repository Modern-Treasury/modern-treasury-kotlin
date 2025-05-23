// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentActionRetrieveResponseTest {

    @Test
    fun create() {
        val paymentActionRetrieveResponse =
            PaymentActionRetrieveResponse.builder()
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

        assertThat(paymentActionRetrieveResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionRetrieveResponse.actionableId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionRetrieveResponse.actionableType()).isEqualTo("actionable_type")
        assertThat(paymentActionRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentActionRetrieveResponse._details())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentActionRetrieveResponse.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentActionRetrieveResponse.liveMode()).isEqualTo(true)
        assertThat(paymentActionRetrieveResponse.object_()).isEqualTo("object")
        assertThat(paymentActionRetrieveResponse.status()).isEqualTo("status")
        assertThat(paymentActionRetrieveResponse.type()).isEqualTo("type")
        assertThat(paymentActionRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentActionRetrieveResponse =
            PaymentActionRetrieveResponse.builder()
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

        val roundtrippedPaymentActionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentActionRetrieveResponse),
                jacksonTypeRef<PaymentActionRetrieveResponse>(),
            )

        assertThat(roundtrippedPaymentActionRetrieveResponse)
            .isEqualTo(paymentActionRetrieveResponse)
    }
}
