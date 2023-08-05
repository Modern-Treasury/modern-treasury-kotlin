package com.moderntreasury.api.services.blocking.paymentOrders

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.PaymentOrderReversalListParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ReversalServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val reversalService = client.paymentOrders().reversals()
        val reversal =
            reversalService.create(
                PaymentOrderReversalCreateParams.builder()
                    .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reason(PaymentOrderReversalCreateParams.Reason.DUPLICATE)
                    .metadata(PaymentOrderReversalCreateParams.Metadata.builder().build())
                    .ledgerTransaction(
                        PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest.builder()
                            .ledgerEntries(
                                listOf(
                                    PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .builder()
                                        .amount(123L)
                                        .direction(
                                            PaymentOrderReversalCreateParams
                                                .LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .Direction
                                                .CREDIT
                                        )
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
                            .description("string")
                            .effectiveAt(LocalDate.parse("2019-12-27"))
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .externalId("string")
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                PaymentOrderReversalCreateParams.LedgerTransactionCreateRequest
                                    .LedgerableType
                                    .COUNTERPARTY
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val reversalService = client.paymentOrders().reversals()
        val reversal =
            reversalService.retrieve(
                PaymentOrderReversalRetrieveParams.builder()
                    .paymentOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reversalId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val reversalService = client.paymentOrders().reversals()
        val response =
            reversalService.list(
                PaymentOrderReversalListParams.builder().paymentOrderId("string").build()
            )
        println(response)
        response.items().forEach { it.validate() }
    }
}
