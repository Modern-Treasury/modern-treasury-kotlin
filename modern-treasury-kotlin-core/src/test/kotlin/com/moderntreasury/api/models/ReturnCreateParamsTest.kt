// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReturnCreateParamsTest {

    @Test
    fun create() {
        ReturnCreateParams.builder()
            .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
            .additionalInformation("additional_information")
            .code(ReturnCreateParams.Code._901)
            .corrections(
                ReturnCreateParams.Corrections.builder()
                    .accountNumber("account_number")
                    .companyId("company_id")
                    .companyName("company_name")
                    .individualIdentificationNumber("individual_identification_number")
                    .routingNumber("routing_number")
                    .transactionCode("transaction_code")
                    .build()
            )
            .data(JsonValue.from(mapOf<String, Any>()))
            .dateOfDeath(LocalDate.parse("2019-12-27"))
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
            .reason("reason")
            .reconciliationStatus(ReturnCreateParams.ReconciliationStatus.UNRECONCILED)
            .build()
    }

    @Test
    fun body() {
        val params =
            ReturnCreateParams.builder()
                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .additionalInformation("additional_information")
                .code(ReturnCreateParams.Code._901)
                .corrections(
                    ReturnCreateParams.Corrections.builder()
                        .accountNumber("account_number")
                        .companyId("company_id")
                        .companyName("company_name")
                        .individualIdentificationNumber("individual_identification_number")
                        .routingNumber("routing_number")
                        .transactionCode("transaction_code")
                        .build()
                )
                .data(JsonValue.from(mapOf<String, Any>()))
                .dateOfDeath(LocalDate.parse("2019-12-27"))
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
                .reason("reason")
                .reconciliationStatus(ReturnCreateParams.ReconciliationStatus.UNRECONCILED)
                .build()

        val body = params._body()

        assertThat(body.returnableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.returnableType())
            .isEqualTo(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
        assertThat(body.additionalInformation()).isEqualTo("additional_information")
        assertThat(body.code()).isEqualTo(ReturnCreateParams.Code._901)
        assertThat(body.corrections())
            .isEqualTo(
                ReturnCreateParams.Corrections.builder()
                    .accountNumber("account_number")
                    .companyId("company_id")
                    .companyName("company_name")
                    .individualIdentificationNumber("individual_identification_number")
                    .routingNumber("routing_number")
                    .transactionCode("transaction_code")
                    .build()
            )
        assertThat(body._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.dateOfDeath()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.ledgerTransaction())
            .isEqualTo(
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
        assertThat(body.reason()).isEqualTo("reason")
        assertThat(body.reconciliationStatus())
            .isEqualTo(ReturnCreateParams.ReconciliationStatus.UNRECONCILED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ReturnCreateParams.builder()
                .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .returnableType(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
                .build()

        val body = params._body()

        assertThat(body.returnableId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.returnableType())
            .isEqualTo(ReturnCreateParams.ReturnableType.INCOMING_PAYMENT_DETAIL)
    }
}
