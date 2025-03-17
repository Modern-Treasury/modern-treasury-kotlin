// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionLegalEntityListParamsTest {

    @Test
    fun create() {
        ConnectionLegalEntityListParams.builder()
            .afterCursor("after_cursor")
            .connectionId("connection_id")
            .legalEntityId("legal_entity_id")
            .perPage(0L)
            .status(ConnectionLegalEntityListParams.Status.COMPLETED)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ConnectionLegalEntityListParams.builder()
                .afterCursor("after_cursor")
                .connectionId("connection_id")
                .legalEntityId("legal_entity_id")
                .perPage(0L)
                .status(ConnectionLegalEntityListParams.Status.COMPLETED)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("connection_id", "connection_id")
        expected.put("legal_entity_id", "legal_entity_id")
        expected.put("per_page", "0")
        expected.put("status", ConnectionLegalEntityListParams.Status.COMPLETED.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConnectionLegalEntityListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
