// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentOrderReversalRetrieveParamsTest {

    @Test
    fun create() {
        PaymentOrderReversalRetrieveParams.builder()
            .paymentOrderId("payment_order_id")
            .reversalId("reversal_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentOrderReversalRetrieveParams.builder()
                .paymentOrderId("payment_order_id")
                .reversalId("reversal_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("payment_order_id")
        assertThat(params._pathParam(1)).isEqualTo("reversal_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
