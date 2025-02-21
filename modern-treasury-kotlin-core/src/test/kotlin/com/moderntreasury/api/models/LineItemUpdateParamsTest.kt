// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LineItemUpdateParamsTest {

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
        assertNotNull(body)
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
        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            LineItemUpdateParams.builder()
                .itemizableType(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .id("id")
                .build()
        assertThat(params).isNotNull
        // path param "itemizableType"
        assertThat(params.getPathParam(0))
            .isEqualTo(LineItemUpdateParams.ItemizableType.EXPECTED_PAYMENTS.toString())
        // path param "itemizableId"
        assertThat(params.getPathParam(1)).isEqualTo("itemizable_id")
        // path param "id"
        assertThat(params.getPathParam(2)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(3)).isEqualTo("")
    }
}
