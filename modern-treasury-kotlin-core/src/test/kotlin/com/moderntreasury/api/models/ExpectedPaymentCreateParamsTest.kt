// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExpectedPaymentCreateParamsTest {

    @Test
    fun create() {
        ExpectedPaymentCreateParams.builder()
            .expectedPaymentCreate(
                ExpectedPaymentCreate.builder()
                    .amountLowerBound(0L)
                    .amountReconciled(0L)
                    .amountReconciledDirection(
                        ExpectedPaymentCreate.AmountReconciledDirection.CREDIT
                    )
                    .amountUnreconciled(0L)
                    .amountUnreconciledDirection(
                        ExpectedPaymentCreate.AmountUnreconciledDirection.CREDIT
                    )
                    .amountUpperBound(0L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .description("description")
                    .direction(ExpectedPaymentCreate.Direction.CREDIT)
                    .externalId("external_id")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addLineItem(
                        LineItem.builder()
                            .amount(0L)
                            .accountingCategoryId("accounting_category_id")
                            .description("description")
                            .metadata(
                                LineItem.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        ExpectedPaymentCreate.Metadata.builder()
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
            .build()
    }

    @Test
    fun body() {
        val params =
            ExpectedPaymentCreateParams.builder()
                .expectedPaymentCreate(
                    ExpectedPaymentCreate.builder()
                        .amountLowerBound(0L)
                        .amountReconciled(0L)
                        .amountReconciledDirection(
                            ExpectedPaymentCreate.AmountReconciledDirection.CREDIT
                        )
                        .amountUnreconciled(0L)
                        .amountUnreconciledDirection(
                            ExpectedPaymentCreate.AmountUnreconciledDirection.CREDIT
                        )
                        .amountUpperBound(0L)
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency(Currency.AED)
                        .dateLowerBound(LocalDate.parse("2019-12-27"))
                        .dateUpperBound(LocalDate.parse("2019-12-27"))
                        .description("description")
                        .direction(ExpectedPaymentCreate.Direction.CREDIT)
                        .externalId("external_id")
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerTransaction(
                            LedgerTransactionCreateRequest.builder()
                                .addLedgerEntry(
                                    LedgerEntryCreateRequest.builder()
                                        .amount(0L)
                                        .direction(TransactionDirection.CREDIT)
                                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .availableBalanceAmount(
                                            LedgerEntryCreateRequest.AvailableBalanceAmount
                                                .builder()
                                                .putAdditionalProperty("foo", JsonValue.from(0))
                                                .build()
                                        )
                                        .effectiveAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .lockVersion(0L)
                                        .metadata(
                                            LedgerEntryCreateRequest.Metadata.builder()
                                                .putAdditionalProperty(
                                                    "key",
                                                    JsonValue.from("value"),
                                                )
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
                        .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addLineItem(
                            LineItem.builder()
                                .amount(0L)
                                .accountingCategoryId("accounting_category_id")
                                .description("description")
                                .metadata(
                                    LineItem.Metadata.builder()
                                        .putAdditionalProperty("key", JsonValue.from("value"))
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                        .build()
                                )
                                .build()
                        )
                        .metadata(
                            ExpectedPaymentCreate.Metadata.builder()
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExpectedPaymentCreate.builder()
                    .amountLowerBound(0L)
                    .amountReconciled(0L)
                    .amountReconciledDirection(
                        ExpectedPaymentCreate.AmountReconciledDirection.CREDIT
                    )
                    .amountUnreconciled(0L)
                    .amountUnreconciledDirection(
                        ExpectedPaymentCreate.AmountUnreconciledDirection.CREDIT
                    )
                    .amountUpperBound(0L)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .dateLowerBound(LocalDate.parse("2019-12-27"))
                    .dateUpperBound(LocalDate.parse("2019-12-27"))
                    .description("description")
                    .direction(ExpectedPaymentCreate.Direction.CREDIT)
                    .externalId("external_id")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addLineItem(
                        LineItem.builder()
                            .amount(0L)
                            .accountingCategoryId("accounting_category_id")
                            .description("description")
                            .metadata(
                                LineItem.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        ExpectedPaymentCreate.Metadata.builder()
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ExpectedPaymentCreateParams.builder().build()

        val body = params._body()
    }
}
