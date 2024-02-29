// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionLegalEntityListParamsTest {

    @Test
    fun createConnectionLegalEntityListParams() {
        ConnectionLegalEntityListParams.builder()
            .afterCursor("string")
            .connectionId("string")
            .legalEntityId("string")
            .perPage(123L)
            .status(ConnectionLegalEntityListParams.Status.COMPLETED)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ConnectionLegalEntityListParams.builder()
                .afterCursor("string")
                .connectionId("string")
                .legalEntityId("string")
                .perPage(123L)
                .status(ConnectionLegalEntityListParams.Status.COMPLETED)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("connection_id", listOf("string"))
        expected.put("legal_entity_id", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("status", listOf(ConnectionLegalEntityListParams.Status.COMPLETED.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ConnectionLegalEntityListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
