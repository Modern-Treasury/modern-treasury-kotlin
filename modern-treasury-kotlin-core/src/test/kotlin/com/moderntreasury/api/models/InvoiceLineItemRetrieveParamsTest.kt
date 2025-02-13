// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemRetrieveParamsTest {

    @Test
    fun create() {
        InvoiceLineItemRetrieveParams.builder().invoiceId("invoice_id").id("id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            InvoiceLineItemRetrieveParams.builder().invoiceId("invoice_id").id("id").build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("invoice_id")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
