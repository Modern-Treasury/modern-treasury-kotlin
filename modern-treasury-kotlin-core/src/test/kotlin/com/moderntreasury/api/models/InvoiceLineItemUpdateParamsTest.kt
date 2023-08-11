package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemUpdateParamsTest {

    @Test
    fun createInvoiceLineItemUpdateParams() {
        InvoiceLineItemUpdateParams.builder()
            .invoiceId("string")
            .id("string")
            .name("string")
            .description("string")
            .quantity(123L)
            .unitAmount(123L)
            .direction("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceLineItemUpdateParams.builder()
                .invoiceId("string")
                .id("string")
                .name("string")
                .description("string")
                .quantity(123L)
                .unitAmount(123L)
                .direction("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.quantity()).isEqualTo(123L)
        assertThat(body.unitAmount()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = InvoiceLineItemUpdateParams.builder().invoiceId("string").id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = InvoiceLineItemUpdateParams.builder().invoiceId("string").id("string").build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
