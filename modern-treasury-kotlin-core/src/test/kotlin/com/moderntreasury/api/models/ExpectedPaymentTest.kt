package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonNull
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpectedPaymentTest {

    @Test
    fun createExpectedPayment() {
        val expectedPayment =
            ExpectedPayment.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .amountUpperBound(123L)
                .amountLowerBound(123L)
                .direction(ExpectedPayment.Direction.CREDIT)
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(ExpectedPaymentType.ACH)
                .currency(Currency.AED)
                .dateUpperBound(LocalDate.parse("2019-12-27"))
                .dateLowerBound(LocalDate.parse("2019-12-27"))
                .description("string")
                .statementDescriptor("string")
                .metadata(ExpectedPayment.Metadata.builder().build())
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .remittanceInformation("string")
                .reconciliationGroups(JsonNull.of())
                .reconciliationFilters(JsonNull.of())
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(ExpectedPayment.Status.ARCHIVED)
                .reconciliationMethod(ExpectedPayment.ReconciliationMethod.AUTOMATIC)
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(expectedPayment).isNotNull
        assertThat(expectedPayment.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.object_()).isEqualTo("string")
        assertThat(expectedPayment.liveMode()).isEqualTo(true)
        assertThat(expectedPayment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(expectedPayment.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(expectedPayment.amountUpperBound()).isEqualTo(123L)
        assertThat(expectedPayment.amountLowerBound()).isEqualTo(123L)
        assertThat(expectedPayment.direction()).isEqualTo(ExpectedPayment.Direction.CREDIT)
        assertThat(expectedPayment.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.type()).isEqualTo(ExpectedPaymentType.ACH)
        assertThat(expectedPayment.currency()).isEqualTo(Currency.AED)
        assertThat(expectedPayment.dateUpperBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(expectedPayment.dateLowerBound()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(expectedPayment.description()).isEqualTo("string")
        assertThat(expectedPayment.statementDescriptor()).isEqualTo("string")
        assertThat(expectedPayment.metadata()).isEqualTo(ExpectedPayment.Metadata.builder().build())
        assertThat(expectedPayment.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.remittanceInformation()).isEqualTo("string")
        assertThat(expectedPayment._reconciliationGroups()).isEqualTo(JsonNull.of())
        assertThat(expectedPayment._reconciliationFilters()).isEqualTo(JsonNull.of())
        assertThat(expectedPayment.transactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.transactionLineItemId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(expectedPayment.status()).isEqualTo(ExpectedPayment.Status.ARCHIVED)
        assertThat(expectedPayment.reconciliationMethod())
            .isEqualTo(ExpectedPayment.ReconciliationMethod.AUTOMATIC)
        assertThat(expectedPayment.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
