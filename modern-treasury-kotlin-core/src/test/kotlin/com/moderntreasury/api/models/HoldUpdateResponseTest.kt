// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldUpdateResponseTest {

    @Test
    fun create() {
        val holdUpdateResponse =
            HoldUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(HoldUpdateResponse.Object.HOLD)
                .status(HoldUpdateResponse.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldUpdateResponse.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    HoldUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(holdUpdateResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(holdUpdateResponse.object_()).isEqualTo(HoldUpdateResponse.Object.HOLD)
        assertThat(holdUpdateResponse.status()).isEqualTo(HoldUpdateResponse.Status.ACTIVE)
        assertThat(holdUpdateResponse.targetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdUpdateResponse.targetType())
            .isEqualTo(HoldUpdateResponse.TargetType.PAYMENT_ORDER)
        assertThat(holdUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(holdUpdateResponse.liveMode()).isEqualTo(true)
        assertThat(holdUpdateResponse.metadata())
            .isEqualTo(
                HoldUpdateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(holdUpdateResponse.reason()).isEqualTo("reason")
        assertThat(holdUpdateResponse.resolution()).isEqualTo("resolution")
        assertThat(holdUpdateResponse.resolvedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val holdUpdateResponse =
            HoldUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(HoldUpdateResponse.Object.HOLD)
                .status(HoldUpdateResponse.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldUpdateResponse.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    HoldUpdateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedHoldUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(holdUpdateResponse),
                jacksonTypeRef<HoldUpdateResponse>(),
            )

        assertThat(roundtrippedHoldUpdateResponse).isEqualTo(holdUpdateResponse)
    }
}
