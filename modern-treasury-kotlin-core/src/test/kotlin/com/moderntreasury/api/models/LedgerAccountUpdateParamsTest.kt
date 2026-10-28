// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountUpdateParamsTest {

    @Test
    fun create() {
        LedgerAccountUpdateParams.builder()
            .id("id")
            .ledgerAccountUpdateRequest(
                LedgerAccountUpdateRequest.builder()
                    .description("description")
                    .externalId("external_id")
                    .metadata(
                        LedgerAccountUpdateRequest.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = LedgerAccountUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            LedgerAccountUpdateParams.builder()
                .id("id")
                .ledgerAccountUpdateRequest(
                    LedgerAccountUpdateRequest.builder()
                        .description("description")
                        .externalId("external_id")
                        .metadata(
                            LedgerAccountUpdateRequest.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                LedgerAccountUpdateRequest.builder()
                    .description("description")
                    .externalId("external_id")
                    .metadata(
                        LedgerAccountUpdateRequest.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = LedgerAccountUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
