// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualAccountSettingListParamsTest {

    @Test
    fun create() {
        VirtualAccountSettingListParams.builder()
            .afterCursor("after_cursor")
            .externalId("external_id")
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VirtualAccountSettingListParams.builder()
                .afterCursor("after_cursor")
                .externalId("external_id")
                .perPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("external_id", "external_id")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VirtualAccountSettingListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
