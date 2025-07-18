// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentOrderTest {

    @Test
    fun create() {
        val paymentOrder =
            PaymentOrder.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounting(
                    Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .chargeBearer(PaymentOrder.ChargeBearer.SHARED)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .currentReturn(
                    ReturnObject.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .code(ReturnObject.Code._901)
                        .corrections(
                            ReturnObject.Corrections.builder()
                                .accountNumber("account_number")
                                .companyId("company_id")
                                .companyName("company_name")
                                .individualIdentificationNumber("individual_identification_number")
                                .routingNumber("routing_number")
                                .transactionCode("transaction_code")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .currentReturn(null)
                        .dateOfDeath(LocalDate.parse("2019-12-27"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failureReason("failure_reason")
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .object_("object")
                        .reason("reason")
                        .addReferenceNumber(
                            ReturnObject.PaymentReference.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .referenceNumber("reference_number")
                                .referenceNumberType(
                                    ReturnObject.PaymentReference.ReferenceNumberType
                                        .ACH_ORIGINAL_TRACE_NUMBER
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                        .role(ReturnObject.Role.ORIGINATING)
                        .status(ReturnObject.Status.COMPLETED)
                        .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(ReturnObject.Type.ACH)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .additionalInformation("additional_information")
                        .data(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .description("description")
                .direction(PaymentOrder.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .foreignExchangeContract("foreign_exchange_contract")
                .foreignExchangeIndicator(PaymentOrder.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
                .foreignExchangeRate(
                    ForeignExchangeRate.builder()
                        .baseAmount(0L)
                        .baseCurrency(Currency.AED)
                        .exponent(0L)
                        .rateString("rate_string")
                        .targetAmount(0L)
                        .targetCurrency(Currency.AED)
                        .value(0L)
                        .build()
                )
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    PaymentOrder.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .nsfProtected(true)
                .object_("object")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingPartyName("originating_party_name")
                .priority(PaymentOrder.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("purpose")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingAccountType(PaymentOrder.ReceivingAccountType.INTERNAL_ACCOUNT)
                .addReferenceNumber(
                    PaymentOrder.PaymentReference.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .referenceNumber("reference_number")
                        .referenceNumberType(
                            PaymentOrder.PaymentReference.ReferenceNumberType
                                .ACH_ORIGINAL_TRACE_NUMBER
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .remittanceInformation("remittance_information")
                .sendRemittanceAdvice(true)
                .statementDescriptor("statement_descriptor")
                .status(PaymentOrder.Status.APPROVED)
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .addTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentOrderType.ACH)
                .ultimateOriginatingAccount(
                    VirtualAccount.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAccountDetail(
                            AccountDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .accountNumberSafe("account_number_safe")
                                .accountNumberType(AccountDetail.AccountNumberType.AU_NUMBER)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .accountNumber("account_number")
                                .build()
                        )
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .metadata(
                            VirtualAccount.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .name("name")
                        .object_("object")
                        .addRoutingDetail(
                            RoutingDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .bankAddress(
                                    Address.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .country("country")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .line1("line1")
                                        .line2("line2")
                                        .liveMode(true)
                                        .locality("locality")
                                        .object_("object")
                                        .postalCode("postal_code")
                                        .region("region")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .bankName("bank_name")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .paymentType(RoutingDetail.PaymentType.ACH)
                                .routingNumber("routing_number")
                                .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .ultimateOriginatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ultimateOriginatingAccountType(
                    PaymentOrder.UltimateOriginatingAccountType.INTERNAL_ACCOUNT
                )
                .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                .ultimateOriginatingPartyName("ultimate_originating_party_name")
                .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                .ultimateReceivingPartyName("ultimate_receiving_party_name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorAttributes(JsonValue.from(mapOf<String, Any>()))
                .vendorFailureReason("vendor_failure_reason")
                .build()

        assertThat(paymentOrder.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.accounting())
            .isEqualTo(
                Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(paymentOrder.accountingCategoryId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.accountingLedgerClassId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.amount()).isEqualTo(0L)
        assertThat(paymentOrder.chargeBearer()).isEqualTo(PaymentOrder.ChargeBearer.SHARED)
        assertThat(paymentOrder.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.currency()).isEqualTo(Currency.AED)
        assertThat(paymentOrder.currentReturn())
            .isEqualTo(
                ReturnObject.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .code(ReturnObject.Code._901)
                    .corrections(
                        ReturnObject.Corrections.builder()
                            .accountNumber("account_number")
                            .companyId("company_id")
                            .companyName("company_name")
                            .individualIdentificationNumber("individual_identification_number")
                            .routingNumber("routing_number")
                            .transactionCode("transaction_code")
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency(Currency.AED)
                    .currentReturn(null)
                    .dateOfDeath(LocalDate.parse("2019-12-27"))
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .failureReason("failure_reason")
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .liveMode(true)
                    .object_("object")
                    .reason("reason")
                    .addReferenceNumber(
                        ReturnObject.PaymentReference.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .liveMode(true)
                            .object_("object")
                            .referenceNumber("reference_number")
                            .referenceNumberType(
                                ReturnObject.PaymentReference.ReferenceNumberType
                                    .ACH_ORIGINAL_TRACE_NUMBER
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                    .role(ReturnObject.Role.ORIGINATING)
                    .status(ReturnObject.Status.COMPLETED)
                    .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(ReturnObject.Type.ACH)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .additionalInformation("additional_information")
                    .data(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(paymentOrder.description()).isEqualTo("description")
        assertThat(paymentOrder.direction()).isEqualTo(PaymentOrder.Direction.CREDIT)
        assertThat(paymentOrder.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paymentOrder.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.externalId()).isEqualTo("external_id")
        assertThat(paymentOrder.foreignExchangeContract()).isEqualTo("foreign_exchange_contract")
        assertThat(paymentOrder.foreignExchangeIndicator())
            .isEqualTo(PaymentOrder.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
        assertThat(paymentOrder.foreignExchangeRate())
            .isEqualTo(
                ForeignExchangeRate.builder()
                    .baseAmount(0L)
                    .baseCurrency(Currency.AED)
                    .exponent(0L)
                    .rateString("rate_string")
                    .targetAmount(0L)
                    .targetCurrency(Currency.AED)
                    .value(0L)
                    .build()
            )
        assertThat(paymentOrder.ledgerTransactionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.liveMode()).isEqualTo(true)
        assertThat(paymentOrder.metadata())
            .isEqualTo(
                PaymentOrder.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(paymentOrder.nsfProtected()).isEqualTo(true)
        assertThat(paymentOrder.object_()).isEqualTo("object")
        assertThat(paymentOrder.originatingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.originatingPartyName()).isEqualTo("originating_party_name")
        assertThat(paymentOrder.priority()).isEqualTo(PaymentOrder.Priority.HIGH)
        assertThat(paymentOrder.processAfter())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder.purpose()).isEqualTo("purpose")
        assertThat(paymentOrder.receivingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.receivingAccountType())
            .isEqualTo(PaymentOrder.ReceivingAccountType.INTERNAL_ACCOUNT)
        assertThat(paymentOrder.referenceNumbers())
            .containsExactly(
                PaymentOrder.PaymentReference.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .liveMode(true)
                    .object_("object")
                    .referenceNumber("reference_number")
                    .referenceNumberType(
                        PaymentOrder.PaymentReference.ReferenceNumberType.ACH_ORIGINAL_TRACE_NUMBER
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(paymentOrder.remittanceInformation()).isEqualTo("remittance_information")
        assertThat(paymentOrder.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(paymentOrder.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(paymentOrder.status()).isEqualTo(PaymentOrder.Status.APPROVED)
        assertThat(paymentOrder.subtype()).isEqualTo(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
        assertThat(paymentOrder.transactionIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(paymentOrder.ultimateOriginatingAccount())
            .isEqualTo(
                PaymentOrder.UltimateOriginatingAccount.ofVirtual(
                    VirtualAccount.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAccountDetail(
                            AccountDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .accountNumberSafe("account_number_safe")
                                .accountNumberType(AccountDetail.AccountNumberType.AU_NUMBER)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .accountNumber("account_number")
                                .build()
                        )
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .metadata(
                            VirtualAccount.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .name("name")
                        .object_("object")
                        .addRoutingDetail(
                            RoutingDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .bankAddress(
                                    Address.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .country("country")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .line1("line1")
                                        .line2("line2")
                                        .liveMode(true)
                                        .locality("locality")
                                        .object_("object")
                                        .postalCode("postal_code")
                                        .region("region")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .bankName("bank_name")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .paymentType(RoutingDetail.PaymentType.ACH)
                                .routingNumber("routing_number")
                                .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
            )
        assertThat(paymentOrder.ultimateOriginatingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrder.ultimateOriginatingAccountType())
            .isEqualTo(PaymentOrder.UltimateOriginatingAccountType.INTERNAL_ACCOUNT)
        assertThat(paymentOrder.ultimateOriginatingPartyIdentifier())
            .isEqualTo("ultimate_originating_party_identifier")
        assertThat(paymentOrder.ultimateOriginatingPartyName())
            .isEqualTo("ultimate_originating_party_name")
        assertThat(paymentOrder.ultimateReceivingPartyIdentifier())
            .isEqualTo("ultimate_receiving_party_identifier")
        assertThat(paymentOrder.ultimateReceivingPartyName())
            .isEqualTo("ultimate_receiving_party_name")
        assertThat(paymentOrder.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrder._vendorAttributes()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(paymentOrder.vendorFailureReason()).isEqualTo("vendor_failure_reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentOrder =
            PaymentOrder.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accounting(
                    Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .chargeBearer(PaymentOrder.ChargeBearer.SHARED)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Currency.AED)
                .currentReturn(
                    ReturnObject.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .amount(0L)
                        .code(ReturnObject.Code._901)
                        .corrections(
                            ReturnObject.Corrections.builder()
                                .accountNumber("account_number")
                                .companyId("company_id")
                                .companyName("company_name")
                                .individualIdentificationNumber("individual_identification_number")
                                .routingNumber("routing_number")
                                .transactionCode("transaction_code")
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .currentReturn(null)
                        .dateOfDeath(LocalDate.parse("2019-12-27"))
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failureReason("failure_reason")
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .object_("object")
                        .reason("reason")
                        .addReferenceNumber(
                            ReturnObject.PaymentReference.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .referenceNumber("reference_number")
                                .referenceNumberType(
                                    ReturnObject.PaymentReference.ReferenceNumberType
                                        .ACH_ORIGINAL_TRACE_NUMBER
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .returnableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .returnableType(ReturnObject.ReturnableType.INCOMING_PAYMENT_DETAIL)
                        .role(ReturnObject.Role.ORIGINATING)
                        .status(ReturnObject.Status.COMPLETED)
                        .transactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .transactionLineItemId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(ReturnObject.Type.ACH)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .additionalInformation("additional_information")
                        .data(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .description("description")
                .direction(PaymentOrder.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .foreignExchangeContract("foreign_exchange_contract")
                .foreignExchangeIndicator(PaymentOrder.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
                .foreignExchangeRate(
                    ForeignExchangeRate.builder()
                        .baseAmount(0L)
                        .baseCurrency(Currency.AED)
                        .exponent(0L)
                        .rateString("rate_string")
                        .targetAmount(0L)
                        .targetCurrency(Currency.AED)
                        .value(0L)
                        .build()
                )
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .metadata(
                    PaymentOrder.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .nsfProtected(true)
                .object_("object")
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingPartyName("originating_party_name")
                .priority(PaymentOrder.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("purpose")
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .receivingAccountType(PaymentOrder.ReceivingAccountType.INTERNAL_ACCOUNT)
                .addReferenceNumber(
                    PaymentOrder.PaymentReference.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .liveMode(true)
                        .object_("object")
                        .referenceNumber("reference_number")
                        .referenceNumberType(
                            PaymentOrder.PaymentReference.ReferenceNumberType
                                .ACH_ORIGINAL_TRACE_NUMBER
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .remittanceInformation("remittance_information")
                .sendRemittanceAdvice(true)
                .statementDescriptor("statement_descriptor")
                .status(PaymentOrder.Status.APPROVED)
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .addTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentOrderType.ACH)
                .ultimateOriginatingAccount(
                    VirtualAccount.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addAccountDetail(
                            AccountDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .accountNumberSafe("account_number_safe")
                                .accountNumberType(AccountDetail.AccountNumberType.AU_NUMBER)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .accountNumber("account_number")
                                .build()
                        )
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .liveMode(true)
                        .metadata(
                            VirtualAccount.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .name("name")
                        .object_("object")
                        .addRoutingDetail(
                            RoutingDetail.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .bankAddress(
                                    Address.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .country("country")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .line1("line1")
                                        .line2("line2")
                                        .liveMode(true)
                                        .locality("locality")
                                        .object_("object")
                                        .postalCode("postal_code")
                                        .region("region")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .bankName("bank_name")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .liveMode(true)
                                .object_("object")
                                .paymentType(RoutingDetail.PaymentType.ACH)
                                .routingNumber("routing_number")
                                .routingNumberType(RoutingDetail.RoutingNumberType.ABA)
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .ultimateOriginatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ultimateOriginatingAccountType(
                    PaymentOrder.UltimateOriginatingAccountType.INTERNAL_ACCOUNT
                )
                .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                .ultimateOriginatingPartyName("ultimate_originating_party_name")
                .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                .ultimateReceivingPartyName("ultimate_receiving_party_name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .vendorAttributes(JsonValue.from(mapOf<String, Any>()))
                .vendorFailureReason("vendor_failure_reason")
                .build()

        val roundtrippedPaymentOrder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentOrder),
                jacksonTypeRef<PaymentOrder>(),
            )

        assertThat(roundtrippedPaymentOrder).isEqualTo(paymentOrder)
    }
}
