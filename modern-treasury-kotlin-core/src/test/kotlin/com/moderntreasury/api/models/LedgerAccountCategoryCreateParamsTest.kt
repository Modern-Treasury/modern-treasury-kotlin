// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryCreateParamsTest {

    @Test
    fun createLedgerAccountCategoryCreateParams() {
        LedgerAccountCategoryCreateParams.builder()
            .currency("currency")
            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .normalBalance(TransactionDirection.CREDIT)
            .currencyExponent(123L)
            .description("description")
            .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .metadata(LedgerAccountCategoryCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountCategoryCreateParams.builder()
                .currency("currency")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .normalBalance(TransactionDirection.CREDIT)
                .currencyExponent(123L)
                .description("description")
                .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .metadata(LedgerAccountCategoryCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("currency")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.normalBalance()).isEqualTo(TransactionDirection.CREDIT)
        assertThat(body.currencyExponent()).isEqualTo(123L)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.ledgerAccountCategoryIds())
            .isEqualTo(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountCategoryCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountCategoryCreateParams.builder()
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
