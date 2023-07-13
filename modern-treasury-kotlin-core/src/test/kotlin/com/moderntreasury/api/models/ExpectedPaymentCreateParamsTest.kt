package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpectedPaymentCreateParamsTest {

    @Test
    fun createExpectedPaymentCreateParams() {
        ExpectedPaymentCreateParams.builder()
            .amountUpperBound(123L)
            .amountLowerBound(123L)
            .direction(ExpectedPaymentCreateParams.Direction.CREDIT)
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(ExpectedPaymentType.ACH)
            .currency(Currency.AED)
            .dateUpperBound(LocalDate.parse("2019-12-27"))
            .dateLowerBound(LocalDate.parse("2019-12-27"))
            .description("string")
            .statementDescriptor("string")
            .metadata(ExpectedPaymentCreateParams.Metadata.builder().build())
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .remittanceInformation("string")
            .reconciliationGroups(JsonNull.of())
            .reconciliationFilters(JsonNull.of())
            .lineItems(
                listOf(
                    ExpectedPaymentCreateParams.LineItemRequest.builder()
                        .amount(123L)
                        .metadata(
                            ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder().build()
                        )
                        .description("string")
                        .accountingCategoryId("string")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExpectedPaymentCreateParams.builder()
                .amountUpperBound(123L)
                .amountLowerBound(123L)
                .direction(ExpectedPaymentCreateParams.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ExpectedPaymentType.ACH)
                .currency(Currency.AED)
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .description("string")
                .statementDescriptor("string")
                .metadata(ExpectedPaymentCreateParams.Metadata.builder().build())
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .remittanceInformation("string")
                .reconciliationGroups(JsonNull.of())
                .reconciliationFilters(JsonNull.of())
                .lineItems(
                    listOf(
                        ExpectedPaymentCreateParams.LineItemRequest.builder()
                            .amount(123L)
                            .metadata(
                                ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder()
                                    .build()
                            )
                            .description("string")
                            .accountingCategoryId("string")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amountUpperBound()).isEqualTo(123L)
        assertThat(body.amountLowerBound()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo(ExpectedPaymentCreateParams.Direction.CREDIT)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(ExpectedPaymentType.ACH)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.dateUpperBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.dateLowerBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.statementDescriptor()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(ExpectedPaymentCreateParams.Metadata.builder().build())
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.remittanceInformation()).isEqualTo("string")
        assertThat(body.reconciliationGroups()).isEqualTo(JsonNull.of())
        assertThat(body.reconciliationFilters()).isEqualTo(JsonNull.of())
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
                    ExpectedPaymentCreateParams.LineItemRequest.builder()
                        .amount(123L)
                        .metadata(
                            ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder().build()
                        )
                        .description("string")
                        .accountingCategoryId("string")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExpectedPaymentCreateParams.builder()
                .amountUpperBound(123L)
                .amountLowerBound(123L)
                .direction(ExpectedPaymentCreateParams.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.amountUpperBound()).isEqualTo(123L)
        assertThat(body.amountLowerBound()).isEqualTo(123L)
        assertThat(body.direction()).isEqualTo(ExpectedPaymentCreateParams.Direction.CREDIT)
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
