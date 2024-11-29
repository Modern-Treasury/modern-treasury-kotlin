// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountSettlementTest {

    @Test
    fun createLedgerAccountSettlement() {
        val ledgerAccountSettlement =
            LedgerAccountSettlement.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .contraLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .currencyExponent(0L)
                .description("description")
                .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(LedgerAccountSettlement.Metadata.builder().build())
                .object_("object")
                .settledLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .settlementEntryDirection("settlement_entry_direction")
                .status(LedgerAccountSettlement.Status.ARCHIVED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerAccountSettlement).isNotNull
        assertThat(ledgerAccountSettlement.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountSettlement.amount()).isEqualTo(0L)
        assertThat(ledgerAccountSettlement.contraLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountSettlement.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountSettlement.currency()).isEqualTo("currency")
        assertThat(ledgerAccountSettlement.currencyExponent()).isEqualTo(0L)
        assertThat(ledgerAccountSettlement.description()).isEqualTo("description")
        assertThat(ledgerAccountSettlement.effectiveAtUpperBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountSettlement.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountSettlement.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountSettlement.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountSettlement.metadata())
            .isEqualTo(LedgerAccountSettlement.Metadata.builder().build())
        assertThat(ledgerAccountSettlement.object_()).isEqualTo("object")
        assertThat(ledgerAccountSettlement.settledLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountSettlement.settlementEntryDirection())
            .isEqualTo("settlement_entry_direction")
        assertThat(ledgerAccountSettlement.status())
            .isEqualTo(LedgerAccountSettlement.Status.ARCHIVED)
        assertThat(ledgerAccountSettlement.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
