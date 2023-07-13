package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CounterpartyListParamsTest {

    @Test
    fun createCounterpartyListParams() {
        CounterpartyListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .name("string")
            .email("dev@stainlessapi.com")
            .metadata(CounterpartyListParams.Metadata.builder().build())
            .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CounterpartyListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .name("string")
                .email("dev@stainlessapi.com")
                .metadata(CounterpartyListParams.Metadata.builder().build())
                .createdAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("name", listOf("string"))
        expected.put("email", listOf("dev@stainlessapi.com"))
        CounterpartyListParams.Metadata.builder().build().forEachQueryParam { key, values ->
            expected.put("metadata[$key]", values)
        }
        expected.put("created_at_lower_bound", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("created_at_upper_bound", listOf("2019-12-27T18:11:19.117Z"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CounterpartyListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
