// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpectedPaymentUpdateParamsTest {

    @Test
    fun create() {
        ExpectedPaymentUpdateParams.builder()
            .id("id")
            .expectedPaymentUpdate(
                ExpectedPaymentUpdate.builder()
                    .amountLowerBound(0L)
                    .amountReconciled(0L)
                    .amountReconciledDirection(
                        ExpectedPaymentUpdate.AmountReconciledDirection.CREDIT
                    )
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = ExpectedPaymentUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExpectedPaymentUpdateParams.builder()
                .id("id")
                .expectedPaymentUpdate(
                    ExpectedPaymentUpdate.builder()
                        .amountLowerBound(0L)
                        .amountReconciled(0L)
                        .amountReconciledDirection(
                            ExpectedPaymentUpdate.AmountReconciledDirection.CREDIT
                        )
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExpectedPaymentUpdate.builder()
                    .amountLowerBound(0L)
                    .amountReconciled(0L)
                    .amountReconciledDirection(
                        ExpectedPaymentUpdate.AmountReconciledDirection.CREDIT
                    )
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExpectedPaymentUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
