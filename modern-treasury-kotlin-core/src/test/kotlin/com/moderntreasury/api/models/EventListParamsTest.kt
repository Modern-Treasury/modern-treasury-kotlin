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
            .afterCursor("after_cursor")
            .entityId("entity_id")
            .eventName("event_name")
            .eventTimeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .eventTimeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .perPage(123L)
            .resource("resource")
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventListParams.builder()
                .afterCursor("after_cursor")
                .entityId("entity_id")
                .eventName("event_name")
                .eventTimeEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventTimeStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .perPage(123L)
                .resource("resource")
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("after_cursor", listOf("after_cursor"))
        expected.put("entity_id", listOf("entity_id"))
        expected.put("event_name", listOf("event_name"))
        expected.put("event_time_end", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("event_time_start", listOf("2019-12-27T18:11:19.117Z"))
        expected.put("per_page", listOf("123"))
        expected.put("resource", listOf("resource"))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
