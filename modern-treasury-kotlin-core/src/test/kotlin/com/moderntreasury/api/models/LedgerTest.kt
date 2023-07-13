package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTest {

    @Test
    fun createLedger() {
        val ledger =
            Ledger.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("string")
                .description("string")
                .metadata(Ledger.Metadata.builder().build())
                .build()
        assertThat(ledger).isNotNull
        assertThat(ledger.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledger.object_()).isEqualTo("string")
        assertThat(ledger.liveMode()).isEqualTo(true)
        assertThat(ledger.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledger.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledger.discardedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledger.name()).isEqualTo("string")
        assertThat(ledger.description()).isEqualTo("string")
        assertThat(ledger.metadata()).isEqualTo(Ledger.Metadata.builder().build())
    }
}
