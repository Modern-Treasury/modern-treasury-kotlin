// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCreateParamsTest {

    @Test
    fun createLedgerAccountCreateParams() {
        LedgerAccountCreateParams.builder()
            .currency("currency")
            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .normalBalance(TransactionDirection.CREDIT)
            .currencyExponent(0L)
            .description("description")
            .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ledgerableType(LedgerAccountCreateParams.LedgerableType.COUNTERPARTY)
            .metadata(
                LedgerAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountCreateParams.builder()
                .currency("currency")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .normalBalance(TransactionDirection.CREDIT)
                .currencyExponent(0L)
                .description("description")
                .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerAccountCreateParams.LedgerableType.COUNTERPARTY)
                .metadata(
                    LedgerAccountCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.normalBalance()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(body.currencyExponent()).isEqualTo(0L)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.ledgerAccountCategoryIds())
            .isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.ledgerableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.ledgerableType())
            .isEqualTo(LedgerAccountCreateParams.LedgerableType.COUNTERPARTY)
        assertThat(body.metadata())
            .isEqualTo(
                LedgerAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountCreateParams.builder()
                .currency("currency")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .normalBalance(TransactionDirection.CREDIT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.normalBalance()).isEqualTo(TransactionDirection.CREDIT)
    }
}
