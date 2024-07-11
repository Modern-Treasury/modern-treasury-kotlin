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
                        .field("field")
                        .operator("operator")
                        .value("value")
                        .build()
                )
                .type("type")
                .build()
        assertThat(ledgerEventHandlerVariable).isNotNull
        assertThat(ledgerEventHandlerVariable.query())
            .isEqualTo(
                LedgerEventHandlerVariable.LedgerEventHandlerConditions.builder()
                    .field("field")
                    .operator("operator")
                    .value("value")
                    .build()
            )
        assertThat(ledgerEventHandlerVariable.type()).isEqualTo("type")
    }
}
