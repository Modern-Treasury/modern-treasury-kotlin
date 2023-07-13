package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InvoiceLineItemRetrieveParamsTest {

    @Test
    fun createInvoiceLineItemRetrieveParams() {
        InvoiceLineItemRetrieveParams.builder().invoiceId("string").id("string").build()
    }

    @Test
    fun getPathParam() {
        val params =
            InvoiceLineItemRetrieveParams.builder().invoiceId("string").id("string").build()
        assertThat(params).isNotNull
        // path param "invoiceId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // path param "id"
        assertThat(params.getPathParam(1)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
