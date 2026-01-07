// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldListResponseTest {

    @Test
    fun create() {
        val holdListResponse =
            HoldListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(HoldListResponse.Object.HOLD)
                .status(HoldListResponse.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldListResponse.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    HoldListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(holdListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(holdListResponse.object_()).isEqualTo(HoldListResponse.Object.HOLD)
        assertThat(holdListResponse.status()).isEqualTo(HoldListResponse.Status.ACTIVE)
        assertThat(holdListResponse.targetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdListResponse.targetType())
            .isEqualTo(HoldListResponse.TargetType.PAYMENT_ORDER)
        assertThat(holdListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(holdListResponse.liveMode()).isEqualTo(true)
        assertThat(holdListResponse.metadata())
            .isEqualTo(
                HoldListResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(holdListResponse.reason()).isEqualTo("reason")
        assertThat(holdListResponse.resolution()).isEqualTo("resolution")
        assertThat(holdListResponse.resolvedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val holdListResponse =
            HoldListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(HoldListResponse.Object.HOLD)
                .status(HoldListResponse.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldListResponse.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    HoldListResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedHoldListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(holdListResponse),
                jacksonTypeRef<HoldListResponse>(),
            )

        assertThat(roundtrippedHoldListResponse).isEqualTo(holdListResponse)
    }
}
