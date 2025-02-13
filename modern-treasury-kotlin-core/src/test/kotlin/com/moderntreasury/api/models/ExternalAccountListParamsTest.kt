// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountListParamsTest {

    @Test
    fun create() {
        ExternalAccountListParams.builder()
            .afterCursor("after_cursor")
            .counterpartyId("counterparty_id")
            .metadata(
                ExternalAccountListParams.Metadata.builder()
                    .putAdditionalProperty("foo", "string")
                    .build()
            )
            .partyName("party_name")
            .perPage(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ExternalAccountListParams.builder()
                .afterCursor("after_cursor")
                .counterpartyId("counterparty_id")
                .metadata(
                    ExternalAccountListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .partyName("party_name")
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("counterparty_id", "counterparty_id")
        ExternalAccountListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("party_name", "party_name")
        expected.put("per_page", "0")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExternalAccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
