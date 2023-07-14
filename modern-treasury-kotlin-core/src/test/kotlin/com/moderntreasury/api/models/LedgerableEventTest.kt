package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerableEventTest {

    @Test
    fun createLedgerableEvent() {
        val ledgerableEvent =
            LedgerableEvent.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .currencyExponent(123L)
                .customData(JsonNull.of())
                .description("string")
                .direction("string")
                .ledgerEventHandlerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(LedgerableEvent.Metadata.builder().build())
                .name("string")
                .object_("string")
                .originatingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerableEvent).isNotNull
        assertThat(ledgerableEvent.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerableEvent.amount()).isEqualTo(123L)
        assertThat(ledgerableEvent.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerableEvent.currency()).isEqualTo("string")
        assertThat(ledgerableEvent.currencyExponent()).isEqualTo(123L)
        assertThat(ledgerableEvent._customData()).isEqualTo(JsonNull.of())
        assertThat(ledgerableEvent.description()).isEqualTo("string")
        assertThat(ledgerableEvent.direction()).isEqualTo("string")
        assertThat(ledgerableEvent.ledgerEventHandlerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerableEvent.liveMode()).isEqualTo(true)
        assertThat(ledgerableEvent.metadata()).isEqualTo(LedgerableEvent.Metadata.builder().build())
        assertThat(ledgerableEvent.name()).isEqualTo("string")
        assertThat(ledgerableEvent.object_()).isEqualTo("string")
        assertThat(ledgerableEvent.originatingLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerableEvent.receivingLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerableEvent.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
