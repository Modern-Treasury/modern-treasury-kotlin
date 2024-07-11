// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerAccountSettlementCreateParamsTest {

    @Test
    fun createLedgerAccountSettlementCreateParams() {
        LedgerAccountSettlementCreateParams.builder()
            .contraLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .settledLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .allowEitherDirection(true)
            .description("description")
            .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .metadata(LedgerAccountSettlementCreateParams.Metadata.builder().build())
            .skipSettlementLedgerTransaction(true)
            .status(LedgerAccountSettlementCreateParams.Status.PENDING)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerAccountSettlementCreateParams.builder()
                .contraLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .settledLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .allowEitherDirection(true)
                .description("description")
                .effectiveAtUpperBound(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(LedgerAccountSettlementCreateParams.Metadata.builder().build())
                .skipSettlementLedgerTransaction(true)
                .status(LedgerAccountSettlementCreateParams.Status.PENDING)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contraLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.settledLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.allowEitherDirection()).isEqualTo(true)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.effectiveAtUpperBound())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.metadata())
            .isEqualTo(LedgerAccountSettlementCreateParams.Metadata.builder().build())
        assertThat(body.skipSettlementLedgerTransaction()).isEqualTo(true)
        assertThat(body.status()).isEqualTo(LedgerAccountSettlementCreateParams.Status.PENDING)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerAccountSettlementCreateParams.builder()
                .contraLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .settledLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.contraLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.settledLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
