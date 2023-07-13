package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountPayoutTest {

    @Test
    fun createLedgerAccountPayout() {
        val ledgerAccountPayout =
            LedgerAccountPayout.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .status(LedgerAccountPayout.Status.ARCHIVED)
                .payoutLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fundingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveAtUpperBound("string")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(123L)
                .currency("string")
                .currencyExponent(123L)
                .metadata(LedgerAccountPayout.Metadata.builder().build())
                .build()
        assertThat(ledgerAccountPayout).isNotNull
        assertThat(ledgerAccountPayout.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.object_()).isEqualTo("string")
        assertThat(ledgerAccountPayout.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountPayout.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountPayout.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountPayout.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.description()).isEqualTo("string")
        assertThat(ledgerAccountPayout.status()).isEqualTo(LedgerAccountPayout.Status.ARCHIVED)
        assertThat(ledgerAccountPayout.payoutLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.fundingLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.effectiveAtUpperBound()).isEqualTo("string")
        assertThat(ledgerAccountPayout.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.amount()).isEqualTo(123L)
        assertThat(ledgerAccountPayout.currency()).isEqualTo("string")
        assertThat(ledgerAccountPayout.currencyExponent()).isEqualTo(123L)
        assertThat(ledgerAccountPayout.metadata())
            .isEqualTo(LedgerAccountPayout.Metadata.builder().build())
    }
}
