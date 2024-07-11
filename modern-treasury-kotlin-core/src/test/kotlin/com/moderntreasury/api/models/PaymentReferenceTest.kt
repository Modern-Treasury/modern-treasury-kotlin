// File generated from our OpenAPI spec by Stainless.

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
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .referenceNumber("reference_number")
                .referenceNumberType(PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER)
                .referenceableId("referenceable_id")
                .referenceableType(PaymentReference.ReferenceableType.PAYMENT_ORDER)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(paymentReference).isNotNull
        assertThat(paymentReference.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentReference.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentReference.liveMode()).isEqualTo(true)
        assertThat(paymentReference.object_()).isEqualTo("object")
        assertThat(paymentReference.referenceNumber()).isEqualTo("reference_number")
        assertThat(paymentReference.referenceNumberType())
            .isEqualTo(PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER)
        assertThat(paymentReference.referenceableId()).isEqualTo("referenceable_id")
        assertThat(paymentReference.referenceableType())
            .isEqualTo(PaymentReference.ReferenceableType.PAYMENT_ORDER)
        assertThat(paymentReference.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
