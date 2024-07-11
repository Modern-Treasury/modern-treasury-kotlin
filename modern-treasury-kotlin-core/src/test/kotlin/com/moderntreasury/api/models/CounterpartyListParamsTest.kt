// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
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
            .metadata(CounterpartyListParams.Metadata.builder().build())
            .name("name")
            .perPage(123L)
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
                .metadata(CounterpartyListParams.Metadata.builder().build())
                .name("name")
                .perPage(123L)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("created_at_lower_bound", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at_upper_bound", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("email", listOf("dev@stainlessapi.com"))
        expected.put("legal_entity_id", listOf("legal_entity_id"))
        CounterpartyListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("name", listOf("name"))
        expected.put("per_page", listOf("123"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CounterpartyListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
