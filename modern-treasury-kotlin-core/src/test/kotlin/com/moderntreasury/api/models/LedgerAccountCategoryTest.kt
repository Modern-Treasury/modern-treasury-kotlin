package com.moderntreasury.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryTest {

    @Test
    fun createLedgerAccountCategory() {
        val ledgerAccountCategory =
            LedgerAccountCategory.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .object_("string")
                .liveMode(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("string")
                .description("string")
                .metadata(LedgerAccountCategory.Metadata.builder().build())
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .normalBalance(LedgerAccountCategory.NormalBalance.CREDIT)
                .balances(
                    LedgerAccountCategory.LedgerBalances.builder()
                        .pendingBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .credits(123L)
                                .debits(123L)
                                .amount(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .credits(123L)
                                .debits(123L)
                                .amount(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .build()
                        )
                        .availableBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .credits(123L)
                                .debits(123L)
                                .amount(123L)
                                .currency("string")
                                .currencyExponent(123L)
                                .build()
                        )
                        .build()
                )
                .build()
        assertThat(ledgerAccountCategory).isNotNull
        assertThat(ledgerAccountCategory.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountCategory.object_()).isEqualTo("string")
        assertThat(ledgerAccountCategory.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountCategory.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountCategory.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountCategory.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountCategory.name()).isEqualTo("string")
        assertThat(ledgerAccountCategory.description()).isEqualTo("string")
        assertThat(ledgerAccountCategory.metadata())
            .isEqualTo(LedgerAccountCategory.Metadata.builder().build())
        assertThat(ledgerAccountCategory.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountCategory.normalBalance())
            .isEqualTo(LedgerAccountCategory.NormalBalance.CREDIT)
        assertThat(ledgerAccountCategory.balances())
            .isEqualTo(
                LedgerAccountCategory.LedgerBalances.builder()
                    .pendingBalance(
                        LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                            .credits(123L)
                            .debits(123L)
                            .amount(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                            .credits(123L)
                            .debits(123L)
                            .amount(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .build()
                    )
                    .availableBalance(
                        LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                            .credits(123L)
                            .debits(123L)
                            .amount(123L)
                            .currency("string")
                            .currencyExponent(123L)
                            .build()
                    )
                    .build()
            )
    }
}
