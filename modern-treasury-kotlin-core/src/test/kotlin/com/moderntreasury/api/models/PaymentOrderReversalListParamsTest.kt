// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderReversalListParamsTest {

    @Test
    fun createPaymentOrderReversalListParams() {
        PaymentOrderReversalListParams.builder()
            .paymentOrderId("payment_order_id")
            .afterCursor("after_cursor")
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PaymentOrderReversalListParams.builder()
                .paymentOrderId("payment_order_id")
                .afterCursor("after_cursor")
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            PaymentOrderReversalListParams.builder().paymentOrderId("payment_order_id").build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            PaymentOrderReversalListParams.builder().paymentOrderId("payment_order_id").build()
        assertThat(params).isNotNull
        // path param "paymentOrderId"
        assertThat(params.getPathParam(0)).isEqualTo("payment_order_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
