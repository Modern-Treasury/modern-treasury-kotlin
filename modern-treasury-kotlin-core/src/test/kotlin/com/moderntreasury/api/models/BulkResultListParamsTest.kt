// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkResultListParamsTest {

    @Test
    fun create() {
        BulkResultListParams.builder()
            .afterCursor("after_cursor")
            .entityId("entity_id")
            .entityType(BulkResultListParams.EntityType.PAYMENT_ORDER)
            .perPage(0L)
            .requestId("request_id")
            .requestType(BulkResultListParams.RequestType.BULK_REQUEST)
            .status(BulkResultListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BulkResultListParams.builder()
                .afterCursor("after_cursor")
                .entityId("entity_id")
                .entityType(BulkResultListParams.EntityType.PAYMENT_ORDER)
                .perPage(0L)
                .requestId("request_id")
                .requestType(BulkResultListParams.RequestType.BULK_REQUEST)
                .status(BulkResultListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("entity_id", "entity_id")
                    .put("entity_type", "payment_order")
                    .put("per_page", "0")
                    .put("request_id", "request_id")
                    .put("request_type", "bulk_request")
                    .put("status", "pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BulkResultListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
