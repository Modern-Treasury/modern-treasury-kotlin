// File generated from our OpenAPI spec by Stainless.

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
                .balances(
                    LedgerAccountCategory.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("currency")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("currency")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .amount(123L)
                                .credits(123L)
                                .currency("currency")
                                .currencyExponent(123L)
                                .debits(123L)
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(LedgerAccountCategory.Metadata.builder().build())
                .name("name")
                .normalBalance(TransactionDirection.CREDIT)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerAccountCategory).isNotNull
        assertThat(ledgerAccountCategory.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountCategory.balances())
            .isEqualTo(
                LedgerAccountCategory.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("currency")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("currency")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                            .amount(123L)
                            .credits(123L)
                            .currency("currency")
                            .currencyExponent(123L)
                            .debits(123L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountCategory.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountCategory.description()).isEqualTo("description")
        assertThat(ledgerAccountCategory.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountCategory.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountCategory.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountCategory.metadata())
            .isEqualTo(LedgerAccountCategory.Metadata.builder().build())
        assertThat(ledgerAccountCategory.name()).isEqualTo("name")
        assertThat(ledgerAccountCategory.normalBalance()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(ledgerAccountCategory.object_()).isEqualTo("object")
        assertThat(ledgerAccountCategory.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
