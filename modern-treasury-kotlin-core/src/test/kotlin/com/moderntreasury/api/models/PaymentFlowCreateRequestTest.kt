// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentFlowCreateRequestTest {

    @Test
    fun create() {
        val paymentFlowCreateRequest =
            PaymentFlowCreateRequest.builder()
                .amount(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency("currency")
                .direction(PaymentFlowCreateRequest.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dueDate(LocalDate.parse("2019-12-27"))
                .build()

        assertThat(paymentFlowCreateRequest.amount()).isEqualTo(0L)
        assertThat(paymentFlowCreateRequest.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlowCreateRequest.currency()).isEqualTo("currency")
        assertThat(paymentFlowCreateRequest.direction())
            .isEqualTo(PaymentFlowCreateRequest.Direction.CREDIT)
        assertThat(paymentFlowCreateRequest.originatingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentFlowCreateRequest.dueDate()).isEqualTo(LocalDate.parse("2019-12-27"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentFlowCreateRequest =
            PaymentFlowCreateRequest.builder()
                .amount(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency("currency")
                .direction(PaymentFlowCreateRequest.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dueDate(LocalDate.parse("2019-12-27"))
                .build()

        val roundtrippedPaymentFlowCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentFlowCreateRequest),
                jacksonTypeRef<PaymentFlowCreateRequest>(),
            )

        assertThat(roundtrippedPaymentFlowCreateRequest).isEqualTo(paymentFlowCreateRequest)
    }
}
