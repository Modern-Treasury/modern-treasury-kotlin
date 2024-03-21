// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemCreateParamsTest {

    @Test
    fun createInvoiceLineItemCreateParams() {
        InvoiceLineItemCreateParams.builder()
            .invoiceId("string")
            .name("string")
            .unitAmount(123L)
            .description("string")
            .direction("string")
            .metadata(InvoiceLineItemCreateParams.Metadata.builder().build())
            .quantity(123L)
            .unitAmountDecimal("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .invoiceId("string")
                .name("string")
                .unitAmount(123L)
                .description("string")
                .direction("string")
                .metadata(InvoiceLineItemCreateParams.Metadata.builder().build())
                .quantity(123L)
                .unitAmountDecimal("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.unitAmount()).isEqualTo(123L)
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.direction()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(InvoiceLineItemCreateParams.Metadata.builder().build())
        assertThat(body.quantity()).isEqualTo(123L)
        assertThat(body.unitAmountDecimal()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .invoiceId("string")
                .name("string")
                .unitAmount(123L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.unitAmount()).isEqualTo(123L)
    }

    @Test
    fun getPathParam() {
        val params =
            InvoiceLineItemCreateParams.builder()
                .invoiceId("string")
                .name("string")
                .unitAmount(123L)
                .build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
