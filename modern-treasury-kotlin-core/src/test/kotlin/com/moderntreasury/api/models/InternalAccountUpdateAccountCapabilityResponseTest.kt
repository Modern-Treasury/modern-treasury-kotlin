// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountUpdateAccountCapabilityResponseTest {

    @Test
    fun create() {
        val internalAccountUpdateAccountCapabilityResponse =
            InternalAccountUpdateAccountCapabilityResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(TransactionDirection.CREDIT)
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .identifier("identifier")
                .liveMode(true)
                .object_("object")
                .paymentType(InternalAccountUpdateAccountCapabilityResponse.PaymentType.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(internalAccountUpdateAccountCapabilityResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(internalAccountUpdateAccountCapabilityResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(internalAccountUpdateAccountCapabilityResponse.direction())
            .isEqualTo(TransactionDirection.CREDIT)
        assertThat(internalAccountUpdateAccountCapabilityResponse.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(internalAccountUpdateAccountCapabilityResponse.identifier())
            .isEqualTo("identifier")
        assertThat(internalAccountUpdateAccountCapabilityResponse.liveMode()).isEqualTo(true)
        assertThat(internalAccountUpdateAccountCapabilityResponse.object_()).isEqualTo("object")
        assertThat(internalAccountUpdateAccountCapabilityResponse.paymentType())
            .isEqualTo(InternalAccountUpdateAccountCapabilityResponse.PaymentType.ACH)
        assertThat(internalAccountUpdateAccountCapabilityResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalAccountUpdateAccountCapabilityResponse =
            InternalAccountUpdateAccountCapabilityResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .direction(TransactionDirection.CREDIT)
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .identifier("identifier")
                .liveMode(true)
                .object_("object")
                .paymentType(InternalAccountUpdateAccountCapabilityResponse.PaymentType.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedInternalAccountUpdateAccountCapabilityResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalAccountUpdateAccountCapabilityResponse),
                jacksonTypeRef<InternalAccountUpdateAccountCapabilityResponse>(),
            )

        assertThat(roundtrippedInternalAccountUpdateAccountCapabilityResponse)
            .isEqualTo(internalAccountUpdateAccountCapabilityResponse)
    }
}
