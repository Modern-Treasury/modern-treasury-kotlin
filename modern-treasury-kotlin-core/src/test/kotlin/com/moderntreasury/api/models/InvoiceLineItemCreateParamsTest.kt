// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemCreateParamsTest {

    @Test
    fun createInvoiceLineItemCreateParams() {
        InvoiceLineItemCreateParams.builder()
            .invoiceId("invoice_id")
            .name("name")
            .unitAmount(0L)
            .description("description")
            .direction("direction")
            .metadata(
                InvoiceLineItemCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .quantity(0L)
            .unitAmountDecimal("unit_amount_decimal")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .invoiceId("invoice_id")
                .name("name")
                .unitAmount(0L)
                .description("description")
                .direction("direction")
                .metadata(
                    InvoiceLineItemCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .quantity(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.unitAmount()).isEqualTo(0L)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.direction()).isEqualTo("direction")
        assertThat(body.metadata())
            .isEqualTo(
                InvoiceLineItemCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.quantity()).isEqualTo(0L)
        assertThat(body.unitAmountDecimal()).isEqualTo("unit_amount_decimal")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .invoiceId("invoice_id")
                .name("name")
                .unitAmount(0L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.unitAmount()).isEqualTo(0L)
    }

    @Test
    fun getPathParam() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .invoiceId("invoice_id")
                .name("name")
                .unitAmount(0L)
                .build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("invoice_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
