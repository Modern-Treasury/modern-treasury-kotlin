// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListParamsTest {

    @Test
    fun create() {
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
    fun queryParams() {
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

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after_cursor", "after_cursor")
                    .put("entity_id", "entity_id")
                    .put("event_name", "event_name")
                    .put("event_time_end", "2019-12-27T18:11:19.117Z")
                    .put("event_time_start", "2019-12-27T18:11:19.117Z")
                    .put("per_page", "0")
                    .put("resource", "resource")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EventListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
