// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListParamsTest {

    @Test
    fun create() {
        DocumentListParams.builder()
            .afterCursor("after_cursor")
            .documentableId("documentable_id")
            .documentableType(DocumentListParams.DocumentableType.CASES)
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DocumentListParams.builder()
                .afterCursor("after_cursor")
                .documentableId("documentable_id")
                .documentableType(DocumentListParams.DocumentableType.CASES)
                .perPage(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("documentable_id", "documentable_id")
                    .put("documentable_type", "cases")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DocumentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
