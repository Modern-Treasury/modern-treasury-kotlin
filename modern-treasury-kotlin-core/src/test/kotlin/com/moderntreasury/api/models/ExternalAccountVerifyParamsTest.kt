// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountVerifyParamsTest {

    @Test
    fun createExternalAccountVerifyParams() {
        ExternalAccountVerifyParams.builder()
            .id("id")
            .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
            .currency(Currency.AED)
            .fallbackType(ExternalAccountVerifyParams.FallbackType.ACH)
            .priority(ExternalAccountVerifyParams.Priority.HIGH)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalAccountVerifyParams.builder()
                .id("id")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
                .currency(Currency.AED)
                .fallbackType(ExternalAccountVerifyParams.FallbackType.ACH)
                .priority(ExternalAccountVerifyParams.Priority.HIGH)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentType()).isEqualTo(ExternalAccountVerifyParams.PaymentType.ACH)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.fallbackType()).isEqualTo(ExternalAccountVerifyParams.FallbackType.ACH)
        assertThat(body.priority()).isEqualTo(ExternalAccountVerifyParams.Priority.HIGH)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExternalAccountVerifyParams.builder()
                .id("id")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentType()).isEqualTo(ExternalAccountVerifyParams.PaymentType.ACH)
    }

    @Test
    fun getPathParam() {
        val params =
            ExternalAccountVerifyParams.builder()
                .id("id")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentType(ExternalAccountVerifyParams.PaymentType.ACH)
                .build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
