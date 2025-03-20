// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentFlowUpdateParamsTest {

    @Test
    fun create() {
        PaymentFlowUpdateParams.builder()
            .id("id")
            .status(PaymentFlowUpdateParams.Status.CANCELLED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentFlowUpdateParams.builder()
                .id("id")
                .status(PaymentFlowUpdateParams.Status.CANCELLED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PaymentFlowUpdateParams.builder()
                .id("id")
                .status(PaymentFlowUpdateParams.Status.CANCELLED)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(PaymentFlowUpdateParams.Status.CANCELLED)
    }
}
