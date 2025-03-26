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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("connection_id", "connection_id")
                    .put("legal_entity_id", "legal_entity_id")
                    .put("per_page", "0")
                    .put("status", "completed")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConnectionLegalEntityListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
