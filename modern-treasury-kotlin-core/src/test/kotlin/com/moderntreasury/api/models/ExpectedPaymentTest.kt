// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpectedPaymentTest {

    @Test
    fun create() {
        val expectedPayment =
            ExpectedPayment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amountLowerBound(0L)
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPayment.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    ExpectedPayment.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .reconciliationFilters(JsonValue.from(mapOf<String, Any>()))
                .reconciliationGroups(JsonValue.from(mapOf<String, Any>()))
                .reconciliationMethod(ExpectedPayment.ReconciliationMethod.AUTOMATIC)
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
                .status(ExpectedPayment.Status.ARCHIVED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ExpectedPaymentType.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(expectedPayment.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.amountLowerBound()).isEqualTo(0L)
        assertThat(expectedPayment.amountUpperBound()).isEqualTo(0L)
        assertThat(expectedPayment.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(expectedPayment.currency()).isEqualTo(Currency.AED)
        assertThat(expectedPayment.dateLowerBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(expectedPayment.dateUpperBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(expectedPayment.description()).isEqualTo("description")
        assertThat(expectedPayment.direction()).isEqualTo(ExpectedPayment.Direction.CREDIT)
        assertThat(expectedPayment.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.liveMode()).isEqualTo(true)
        assertThat(expectedPayment.metadata())
            .isEqualTo(
                ExpectedPayment.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(expectedPayment.object_()).isEqualTo("object")
        assertThat(expectedPayment._reconciliationFilters())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(expectedPayment._reconciliationGroups())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(expectedPayment.reconciliationMethod())
            .isEqualTo(ExpectedPayment.ReconciliationMethod.AUTOMATIC)
        assertThat(expectedPayment.reconciliationRuleVariables())
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
        assertThat(expectedPayment.remittanceInformation()).isEqualTo("remittance_information")
        assertThat(expectedPayment.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(expectedPayment.status()).isEqualTo(ExpectedPayment.Status.ARCHIVED)
        assertThat(expectedPayment.transactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.transactionLineItemId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.type()).isEqualTo(ExpectedPaymentType.ACH)
        assertThat(expectedPayment.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val expectedPayment =
            ExpectedPayment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amountLowerBound(0L)
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPayment.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    ExpectedPayment.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .reconciliationFilters(JsonValue.from(mapOf<String, Any>()))
                .reconciliationGroups(JsonValue.from(mapOf<String, Any>()))
                .reconciliationMethod(ExpectedPayment.ReconciliationMethod.AUTOMATIC)
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
                .status(ExpectedPayment.Status.ARCHIVED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ExpectedPaymentType.ACH)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedExpectedPayment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(expectedPayment),
                jacksonTypeRef<ExpectedPayment>(),
            )

        assertThat(roundtrippedExpectedPayment).isEqualTo(expectedPayment)
    }
}
