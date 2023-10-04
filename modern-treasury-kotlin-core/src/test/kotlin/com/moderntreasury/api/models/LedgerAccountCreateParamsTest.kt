// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountCreateParamsTest {

    @Test
    fun createLedgerAccountCreateParams() {
        LedgerAccountCreateParams.builder()
            .currency("string")
            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("string")
            .normalBalance(LedgerAccountCreateParams.NormalBalance.CREDIT)
            .currencyExponent(123L)
            .description("string")
            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .ledgerableType(LedgerAccountCreateParams.LedgerableType.EXTERNAL_ACCOUNT)
            .metadata(LedgerAccountCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountCreateParams.builder()
                .currency("string")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .normalBalance(LedgerAccountCreateParams.NormalBalance.CREDIT)
                .currencyExponent(123L)
                .description("string")
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ledgerableType(LedgerAccountCreateParams.LedgerableType.EXTERNAL_ACCOUNT)
                .metadata(LedgerAccountCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.normalBalance()).isEqualTo(LedgerAccountCreateParams.NormalBalance.CREDIT)
        assertThat(body.currencyExponent()).isEqualTo(123L)
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.ledgerableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.ledgerableType())
            .isEqualTo(LedgerAccountCreateParams.LedgerableType.EXTERNAL_ACCOUNT)
        assertThat(body.metadata()).isEqualTo(LedgerAccountCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountCreateParams.builder()
                .currency("string")
                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .normalBalance(LedgerAccountCreateParams.NormalBalance.CREDIT)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.currency()).isEqualTo("string")
        assertThat(body.ledgerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.normalBalance()).isEqualTo(LedgerAccountCreateParams.NormalBalance.CREDIT)
    }
}
