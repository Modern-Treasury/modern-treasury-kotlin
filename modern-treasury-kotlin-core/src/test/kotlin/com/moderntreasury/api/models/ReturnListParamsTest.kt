// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
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
            .perPage(0L)
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
                .perPage(0L)
                .returnableId("returnable_id")
                .returnableType(ReturnListParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("counterparty_id", "counterparty_id")
        expected.put("internal_account_id", "internal_account_id")
        expected.put("per_page", "0")
        expected.put("returnable_id", "returnable_id")
        expected.put(
            "returnable_type",
            ReturnListParams.ReturnableType.INCOMING_PAYMENT_DETAIL.toString()
        )
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ReturnListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
