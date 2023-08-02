package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LedgerTransactionUpdateParamsTest {

    @Test
    fun createLedgerTransactionUpdateParams() {
        LedgerTransactionUpdateParams.builder()
            .id("string")
            .description("string")
            .status(LedgerTransactionUpdateParams.Status.ARCHIVED)
            .metadata(LedgerTransactionUpdateParams.Metadata.builder().build())
            .ledgerEntries(
                listOf(
                    LedgerTransactionUpdateParams.LedgerEntryCreateRequest.builder()
                        .amount(123L)
                        .direction(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Direction.CREDIT
                        )
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                .AvailableBalanceAmount
                                .builder()
                                .build()
                        )
                        .lockVersion(123L)
                        .metadata(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Metadata
                                .builder()
                                .build()
                        )
                        .pendingBalanceAmount(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                .PendingBalanceAmount
                                .builder()
                                .build()
                        )
                        .postedBalanceAmount(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                .PostedBalanceAmount
                                .builder()
                                .build()
                        )
                        .showResultingLedgerAccountBalances(true)
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            LedgerTransactionUpdateParams.builder()
                .id("string")
                .description("string")
                .status(LedgerTransactionUpdateParams.Status.ARCHIVED)
                .metadata(LedgerTransactionUpdateParams.Metadata.builder().build())
                .ledgerEntries(
                    listOf(
                        LedgerTransactionUpdateParams.LedgerEntryCreateRequest.builder()
                            .amount(123L)
                            .direction(
                                LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Direction
                                    .CREDIT
                            )
                            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .availableBalanceAmount(
                                LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                    .AvailableBalanceAmount
                                    .builder()
                                    .build()
                            )
                            .lockVersion(123L)
                            .metadata(
                                LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Metadata
                                    .builder()
                                    .build()
                            )
                            .pendingBalanceAmount(
                                LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                    .PendingBalanceAmount
                                    .builder()
                                    .build()
                            )
                            .postedBalanceAmount(
                                LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                    .PostedBalanceAmount
                                    .builder()
                                    .build()
                            )
                            .showResultingLedgerAccountBalances(true)
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.status()).isEqualTo(LedgerTransactionUpdateParams.Status.ARCHIVED)
        assertThat(body.metadata())
            .isEqualTo(LedgerTransactionUpdateParams.Metadata.builder().build())
        assertThat(body.ledgerEntries())
            .isEqualTo(
                listOf(
                    LedgerTransactionUpdateParams.LedgerEntryCreateRequest.builder()
                        .amount(123L)
                        .direction(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Direction.CREDIT
                        )
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .availableBalanceAmount(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                .AvailableBalanceAmount
                                .builder()
                                .build()
                        )
                        .lockVersion(123L)
                        .metadata(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest.Metadata
                                .builder()
                                .build()
                        )
                        .pendingBalanceAmount(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                .PendingBalanceAmount
                                .builder()
                                .build()
                        )
                        .postedBalanceAmount(
                            LedgerTransactionUpdateParams.LedgerEntryCreateRequest
                                .PostedBalanceAmount
                                .builder()
                                .build()
                        )
                        .showResultingLedgerAccountBalances(true)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = LedgerTransactionUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = LedgerTransactionUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
