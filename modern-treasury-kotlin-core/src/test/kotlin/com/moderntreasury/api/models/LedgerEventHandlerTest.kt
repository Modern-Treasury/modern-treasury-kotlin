// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerTest {

    @Test
    fun createLedgerEventHandler() {
        val ledgerEventHandler =
            LedgerEventHandler.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .conditions(
                    LedgerEventHandler.LedgerEventHandlerConditions.builder()
                        .field("string")
                        .operator("string")
                        .value("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("My Description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerId("string")
                .ledgerTransactionTemplate(
                    LedgerEventHandler.LedgerEventHandlerLedgerTransactionTemplate.builder()
                        .description("My Ledger Transaction Template Description")
                        .effectiveAt("{{ledgerable_event.custom_data.effective_at}}")
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandler.LedgerEventHandlerLedgerTransactionTemplate
                                    .LedgerEventHandlerLedgerEntries
                                    .builder()
                                    .amount("string")
                                    .direction("string")
                                    .ledgerAccountId("string")
                                    .build()
                            )
                        )
                        .status("posted")
                        .build()
                )
                .liveMode(true)
                .metadata(LedgerEventHandler.Metadata.builder().build())
                .name("My Event Handler")
                .object_("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .variables(LedgerEventHandler.LedgerEventHandlerVariables.builder().build())
                .build()
        assertThat(ledgerEventHandler).isNotNull
        assertThat(ledgerEventHandler.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEventHandler.conditions())
            .isEqualTo(
                LedgerEventHandler.LedgerEventHandlerConditions.builder()
                    .field("string")
                    .operator("string")
                    .value("string")
                    .build()
            )
        assertThat(ledgerEventHandler.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandler.description()).isEqualTo("My Description")
        assertThat(ledgerEventHandler.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandler.ledgerId()).isEqualTo("string")
        assertThat(ledgerEventHandler.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandler.LedgerEventHandlerLedgerTransactionTemplate.builder()
                    .description("My Ledger Transaction Template Description")
                    .effectiveAt("{{ledgerable_event.custom_data.effective_at}}")
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandler.LedgerEventHandlerLedgerTransactionTemplate
                                .LedgerEventHandlerLedgerEntries
                                .builder()
                                .amount("string")
                                .direction("string")
                                .ledgerAccountId("string")
                                .build()
                        )
                    )
                    .status("posted")
                    .build()
            )
        assertThat(ledgerEventHandler.liveMode()).isEqualTo(true)
        assertThat(ledgerEventHandler.metadata())
            .isEqualTo(LedgerEventHandler.Metadata.builder().build())
        assertThat(ledgerEventHandler.name()).isEqualTo("My Event Handler")
        assertThat(ledgerEventHandler.object_()).isEqualTo("string")
        assertThat(ledgerEventHandler.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandler.variables())
            .isEqualTo(LedgerEventHandler.LedgerEventHandlerVariables.builder().build())
    }
}
