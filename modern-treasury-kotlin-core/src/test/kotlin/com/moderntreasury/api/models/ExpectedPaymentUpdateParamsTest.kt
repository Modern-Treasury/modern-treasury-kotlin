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
            .amountUpperBound(123L)
            .amountLowerBound(123L)
            .direction(ExpectedPaymentUpdateParams.Direction.CREDIT)
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(ExpectedPaymentType.ACH)
            .currency(Currency.AED)
            .dateUpperBound(LocalDate.parse("2019-12-27"))
            .dateLowerBound(LocalDate.parse("2019-12-27"))
            .description("string")
            .statementDescriptor("string")
            .metadata(ExpectedPaymentUpdateParams.Metadata.builder().build())
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .remittanceInformation("string")
            .reconciliationGroups(JsonNull.of())
            .reconciliationFilters(JsonNull.of())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExpectedPaymentUpdateParams.builder()
                .id("string")
                .amountUpperBound(123L)
                .amountLowerBound(123L)
                .direction(ExpectedPaymentUpdateParams.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ExpectedPaymentType.ACH)
                .currency(Currency.AED)
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .description("string")
                .statementDescriptor("string")
                .metadata(ExpectedPaymentUpdateParams.Metadata.builder().build())
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .remittanceInformation("string")
                .reconciliationGroups(JsonNull.of())
                .reconciliationFilters(JsonNull.of())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amountUpperBound()).isEqualTo(123L)
        assertThat(body.amountLowerBound()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo(ExpectedPaymentUpdateParams.Direction.CREDIT)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(ExpectedPaymentType.ACH)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.dateUpperBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.dateLowerBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.statementDescriptor()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(ExpectedPaymentUpdateParams.Metadata.builder().build())
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.remittanceInformation()).isEqualTo("string")
        assertThat(body.reconciliationGroups()).isEqualTo(JsonNull.of())
        assertThat(body.reconciliationFilters()).isEqualTo(JsonNull.of())
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
