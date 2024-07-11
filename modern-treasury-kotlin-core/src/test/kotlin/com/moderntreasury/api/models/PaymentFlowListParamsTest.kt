// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentFlowListParamsTest {

    @Test
    fun createPaymentFlowListParams() {
        PaymentFlowListParams.builder()
            .afterCursor("after_cursor")
            .clientToken("client_token")
            .counterpartyId("counterparty_id")
            .originatingAccountId("originating_account_id")
            .paymentOrderId("payment_order_id")
            .perPage(123L)
            .receivingAccountId("receiving_account_id")
            .status("status")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            PaymentFlowListParams.builder()
                .afterCursor("after_cursor")
                .clientToken("client_token")
                .counterpartyId("counterparty_id")
                .originatingAccountId("originating_account_id")
                .paymentOrderId("payment_order_id")
                .perPage(123L)
                .receivingAccountId("receiving_account_id")
                .status("status")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("client_token", listOf("client_token"))
        expected.put("counterparty_id", listOf("counterparty_id"))
        expected.put("originating_account_id", listOf("originating_account_id"))
        expected.put("payment_order_id", listOf("payment_order_id"))
        expected.put("per_page", listOf("123"))
        expected.put("receiving_account_id", listOf("receiving_account_id"))
        expected.put("status", listOf("status"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = PaymentFlowListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
