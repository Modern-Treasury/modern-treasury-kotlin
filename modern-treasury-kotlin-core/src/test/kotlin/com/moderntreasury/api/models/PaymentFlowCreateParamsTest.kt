// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentFlowCreateParamsTest {

    @Test
    fun create() {
        PaymentFlowCreateParams.builder()
            .paymentFlowCreateRequest(
                PaymentFlowCreateRequest.builder()
                    .amount(0L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency("currency")
                    .direction(PaymentFlowCreateRequest.Direction.CREDIT)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dueDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentFlowCreateParams.builder()
                .paymentFlowCreateRequest(
                    PaymentFlowCreateRequest.builder()
                        .amount(0L)
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency("currency")
                        .direction(PaymentFlowCreateRequest.Direction.CREDIT)
                        .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .dueDate(LocalDate.parse("2019-12-27"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PaymentFlowCreateRequest.builder()
                    .amount(0L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency("currency")
                    .direction(PaymentFlowCreateRequest.Direction.CREDIT)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .dueDate(LocalDate.parse("2019-12-27"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentFlowCreateParams.builder()
                .paymentFlowCreateRequest(
                    PaymentFlowCreateRequest.builder()
                        .amount(0L)
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency("currency")
                        .direction(PaymentFlowCreateRequest.Direction.CREDIT)
                        .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PaymentFlowCreateRequest.builder()
                    .amount(0L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency("currency")
                    .direction(PaymentFlowCreateRequest.Direction.CREDIT)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
