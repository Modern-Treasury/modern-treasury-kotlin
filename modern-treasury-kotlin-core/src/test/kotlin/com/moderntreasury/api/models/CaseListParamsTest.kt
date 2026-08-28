// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CaseListParamsTest {

    @Test
    fun create() {
        CaseListParams.builder()
            .afterCursor("after_cursor")
            .perPage(0L)
            .status(CaseListParams.Status.OPEN)
            .subjectId("subject_id")
            .subjectType(CaseListParams.SubjectType.LEGAL_ENTITY)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CaseListParams.builder()
                .afterCursor("after_cursor")
                .perPage(0L)
                .status(CaseListParams.Status.OPEN)
                .subjectId("subject_id")
                .subjectType(CaseListParams.SubjectType.LEGAL_ENTITY)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("per_page", "0")
                    .put("status", "open")
                    .put("subject_id", "subject_id")
                    .put("subject_type", "legal_entity")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CaseListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
