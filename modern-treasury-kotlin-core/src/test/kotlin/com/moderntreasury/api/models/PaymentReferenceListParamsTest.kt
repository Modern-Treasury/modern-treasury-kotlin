package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentReferenceListParamsTest {

    @Test
    fun createPaymentReferenceListParams() {
        PaymentReferenceListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .referenceableId("string")
            .referenceableType(PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER)
            .referenceNumber("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PaymentReferenceListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .referenceableId("string")
                .referenceableType(PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER)
                .referenceNumber("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("referenceable_id", listOf("string"))
        expected.put(
            "referenceable_type",
            listOf(PaymentReferenceListParams.ReferenceableType.PAYMENT_ORDER.toString())
        )
        expected.put("reference_number", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PaymentReferenceListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
