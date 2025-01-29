// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerListParamsTest {

    @Test
    fun createLedgerListParams() {
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
        val expected = QueryParams.builder()
        expected.put("id[]", "string")
        expected.put("after_cursor", "after_cursor")
        LedgerListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("per_page", "0")
        LedgerListParams.UpdatedAt.builder()
            .putAdditionalProperty("foo", "2019-12-27T18:11:19.117Z")
            .build()
            .forEachQueryParam { key, values -> expected.put("updated_at[$key]", values) }
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LedgerListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
