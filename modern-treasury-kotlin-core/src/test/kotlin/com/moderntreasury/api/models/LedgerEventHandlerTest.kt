// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
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
                        .field("ledgerable_event.name")
                        .operator("equals")
                        .value("credit_card_swipe")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("My Description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerId("ledger_id")
                .ledgerTransactionTemplate(
                    LedgerEventHandler.LedgerEventHandlerLedgerTransactionTemplate.builder()
                        .description("My Ledger Transaction Template Description")
                        .effectiveAt("{{ledgerable_event.custom_data.effective_at}}")
                        .ledgerEntries(
                            listOf(
                                LedgerEventHandler.LedgerEventHandlerLedgerTransactionTemplate
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
                .liveMode(true)
                .metadata(
                    LedgerEventHandler.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("My Event Handler")
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .variables(
                    LedgerEventHandler.LedgerEventHandlerVariables.builder()
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
        assertThat(ledgerEventHandler).isNotNull
        assertThat(ledgerEventHandler.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerEventHandler.conditions())
            .isEqualTo(
                LedgerEventHandler.LedgerEventHandlerConditions.builder()
                    .field("ledgerable_event.name")
                    .operator("equals")
                    .value("credit_card_swipe")
                    .build()
            )
        assertThat(ledgerEventHandler.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandler.description()).isEqualTo("My Description")
        assertThat(ledgerEventHandler.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandler.ledgerId()).isEqualTo("ledger_id")
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
                                .amount("amount")
                                .direction("direction")
                                .ledgerAccountId("ledger_account_id")
                                .build()
                        )
                    )
                    .status("posted")
                    .build()
            )
        assertThat(ledgerEventHandler.liveMode()).isEqualTo(true)
        assertThat(ledgerEventHandler.metadata())
            .isEqualTo(
                LedgerEventHandler.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerEventHandler.name()).isEqualTo("My Event Handler")
        assertThat(ledgerEventHandler.object_()).isEqualTo("object")
        assertThat(ledgerEventHandler.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerEventHandler.variables())
            .isEqualTo(
                LedgerEventHandler.LedgerEventHandlerVariables.builder()
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
}
