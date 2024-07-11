// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerCreateParamsTest {

    @Test
    fun createLedgerEventHandlerCreateParams() {
        LedgerEventHandlerCreateParams.builder()
            .ledgerTransactionTemplate(
                LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate.builder()
                    .description("My Ledger Transaction Template Description")
                    .effectiveAt("{{ledgerable_event.custom_data.effective_at}}")
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerCreateParams
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .LedgerEventHandlerLedgerEntries
                                .builder()
                                .amount("amount")
                                .direction("direction")
                                .ledgerAccountId("ledger_account_id")
                                .build()
                        )
                    )
                    .status("posted")
                    .build()
            )
            .name("name")
            .conditions(
                LedgerEventHandlerCreateParams.LedgerEventHandlerConditions.builder()
                    .field("field")
                    .operator("operator")
                    .value("value")
                    .build()
            )
            .description("description")
            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(LedgerEventHandlerCreateParams.Metadata.builder().build())
            .variables(LedgerEventHandlerCreateParams.LedgerEventHandlerVariables.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerEventHandlerCreateParams.builder()
                .ledgerTransactionTemplate(
                    LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate
                        .builder()
                        .description("My Ledger Transaction Template Description")
                        .effectiveAt("{{ledgerable_event.custom_data.effective_at}}")
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandlerCreateParams
                                    .LedgerEventHandlerLedgerTransactionTemplate
                                    .LedgerEventHandlerLedgerEntries
                                    .builder()
                                    .amount("amount")
                                    .direction("direction")
                                    .ledgerAccountId("ledger_account_id")
                                    .build()
                            )
                        )
                        .status("posted")
                        .build()
                )
                .name("name")
                .conditions(
                    LedgerEventHandlerCreateParams.LedgerEventHandlerConditions.builder()
                        .field("field")
                        .operator("operator")
                        .value("value")
                        .build()
                )
                .description("description")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(LedgerEventHandlerCreateParams.Metadata.builder().build())
                .variables(
                    LedgerEventHandlerCreateParams.LedgerEventHandlerVariables.builder().build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate.builder()
                    .description("My Ledger Transaction Template Description")
                    .effectiveAt("{{ledgerable_event.custom_data.effective_at}}")
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerCreateParams
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .LedgerEventHandlerLedgerEntries
                                .builder()
                                .amount("amount")
                                .direction("direction")
                                .ledgerAccountId("ledger_account_id")
                                .build()
                        )
                    )
                    .status("posted")
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.conditions())
            .isEqualTo(
                LedgerEventHandlerCreateParams.LedgerEventHandlerConditions.builder()
                    .field("field")
                    .operator("operator")
                    .value("value")
                    .build()
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .isEqualTo(LedgerEventHandlerCreateParams.Metadata.builder().build())
        assertThat(body.variables())
            .isEqualTo(LedgerEventHandlerCreateParams.LedgerEventHandlerVariables.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerEventHandlerCreateParams.builder()
                .ledgerTransactionTemplate(
                    LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate
                        .builder()
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandlerCreateParams
                                    .LedgerEventHandlerLedgerTransactionTemplate
                                    .LedgerEventHandlerLedgerEntries
                                    .builder()
                                    .amount("amount")
                                    .direction("direction")
                                    .ledgerAccountId("ledger_account_id")
                                    .build()
                            )
                        )
                        .build()
                )
                .name("name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.ledgerTransactionTemplate())
            .isEqualTo(
                LedgerEventHandlerCreateParams.LedgerEventHandlerLedgerTransactionTemplate.builder()
                    .ledgerEntries(
                        listOf(
                            LedgerEventHandlerCreateParams
                                .LedgerEventHandlerLedgerTransactionTemplate
                                .LedgerEventHandlerLedgerEntries
                                .builder()
                                .amount("amount")
                                .direction("direction")
                                .ledgerAccountId("ledger_account_id")
                                .build()
                        )
                    )
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
    }
}
