// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReturnListParamsTest {

    @Test
    fun createReturnListParams() {
        ReturnListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .internalAccountId("internal_account_id")
            .perPage(123L)
            .returnableId("returnable_id")
            .returnableType(ReturnListParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ReturnListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .internalAccountId("internal_account_id")
                .perPage(123L)
                .returnableId("returnable_id")
                .returnableType(ReturnListParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("counterparty_id", listOf("counterparty_id"))
        expected.put("internal_account_id", listOf("internal_account_id"))
        expected.put("per_page", listOf("123"))
        expected.put("returnable_id", listOf("returnable_id"))
        expected.put(
            "returnable_type",
            listOf(ReturnListParams.ReturnableType.INCOMING_PAYMENT_DETAIL.toString())
        )
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ReturnListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
