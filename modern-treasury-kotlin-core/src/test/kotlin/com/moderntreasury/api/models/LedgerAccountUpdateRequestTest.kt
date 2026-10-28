// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountUpdateRequestTest {

    @Test
    fun create() {
        val ledgerAccountUpdateRequest =
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

        assertThat(ledgerAccountUpdateRequest.description()).isEqualTo("description")
        assertThat(ledgerAccountUpdateRequest.externalId()).isEqualTo("external_id")
        assertThat(ledgerAccountUpdateRequest.metadata())
            .isEqualTo(
                LedgerAccountUpdateRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerAccountUpdateRequest.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerAccountUpdateRequest =
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

        val roundtrippedLedgerAccountUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerAccountUpdateRequest),
                jacksonTypeRef<LedgerAccountUpdateRequest>(),
            )

        assertThat(roundtrippedLedgerAccountUpdateRequest).isEqualTo(ledgerAccountUpdateRequest)
    }
}
