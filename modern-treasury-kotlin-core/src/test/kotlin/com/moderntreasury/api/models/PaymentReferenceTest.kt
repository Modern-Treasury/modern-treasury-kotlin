package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentReferenceTest {

    @Test
    fun createPaymentReference() {
        val paymentReference =
            PaymentReference.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .referenceableId("string")
                .referenceableType(PaymentReference.ReferenceableType.PAYMENT_ORDER)
                .referenceNumber("string")
                .referenceNumberType(PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER)
                .build()
        assertThat(paymentReference).isNotNull
        assertThat(paymentReference.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentReference.object_()).isEqualTo("string")
        assertThat(paymentReference.liveMode()).isEqualTo(true)
        assertThat(paymentReference.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentReference.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentReference.referenceableId()).isEqualTo("string")
        assertThat(paymentReference.referenceableType())
            .isEqualTo(PaymentReference.ReferenceableType.PAYMENT_ORDER)
        assertThat(paymentReference.referenceNumber()).isEqualTo("string")
        assertThat(paymentReference.referenceNumberType())
            .isEqualTo(PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER)
    }
}
