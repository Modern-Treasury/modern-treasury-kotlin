// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyListParamsTest {

    @Test
    fun createCounterpartyListParams() {
        CounterpartyListParams.builder()
            .afterCursor("after_cursor")
            .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .email("dev@stainlessapi.com")
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
    fun getQueryParams() {
        val params =
            CounterpartyListParams.builder()
                .afterCursor("after_cursor")
                .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .email("dev@stainlessapi.com")
                .legalEntityId("legal_entity_id")
                .metadata(
                    CounterpartyListParams.Metadata.builder()
                        .putAdditionalProperty("foo", "string")
                        .build()
                )
                .name("name")
                .perPage(0L)
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("created_at_lower_bound", "2019-12-27T18:11:19.117Z")
        expected.put("created_at_upper_bound", "2019-12-27T18:11:19.117Z")
        expected.put("email", "dev@stainlessapi.com")
        expected.put("legal_entity_id", "legal_entity_id")
        CounterpartyListParams.Metadata.builder()
            .putAdditionalProperty("foo", "string")
            .build()
            .forEachQueryParam { key, values -> expected.put("metadata[$key]", values) }
        expected.put("name", "name")
        expected.put("per_page", "0")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CounterpartyListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
