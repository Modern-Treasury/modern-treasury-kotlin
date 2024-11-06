// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
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
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("per_page", "123")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params =
            LineItemListParams.builder()
                .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
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
