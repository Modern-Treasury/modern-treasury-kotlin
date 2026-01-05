// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerEntryCreateRequest
import com.moderntreasury.api.models.LedgerTransactionCreatePartialPostParams
import com.moderntreasury.api.models.LedgerTransactionCreateRequest
import com.moderntreasury.api.models.LedgerTransactionCreateReversalParams
import com.moderntreasury.api.models.LedgerTransactionUpdateParams
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerTransactionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionServiceAsync = client.ledgerTransactions()

        val ledgerTransaction =
            ledgerTransactionServiceAsync.create(
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
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .lockVersion(0L)
                            .metadata(
                                LedgerEntryCreateRequest.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
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
                    .ledgerableType(LedgerTransactionCreateRequest.LedgerableType.EXPECTED_PAYMENT)
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

        ledgerTransaction.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionServiceAsync = client.ledgerTransactions()

        val ledgerTransaction = ledgerTransactionServiceAsync.retrieve("id")

        ledgerTransaction.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionServiceAsync = client.ledgerTransactions()

        val ledgerTransaction =
            ledgerTransactionServiceAsync.update(
                LedgerTransactionUpdateParams.builder()
                    .id("id")
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                            .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .lockVersion(0L)
                            .metadata(
                                LedgerEntryCreateRequest.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
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
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(LedgerTransactionUpdateParams.LedgerableType.EXPECTED_PAYMENT)
                    .metadata(
                        LedgerTransactionUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .status(LedgerTransactionUpdateParams.Status.ARCHIVED)
                    .build()
            )

        ledgerTransaction.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionServiceAsync = client.ledgerTransactions()

        val page = ledgerTransactionServiceAsync.list()

        page.items().forEach { it.validate() }
    }

    @Test
    suspend fun createPartialPost() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionServiceAsync = client.ledgerTransactions()

        val ledgerTransaction =
            ledgerTransactionServiceAsync.createPartialPost(
                LedgerTransactionCreatePartialPostParams.builder()
                    .id("id")
                    .addPostedLedgerEntry(
                        LedgerTransactionCreatePartialPostParams.LedgerEntryPartialPostCreateRequest
                            .builder()
                            .amount(0L)
                            .direction(
                                LedgerTransactionCreatePartialPostParams
                                    .LedgerEntryPartialPostCreateRequest
                                    .Direction
                                    .CREDIT
                            )
                            .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .metadata(
                                LedgerTransactionCreatePartialPostParams
                                    .LedgerEntryPartialPostCreateRequest
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .build()
                    )
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        LedgerTransactionCreatePartialPostParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        ledgerTransaction.validate()
    }

    @Test
    suspend fun createReversal() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerTransactionServiceAsync = client.ledgerTransactions()

        val ledgerTransaction =
            ledgerTransactionServiceAsync.createReversal(
                LedgerTransactionCreateReversalParams.builder()
                    .id("id")
                    .description("description")
                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalId("external_id")
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        LedgerTransactionCreateReversalParams.LedgerableType.EXPECTED_PAYMENT
                    )
                    .metadata(
                        LedgerTransactionCreateReversalParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .status(LedgerTransactionCreateReversalParams.Status.ARCHIVED)
                    .build()
            )

        ledgerTransaction.validate()
    }
}
