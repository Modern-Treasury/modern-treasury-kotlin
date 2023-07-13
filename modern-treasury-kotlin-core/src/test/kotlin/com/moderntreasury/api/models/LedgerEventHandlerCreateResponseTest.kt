package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerCreateResponseTest {

    @Test
    fun createLedgerEventHandlerCreateResponse() {
        val ledgerEventHandlerCreateResponse =
            LedgerEventHandlerCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("string")
                .description("string")
                .ledgerTransactionTemplate(
                    LedgerEventHandlerCreateResponse.LedgerEventHandlerLedgerTransactionTemplate
                        .builder()
                        .description("string")
                        .effectiveAt("string")
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandlerCreateResponse
                                    .LedgerEventHandlerLedgerTransactionTemplate
                                    .LedgerEventHandlerLedgerEntries
                                    .builder()
                                    .amount("string")
                                    .direction("string")
                                    .ledgerAccountId("string")
                                    .build()
                            )
                        )
                        .metadata(
                            LedgerEventHandlerCreateResponse
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .Metadata
                                .builder()
                                .build()
                        )
                        .build()
                )
                .conditions(
                    LedgerEventHandlerCreateResponse.LedgerEventHandlerConditions.builder()
                        .field("string")
                        .operator("string")
                        .value("string")
                        .build()
                )
                .metadata(LedgerEventHandlerCreateResponse.Metadata.builder().build())
                .build()
        assertThat(ledgerEventHandlerCreateResponse).isNotNull
        assertThat(ledgerEventHandlerCreateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEventHandlerCreateResponse.object_()).isEqualTo("string")
        assertThat(ledgerEventHandlerCreateResponse.liveMode()).isEqualTo(true)
        assertThat(ledgerEventHandlerCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerCreateResponse.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerCreateResponse.name()).isEqualTo("string")
        assertThat(ledgerEventHandlerCreateResponse.description()).isEqualTo("string")
        assertThat(ledgerEventHandlerCreateResponse.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandlerCreateResponse.LedgerEventHandlerLedgerTransactionTemplate
                    .builder()
                    .description("string")
                    .effectiveAt("string")
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerCreateResponse
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .LedgerEventHandlerLedgerEntries
                                .builder()
                                .amount("string")
                                .direction("string")
                                .ledgerAccountId("string")
                                .build()
                        )
                    )
                    .metadata(
                        LedgerEventHandlerCreateResponse.LedgerEventHandlerLedgerTransactionTemplate
                            .Metadata
                            .builder()
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerEventHandlerCreateResponse.conditions())
            .isEqualTo(
                LedgerEventHandlerCreateResponse.LedgerEventHandlerConditions.builder()
                    .field("string")
                    .operator("string")
                    .value("string")
                    .build()
            )
        assertThat(ledgerEventHandlerCreateResponse.metadata())
            .isEqualTo(LedgerEventHandlerCreateResponse.Metadata.builder().build())
    }
}
