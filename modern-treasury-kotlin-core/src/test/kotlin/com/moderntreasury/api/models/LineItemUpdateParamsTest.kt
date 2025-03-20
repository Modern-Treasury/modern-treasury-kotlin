// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LineItemUpdateParamsTest {

    @Test
    fun create() {
        LineItemUpdateParams.builder()
            .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
            .itemizableId("itemizable_id")
            .id("id")
            .metadata(
                LineItemUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LineItemUpdateParams.builder()
                .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .id("id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("expected_payments")
        assertThat(params._pathParam(1)).isEqualTo("itemizable_id")
        assertThat(params._pathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LineItemUpdateParams.builder()
                .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .id("id")
                .metadata(
                    LineItemUpdateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.metadata())
            .isEqualTo(
                LineItemUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LineItemUpdateParams.builder()
                .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .id("id")
                .build()

        val body = params._body()
    }
}
