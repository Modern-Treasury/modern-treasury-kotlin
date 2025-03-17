// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LineItemListParamsTest {

    @Test
    fun create() {
        LineItemListParams.builder()
            .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
            .itemizableId("itemizable_id")
            .afterCursor("after_cursor")
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LineItemListParams.builder()
                .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .afterCursor("after_cursor")
                .perPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            LineItemListParams.builder()
                .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun getPathParam() {
        val params =
            LineItemListParams.builder()
                .itemizableType(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS)
                .itemizableId("itemizable_id")
                .build()
        assertThat(params).isNotNull
        // path param "itemizableType"
        assertThat(params.getPathParam(0))
            .isEqualTo(LineItemListParams.ItemizableType.EXPECTED_PAYMENTS.toString())
        // path param "itemizableId"
        assertThat(params.getPathParam(1)).isEqualTo("itemizable_id")
        // out-of-bound path param
        assertThat(params.getPathParam(2)).isEqualTo("")
    }
}
