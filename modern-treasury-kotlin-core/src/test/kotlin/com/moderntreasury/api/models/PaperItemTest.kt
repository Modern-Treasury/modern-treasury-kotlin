// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaperItemTest {

    @Test
    fun createPaperItem() {
        val paperItem =
            PaperItem.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountNumber("account_number")
                .accountNumberSafe("account_number_safe")
                .amount(0L)
                .checkNumber("check_number")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .depositDate(LocalDate.parse("2019-12-27"))
                .liveMode(true)
                .lockboxNumber("lockbox_number")
                .memoField("memo_field")
                .object_("object")
                .remitterName("remitter_name")
                .routingNumber("routing_number")
                .status(PaperItem.Status.COMPLETED)
                .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(paperItem).isNotNull
        assertThat(paperItem.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paperItem.accountNumber()).isEqualTo("account_number")
        assertThat(paperItem.accountNumberSafe()).isEqualTo("account_number_safe")
        assertThat(paperItem.amount()).isEqualTo(0L)
        assertThat(paperItem.checkNumber()).isEqualTo("check_number")
        assertThat(paperItem.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paperItem.currency()).isEqualTo(Currency.AED)
        assertThat(paperItem.depositDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paperItem.liveMode()).isEqualTo(true)
        assertThat(paperItem.lockboxNumber()).isEqualTo("lockbox_number")
        assertThat(paperItem.memoField()).isEqualTo("memo_field")
        assertThat(paperItem.object_()).isEqualTo("object")
        assertThat(paperItem.remitterName()).isEqualTo("remitter_name")
        assertThat(paperItem.routingNumber()).isEqualTo("routing_number")
        assertThat(paperItem.status()).isEqualTo(PaperItem.Status.COMPLETED)
        assertThat(paperItem.transactionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paperItem.transactionLineItemId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paperItem.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
