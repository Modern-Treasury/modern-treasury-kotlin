// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

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
            .perPage(123L)
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
                .perPage(123L)
                .requestId("request_id")
                .requestType(BulkResultListParams.RequestType.BULK_REQUEST)
                .status(BulkResultListParams.Status.PENDING)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("entity_id", listOf("entity_id"))
        expected.put(
            "entity_type",
            listOf(BulkResultListParams.EntityType.PAYMENT_ORDER.toString())
        )
        expected.put("per_page", listOf("123"))
        expected.put("request_id", listOf("request_id"))
        expected.put(
            "request_type",
            listOf(BulkResultListParams.RequestType.BULK_REQUEST.toString())
        )
        expected.put("status", listOf(BulkResultListParams.Status.PENDING.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BulkResultListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
