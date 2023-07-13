package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCreateParamsTest {

    @Test
    fun createLedgerAccountCreateParams() {
        LedgerAccountCreateParams.builder()
            .name("string")
            .description("string")
            .normalBalance(LedgerAccountCreateParams.NormalBalance.CREDIT)
            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .currency("string")
            .currencyExponent(123L)
            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ledgerableType(LedgerAccountCreateParams.LedgerableType.EXTERNAL_ACCOUNT)
            .metadata(LedgerAccountCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountCreateParams.builder()
                .name("string")
                .description("string")
                .normalBalance(LedgerAccountCreateParams.NormalBalance.CREDIT)
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency("string")
                .currencyExponent(123L)
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerAccountCreateParams.LedgerableType.EXTERNAL_ACCOUNT)
                .metadata(LedgerAccountCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.normalBalance()).isEqualTo(LedgerAccountCreateParams.NormalBalance.CREDIT)
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.currencyExponent()).isEqualTo(123L)
        assertThat(body.ledgerableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.ledgerableType())
            .isEqualTo(LedgerAccountCreateParams.LedgerableType.EXTERNAL_ACCOUNT)
        assertThat(body.metadata()).isEqualTo(LedgerAccountCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountCreateParams.builder()
                .name("string")
                .normalBalance(LedgerAccountCreateParams.NormalBalance.CREDIT)
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.normalBalance()).isEqualTo(LedgerAccountCreateParams.NormalBalance.CREDIT)
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo("string")
    }
}
