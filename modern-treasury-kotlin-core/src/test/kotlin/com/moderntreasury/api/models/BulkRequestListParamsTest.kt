// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkRequestListParamsTest {

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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("action_type", "create")
                    .put("after_cursor", "after_cursor")
                    .put("metadata[foo]", "string")
                    .put("per_page", "0")
                    .put("resource_type", "payment_order")
                    .put("status", "pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BulkRequestListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
