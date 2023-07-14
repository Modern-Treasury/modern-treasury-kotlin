package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerDeleteResponseTest {

    @Test
    fun createLedgerEventHandlerDeleteResponse() {
        val ledgerEventHandlerDeleteResponse =
            LedgerEventHandlerDeleteResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .conditions(
                    LedgerEventHandlerDeleteResponse.LedgerEventHandlerConditions.builder()
                        .field("string")
                        .operator("string")
                        .value("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerTransactionTemplate(
                    LedgerEventHandlerDeleteResponse.LedgerEventHandlerLedgerTransactionTemplate
                        .builder()
                        .description("string")
                        .effectiveAt("string")
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandlerDeleteResponse
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
                            LedgerEventHandlerDeleteResponse
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .Metadata
                                .builder()
                                .build()
                        )
                        .build()
                )
                .liveMode(true)
                .metadata(LedgerEventHandlerDeleteResponse.Metadata.builder().build())
                .name("string")
                .object_("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerEventHandlerDeleteResponse).isNotNull
        assertThat(ledgerEventHandlerDeleteResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEventHandlerDeleteResponse.conditions())
            .isEqualTo(
                LedgerEventHandlerDeleteResponse.LedgerEventHandlerConditions.builder()
                    .field("string")
                    .operator("string")
                    .value("string")
                    .build()
            )
        assertThat(ledgerEventHandlerDeleteResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerDeleteResponse.description()).isEqualTo("string")
        assertThat(ledgerEventHandlerDeleteResponse.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerDeleteResponse.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandlerDeleteResponse.LedgerEventHandlerLedgerTransactionTemplate
                    .builder()
                    .description("string")
                    .effectiveAt("string")
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerDeleteResponse
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
                        LedgerEventHandlerDeleteResponse.LedgerEventHandlerLedgerTransactionTemplate
                            .Metadata
                            .builder()
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerEventHandlerDeleteResponse.liveMode()).isEqualTo(true)
        assertThat(ledgerEventHandlerDeleteResponse.metadata())
            .isEqualTo(LedgerEventHandlerDeleteResponse.Metadata.builder().build())
        assertThat(ledgerEventHandlerDeleteResponse.name()).isEqualTo("string")
        assertThat(ledgerEventHandlerDeleteResponse.object_()).isEqualTo("string")
        assertThat(ledgerEventHandlerDeleteResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
