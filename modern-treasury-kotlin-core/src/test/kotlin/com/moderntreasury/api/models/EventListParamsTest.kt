// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
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
            .perPage(0L)
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
                .perPage(0L)
                .resource("resource")
                .build()
        val expected = QueryParams.builder()
        expected.put("after_cursor", "after_cursor")
        expected.put("entity_id", "entity_id")
        expected.put("event_name", "event_name")
        expected.put("event_time_end", "2019-12-27T18:11:19.117Z")
        expected.put("event_time_start", "2019-12-27T18:11:19.117Z")
        expected.put("per_page", "0")
        expected.put("resource", "resource")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
