// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountStatementCreateResponseTest {

    @Test
    fun createLedgerAccountStatementCreateResponse() {
        val ledgerAccountStatementCreateResponse =
            LedgerAccountStatementCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .effectiveAtLowerBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endingBalance(
                    LedgerAccountStatementCreateResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .build()
                )
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerAccountLockVersion(0L)
                .ledgerAccountNormalBalance(TransactionDirection.CREDIT)
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    LedgerAccountStatementCreateResponse.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .object_("object")
                .startingBalance(
                    LedgerAccountStatementCreateResponse.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance
                                .builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()
        assertThat(ledgerAccountStatementCreateResponse).isNotNull
        assertThat(ledgerAccountStatementCreateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountStatementCreateResponse.description()).isEqualTo("description")
        assertThat(ledgerAccountStatementCreateResponse.effectiveAtLowerBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountStatementCreateResponse.effectiveAtUpperBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountStatementCreateResponse.endingBalance())
            .isEqualTo(
                LedgerAccountStatementCreateResponse.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountStatementCreateResponse.ledgerAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementCreateResponse.ledgerAccountLockVersion()).isEqualTo(0L)
        assertThat(ledgerAccountStatementCreateResponse.ledgerAccountNormalBalance())
            .isEqualTo(TransactionDirection.CREDIT)
        assertThat(ledgerAccountStatementCreateResponse.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountStatementCreateResponse.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountStatementCreateResponse.metadata())
            .isEqualTo(
                LedgerAccountStatementCreateResponse.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerAccountStatementCreateResponse.object_()).isEqualTo("object")
        assertThat(ledgerAccountStatementCreateResponse.startingBalance())
            .isEqualTo(
                LedgerAccountStatementCreateResponse.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountStatementCreateResponse.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountStatementCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }
}
