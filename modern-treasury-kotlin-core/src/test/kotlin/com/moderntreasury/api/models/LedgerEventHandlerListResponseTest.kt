// File generated from our OpenAPI spec by Stainless.

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
                .conditions(
                    LedgerEventHandlerListResponse.LedgerEventHandlerConditions.builder()
                        .field("string")
                        .operator("string")
                        .value("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerTransactionTemplate(
                    LedgerEventHandlerListResponse.LedgerEventHandlerLedgerTransactionTemplate
                        .builder()
                        .description("string")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                .liveMode(true)
                .metadata(LedgerEventHandlerListResponse.Metadata.builder().build())
                .name("string")
                .object_("string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerEventHandlerListResponse).isNotNull
        assertThat(ledgerEventHandlerListResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEventHandlerListResponse.conditions())
            .isEqualTo(
                LedgerEventHandlerListResponse.LedgerEventHandlerConditions.builder()
                    .field("string")
                    .operator("string")
                    .value("string")
                    .build()
            )
        assertThat(ledgerEventHandlerListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerListResponse.description()).isEqualTo("string")
        assertThat(ledgerEventHandlerListResponse.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandlerListResponse.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandlerListResponse.LedgerEventHandlerLedgerTransactionTemplate.builder()
                    .description("string")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
        assertThat(ledgerEventHandlerListResponse.liveMode()).isEqualTo(true)
        assertThat(ledgerEventHandlerListResponse.metadata())
            .isEqualTo(LedgerEventHandlerListResponse.Metadata.builder().build())
        assertThat(ledgerEventHandlerListResponse.name()).isEqualTo("string")
        assertThat(ledgerEventHandlerListResponse.object_()).isEqualTo("string")
        assertThat(ledgerEventHandlerListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
