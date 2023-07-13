package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerCreateParamsTest {

    @Test
    fun createLedgerEventHandlerCreateParams() {
        LedgerEventHandlerCreateParams.builder()
            .name("string")
            .description("string")
            .ledgerTransactionTemplate(
                LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate.builder()
                    .description("string")
                    .effectiveAt("string")
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerCreateParams
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
                        LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate
                            .Metadata
                            .builder()
                            .build()
                    )
                    .build()
            )
            .conditions(
                LedgerEventHandlerCreateParams.LedgerEventHandlerConditions.builder()
                    .field("string")
                    .operator("string")
                    .value("string")
                    .build()
            )
            .metadata(LedgerEventHandlerCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerEventHandlerCreateParams.builder()
                .name("string")
                .description("string")
                .ledgerTransactionTemplate(
                    LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate
                        .builder()
                        .description("string")
                        .effectiveAt("string")
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandlerCreateParams
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
                            LedgerEventHandlerCreateParams
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .Metadata
                                .builder()
                                .build()
                        )
                        .build()
                )
                .conditions(
                    LedgerEventHandlerCreateParams.LedgerEventHandlerConditions.builder()
                        .field("string")
                        .operator("string")
                        .value("string")
                        .build()
                )
                .metadata(LedgerEventHandlerCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate.builder()
                    .description("string")
                    .effectiveAt("string")
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerCreateParams
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
                        LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate
                            .Metadata
                            .builder()
                            .build()
                    )
                    .build()
            )
        assertThat(body.conditions())
            .isEqualTo(
                LedgerEventHandlerCreateParams.LedgerEventHandlerConditions.builder()
                    .field("string")
                    .operator("string")
                    .value("string")
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(LedgerEventHandlerCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerEventHandlerCreateParams.builder()
                .name("string")
                .ledgerTransactionTemplate(
                    LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate
                        .builder()
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandlerCreateParams
                                    .LedgerEventHandlerLedgerTransactionTemplate
                                    .LedgerEventHandlerLedgerEntries
                                    .builder()
                                    .amount("string")
                                    .direction("string")
                                    .ledgerAccountId("string")
                                    .build()
                            )
                        )
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate.builder()
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerCreateParams
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .LedgerEventHandlerLedgerEntries
                                .builder()
                                .amount("string")
                                .direction("string")
                                .ledgerAccountId("string")
                                .build()
                        )
                    )
                    .build()
            )
    }
}
