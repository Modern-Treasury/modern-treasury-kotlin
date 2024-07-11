// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LineItemListParamsTest {

    @Test
    fun createLineItemListParams() {
        LineItemListParams.builder()
            .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
            .itemizableId("itemizable_id")
            .afterCursor("after_cursor")
            .perPage(123L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            LineItemListParams.builder()
                .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
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
            LineItemListParams.builder()
                .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getPathParam() {
        val params =
            LineItemListParams.builder()
                .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .build()
        assertThat(params).isNotNull
        // path param "itemizableType"
        assertThat(params.getPathParam(0))
            .isEqualTo(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS.toString())
        // path param "itemizableId"
        assertThat(params.getPathParam(1)).isEqualTo("itemizable_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
