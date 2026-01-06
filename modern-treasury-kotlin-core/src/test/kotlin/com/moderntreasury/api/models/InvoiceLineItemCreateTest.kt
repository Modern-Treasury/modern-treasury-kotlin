// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLineItemCreateTest {

    @Test
    fun create() {
        val invoiceLineItemCreate =
            InvoiceLineItemCreate.builder()
                .name("name")
                .unitAmount(0L)
                .description("description")
                .direction("direction")
                .metadata(
                    InvoiceLineItemCreate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .quantity(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .build()

        assertThat(invoiceLineItemCreate.name()).isEqualTo("name")
        assertThat(invoiceLineItemCreate.unitAmount()).isEqualTo(0L)
        assertThat(invoiceLineItemCreate.description()).isEqualTo("description")
        assertThat(invoiceLineItemCreate.direction()).isEqualTo("direction")
        assertThat(invoiceLineItemCreate.metadata())
            .isEqualTo(
                InvoiceLineItemCreate.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(invoiceLineItemCreate.quantity()).isEqualTo(0L)
        assertThat(invoiceLineItemCreate.unitAmountDecimal()).isEqualTo("unit_amount_decimal")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceLineItemCreate =
            InvoiceLineItemCreate.builder()
                .name("name")
                .unitAmount(0L)
                .description("description")
                .direction("direction")
                .metadata(
                    InvoiceLineItemCreate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .quantity(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .build()

        val roundtrippedInvoiceLineItemCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceLineItemCreate),
                jacksonTypeRef<InvoiceLineItemCreate>(),
            )

        assertThat(roundtrippedInvoiceLineItemCreate).isEqualTo(invoiceLineItemCreate)
    }
}
