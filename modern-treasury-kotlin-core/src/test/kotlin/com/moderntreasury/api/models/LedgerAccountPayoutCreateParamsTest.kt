package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountPayoutCreateParamsTest {

    @Test
    fun createLedgerAccountPayoutCreateParams() {
        LedgerAccountPayoutCreateParams.builder()
            .description("string")
            .status(LedgerAccountPayoutCreateParams.Status.PENDING)
            .payoutLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fundingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .effectiveAtUpperBound("14:15:22Z")
            .metadata(LedgerAccountPayoutCreateParams.Metadata.builder().build())
            .skipPayoutLedgerTransaction(true)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountPayoutCreateParams.builder()
                .description("string")
                .status(LedgerAccountPayoutCreateParams.Status.PENDING)
                .payoutLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fundingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .effectiveAtUpperBound("14:15:22Z")
                .metadata(LedgerAccountPayoutCreateParams.Metadata.builder().build())
                .skipPayoutLedgerTransaction(true)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.status()).isEqualTo(LedgerAccountPayoutCreateParams.Status.PENDING)
        assertThat(body.payoutLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.fundingLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.effectiveAtUpperBound()).isEqualTo("14:15:22Z")
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountPayoutCreateParams.Metadata.builder().build())
        assertThat(body.skipPayoutLedgerTransaction()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountPayoutCreateParams.builder()
                .payoutLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fundingLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.payoutLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.fundingLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
