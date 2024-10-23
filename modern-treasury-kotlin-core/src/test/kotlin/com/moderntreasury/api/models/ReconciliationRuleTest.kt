// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ReconciliationRuleTest {

    @Test
    fun createReconciliationRule() {
        val reconciliationRule =
            ReconciliationRule.builder()
                .amountLowerBound(123L)
                .amountUpperBound(123L)
                .direction(ReconciliationRule.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .customIdentifiers(ReconciliationRule.CustomIdentifiers.builder().build())
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .type(ReconciliationRule.Type.ACH)
                .build()
        assertThat(reconciliationRule).isNotNull
        assertThat(reconciliationRule.amountLowerBound()).isEqualTo(123L)
        assertThat(reconciliationRule.amountUpperBound()).isEqualTo(123L)
        assertThat(reconciliationRule.direction()).isEqualTo(ReconciliationRule.Direction.CREDIT)
        assertThat(reconciliationRule.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(reconciliationRule.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(reconciliationRule.currency()).isEqualTo(Currency.AED)
        assertThat(reconciliationRule.customIdentifiers())
            .isEqualTo(ReconciliationRule.CustomIdentifiers.builder().build())
        assertThat(reconciliationRule.dateLowerBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(reconciliationRule.dateUpperBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(reconciliationRule.type()).isEqualTo(ReconciliationRule.Type.ACH)
    }
}
