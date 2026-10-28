// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LineItemRequestTest {

    @Test
    fun create() {
        val lineItemRequest =
            LineItemRequest.builder()
                .amount(0L)
                .accountingCategoryId("accounting_category_id")
                .description("description")
                .metadata(
                    LineItemRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        assertThat(lineItemRequest.amount()).isEqualTo(0L)
        assertThat(lineItemRequest.accountingCategoryId()).isEqualTo("accounting_category_id")
        assertThat(lineItemRequest.description()).isEqualTo("description")
        assertThat(lineItemRequest.metadata())
            .isEqualTo(
                LineItemRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lineItemRequest =
            LineItemRequest.builder()
                .amount(0L)
                .accountingCategoryId("accounting_category_id")
                .description("description")
                .metadata(
                    LineItemRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val roundtrippedLineItemRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lineItemRequest),
                jacksonTypeRef<LineItemRequest>(),
            )

        assertThat(roundtrippedLineItemRequest).isEqualTo(lineItemRequest)
    }
}
