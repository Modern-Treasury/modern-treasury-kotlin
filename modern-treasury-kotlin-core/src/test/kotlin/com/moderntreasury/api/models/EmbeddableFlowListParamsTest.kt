// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddableFlowListParamsTest {

    @Test
    fun create() {
        EmbeddableFlowListParams.builder()
            .afterCursor("after_cursor")
            .perPage(0L)
            .status("status")
            .template(EmbeddableFlowListParams.Template.LEGAL_ENTITY_ONBOARDING)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EmbeddableFlowListParams.builder()
                .afterCursor("after_cursor")
                .perPage(0L)
                .status("status")
                .template(EmbeddableFlowListParams.Template.LEGAL_ENTITY_ONBOARDING)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("per_page", "0")
                    .put("status", "status")
                    .put("template", "legal_entity_onboarding")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmbeddableFlowListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
