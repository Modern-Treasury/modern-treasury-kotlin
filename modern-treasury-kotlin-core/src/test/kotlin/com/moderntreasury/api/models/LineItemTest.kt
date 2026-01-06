// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LineItemTest {

    @Test
    fun create() {
        val lineItem =
            LineItem.builder()
                .amount(0L)
                .accountingCategoryId("accounting_category_id")
                .description("description")
                .metadata(
                    LineItem.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        assertThat(lineItem.amount()).isEqualTo(0L)
        assertThat(lineItem.accountingCategoryId()).isEqualTo("accounting_category_id")
        assertThat(lineItem.description()).isEqualTo("description")
        assertThat(lineItem.metadata())
            .isEqualTo(
                LineItem.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lineItem =
            LineItem.builder()
                .amount(0L)
                .accountingCategoryId("accounting_category_id")
                .description("description")
                .metadata(
                    LineItem.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()

        val roundtrippedLineItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lineItem),
                jacksonTypeRef<LineItem>(),
            )

        assertThat(roundtrippedLineItem).isEqualTo(lineItem)
    }
}
