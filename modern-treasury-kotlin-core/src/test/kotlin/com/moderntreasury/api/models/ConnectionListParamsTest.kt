// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionListParamsTest {

    @Test
    fun createConnectionListParams() {
        ConnectionListParams.builder()
            .afterCursor("after_cursor")
            .entity("entity")
            .perPage(123L)
            .vendorCustomerId("vendor_customer_id")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ConnectionListParams.builder()
                .afterCursor("after_cursor")
                .entity("entity")
                .perPage(123L)
                .vendorCustomerId("vendor_customer_id")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("entity", listOf("entity"))
        expected.put("per_page", listOf("123"))
        expected.put("vendor_customer_id", listOf("vendor_customer_id"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ConnectionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
