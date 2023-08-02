package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IncomingPaymentDetailCreateAsyncParamsTest {

    @Test
    fun createIncomingPaymentDetailCreateAsyncParams() {
        IncomingPaymentDetailCreateAsyncParams.builder()
            .type(IncomingPaymentDetailCreateAsyncParams.Type.ACH)
            .direction(IncomingPaymentDetailCreateAsyncParams.Direction.CREDIT)
            .amount(123L)
            .currency(Currency.AED)
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .asOfDate(LocalDate.parse("2019-12-27"))
            .description("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            IncomingPaymentDetailCreateAsyncParams.builder()
                .type(IncomingPaymentDetailCreateAsyncParams.Type.ACH)
                .direction(IncomingPaymentDetailCreateAsyncParams.Direction.CREDIT)
                .amount(123L)
                .currency(Currency.AED)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .virtualAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOfDate(LocalDate.parse("2019-12-27"))
                .description("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.type()).isEqualTo(IncomingPaymentDetailCreateAsyncParams.Type.ACH)
        assertThat(body.direction())
            .isEqualTo(IncomingPaymentDetailCreateAsyncParams.Direction.CREDIT)
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.virtualAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.description()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = IncomingPaymentDetailCreateAsyncParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
