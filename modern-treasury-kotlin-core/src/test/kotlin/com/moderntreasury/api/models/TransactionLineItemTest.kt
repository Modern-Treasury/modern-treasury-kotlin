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
                .amount(123L)
                .counterpartyId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("string")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expectedPaymentId("string")
                .liveMode(true)
                .object_("string")
                .transactableId("string")
                .transactableType(TransactionLineItem.TransactableType.INCOMING_PAYMENT_DETAIL)
                .transactionId("string")
                .type(TransactionLineItem.Type.ORIGINATING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(transactionLineItem).isNotNull
        assertThat(transactionLineItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionLineItem.amount()).isEqualTo(123L)
        assertThat(transactionLineItem.counterpartyId()).isEqualTo("string")
        assertThat(transactionLineItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionLineItem.description()).isEqualTo("string")
        assertThat(transactionLineItem.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionLineItem.expectedPaymentId()).isEqualTo("string")
        assertThat(transactionLineItem.liveMode()).isEqualTo(true)
        assertThat(transactionLineItem.object_()).isEqualTo("string")
        assertThat(transactionLineItem.transactableId()).isEqualTo("string")
        assertThat(transactionLineItem.transactableType())
            .isEqualTo(TransactionLineItem.TransactableType.INCOMING_PAYMENT_DETAIL)
        assertThat(transactionLineItem.transactionId()).isEqualTo("string")
        assertThat(transactionLineItem.type()).isEqualTo(TransactionLineItem.Type.ORIGINATING)
        assertThat(transactionLineItem.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
