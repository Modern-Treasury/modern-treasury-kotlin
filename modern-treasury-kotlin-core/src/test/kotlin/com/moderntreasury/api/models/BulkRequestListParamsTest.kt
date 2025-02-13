// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BulkRequestListParamsTest {

    @Test
    fun create() {
        BulkRequestListParams.builder()
            .actionType(BulkRequestListParams.ActionType.CREATE)
            .afterCursor("after_cursor")
            .metadata(
                BulkRequestListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .perPage(0L)
            .resourceType(BulkRequestListParams.ResourceType.PAYMENT_ORDER)
            .status(BulkRequestListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BulkRequestListParams.builder()
                .actionType(BulkRequestListParams.ActionType.CREATE)
                .afterCursor("after_cursor")
                .metadata(
                    BulkRequestListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .perPage(0L)
                .resourceType(BulkRequestListParams.ResourceType.PAYMENT_ORDER)
                .status(BulkRequestListParams.Status.PENDING)
                .build()
        val expected = QueryParams.builder()
        expected.put("action_type", BulkRequestListParams.ActionType.CREATE.toString())
        expected.put("after_cursor", "after_cursor")
        BulkRequestListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("per_page", "0")
        expected.put("resource_type", BulkRequestListParams.ResourceType.PAYMENT_ORDER.toString())
        expected.put("status", BulkRequestListParams.Status.PENDING.toString())
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BulkRequestListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
