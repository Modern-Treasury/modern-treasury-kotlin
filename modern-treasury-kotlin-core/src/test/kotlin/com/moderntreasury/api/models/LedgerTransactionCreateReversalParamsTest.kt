package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionCreateReversalParamsTest {

    @Test
    fun createLedgerTransactionCreateReversalParams() {
        LedgerTransactionCreateReversalParams.builder()
            .ledgerTransactionId("string")
            .description("string")
            .status(LedgerTransactionCreateReversalParams.Status.ARCHIVED)
            .metadata(LedgerTransactionCreateReversalParams.Metadata.builder().build())
            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .externalId("string")
            .ledgerableType(LedgerTransactionCreateReversalParams.LedgerableType.COUNTERPARTY)
            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerTransactionCreateReversalParams.builder()
                .ledgerTransactionId("string")
                .description("string")
                .status(LedgerTransactionCreateReversalParams.Status.ARCHIVED)
                .metadata(LedgerTransactionCreateReversalParams.Metadata.builder().build())
                .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("string")
                .ledgerableType(LedgerTransactionCreateReversalParams.LedgerableType.COUNTERPARTY)
                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.status()).isEqualTo(LedgerTransactionCreateReversalParams.Status.ARCHIVED)
        assertThat(body.metadata())
            .isEqualTo(LedgerTransactionCreateReversalParams.Metadata.builder().build())
        assertThat(body.effectiveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.externalId()).isEqualTo("string")
        assertThat(body.ledgerableType())
            .isEqualTo(LedgerTransactionCreateReversalParams.LedgerableType.COUNTERPARTY)
        assertThat(body.ledgerableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            LedgerTransactionCreateReversalParams.builder().ledgerTransactionId("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params =
            LedgerTransactionCreateReversalParams.builder().ledgerTransactionId("string").build()
        assertThat(params).isNotNull
        // path param "ledgerTransactionId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
