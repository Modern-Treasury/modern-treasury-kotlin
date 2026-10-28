// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLineItemCreateRequestTest {

    @Test
    fun create() {
        val invoiceLineItemCreateRequest =
            InvoiceLineItemCreateRequest.builder()
                .name("name")
                .unitAmount(0L)
                .description("description")
                .direction("direction")
                .metadata(
                    InvoiceLineItemCreateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .quantity(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .build()

        assertThat(invoiceLineItemCreateRequest.name()).isEqualTo("name")
        assertThat(invoiceLineItemCreateRequest.unitAmount()).isEqualTo(0L)
        assertThat(invoiceLineItemCreateRequest.description()).isEqualTo("description")
        assertThat(invoiceLineItemCreateRequest.direction()).isEqualTo("direction")
        assertThat(invoiceLineItemCreateRequest.metadata())
            .isEqualTo(
                InvoiceLineItemCreateRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(invoiceLineItemCreateRequest.quantity()).isEqualTo(0L)
        assertThat(invoiceLineItemCreateRequest.unitAmountDecimal())
            .isEqualTo("unit_amount_decimal")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invoiceLineItemCreateRequest =
            InvoiceLineItemCreateRequest.builder()
                .name("name")
                .unitAmount(0L)
                .description("description")
                .direction("direction")
                .metadata(
                    InvoiceLineItemCreateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .quantity(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .build()

        val roundtrippedInvoiceLineItemCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invoiceLineItemCreateRequest),
                jacksonTypeRef<InvoiceLineItemCreateRequest>(),
            )

        assertThat(roundtrippedInvoiceLineItemCreateRequest).isEqualTo(invoiceLineItemCreateRequest)
    }
}
