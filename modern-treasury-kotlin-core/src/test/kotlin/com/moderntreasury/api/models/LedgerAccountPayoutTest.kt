// File generated from our OpenAPI spec by Stainless.

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
                .amount(123L)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("string")
                .currencyExponent(123L)
                .description("string")
                .effectiveAtUpperBound("string")
                .fundingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(LedgerAccountPayout.Metadata.builder().build())
                .object_("string")
                .payoutLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .status(LedgerAccountPayout.Status.ARCHIVED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerAccountPayout).isNotNull
        assertThat(ledgerAccountPayout.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.amount()).isEqualTo(123L)
        assertThat(ledgerAccountPayout.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountPayout.currency()).isEqualTo("string")
        assertThat(ledgerAccountPayout.currencyExponent()).isEqualTo(123L)
        assertThat(ledgerAccountPayout.description()).isEqualTo("string")
        assertThat(ledgerAccountPayout.effectiveAtUpperBound()).isEqualTo("string")
        assertThat(ledgerAccountPayout.fundingLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountPayout.metadata())
            .isEqualTo(LedgerAccountPayout.Metadata.builder().build())
        assertThat(ledgerAccountPayout.object_()).isEqualTo("string")
        assertThat(ledgerAccountPayout.payoutLedgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountPayout.status()).isEqualTo(LedgerAccountPayout.Status.ARCHIVED)
        assertThat(ledgerAccountPayout.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
