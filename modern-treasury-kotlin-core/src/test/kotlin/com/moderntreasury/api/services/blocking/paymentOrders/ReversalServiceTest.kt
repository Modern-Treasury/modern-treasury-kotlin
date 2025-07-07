// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.paymentOrders

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerEntryCreateRequest
import com.moderntreasury.api.models.LedgerTransactionCreateRequest
import com.moderntreasury.api.models.PaymentOrderReversalCreateParams
import com.moderntreasury.api.models.PaymentOrderReversalRetrieveParams
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ReversalServiceTest {

    @Test
    fun create() {
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
                        LedgerTransactionCreateRequest.builder()
                            .addLedgerEntry(
                                LedgerEntryCreateRequest.builder()
                                    .amount(0L)
                                    .direction(TransactionDirection.CREDIT)
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .availableBalanceAmount(
                                        LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .lockVersion(0L)
                                    .metadata(
                                        LedgerEntryCreateRequest.Metadata.builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
                                            .build()
                                    )
                                    .pendingBalanceAmount(
                                        LedgerEntryCreateRequest.PendingBalanceAmount.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .postedBalanceAmount(
                                        LedgerEntryCreateRequest.PostedBalanceAmount.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .showResultingLedgerAccountBalances(true)
                                    .build()
                            )
                            .description("description")
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .externalId("external_id")
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                LedgerTransactionCreateRequest.LedgerableType.EXPECTED_PAYMENT
                            )
                            .metadata(
                                LedgerTransactionCreateRequest.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .status(LedgerTransactionCreateRequest.Status.ARCHIVED)
                            .build()
                    )
                    .metadata(
                        PaymentOrderReversalCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        reversal.validate()
    }

    @Test
    fun retrieve() {
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

        reversal.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val reversalService = client.paymentOrders().reversals()

        val page = reversalService.list("payment_order_id")

        page.items().forEach { it.validate() }
    }
}
