// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.ExpectedPaymentListParams
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExpectedPaymentServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.create(
                ExpectedPaymentCreateParams.builder()
                    .amountLowerBound(0L)
                    .amountUpperBound(0L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .description("description")
                    .direction(ExpectedPaymentCreateParams.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerTransaction(
                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.builder()
                            .ledgerEntries(
                                listOf(
                                    ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                        .LedgerEntryCreateRequest
                                        .builder()
                                        .amount(0L)
                                        .direction(TransactionDirection.CREDIT)
                                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .availableBalanceAmount(
                                            ExpectedPaymentCreateParams
                                                .LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .AvailableBalanceAmount
                                                .builder()
                                                .build()
                                        )
                                        .lockVersion(0L)
                                        .metadata(
                                            ExpectedPaymentCreateParams
                                                .LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .Metadata
                                                .builder()
                                                .build()
                                        )
                                        .pendingBalanceAmount(
                                            ExpectedPaymentCreateParams
                                                .LedgerTransactionCreateRequest
                                                .LedgerEntryCreateRequest
                                                .PendingBalanceAmount
                                                .builder()
                                                .build()
                                        )
                                        .postedBalanceAmount(
                                            ExpectedPaymentCreateParams
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
                                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                    .LedgerableType
                                    .EXPECTED_PAYMENT
                            )
                            .metadata(
                                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Metadata
                                    .builder()
                                    .build()
                            )
                            .status(
                                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Status
                                    .ARCHIVED
                            )
                            .build()
                    )
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .lineItems(
                        listOf(
                            ExpectedPaymentCreateParams.LineItemRequest.builder()
                                .amount(0L)
                                .accountingCategoryId("accounting_category_id")
                                .description("description")
                                .metadata(
                                    ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder()
                                        .build()
                                )
                                .build()
                        )
                    )
                    .metadata(ExpectedPaymentCreateParams.Metadata.builder().build())
                    .reconciliationFilters(JsonNull.of())
                    .reconciliationGroups(JsonNull.of())
                    .reconciliationRuleVariables(
                        listOf(
                            ReconciliationRule.builder()
                                .amountLowerBound(0L)
                                .amountUpperBound(0L)
                                .direction(ReconciliationRule.Direction.CREDIT)
                                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .currency(Currency.AED)
                                .customIdentifiers(
                                    ReconciliationRule.CustomIdentifiers.builder().build()
                                )
                                .dateLowerBound(LocalDate.parse("2019-12-27"))
                                .dateUpperBound(LocalDate.parse("2019-12-27"))
                                .type(ReconciliationRule.Type.ACH)
                                .build()
                        )
                    )
                    .remittanceInformation("remittance_information")
                    .statementDescriptor("statement_descriptor")
                    .type(ExpectedPaymentType.ACH)
                    .build()
            )
        println(expectedPayment)
        expectedPayment.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.retrieve(
                ExpectedPaymentRetrieveParams.builder().id("id").build()
            )
        println(expectedPayment)
        expectedPayment.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.update(
                ExpectedPaymentUpdateParams.builder()
                    .id("id")
                    .amountLowerBound(0L)
                    .amountUpperBound(0L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .description("description")
                    .direction(ExpectedPaymentUpdateParams.Direction.CREDIT)
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(ExpectedPaymentUpdateParams.Metadata.builder().build())
                    .reconciliationFilters(JsonNull.of())
                    .reconciliationGroups(JsonNull.of())
                    .reconciliationRuleVariables(
                        listOf(
                            ReconciliationRule.builder()
                                .amountLowerBound(0L)
                                .amountUpperBound(0L)
                                .direction(ReconciliationRule.Direction.CREDIT)
                                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .currency(Currency.AED)
                                .customIdentifiers(
                                    ReconciliationRule.CustomIdentifiers.builder().build()
                                )
                                .dateLowerBound(LocalDate.parse("2019-12-27"))
                                .dateUpperBound(LocalDate.parse("2019-12-27"))
                                .type(ReconciliationRule.Type.ACH)
                                .build()
                        )
                    )
                    .remittanceInformation("remittance_information")
                    .statementDescriptor("statement_descriptor")
                    .status(ExpectedPaymentUpdateParams.Status.RECONCILED)
                    .type(ExpectedPaymentType.ACH)
                    .build()
            )
        println(expectedPayment)
        expectedPayment.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val response = expectedPaymentService.list(ExpectedPaymentListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val expectedPaymentService = client.expectedPayments()
        val expectedPayment =
            expectedPaymentService.delete(ExpectedPaymentDeleteParams.builder().id("id").build())
        println(expectedPayment)
        expectedPayment.validate()
    }
}
