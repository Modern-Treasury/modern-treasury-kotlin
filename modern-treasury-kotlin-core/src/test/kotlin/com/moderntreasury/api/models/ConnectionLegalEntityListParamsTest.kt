// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionLegalEntityListParamsTest {

    @Test
    fun createConnectionLegalEntityListParams() {
        ConnectionLegalEntityListParams.builder()
            .afterCursor("after_cursor")
            .connectionId("connection_id")
            .legalEntityId("legal_entity_id")
            .perPage(123L)
            .status(ConnectionLegalEntityListParams.Status.COMPLETED)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            ConnectionLegalEntityListParams.builder()
                .afterCursor("after_cursor")
                .connectionId("connection_id")
                .legalEntityId("legal_entity_id")
                .perPage(123L)
                .status(ConnectionLegalEntityListParams.Status.COMPLETED)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("connection_id", "connection_id")
        expected.put("legal_entity_id", "legal_entity_id")
        expected.put("per_page", "123")
        expected.put("status", ConnectionLegalEntityListParams.Status.COMPLETED.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = ConnectionLegalEntityListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
