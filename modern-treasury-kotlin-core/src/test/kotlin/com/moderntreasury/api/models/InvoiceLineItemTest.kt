// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLineItemTest {

    @Test
    fun create() {
        val invoiceLineItem =
            InvoiceLineItem.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .direction("direction")
                .liveMode(true)
                .metadata(
                    InvoiceLineItem.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .object_("object")
                .quantity(0L)
                .unitAmount(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(invoiceLineItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(invoiceLineItem.amount()).isEqualTo(0L)
        assertThat(invoiceLineItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(invoiceLineItem.description()).isEqualTo("description")
        assertThat(invoiceLineItem.direction()).isEqualTo("direction")
        assertThat(invoiceLineItem.liveMode()).isEqualTo(true)
        assertThat(invoiceLineItem.metadata())
            .isEqualTo(
                InvoiceLineItem.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(invoiceLineItem.name()).isEqualTo("name")
        assertThat(invoiceLineItem.object_()).isEqualTo("object")
        assertThat(invoiceLineItem.quantity()).isEqualTo(0L)
        assertThat(invoiceLineItem.unitAmount()).isEqualTo(0L)
        assertThat(invoiceLineItem.unitAmountDecimal()).isEqualTo("unit_amount_decimal")
        assertThat(invoiceLineItem.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceLineItem =
            InvoiceLineItem.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .direction("direction")
                .liveMode(true)
                .metadata(
                    InvoiceLineItem.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .object_("object")
                .quantity(0L)
                .unitAmount(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedInvoiceLineItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceLineItem),
                jacksonTypeRef<InvoiceLineItem>(),
            )

        assertThat(roundtrippedInvoiceLineItem).isEqualTo(invoiceLineItem)
    }
}
