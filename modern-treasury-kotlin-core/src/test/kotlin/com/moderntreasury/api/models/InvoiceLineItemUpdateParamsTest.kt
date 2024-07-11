// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemUpdateParamsTest {

    @Test
    fun createInvoiceLineItemUpdateParams() {
        InvoiceLineItemUpdateParams.builder()
            .invoiceId("invoice_id")
            .id("id")
            .description("description")
            .direction("direction")
            .metadata(InvoiceLineItemUpdateParams.Metadata.builder().build())
            .name("name")
            .quantity(123L)
            .unitAmount(123L)
            .unitAmountDecimal("unit_amount_decimal")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceLineItemUpdateParams.builder()
                .invoiceId("invoice_id")
                .id("id")
                .description("description")
                .direction("direction")
                .metadata(InvoiceLineItemUpdateParams.Metadata.builder().build())
                .name("name")
                .quantity(123L)
                .unitAmount(123L)
                .unitAmountDecimal("unit_amount_decimal")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.direction()).isEqualTo("direction")
        assertThat(body.metadata())
            .isEqualTo(InvoiceLineItemUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.quantity()).isEqualTo(123L)
        assertThat(body.unitAmount()).isEqualTo(123L)
        assertThat(body.unitAmountDecimal()).isEqualTo("unit_amount_decimal")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InvoiceLineItemUpdateParams.builder().invoiceId("invoice_id").id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
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
