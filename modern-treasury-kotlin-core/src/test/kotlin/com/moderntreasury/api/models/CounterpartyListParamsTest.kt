// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CounterpartyListParamsTest {

    @Test
    fun create() {
        CounterpartyListParams.builder()
            .afterCursor("after_cursor")
            .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .email("dev@stainless.com")
            .externalId("external_id")
            .legalEntityId("legal_entity_id")
            .metadata(
                CounterpartyListParams.Metadata.builder()
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
            CounterpartyListParams.builder()
                .afterCursor("after_cursor")
                .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("dev@stainless.com")
                .externalId("external_id")
                .legalEntityId("legal_entity_id")
                .metadata(
                    CounterpartyListParams.Metadata.builder()
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
                    .put("created_at_lower_bound", "2019-12-27T18:11:19.117Z")
                    .put("created_at_upper_bound", "2019-12-27T18:11:19.117Z")
                    .put("email", "dev@stainless.com")
                    .put("external_id", "external_id")
                    .put("legal_entity_id", "legal_entity_id")
                    .put("metadata[foo]", "string")
                    .put("name", "name")
                    .put("per_page", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CounterpartyListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
