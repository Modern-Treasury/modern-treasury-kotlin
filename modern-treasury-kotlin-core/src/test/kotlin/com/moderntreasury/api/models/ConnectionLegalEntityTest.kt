// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConnectionLegalEntityTest {

    @Test
    fun createConnectionLegalEntity() {
        val connectionLegalEntity =
            ConnectionLegalEntity.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .connectionId("connection_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .legalEntityId("legal_entity_id")
                .liveMode(true)
                .object_("object")
                .status(ConnectionLegalEntity.Status.COMPLETED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorId("vendor_id")
                .build()
        assertThat(connectionLegalEntity).isNotNull
        assertThat(connectionLegalEntity.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(connectionLegalEntity.connectionId()).isEqualTo("connection_id")
        assertThat(connectionLegalEntity.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connectionLegalEntity.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connectionLegalEntity.legalEntityId()).isEqualTo("legal_entity_id")
        assertThat(connectionLegalEntity.liveMode()).isEqualTo(true)
        assertThat(connectionLegalEntity.object_()).isEqualTo("object")
        assertThat(connectionLegalEntity.status()).isEqualTo(ConnectionLegalEntity.Status.COMPLETED)
        assertThat(connectionLegalEntity.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(connectionLegalEntity.vendorId()).isEqualTo("vendor_id")
    }
}
