// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import kotlin.test.assertNotNull
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
    fun body() {
        val params =
            PaymentFlowUpdateParams.builder()
                .id("id")
                .status(PaymentFlowUpdateParams.Status.CANCELLED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.status()).isEqualTo(PaymentFlowUpdateParams.Status.CANCELLED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentFlowUpdateParams.builder()
                .id("id")
                .status(PaymentFlowUpdateParams.Status.CANCELLED)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.status()).isEqualTo(PaymentFlowUpdateParams.Status.CANCELLED)
    }

    @Test
    fun getPathParam() {
        val params =
            PaymentFlowUpdateParams.builder()
                .id("id")
                .status(PaymentFlowUpdateParams.Status.CANCELLED)
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
