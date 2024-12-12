// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionListParamsTest {

    @Test
    fun createConnectionListParams() {
        ConnectionListParams.builder()
            .afterCursor("after_cursor")
            .entity("entity")
            .perPage(0L)
            .vendorCustomerId("vendor_customer_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ConnectionListParams.builder()
                .afterCursor("after_cursor")
                .entity("entity")
                .perPage(0L)
                .vendorCustomerId("vendor_customer_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("entity", "entity")
        expected.put("per_page", "0")
        expected.put("vendor_customer_id", "vendor_customer_id")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ConnectionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
