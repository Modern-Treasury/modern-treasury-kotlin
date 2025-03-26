// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerListParamsTest {

    @Test
    fun create() {
        LedgerListParams.builder()
            .addId("string")
            .afterCursor("after_cursor")
            .metadata(
                LedgerListParams.Metadata.builder().putAdditionalProperty("foo", "string").build()
            )
            .perPage(0L)
            .updatedAt(
                LedgerListParams.UpdatedAt.builder()
                    .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LedgerListParams.builder()
                .addId("string")
                .afterCursor("after_cursor")
                .metadata(
                    LedgerListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .perPage(0L)
                .updatedAt(
                    LedgerListParams.UpdatedAt.builder()
                        .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id[]", "string")
                    .put("after_cursor", "after_cursor")
                    .put("metadata[foo]", "string")
                    .put("per_page", "0")
                    .put("updated_at[foo]", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
