// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
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
                    .field("ledgerable_event.name")
                    .operator("equals")
                    .value("credit_card_swipe")
                    .build()
            )
            .description("description")
            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(
                LedgerEventHandlerCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .variables(
                LedgerEventHandlerCreateParams.LedgerEventHandlerVariables.builder()
                    .putAdditionalProperty(
                        "credit_account",
                        JsonValue.from(
                            mapOf(
                                "query" to
                                    mapOf(
                                        "field" to "name",
                                        "operator" to "equals",
                                        "value" to "my_credit_account",
                                    ),
                                "type" to "ledger_account"
                            )
                        )
                    )
                    .build()
            )
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
                        .field("ledgerable_event.name")
                        .operator("equals")
                        .value("credit_card_swipe")
                        .build()
                )
                .description("description")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    LedgerEventHandlerCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .variables(
                    LedgerEventHandlerCreateParams.LedgerEventHandlerVariables.builder()
                        .putAdditionalProperty(
                            "credit_account",
                            JsonValue.from(
                                mapOf(
                                    "query" to
                                        mapOf(
                                            "field" to "name",
                                            "operator" to "equals",
                                            "value" to "my_credit_account",
                                        ),
                                    "type" to "ledger_account"
                                )
                            )
                        )
                        .build()
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
                    .field("ledgerable_event.name")
                    .operator("equals")
                    .value("credit_card_swipe")
                    .build()
            )
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .isEqualTo(
                LedgerEventHandlerCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.variables())
            .isEqualTo(
                LedgerEventHandlerCreateParams.LedgerEventHandlerVariables.builder()
                    .putAdditionalProperty(
                        "credit_account",
                        JsonValue.from(
                            mapOf(
                                "query" to
                                    mapOf(
                                        "field" to "name",
                                        "operator" to "equals",
                                        "value" to "my_credit_account",
                                    ),
                                "type" to "ledger_account"
                            )
                        )
                    )
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
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
    }
}
