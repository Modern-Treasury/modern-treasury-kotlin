package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionTest {

    @Test
    fun createTransaction() {
        val transaction =
            Transaction.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .amount(123L)
                .currency(Currency.AED)
                .direction("string")
                .vendorDescription("string")
                .vendorCode("string")
                .vendorCodeType(Transaction.VendorCodeType.BAI2)
                .vendorId("string")
                .asOfDate(LocalDate.parse("2019-12-27"))
                .asOfTime("string")
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(Transaction.Metadata.builder().build())
                .posted(true)
                .vendorCustomerId("string")
                .reconciled(true)
                .details(Transaction.Details.builder().build())
                .type(Transaction.Type.ACH)
                .build()
        assertThat(transaction).isNotNull
        assertThat(transaction.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.object_()).isEqualTo("string")
        assertThat(transaction.liveMode()).isEqualTo(true)
        assertThat(transaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transaction.amount()).isEqualTo(123L)
        assertThat(transaction.currency()).isEqualTo(Currency.AED)
        assertThat(transaction.direction()).isEqualTo("string")
        assertThat(transaction.vendorDescription()).isEqualTo("string")
        assertThat(transaction.vendorCode()).isEqualTo("string")
        assertThat(transaction.vendorCodeType()).isEqualTo(Transaction.VendorCodeType.BAI2)
        assertThat(transaction.vendorId()).isEqualTo("string")
        assertThat(transaction.asOfDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(transaction.asOfTime()).isEqualTo("string")
        assertThat(transaction.internalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transaction.metadata()).isEqualTo(Transaction.Metadata.builder().build())
        assertThat(transaction.posted()).isEqualTo(true)
        assertThat(transaction.vendorCustomerId()).isEqualTo("string")
        assertThat(transaction.reconciled()).isEqualTo(true)
        assertThat(transaction.details()).isEqualTo(Transaction.Details.builder().build())
        assertThat(transaction.type()).isEqualTo(Transaction.Type.ACH)
    }
}
