package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConnectionTest {

    @Test
    fun createConnection() {
        val connection =
            Connection.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorCustomerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorName("string")
                .build()
        assertThat(connection).isNotNull
        assertThat(connection.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connection.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connection.liveMode()).isEqualTo(true)
        assertThat(connection.object_()).isEqualTo("string")
        assertThat(connection.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connection.vendorCustomerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connection.vendorId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connection.vendorName()).isEqualTo("string")
    }
}
