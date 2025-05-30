// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionTest {

    @Test
    fun create() {
        val connection =
            Connection.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorCustomerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorName("vendor_name")
                .build()

        assertThat(connection.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connection.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connection.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connection.liveMode()).isEqualTo(true)
        assertThat(connection.object_()).isEqualTo("object")
        assertThat(connection.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connection.vendorCustomerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connection.vendorId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connection.vendorName()).isEqualTo("vendor_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val connection =
            Connection.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorCustomerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .vendorName("vendor_name")
                .build()

        val roundtrippedConnection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(connection),
                jacksonTypeRef<Connection>(),
            )

        assertThat(roundtrippedConnection).isEqualTo(connection)
    }
}
