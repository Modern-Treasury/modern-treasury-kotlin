// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpectedPaymentUpdateParamsTest {

    @Test
    fun createExpectedPaymentUpdateParams() {
        ExpectedPaymentUpdateParams.builder()
            .id("string")
            .amountLowerBound(123L)
            .amountUpperBound(123L)
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .currency(Currency.AED)
            .dateLowerBound(LocalDate.parse("2019-12-27"))
            .dateUpperBound(LocalDate.parse("2019-12-27"))
            .description("string")
            .direction(TransactionDirection.CREDIT)
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(ExpectedPaymentUpdateParams.Metadata.builder().build())
            .reconciliationFilters(JsonNull.of())
            .reconciliationGroups(JsonNull.of())
            .reconciliationRuleVariables(
                listOf(ExpectedPaymentUpdateParams.ReconciliationRuleVariable.builder().build())
            )
            .remittanceInformation("string")
            .statementDescriptor("string")
            .status(ExpectedPaymentUpdateParams.Status.RECONCILED)
            .type(ExpectedPaymentType.ACH)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExpectedPaymentUpdateParams.builder()
                .id("string")
                .amountLowerBound(123L)
                .amountUpperBound(123L)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .description("string")
                .direction(TransactionDirection.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(ExpectedPaymentUpdateParams.Metadata.builder().build())
                .reconciliationFilters(JsonNull.of())
                .reconciliationGroups(JsonNull.of())
                .reconciliationRuleVariables(
                    listOf(ExpectedPaymentUpdateParams.ReconciliationRuleVariable.builder().build())
                )
                .remittanceInformation("string")
                .statementDescriptor("string")
                .status(ExpectedPaymentUpdateParams.Status.RECONCILED)
                .type(ExpectedPaymentType.ACH)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amountLowerBound()).isEqualTo(123L)
        assertThat(body.amountUpperBound()).isEqualTo(123L)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.dateLowerBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.dateUpperBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.direction()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .isEqualTo(ExpectedPaymentUpdateParams.Metadata.builder().build())
        assertThat(body.reconciliationFilters()).isEqualTo(JsonNull.of())
        assertThat(body.reconciliationGroups()).isEqualTo(JsonNull.of())
        assertThat(body.reconciliationRuleVariables())
            .isEqualTo(
                listOf(ExpectedPaymentUpdateParams.ReconciliationRuleVariable.builder().build())
            )
        assertThat(body.remittanceInformation()).isEqualTo("string")
        assertThat(body.statementDescriptor()).isEqualTo("string")
        assertThat(body.status()).isEqualTo(ExpectedPaymentUpdateParams.Status.RECONCILED)
        assertThat(body.type()).isEqualTo(ExpectedPaymentType.ACH)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ExpectedPaymentUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = ExpectedPaymentUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
