// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldTest {

    @Test
    fun create() {
        val hold =
            Hold.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(Hold.Object.HOLD)
                .status(Hold.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(Hold.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    Hold.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(hold.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(hold.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hold.object_()).isEqualTo(Hold.Object.HOLD)
        assertThat(hold.status()).isEqualTo(Hold.Status.ACTIVE)
        assertThat(hold.targetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(hold.targetType()).isEqualTo(Hold.TargetType.PAYMENT_ORDER)
        assertThat(hold.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hold.liveMode()).isEqualTo(true)
        assertThat(hold.metadata())
            .isEqualTo(
                Hold.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(hold.reason()).isEqualTo("reason")
        assertThat(hold.resolution()).isEqualTo("resolution")
        assertThat(hold.resolvedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hold =
            Hold.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .object_(Hold.Object.HOLD)
                .status(Hold.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(Hold.TargetType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .metadata(
                    Hold.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .resolution("resolution")
                .resolvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedHold =
            jsonMapper.readValue(jsonMapper.writeValueAsString(hold), jacksonTypeRef<Hold>())

        assertThat(roundtrippedHold).isEqualTo(hold)
    }
}
