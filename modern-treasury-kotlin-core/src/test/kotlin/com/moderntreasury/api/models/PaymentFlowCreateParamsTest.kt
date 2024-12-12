// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentFlowCreateParamsTest {

    @Test
    fun createPaymentFlowCreateParams() {
        PaymentFlowCreateParams.builder()
            .amount(0L)
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .currency("currency")
            .direction(PaymentFlowCreateParams.Direction.CREDIT)
            .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dueDate(LocalDate.parse("2019-12-27"))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PaymentFlowCreateParams.builder()
                .amount(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency("currency")
                .direction(PaymentFlowCreateParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dueDate(LocalDate.parse("2019-12-27"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.direction()).isEqualTo(PaymentFlowCreateParams.Direction.CREDIT)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.dueDate()).isEqualTo(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentFlowCreateParams.builder()
                .amount(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency("currency")
                .direction(PaymentFlowCreateParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.direction()).isEqualTo(PaymentFlowCreateParams.Direction.CREDIT)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
