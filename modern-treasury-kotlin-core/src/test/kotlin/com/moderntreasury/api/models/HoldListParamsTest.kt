// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HoldListParamsTest {

    @Test
    fun create() {
        HoldListParams.builder()
            .afterCursor("after_cursor")
            .metadata(
                HoldListParams.Metadata.builder().putAdditionalProperty("foo", "string").build()
            )
            .perPage(0L)
            .status(HoldListParams.Status.ACTIVE)
            .targetId("target_id")
            .targetType(HoldListParams.TargetType.PAYMENT_ORDER)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            HoldListParams.builder()
                .afterCursor("after_cursor")
                .metadata(
                    HoldListParams.Metadata.builder().putAdditionalProperty("foo", "string").build()
                )
                .perPage(0L)
                .status(HoldListParams.Status.ACTIVE)
                .targetId("target_id")
                .targetType(HoldListParams.TargetType.PAYMENT_ORDER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("metadata[foo]", "string")
                    .put("per_page", "0")
                    .put("status", "active")
                    .put("target_id", "target_id")
                    .put("target_type", "payment_order")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HoldListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
