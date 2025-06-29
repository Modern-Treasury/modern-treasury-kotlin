// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionLineItemTest {

    @Test
    fun create() {
        val transactionLineItem =
            TransactionLineItem.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .counterpartyId("counterparty_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expectedPaymentId("expected_payment_id")
                .liveMode(true)
                .object_("object")
                .reconcilable(true)
                .reconciliationGroupId("reconciliation_group_id")
                .transactableId("transactable_id")
                .transactableType(TransactionLineItem.TransactableType.INCOMING_PAYMENT_DETAIL)
                .transactionId("transaction_id")
                .type(TransactionLineItem.Type.ORIGINATING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(transactionLineItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(transactionLineItem.amount()).isEqualTo(0L)
        assertThat(transactionLineItem.counterpartyId()).isEqualTo("counterparty_id")
        assertThat(transactionLineItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionLineItem.description()).isEqualTo("description")
        assertThat(transactionLineItem.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionLineItem.expectedPaymentId()).isEqualTo("expected_payment_id")
        assertThat(transactionLineItem.liveMode()).isEqualTo(true)
        assertThat(transactionLineItem.object_()).isEqualTo("object")
        assertThat(transactionLineItem.reconcilable()).isEqualTo(true)
        assertThat(transactionLineItem.reconciliationGroupId()).isEqualTo("reconciliation_group_id")
        assertThat(transactionLineItem.transactableId()).isEqualTo("transactable_id")
        assertThat(transactionLineItem.transactableType())
            .isEqualTo(TransactionLineItem.TransactableType.INCOMING_PAYMENT_DETAIL)
        assertThat(transactionLineItem.transactionId()).isEqualTo("transaction_id")
        assertThat(transactionLineItem.type()).isEqualTo(TransactionLineItem.Type.ORIGINATING)
        assertThat(transactionLineItem.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionLineItem =
            TransactionLineItem.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .counterpartyId("counterparty_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expectedPaymentId("expected_payment_id")
                .liveMode(true)
                .object_("object")
                .reconcilable(true)
                .reconciliationGroupId("reconciliation_group_id")
                .transactableId("transactable_id")
                .transactableType(TransactionLineItem.TransactableType.INCOMING_PAYMENT_DETAIL)
                .transactionId("transaction_id")
                .type(TransactionLineItem.Type.ORIGINATING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTransactionLineItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionLineItem),
                jacksonTypeRef<TransactionLineItem>(),
            )

        assertThat(roundtrippedTransactionLineItem).isEqualTo(transactionLineItem)
    }
}
