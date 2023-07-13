package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderReversalRetrieveParamsTest {

    @Test
    fun createPaymentOrderReversalRetrieveParams() {
        PaymentOrderReversalRetrieveParams.builder()
            .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .reversalId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            PaymentOrderReversalRetrieveParams.builder()
                .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reversalId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(params).isNotNull
        // path param "paymentOrderId"
        assertThat(params.getPathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // path param "reversalId"
        assertThat(params.getPathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
