// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvoiceAddPaymentOrderParamsTest {

    @Test
    fun create() {
        InvoiceAddPaymentOrderParams.builder().id("id").paymentOrderId("payment_order_id").build()
    }

    @Test
    fun getPathParam() {
        val params =
            InvoiceAddPaymentOrderParams.builder()
                .id("id")
                .paymentOrderId("payment_order_id")
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // path param "paymentOrderId"
        assertThat(params.getPathParam(1)).isEqualTo("payment_order_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
