// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BulkRequestListParamsTest {

    @Test
    fun createBulkRequestListParams() {
        BulkRequestListParams.builder()
            .actionType(BulkRequestListParams.ActionType.CREATE)
            .afterCursor("after_cursor")
            .metadata(BulkRequestListParams.Metadata.builder().build())
            .perPage(123L)
            .resourceType(BulkRequestListParams.ResourceType.PAYMENT_ORDER)
            .status(BulkRequestListParams.Status.PENDING)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            BulkRequestListParams.builder()
                .actionType(BulkRequestListParams.ActionType.CREATE)
                .afterCursor("after_cursor")
                .metadata(BulkRequestListParams.Metadata.builder().build())
                .perPage(123L)
                .resourceType(BulkRequestListParams.ResourceType.PAYMENT_ORDER)
                .status(BulkRequestListParams.Status.PENDING)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("action_type", listOf(BulkRequestListParams.ActionType.CREATE.toString()))
        expected.put("after_cursor", listOf("after_cursor"))
        BulkRequestListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("per_page", listOf("123"))
        expected.put(
            "resource_type",
            listOf(BulkRequestListParams.ResourceType.PAYMENT_ORDER.toString())
        )
        expected.put("status", listOf(BulkRequestListParams.Status.PENDING.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BulkRequestListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
