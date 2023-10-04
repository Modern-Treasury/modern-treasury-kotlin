// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventListParamsTest {

    @Test
    fun createEventListParams() {
        EventListParams.builder()
            .afterCursor("string")
            .perPage(123L)
            .eventTimeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .eventTimeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .resource("string")
            .entityId("string")
            .eventName("string")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventListParams.builder()
                .afterCursor("string")
                .perPage(123L)
                .eventTimeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventTimeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resource("string")
                .entityId("string")
                .eventName("string")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("string"))
        expected.put("per_page", listOf("123"))
        expected.put("event_time_start", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("event_time_end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("resource", listOf("string"))
        expected.put("entity_id", listOf("string"))
        expected.put("event_name", listOf("string"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
