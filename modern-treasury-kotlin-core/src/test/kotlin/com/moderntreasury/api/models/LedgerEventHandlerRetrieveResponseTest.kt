package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerRetrieveResponseTest {

    @Test
    fun createLedgerEventHandlerRetrieveResponse() {
        val ledgerEventHandlerRetrieveResponse =
            LedgerEventHandlerRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("string")
                .description("string")
                .ledgerTransactionTemplate(
                    LedgerEventHandlerRetrieveResponse.LedgerEventHandlerLedgerTransactionTemplate
                        .builder()
                        .description("string")
                        .effectiveAt("string")
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandlerRetrieveResponse
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
                            LedgerEventHandlerRetrieveResponse
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .Metadata
                                .builder()
                                .build()
                        )
                        .build()
                )
                .conditions(
                    LedgerEventHandlerRetrieveResponse.LedgerEventHandlerConditions.builder()
                        .field("string")
                        .operator("string")
                        .value("string")
                        .build()
                )
                .metadata(LedgerEventHandlerRetrieveResponse.Metadata.builder().build())
                .build()
        assertThat(ledgerEventHandlerRetrieveResponse).isNotNull
        assertThat(ledgerEventHandlerRetrieveResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEventHandlerRetrieveResponse.object_()).isEqualTo("string")
        assertThat(ledgerEventHandlerRetrieveResponse.liveMode()).isEqualTo(true)
        assertThat(ledgerEventHandlerRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerRetrieveResponse.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerRetrieveResponse.name()).isEqualTo("string")
        assertThat(ledgerEventHandlerRetrieveResponse.description()).isEqualTo("string")
        assertThat(ledgerEventHandlerRetrieveResponse.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandlerRetrieveResponse.LedgerEventHandlerLedgerTransactionTemplate
                    .builder()
                    .description("string")
                    .effectiveAt("string")
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerRetrieveResponse
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
                        LedgerEventHandlerRetrieveResponse
                            .LedgerEventHandlerLedgerTransactionTemplate
                            .Metadata
                            .builder()
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerEventHandlerRetrieveResponse.conditions())
            .isEqualTo(
                LedgerEventHandlerRetrieveResponse.LedgerEventHandlerConditions.builder()
                    .field("string")
                    .operator("string")
                    .value("string")
                    .build()
            )
        assertThat(ledgerEventHandlerRetrieveResponse.metadata())
            .isEqualTo(LedgerEventHandlerRetrieveResponse.Metadata.builder().build())
    }
}
