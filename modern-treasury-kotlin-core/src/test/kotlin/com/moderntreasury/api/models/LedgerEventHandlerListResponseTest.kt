package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerListResponseTest {

    @Test
    fun createLedgerEventHandlerListResponse() {
        val ledgerEventHandlerListResponse =
            LedgerEventHandlerListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("string")
                .description("string")
                .ledgerTransactionTemplate(
                    LedgerEventHandlerListResponse.LedgerEventHandlerLedgerTransactionTemplate
                        .builder()
                        .description("string")
                        .effectiveAt("string")
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandlerListResponse
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
                            LedgerEventHandlerListResponse
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .Metadata
                                .builder()
                                .build()
                        )
                        .build()
                )
                .conditions(
                    LedgerEventHandlerListResponse.LedgerEventHandlerConditions.builder()
                        .field("string")
                        .operator("string")
                        .value("string")
                        .build()
                )
                .metadata(LedgerEventHandlerListResponse.Metadata.builder().build())
                .build()
        assertThat(ledgerEventHandlerListResponse).isNotNull
        assertThat(ledgerEventHandlerListResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEventHandlerListResponse.object_()).isEqualTo("string")
        assertThat(ledgerEventHandlerListResponse.liveMode()).isEqualTo(true)
        assertThat(ledgerEventHandlerListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerListResponse.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerListResponse.name()).isEqualTo("string")
        assertThat(ledgerEventHandlerListResponse.description()).isEqualTo("string")
        assertThat(ledgerEventHandlerListResponse.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandlerListResponse.LedgerEventHandlerLedgerTransactionTemplate.builder()
                    .description("string")
                    .effectiveAt("string")
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerListResponse
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
                        LedgerEventHandlerListResponse.LedgerEventHandlerLedgerTransactionTemplate
                            .Metadata
                            .builder()
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerEventHandlerListResponse.conditions())
            .isEqualTo(
                LedgerEventHandlerListResponse.LedgerEventHandlerConditions.builder()
                    .field("string")
                    .operator("string")
                    .value("string")
                    .build()
            )
        assertThat(ledgerEventHandlerListResponse.metadata())
            .isEqualTo(LedgerEventHandlerListResponse.Metadata.builder().build())
    }
}
