// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerEventHandlerListParamsTest {

    @Test
    fun create() {
        LedgerEventHandlerListParams.builder()
            .afterCursor("after_cursor")
            .createdAt(
                LedgerEventHandlerListParams.CreatedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .metadata(
                LedgerEventHandlerListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .name("name")
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerEventHandlerListParams.builder()
                .afterCursor("after_cursor")
                .createdAt(
                    LedgerEventHandlerListParams.CreatedAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .metadata(
                    LedgerEventHandlerListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .name("name")
                .perPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("created_at[foo]", "2019-12-27T18:11:19.117Z")
                    .put("metadata[foo]", "string")
                    .put("name", "name")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerEventHandlerListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
