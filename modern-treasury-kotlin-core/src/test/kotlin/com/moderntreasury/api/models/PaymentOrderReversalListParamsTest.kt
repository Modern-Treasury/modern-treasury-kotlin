// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderReversalListParamsTest {

    @Test
    fun createPaymentOrderReversalListParams() {
        PaymentOrderReversalListParams.builder()
            .paymentOrderId("payment_order_id")
            .afterCursor("after_cursor")
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PaymentOrderReversalListParams.builder()
                .paymentOrderId("payment_order_id")
                .afterCursor("after_cursor")
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("per_page", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PaymentOrderReversalListParams.builder().paymentOrderId("payment_order_id").build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
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
