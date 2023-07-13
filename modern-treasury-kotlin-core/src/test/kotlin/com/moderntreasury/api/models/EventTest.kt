package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventTest {

    @Test
    fun createEvent() {
        val event =
            Event.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resource("string")
                .eventName("string")
                .eventTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .data(Event.Data.builder().build())
                .entityId("string")
                .build()
        assertThat(event).isNotNull
        assertThat(event.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(event.object_()).isEqualTo("string")
        assertThat(event.liveMode()).isEqualTo(true)
        assertThat(event.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(event.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(event.resource()).isEqualTo("string")
        assertThat(event.eventName()).isEqualTo("string")
        assertThat(event.eventTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(event.data()).isEqualTo(Event.Data.builder().build())
        assertThat(event.entityId()).isEqualTo("string")
    }
}
