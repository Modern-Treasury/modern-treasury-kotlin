// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentActionUpdateParamsTest {

    @Test
    fun create() {
        PaymentActionUpdateParams.builder()
            .id("id")
            .status(PaymentActionUpdateParams.Status.PENDING)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PaymentActionUpdateParams.builder()
                .id("id")
                .status(PaymentActionUpdateParams.Status.PENDING)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PaymentActionUpdateParams.builder()
                .id("id")
                .status(PaymentActionUpdateParams.Status.PENDING)
                .build()

        val body = params._body()

        assertThat(body.status()).isEqualTo(PaymentActionUpdateParams.Status.PENDING)
    }
}
