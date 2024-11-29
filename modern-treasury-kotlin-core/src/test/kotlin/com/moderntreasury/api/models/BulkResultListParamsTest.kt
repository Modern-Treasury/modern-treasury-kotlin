// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BulkResultListParamsTest {

    @Test
    fun createBulkResultListParams() {
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
    fun getQueryParams() {
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
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("entity_id", "entity_id")
        expected.put("entity_type", BulkResultListParams.EntityType.PAYMENT_ORDER.toString())
        expected.put("per_page", "0")
        expected.put("request_id", "request_id")
        expected.put("request_type", BulkResultListParams.RequestType.BULK_REQUEST.toString())
        expected.put("status", BulkResultListParams.Status.PENDING.toString())
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BulkResultListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
