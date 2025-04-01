// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerEventHandlerVariableTest {

    @Test
    fun create() {
        val ledgerEventHandlerVariable =
            LedgerEventHandlerVariable.builder()
                .query(
                    LedgerEventHandlerVariable.LedgerEventHandlerConditions.builder()
                        .field("name")
                        .operator("equals")
                        .value("my_credit_account")
                        .build()
                )
                .type("ledger_account")
                .build()

        assertThat(ledgerEventHandlerVariable.query())
            .isEqualTo(
                LedgerEventHandlerVariable.LedgerEventHandlerConditions.builder()
                    .field("name")
                    .operator("equals")
                    .value("my_credit_account")
                    .build()
            )
        assertThat(ledgerEventHandlerVariable.type()).isEqualTo("ledger_account")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerEventHandlerVariable =
            LedgerEventHandlerVariable.builder()
                .query(
                    LedgerEventHandlerVariable.LedgerEventHandlerConditions.builder()
                        .field("name")
                        .operator("equals")
                        .value("my_credit_account")
                        .build()
                )
                .type("ledger_account")
                .build()

        val roundtrippedLedgerEventHandlerVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerEventHandlerVariable),
                jacksonTypeRef<LedgerEventHandlerVariable>(),
            )

        assertThat(roundtrippedLedgerEventHandlerVariable).isEqualTo(ledgerEventHandlerVariable)
    }
}
