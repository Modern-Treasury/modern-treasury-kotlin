// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LedgerAccountCategoryTest {

    @Test
    fun create() {
        val ledgerAccountCategory =
            LedgerAccountCategory.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .balances(
                    LedgerAccountCategory.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    LedgerAccountCategory.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .normalBalance(TransactionDirection.CREDIT)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(ledgerAccountCategory.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountCategory.balances())
            .isEqualTo(
                LedgerAccountCategory.LedgerBalances.builder()
                    .availableBalance(
                        LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .pendingBalance(
                        LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .postedBalance(
                        LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                            .amount(0L)
                            .credits(0L)
                            .currency("currency")
                            .currencyExponent(0L)
                            .debits(0L)
                            .build()
                    )
                    .build()
            )
        assertThat(ledgerAccountCategory.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountCategory.description()).isEqualTo("description")
        assertThat(ledgerAccountCategory.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ledgerAccountCategory.externalId()).isEqualTo("external_id")
        assertThat(ledgerAccountCategory.ledgerId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ledgerAccountCategory.liveMode()).isEqualTo(true)
        assertThat(ledgerAccountCategory.metadata())
            .isEqualTo(
                LedgerAccountCategory.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(ledgerAccountCategory.name()).isEqualTo("name")
        assertThat(ledgerAccountCategory.normalBalance()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(ledgerAccountCategory.object_()).isEqualTo("object")
        assertThat(ledgerAccountCategory.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ledgerAccountCategory =
            LedgerAccountCategory.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .balances(
                    LedgerAccountCategory.LedgerBalances.builder()
                        .availableBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .pendingBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .postedBalance(
                            LedgerAccountCategory.LedgerBalances.LedgerBalance.builder()
                                .amount(0L)
                                .credits(0L)
                                .currency("currency")
                                .currencyExponent(0L)
                                .debits(0L)
                                .build()
                        )
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    LedgerAccountCategory.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .normalBalance(TransactionDirection.CREDIT)
                .object_("object")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedLedgerAccountCategory =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ledgerAccountCategory),
                jacksonTypeRef<LedgerAccountCategory>(),
            )

        assertThat(roundtrippedLedgerAccountCategory).isEqualTo(ledgerAccountCategory)
    }
}
