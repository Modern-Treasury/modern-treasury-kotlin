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
            .amountLowerBound(0L)
            .amountUpperBound(0L)
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .currency(Currency.AED)
            .dateLowerBound(LocalDate.parse("2019-12-27"))
            .dateUpperBound(LocalDate.parse("2019-12-27"))
            .description("description")
            .direction(ExpectedPaymentUpdateParams.Direction.CREDIT)
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(
                ExpectedPaymentUpdateParams.Metadata.builder()
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
            .status(ExpectedPaymentUpdateParams.Status.RECONCILED)
            .type(ExpectedPaymentType.ACH)
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
                .amountLowerBound(0L)
                .amountUpperBound(0L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("description")
                .direction(ExpectedPaymentUpdateParams.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    ExpectedPaymentUpdateParams.Metadata.builder()
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
                .status(ExpectedPaymentUpdateParams.Status.RECONCILED)
                .type(ExpectedPaymentType.ACH)
                .build()

        val body = params._body()

        assertThat(body.amountLowerBound()).isEqualTo(0L)
        assertThat(body.amountUpperBound()).isEqualTo(0L)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.dateLowerBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.dateUpperBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.direction()).isEqualTo(ExpectedPaymentUpdateParams.Direction.CREDIT)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .isEqualTo(
                ExpectedPaymentUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body._reconciliationFilters()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._reconciliationGroups()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.reconciliationRuleVariables())
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
        assertThat(body.remittanceInformation()).isEqualTo("remittance_information")
        assertThat(body.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(body.status()).isEqualTo(ExpectedPaymentUpdateParams.Status.RECONCILED)
        assertThat(body.type()).isEqualTo(ExpectedPaymentType.ACH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExpectedPaymentUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
