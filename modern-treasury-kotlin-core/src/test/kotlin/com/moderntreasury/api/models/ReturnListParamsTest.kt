// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReturnListParamsTest {

    @Test
    fun createReturnListParams() {
        ReturnListParams.builder()
            .afterCursor("string")
            .counterpartyId("string")
            .internalAccountId("string")
            .perPage(123L)
            .returnableId("string")
            .returnableType(ReturnListParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ReturnListParams.builder()
                .afterCursor("string")
                .counterpartyId("string")
                .internalAccountId("string")
                .perPage(123L)
                .returnableId("string")
                .returnableType(ReturnListParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("counterparty_id", listOf("string"))
        expected.put("internal_account_id", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("returnable_id", listOf("string"))
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
