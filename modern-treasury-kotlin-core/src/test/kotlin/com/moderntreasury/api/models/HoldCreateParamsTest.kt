// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldCreateParamsTest {

    @Test
    fun create() {
        HoldCreateParams.builder()
            .status(HoldCreateParams.Status.ACTIVE)
            .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .targetType(HoldCreateParams.TargetType.PAYMENT_ORDER)
            .metadata(
                HoldCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .reason("reason")
            .build()
    }

    @Test
    fun body() {
        val params =
            HoldCreateParams.builder()
                .status(HoldCreateParams.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldCreateParams.TargetType.PAYMENT_ORDER)
                .metadata(
                    HoldCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .reason("reason")
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(HoldCreateParams.Status.ACTIVE)
        assertThat(body.targetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.targetType()).isEqualTo(HoldCreateParams.TargetType.PAYMENT_ORDER)
        assertThat(body.metadata())
            .isEqualTo(
                HoldCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.reason()).isEqualTo("reason")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            HoldCreateParams.builder()
                .status(HoldCreateParams.Status.ACTIVE)
                .targetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .targetType(HoldCreateParams.TargetType.PAYMENT_ORDER)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(HoldCreateParams.Status.ACTIVE)
        assertThat(body.targetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.targetType()).isEqualTo(HoldCreateParams.TargetType.PAYMENT_ORDER)
    }
}
