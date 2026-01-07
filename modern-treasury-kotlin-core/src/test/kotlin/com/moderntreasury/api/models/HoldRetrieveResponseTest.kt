// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldRetrieveResponseTest {

    @Test
    fun create() {
        val holdRetrieveResponse =
            HoldRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(HoldRetrieveResponse.Object.HOLD)
                .status(HoldRetrieveResponse.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldRetrieveResponse.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    HoldRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(holdRetrieveResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(holdRetrieveResponse.object_()).isEqualTo(HoldRetrieveResponse.Object.HOLD)
        assertThat(holdRetrieveResponse.status()).isEqualTo(HoldRetrieveResponse.Status.ACTIVE)
        assertThat(holdRetrieveResponse.targetId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(holdRetrieveResponse.targetType())
            .isEqualTo(HoldRetrieveResponse.TargetType.PAYMENT_ORDER)
        assertThat(holdRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(holdRetrieveResponse.liveMode()).isEqualTo(true)
        assertThat(holdRetrieveResponse.metadata())
            .isEqualTo(
                HoldRetrieveResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(holdRetrieveResponse.reason()).isEqualTo("reason")
        assertThat(holdRetrieveResponse.resolution()).isEqualTo("resolution")
        assertThat(holdRetrieveResponse.resolvedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val holdRetrieveResponse =
            HoldRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(HoldRetrieveResponse.Object.HOLD)
                .status(HoldRetrieveResponse.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldRetrieveResponse.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    HoldRetrieveResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedHoldRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(holdRetrieveResponse),
                jacksonTypeRef<HoldRetrieveResponse>(),
            )

        assertThat(roundtrippedHoldRetrieveResponse).isEqualTo(holdRetrieveResponse)
    }
}
