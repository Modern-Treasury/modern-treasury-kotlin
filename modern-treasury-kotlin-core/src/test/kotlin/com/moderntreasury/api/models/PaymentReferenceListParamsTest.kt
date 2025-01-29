// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentReferenceListParamsTest {

    @Test
    fun createPaymentReferenceListParams() {
        PaymentReferenceListParams.builder()
            .afterCursor("after_cursor")
            .perPage(0L)
            .referenceNumber("reference_number")
            .referenceableId("referenceable_id")
            .referenceableType(PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PaymentReferenceListParams.builder()
                .afterCursor("after_cursor")
                .perPage(0L)
                .referenceNumber("reference_number")
                .referenceableId("referenceable_id")
                .referenceableType(PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("per_page", "0")
        expected.put("reference_number", "reference_number")
        expected.put("referenceable_id", "referenceable_id")
        expected.put(
            "referenceable_type",
            PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER.toString()
        )
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PaymentReferenceListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
