package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransactionLineItemTest {

    @Test
    fun createTransactionLineItem() {
        val transactionLineItem =
            TransactionLineItem.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(TransactionLineItem.Type.ORIGINATING)
                .transactableType(TransactionLineItem.TransactableType.INCOMING_PAYMENT_DETAIL)
                .transactableId("string")
                .amount(123L)
                .description("string")
                .counterpartyId("string")
                .expectedPaymentId("string")
                .build()
        assertThat(transactionLineItem).isNotNull
        assertThat(transactionLineItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionLineItem.object_()).isEqualTo("string")
        assertThat(transactionLineItem.liveMode()).isEqualTo(true)
        assertThat(transactionLineItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionLineItem.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionLineItem.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionLineItem.type()).isEqualTo(TransactionLineItem.Type.ORIGINATING)
        assertThat(transactionLineItem.transactableType())
            .isEqualTo(TransactionLineItem.TransactableType.INCOMING_PAYMENT_DETAIL)
        assertThat(transactionLineItem.transactableId()).isEqualTo("string")
        assertThat(transactionLineItem.amount()).isEqualTo(123L)
        assertThat(transactionLineItem.description()).isEqualTo("string")
        assertThat(transactionLineItem.counterpartyId()).isEqualTo("string")
        assertThat(transactionLineItem.expectedPaymentId()).isEqualTo("string")
    }
}
