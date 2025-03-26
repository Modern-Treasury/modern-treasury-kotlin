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
    fun pathParams() {
        val params =
            InvoiceAddPaymentOrderParams.builder()
                .id("id")
                .paymentOrderId("payment_order_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        assertThat(params._pathParam(1)).isEqualTo("payment_order_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
