// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LegalEntityListParamsTest {

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
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("legal_entity_type", LegalEntityListParams.LegalEntityType.BUSINESS.toString())
        LegalEntityListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("per_page", "0")
        expected.put("show_deleted", "show_deleted")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LegalEntityListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
