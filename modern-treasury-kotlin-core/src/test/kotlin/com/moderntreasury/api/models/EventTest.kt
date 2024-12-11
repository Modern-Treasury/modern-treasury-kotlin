// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventTest {

    @Test
    fun createEvent() {
        val event =
            Event.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .data(
                    Event.Data.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
                )
                .entityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .eventName("event_name")
                .eventTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .resource("resource")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(event).isNotNull
        assertThat(event.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(event.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(event.data())
            .isEqualTo(
                Event.Data.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(event.entityId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(event.eventName()).isEqualTo("event_name")
        assertThat(event.eventTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(event.liveMode()).isEqualTo(true)
        assertThat(event.object_()).isEqualTo("object")
        assertThat(event.resource()).isEqualTo("resource")
        assertThat(event.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
