// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLineItemUpdateParamsTest {

    @Test
    fun create() {
        InvoiceLineItemUpdateParams.builder()
            .invoiceId("invoice_id")
            .id("id")
            .description("description")
            .direction("direction")
            .metadata(
                InvoiceLineItemUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .name("name")
            .quantity(0L)
            .unitAmount(0L)
            .unitAmountDecimal("unit_amount_decimal")
            .build()
    }

    @Test
    fun body() {
        val params =
            InvoiceLineItemUpdateParams.builder()
                .invoiceId("invoice_id")
                .id("id")
                .description("description")
                .direction("direction")
                .metadata(
                    InvoiceLineItemUpdateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .quantity(0L)
                .unitAmount(0L)
                .unitAmountDecimal("unit_amount_decimal")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.direction()).isEqualTo("direction")
        assertThat(body.metadata())
            .isEqualTo(
                InvoiceLineItemUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.quantity()).isEqualTo(0L)
        assertThat(body.unitAmount()).isEqualTo(0L)
        assertThat(body.unitAmountDecimal()).isEqualTo("unit_amount_decimal")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InvoiceLineItemUpdateParams.builder().invoiceId("invoice_id").id("id").build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params = InvoiceLineItemUpdateParams.builder().invoiceId("invoice_id").id("id").build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("invoice_id")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
