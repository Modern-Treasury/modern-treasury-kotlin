// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.ExpectedPaymentCreateParams
import com.moderntreasury.api.models.ExpectedPaymentDeleteParams
import com.moderntreasury.api.models.ExpectedPaymentRetrieveParams
import com.moderntreasury.api.models.ExpectedPaymentType
import com.moderntreasury.api.models.ExpectedPaymentUpdateParams
import com.moderntreasury.api.models.ReconciliationRule
import com.moderntreasury.api.models.TransactionDirection
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
                            .addLedgerEntry(
                                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .builder()
                                    .amount(0L)
                                    .direction(TransactionDirection.CREDIT)
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .availableBalanceAmount(
                                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .AvailableBalanceAmount
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .lockVersion(0L)
                                    .metadata(
                                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
                                            .build()
                                    )
                                    .pendingBalanceAmount(
                                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PendingBalanceAmount
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .postedBalanceAmount(
                                        ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PostedBalanceAmount
                                            .builder()
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
                                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest
                                    .LedgerableType
                                    .EXPECTED_PAYMENT
                            )
                            .metadata(
                                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .status(
                                ExpectedPaymentCreateParams.LedgerTransactionCreateRequest.Status
                                    .ARCHIVED
                            )
                            .build()
                    )
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addLineItem(
                        ExpectedPaymentCreateParams.LineItemRequest.builder()
                            .amount(0L)
                            .accountingCategoryId("accounting_category_id")
                            .description("description")
                            .metadata(
                                ExpectedPaymentCreateParams.LineItemRequest.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        ExpectedPaymentCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .reconciliationFilters(JsonValue.from(mapOf<String, Any>()))
                    .reconciliationGroups(JsonValue.from(mapOf<String, Any>()))
                    .addReconciliationRuleVariable(
                        ReconciliationRule.builder()
                            .amountLowerBound(0L)
                            .amountUpperBound(0L)
                            .direction(ReconciliationRule.Direction.CREDIT)
                            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .currency(Currency.AED)
                            .customIdentifiers(
                                ReconciliationRule.CustomIdentifiers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .dateLowerBound(LocalDate.parse("2019-12-27"))
                            .dateUpperBound(LocalDate.parse("2019-12-27"))
                            .type(ReconciliationRule.Type.ACH)
                            .build()
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
                    .metadata(
                        ExpectedPaymentUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .reconciliationFilters(JsonValue.from(mapOf<String, Any>()))
                    .reconciliationGroups(JsonValue.from(mapOf<String, Any>()))
                    .addReconciliationRuleVariable(
                        ReconciliationRule.builder()
                            .amountLowerBound(0L)
                            .amountUpperBound(0L)
                            .direction(ReconciliationRule.Direction.CREDIT)
                            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .currency(Currency.AED)
                            .customIdentifiers(
                                ReconciliationRule.CustomIdentifiers.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .dateLowerBound(LocalDate.parse("2019-12-27"))
                            .dateUpperBound(LocalDate.parse("2019-12-27"))
                            .type(ReconciliationRule.Type.ACH)
                            .build()
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
        val response = expectedPaymentService.list()
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
