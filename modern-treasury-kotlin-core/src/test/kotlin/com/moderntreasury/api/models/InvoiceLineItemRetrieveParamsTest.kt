// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceLineItemRetrieveParamsTest {

    @Test
    fun create() {
        InvoiceLineItemRetrieveParams.builder().invoiceId("invoice_id").id("id").build()
    }

    @Test
    fun pathParams() {
        val params =
            InvoiceLineItemRetrieveParams.builder().invoiceId("invoice_id").id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("invoice_id")
        assertThat(params._pathParam(1)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
