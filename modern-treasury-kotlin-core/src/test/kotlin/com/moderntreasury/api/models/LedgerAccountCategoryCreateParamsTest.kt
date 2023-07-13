package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCategoryCreateParamsTest {

    @Test
    fun createLedgerAccountCategoryCreateParams() {
        LedgerAccountCategoryCreateParams.builder()
            .name("string")
            .description("string")
            .metadata(LedgerAccountCategoryCreateParams.Metadata.builder().build())
            .currency("string")
            .currencyExponent(123L)
            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .normalBalance(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountCategoryCreateParams.builder()
                .name("string")
                .description("string")
                .metadata(LedgerAccountCategoryCreateParams.Metadata.builder().build())
                .currency("string")
                .currencyExponent(123L)
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .normalBalance(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountCategoryCreateParams.Metadata.builder().build())
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.currencyExponent()).isEqualTo(123L)
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.normalBalance())
            .isEqualTo(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountCategoryCreateParams.builder()
                .name("string")
                .currency("string")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .normalBalance(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.normalBalance())
            .isEqualTo(LedgerAccountCategoryCreateParams.NormalBalance.CREDIT)
    }
}
