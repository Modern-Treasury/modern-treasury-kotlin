// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerUpdateParamsTest {

    @Test
    fun create() {
        LedgerUpdateParams.builder()
            .id("id")
            .description("description")
            .metadata(
                LedgerUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params = LedgerUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LedgerUpdateParams.builder()
                .id("id")
                .description("description")
                .metadata(
                    LedgerUpdateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.metadata())
            .isEqualTo(
                LedgerUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LedgerUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
