// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldCreateResponseTest {

    @Test
    fun create() {
        val holdCreateResponse =
            HoldCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(HoldCreateResponse.Object.HOLD)
                .status(HoldCreateResponse.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldCreateResponse.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    HoldCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(holdCreateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(holdCreateResponse.object_()).isEqualTo(HoldCreateResponse.Object.HOLD)
        assertThat(holdCreateResponse.status()).isEqualTo(HoldCreateResponse.Status.ACTIVE)
        assertThat(holdCreateResponse.targetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdCreateResponse.targetType())
            .isEqualTo(HoldCreateResponse.TargetType.PAYMENT_ORDER)
        assertThat(holdCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(holdCreateResponse.liveMode()).isEqualTo(true)
        assertThat(holdCreateResponse.metadata())
            .isEqualTo(
                HoldCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(holdCreateResponse.reason()).isEqualTo("reason")
        assertThat(holdCreateResponse.resolution()).isEqualTo("resolution")
        assertThat(holdCreateResponse.resolvedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val holdCreateResponse =
            HoldCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(HoldCreateResponse.Object.HOLD)
                .status(HoldCreateResponse.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldCreateResponse.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    HoldCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedHoldCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(holdCreateResponse),
                jacksonTypeRef<HoldCreateResponse>(),
            )

        assertThat(roundtrippedHoldCreateResponse).isEqualTo(holdCreateResponse)
    }
}
