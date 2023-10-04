// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountStatementCreateParamsTest {

    @Test
    fun createLedgerAccountStatementCreateParams() {
        LedgerAccountStatementCreateParams.builder()
            .effectiveAtLowerBound("string")
            .effectiveAtUpperBound("string")
            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("string")
            .metadata(LedgerAccountStatementCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountStatementCreateParams.builder()
                .effectiveAtLowerBound("string")
                .effectiveAtUpperBound("string")
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .metadata(LedgerAccountStatementCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.effectiveAtLowerBound()).isEqualTo("string")
        assertThat(body.effectiveAtUpperBound()).isEqualTo("string")
        assertThat(body.ledgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountStatementCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountStatementCreateParams.builder()
                .effectiveAtLowerBound("string")
                .effectiveAtUpperBound("string")
                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.effectiveAtLowerBound()).isEqualTo("string")
        assertThat(body.effectiveAtUpperBound()).isEqualTo("string")
        assertThat(body.ledgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
