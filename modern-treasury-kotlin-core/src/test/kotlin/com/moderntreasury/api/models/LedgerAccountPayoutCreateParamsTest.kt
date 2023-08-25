package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountPayoutCreateParamsTest {

    @Test
    fun createLedgerAccountPayoutCreateParams() {
        LedgerAccountPayoutCreateParams.builder()
            .fundingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .payoutLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("string")
            .effectiveAtUpperBound("14:15:22Z")
            .metadata(LedgerAccountPayoutCreateParams.Metadata.builder().build())
            .skipPayoutLedgerTransaction(true)
            .status(LedgerAccountPayoutCreateParams.Status.PENDING)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountPayoutCreateParams.builder()
                .fundingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .payoutLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .effectiveAtUpperBound("14:15:22Z")
                .metadata(LedgerAccountPayoutCreateParams.Metadata.builder().build())
                .skipPayoutLedgerTransaction(true)
                .status(LedgerAccountPayoutCreateParams.Status.PENDING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.fundingLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.payoutLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.effectiveAtUpperBound()).isEqualTo("14:15:22Z")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountPayoutCreateParams.Metadata.builder().build())
        assertThat(body.skipPayoutLedgerTransaction()).isEqualTo(true)
        assertThat(body.status()).isEqualTo(LedgerAccountPayoutCreateParams.Status.PENDING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountPayoutCreateParams.builder()
                .fundingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .payoutLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.fundingLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.payoutLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
