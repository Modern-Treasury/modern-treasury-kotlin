// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpectedPaymentUpdateTest {

    @Test
    fun create() {
        val expectedPaymentUpdate =
            ExpectedPaymentUpdate.builder()
                .amountLowerBound(0L)
                .amountReconciled(0L)
                .amountReconciledDirection(ExpectedPaymentUpdate.AmountReconciledDirection.CREDIT)
                .amountUnreconciled(0L)
                .amountUnreconciledDirection(
                    ExpectedPaymentUpdate.AmountUnreconciledDirection.CREDIT
                )
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPaymentUpdate.Direction.CREDIT)
                .externalId("external_id")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    ExpectedPaymentUpdate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .reconciliationFilters(JsonValue.from(mapOf<String, Any>()))
                .reconciliationGroups(JsonValue.from(mapOf<String, Any>()))
                .addReconciliationRuleVariable(
                    ReconciliationRule.builder()
                        .amountLowerBound(0L)
                        .amountUpperBound(0L)
                        .direction(ReconciliationRule.Direction.CREDIT)
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency(Currency.AED)
                        .customIdentifiers(
                            ReconciliationRule.CustomIdentifiers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .dateLowerBound(LocalDate.parse("2019-12-27"))
                        .dateUpperBound(LocalDate.parse("2019-12-27"))
                        .type(ReconciliationRule.Type.ACH)
                        .build()
                )
                .remittanceInformation("remittance_information")
                .statementDescriptor("statement_descriptor")
                .status(ExpectedPaymentUpdate.Status.RECONCILED)
                .type(ExpectedPaymentType.ACH)
                .build()

        assertThat(expectedPaymentUpdate.amountLowerBound()).isEqualTo(0L)
        assertThat(expectedPaymentUpdate.amountReconciled()).isEqualTo(0L)
        assertThat(expectedPaymentUpdate.amountReconciledDirection())
            .isEqualTo(ExpectedPaymentUpdate.AmountReconciledDirection.CREDIT)
        assertThat(expectedPaymentUpdate.amountUnreconciled()).isEqualTo(0L)
        assertThat(expectedPaymentUpdate.amountUnreconciledDirection())
            .isEqualTo(ExpectedPaymentUpdate.AmountUnreconciledDirection.CREDIT)
        assertThat(expectedPaymentUpdate.amountUpperBound()).isEqualTo(0L)
        assertThat(expectedPaymentUpdate.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPaymentUpdate.currency()).isEqualTo(Currency.AED)
        assertThat(expectedPaymentUpdate.dateLowerBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(expectedPaymentUpdate.dateUpperBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(expectedPaymentUpdate.description()).isEqualTo("description")
        assertThat(expectedPaymentUpdate.direction())
            .isEqualTo(ExpectedPaymentUpdate.Direction.CREDIT)
        assertThat(expectedPaymentUpdate.externalId()).isEqualTo("external_id")
        assertThat(expectedPaymentUpdate.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPaymentUpdate.metadata())
            .isEqualTo(
                ExpectedPaymentUpdate.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(expectedPaymentUpdate._reconciliationFilters())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(expectedPaymentUpdate._reconciliationGroups())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(expectedPaymentUpdate.reconciliationRuleVariables())
            .containsExactly(
                ReconciliationRule.builder()
                    .amountLowerBound(0L)
                    .amountUpperBound(0L)
                    .direction(ReconciliationRule.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .customIdentifiers(
                        ReconciliationRule.CustomIdentifiers.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .type(ReconciliationRule.Type.ACH)
                    .build()
            )
        assertThat(expectedPaymentUpdate.remittanceInformation())
            .isEqualTo("remittance_information")
        assertThat(expectedPaymentUpdate.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(expectedPaymentUpdate.status())
            .isEqualTo(ExpectedPaymentUpdate.Status.RECONCILED)
        assertThat(expectedPaymentUpdate.type()).isEqualTo(ExpectedPaymentType.ACH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val expectedPaymentUpdate =
            ExpectedPaymentUpdate.builder()
                .amountLowerBound(0L)
                .amountReconciled(0L)
                .amountReconciledDirection(ExpectedPaymentUpdate.AmountReconciledDirection.CREDIT)
                .amountUnreconciled(0L)
                .amountUnreconciledDirection(
                    ExpectedPaymentUpdate.AmountUnreconciledDirection.CREDIT
                )
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPaymentUpdate.Direction.CREDIT)
                .externalId("external_id")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    ExpectedPaymentUpdate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .reconciliationFilters(JsonValue.from(mapOf<String, Any>()))
                .reconciliationGroups(JsonValue.from(mapOf<String, Any>()))
                .addReconciliationRuleVariable(
                    ReconciliationRule.builder()
                        .amountLowerBound(0L)
                        .amountUpperBound(0L)
                        .direction(ReconciliationRule.Direction.CREDIT)
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency(Currency.AED)
                        .customIdentifiers(
                            ReconciliationRule.CustomIdentifiers.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .dateLowerBound(LocalDate.parse("2019-12-27"))
                        .dateUpperBound(LocalDate.parse("2019-12-27"))
                        .type(ReconciliationRule.Type.ACH)
                        .build()
                )
                .remittanceInformation("remittance_information")
                .statementDescriptor("statement_descriptor")
                .status(ExpectedPaymentUpdate.Status.RECONCILED)
                .type(ExpectedPaymentType.ACH)
                .build()

        val roundtrippedExpectedPaymentUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expectedPaymentUpdate),
                jacksonTypeRef<ExpectedPaymentUpdate>(),
            )

        assertThat(roundtrippedExpectedPaymentUpdate).isEqualTo(expectedPaymentUpdate)
    }
}
