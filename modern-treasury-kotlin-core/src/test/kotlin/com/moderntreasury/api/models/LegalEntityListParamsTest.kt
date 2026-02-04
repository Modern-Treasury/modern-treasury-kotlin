// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalEntityListParamsTest {

    @Test
    fun create() {
        LegalEntityListParams.builder()
            .afterCursor("after_cursor")
            .legalEntityType(LegalEntityListParams.LegalEntityType.BUSINESS)
            .metadata(
                LegalEntityListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .perPage(0L)
            .showDeleted("show_deleted")
            .status(LegalEntityListParams.Status.PENDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            LegalEntityListParams.builder()
                .afterCursor("after_cursor")
                .legalEntityType(LegalEntityListParams.LegalEntityType.BUSINESS)
                .metadata(
                    LegalEntityListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .perPage(0L)
                .showDeleted("show_deleted")
                .status(LegalEntityListParams.Status.PENDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("legal_entity_type", "business")
                    .put("metadata[foo]", "string")
                    .put("per_page", "0")
                    .put("show_deleted", "show_deleted")
                    .put("status", "pending")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LegalEntityListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
