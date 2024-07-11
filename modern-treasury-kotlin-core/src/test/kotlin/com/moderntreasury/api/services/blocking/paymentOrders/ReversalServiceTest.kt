// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.paymentOrders

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ReversalServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val reversalService = client.paymentOrders().reversals()
        val reversal =
            reversalService.create(
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
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .Metadata
                                    .builder()
                                    .build()
                            )
                            .status(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .Status
                                    .ARCHIVED
                            )
                            .build()
                    )
                    .metadata(PaymentOrderReversalCreateParams.Metadata.builder().build())
                    .build()
            )
        println(reversal)
        reversal.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val reversalService = client.paymentOrders().reversals()
        val reversal =
            reversalService.retrieve(
                PaymentOrderReversalRetrieveParams.builder()
                    .paymentOrderId("payment_order_id")
                    .reversalId("reversal_id")
                    .build()
            )
        println(reversal)
        reversal.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val reversalService = client.paymentOrders().reversals()
        val response =
            reversalService.list(
                PaymentOrderReversalListParams.builder().paymentOrderId("payment_order_id").build()
            )
        println(response)
        response.items().forEach { it.validate() }
    }
}
