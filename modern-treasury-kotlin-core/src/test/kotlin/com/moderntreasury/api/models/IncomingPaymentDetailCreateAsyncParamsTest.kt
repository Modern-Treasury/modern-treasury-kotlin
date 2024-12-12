// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomingPaymentDetailCreateAsyncParamsTest {

    @Test
    fun createIncomingPaymentDetailCreateAsyncParams() {
        IncomingPaymentDetailCreateAsyncParams.builder()
            .amount(0L)
            .asOfDate(LocalDate.parse("2019-12-27"))
            .currency(Currency.AED)
            .description("description")
            .direction(IncomingPaymentDetailCreateAsyncParams.Direction.CREDIT)
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(IncomingPaymentDetailCreateAsyncParams.Type.ACH)
            .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            IncomingPaymentDetailCreateAsyncParams.builder()
                .amount(0L)
                .asOfDate(LocalDate.parse("2019-12-27"))
                .currency(Currency.AED)
                .description("description")
                .direction(IncomingPaymentDetailCreateAsyncParams.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(IncomingPaymentDetailCreateAsyncParams.Type.ACH)
                .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.direction())
            .isEqualTo(IncomingPaymentDetailCreateAsyncParams.Direction.CREDIT)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(IncomingPaymentDetailCreateAsyncParams.Type.ACH)
        assertThat(body.virtualAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = IncomingPaymentDetailCreateAsyncParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
