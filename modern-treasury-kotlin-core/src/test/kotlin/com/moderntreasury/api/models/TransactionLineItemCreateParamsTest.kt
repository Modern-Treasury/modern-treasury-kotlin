// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionLineItemCreateParamsTest {

    @Test
    fun createTransactionLineItemCreateParams() {
        TransactionLineItemCreateParams.builder()
            .amount(0L)
            .expectedPaymentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionLineItemCreateParams.builder()
                .amount(0L)
                .expectedPaymentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.expectedPaymentId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.transactionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionLineItemCreateParams.builder()
                .amount(0L)
                .expectedPaymentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.expectedPaymentId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.transactionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
