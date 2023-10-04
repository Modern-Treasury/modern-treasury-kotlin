// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryCreateParamsTest {

    @Test
    fun createLedgerAccountCategoryCreateParams() {
        LedgerAccountCategoryCreateParams.builder()
            .currency("string")
            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("string")
            .normalBalance(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
            .currencyExponent(123L)
            .description("string")
            .metadata(LedgerAccountCategoryCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountCategoryCreateParams.builder()
                .currency("string")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .normalBalance(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
                .currencyExponent(123L)
                .description("string")
                .metadata(LedgerAccountCategoryCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.normalBalance())
            .isEqualTo(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
        assertThat(body.currencyExponent()).isEqualTo(123L)
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountCategoryCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountCategoryCreateParams.builder()
                .currency("string")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .normalBalance(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.normalBalance())
            .isEqualTo(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
    }
}
