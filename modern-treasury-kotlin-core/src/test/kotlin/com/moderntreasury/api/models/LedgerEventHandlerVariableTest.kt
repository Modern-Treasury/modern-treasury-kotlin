// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerEventHandlerVariableTest {

    @Test
    fun createLedgerEventHandlerVariable() {
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
        assertThat(ledgerEventHandlerVariable).isNotNull
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
}
