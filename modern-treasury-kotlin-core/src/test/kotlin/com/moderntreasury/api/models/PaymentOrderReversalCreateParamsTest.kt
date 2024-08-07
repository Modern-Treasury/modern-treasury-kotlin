// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderReversalCreateParamsTest {

    @Test
    fun createPaymentOrderReversalCreateParams() {
        PaymentOrderReversalCreateParams.builder()
            .paymentOrderId("payment_order_id")
            .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
            .ledgerTransaction(
                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                    .ledgerEntries(
                        listOf(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(TransactionDirection.CREDIT)
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .metadata(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .pendingBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PostedBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .externalId("external_id")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                            .LedgerableType
                            .EXPECTED_PAYMENT
                    )
                    .metadata(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .status(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Status
                            .ARCHIVED
                    )
                    .build()
            )
            .metadata(PaymentOrderReversalCreateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            PaymentOrderReversalCreateParams.builder()
                .paymentOrderId("payment_order_id")
                .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                .ledgerTransaction(
                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                        .ledgerEntries(
                            listOf(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .builder()
                                    .amount(123L)
                                    .direction(TransactionDirection.CREDIT)
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .availableBalanceAmount(
                                        PaymentOrderReversalCreateParams
                                            .LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .AvailableBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .lockVersion(123L)
                                    .metadata(
                                        PaymentOrderReversalCreateParams
                                            .LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .Metadata
                                            .builder()
                                            .build()
                                    )
                                    .pendingBalanceAmount(
                                        PaymentOrderReversalCreateParams
                                            .LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PendingBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .postedBalanceAmount(
                                        PaymentOrderReversalCreateParams
                                            .LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PostedBalanceAmount
                                            .builder()
                                            .build()
                                    )
                                    .showResultingLedgerAccountBalances(true)
                                    .build()
                            )
                        )
                        .description("description")
                        .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .externalId("external_id")
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                .LedgerableType
                                .EXPECTED_PAYMENT
                        )
                        .metadata(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Metadata
                                .builder()
                                .build()
                        )
                        .status(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Status
                                .ARCHIVED
                        )
                        .build()
                )
                .metadata(PaymentOrderReversalCreateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason()).isEqualTo(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
        assertThat(body.ledgerTransaction())
            .isEqualTo(
                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                    .ledgerEntries(
                        listOf(
                            PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                .LedgerEntryCreateRequest
                                .builder()
                                .amount(123L)
                                .direction(TransactionDirection.CREDIT)
                                .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .availableBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .AvailableBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .lockVersion(123L)
                                .metadata(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .Metadata
                                        .builder()
                                        .build()
                                )
                                .pendingBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PendingBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .postedBalanceAmount(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .PostedBalanceAmount
                                        .builder()
                                        .build()
                                )
                                .showResultingLedgerAccountBalances(true)
                                .build()
                        )
                    )
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .externalId("external_id")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                            .LedgerableType
                            .EXPECTED_PAYMENT
                    )
                    .metadata(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Metadata
                            .builder()
                            .build()
                    )
                    .status(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.Status
                            .ARCHIVED
                    )
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(PaymentOrderReversalCreateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            PaymentOrderReversalCreateParams.builder()
                .paymentOrderId("payment_order_id")
                .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.reason()).isEqualTo(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
    }

    @Test
    fun getPathParam() {
        val params =
            PaymentOrderReversalCreateParams.builder()
                .paymentOrderId("payment_order_id")
                .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                .build()
        assertThat(params).isNotNull
        // path param "paymentOrderId"
        assertThat(params.getPathParam(0)).isEqualTo("payment_order_id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
