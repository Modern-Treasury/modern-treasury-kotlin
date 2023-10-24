// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionListParamsTest {

    @Test
    fun createConnectionListParams() {
        ConnectionListParams.builder()
            .afterCursor("string")
            .entity("string")
            .perPage(123L)
            .vendorCustomerId("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ConnectionListParams.builder()
                .afterCursor("string")
                .entity("string")
                .perPage(123L)
                .vendorCustomerId("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("entity", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("vendor_customer_id", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ConnectionListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
