// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentOrderUpdateRequestTest {

    @Test
    fun create() {
        val paymentOrderUpdateRequest =
            PaymentOrderUpdateRequest.builder()
                .accounting(
                    Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .chargeBearer(PaymentOrderUpdateRequest.ChargeBearer.SHARED)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .description("description")
                .direction(PaymentOrderUpdateRequest.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .fallbackType(PaymentOrderUpdateRequest.FallbackType.ACH)
                .foreignExchangeContract("foreign_exchange_contract")
                .foreignExchangeIndicator(
                    PaymentOrderUpdateRequest.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                )
                .addLineItem(
                    LineItemRequest.builder()
                        .amount(0L)
                        .accountingCategoryId("accounting_category_id")
                        .description("description")
                        .metadata(
                            LineItemRequest.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .build()
                )
                .metadata(
                    PaymentOrderUpdateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .nsfProtected(true)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingPartyAddress(
                    PaymentOrderUpdateRequest.OriginatingPartyAddress.builder()
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .build()
                )
                .originatingPartyName("originating_party_name")
                .originatingSecondaryPartyName("originating_secondary_party_name")
                .priority(PaymentOrderUpdateRequest.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("purpose")
                .receivingAccount(
                    PaymentOrderUpdateRequest.ReceivingAccount.builder()
                        .addAccountDetail(
                            PaymentOrderUpdateRequest.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    PaymentOrderUpdateRequest.ReceivingAccount.AccountDetail
                                        .AccountNumberType
                                        .ARBITRUM_ADDRESS
                                )
                                .build()
                        )
                        .accountType(ExternalAccountType.CASH)
                        .addContactDetail(
                            ContactDetailCreateRequest.builder()
                                .contactIdentifier("contact_identifier")
                                .contactIdentifierType(
                                    ContactDetailCreateRequest.ContactIdentifierType.EMAIL
                                )
                                .build()
                        )
                        .externalId("external_id")
                        .ledgerAccount(
                            LedgerAccountCreateRequest.builder()
                                .currency("currency")
                                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .normalBalance(TransactionDirection.CREDIT)
                                .currencyExponent(0L)
                                .description("description")
                                .externalId("external_id")
                                .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableType(
                                    LedgerAccountCreateRequest.LedgerableType.EXTERNAL_ACCOUNT
                                )
                                .metadata(
                                    LedgerAccountCreateRequest.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .putAdditionalProperty("key", JsonValue.from("value"))
                                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                        .build()
                                )
                                .build()
                        )
                        .metadata(
                            PaymentOrderUpdateRequest.ReceivingAccount.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .name("name")
                        .partyAddress(
                            AddressRequest.builder()
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .locality("locality")
                                .postalCode("postal_code")
                                .region("region")
                                .build()
                        )
                        .partyIdentifier("party_identifier")
                        .partyName("party_name")
                        .partyType(PaymentOrderUpdateRequest.ReceivingAccount.PartyType.BUSINESS)
                        .plaidProcessorToken("plaid_processor_token")
                        .addRoutingDetail(
                            PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail.builder()
                                .routingNumber("routing_number")
                                .routingNumberType(
                                    PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail
                                        .RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail
                                        .PaymentType
                                        .ACH
                                )
                                .build()
                        )
                        .build()
                )
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reconciliationStatus(PaymentOrderUpdateRequest.ReconciliationStatus.UNRECONCILED)
                .remittanceInformation("remittance_information")
                .sendRemittanceAdvice(true)
                .statementDescriptor("statement_descriptor")
                .status(PaymentOrderUpdateRequest.Status.APPROVED)
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .type(PaymentOrderType.ACH)
                .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                .ultimateOriginatingPartyName("ultimate_originating_party_name")
                .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                .ultimateReceivingPartyName("ultimate_receiving_party_name")
                .build()

        assertThat(paymentOrderUpdateRequest.accounting())
            .isEqualTo(
                Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(paymentOrderUpdateRequest.accountingCategoryId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdateRequest.accountingLedgerClassId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdateRequest.amount()).isEqualTo(0L)
        assertThat(paymentOrderUpdateRequest.chargeBearer())
            .isEqualTo(PaymentOrderUpdateRequest.ChargeBearer.SHARED)
        assertThat(paymentOrderUpdateRequest.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdateRequest.currency()).isEqualTo(Currency.AED)
        assertThat(paymentOrderUpdateRequest.description()).isEqualTo("description")
        assertThat(paymentOrderUpdateRequest.direction())
            .isEqualTo(PaymentOrderUpdateRequest.Direction.CREDIT)
        assertThat(paymentOrderUpdateRequest.effectiveDate())
            .isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paymentOrderUpdateRequest.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrderUpdateRequest.externalId()).isEqualTo("external_id")
        assertThat(paymentOrderUpdateRequest.fallbackType())
            .isEqualTo(PaymentOrderUpdateRequest.FallbackType.ACH)
        assertThat(paymentOrderUpdateRequest.foreignExchangeContract())
            .isEqualTo("foreign_exchange_contract")
        assertThat(paymentOrderUpdateRequest.foreignExchangeIndicator())
            .isEqualTo(PaymentOrderUpdateRequest.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
        assertThat(paymentOrderUpdateRequest.lineItems())
            .containsExactly(
                LineItemRequest.builder()
                    .amount(0L)
                    .accountingCategoryId("accounting_category_id")
                    .description("description")
                    .metadata(
                        LineItemRequest.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
        assertThat(paymentOrderUpdateRequest.metadata())
            .isEqualTo(
                PaymentOrderUpdateRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(paymentOrderUpdateRequest.nsfProtected()).isEqualTo(true)
        assertThat(paymentOrderUpdateRequest.originatingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdateRequest.originatingPartyAddress())
            .isEqualTo(
                PaymentOrderUpdateRequest.OriginatingPartyAddress.builder()
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .build()
            )
        assertThat(paymentOrderUpdateRequest.originatingPartyName())
            .isEqualTo("originating_party_name")
        assertThat(paymentOrderUpdateRequest.originatingSecondaryPartyName())
            .isEqualTo("originating_secondary_party_name")
        assertThat(paymentOrderUpdateRequest.priority())
            .isEqualTo(PaymentOrderUpdateRequest.Priority.HIGH)
        assertThat(paymentOrderUpdateRequest.processAfter())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrderUpdateRequest.purpose()).isEqualTo("purpose")
        assertThat(paymentOrderUpdateRequest.receivingAccount())
            .isEqualTo(
                PaymentOrderUpdateRequest.ReceivingAccount.builder()
                    .addAccountDetail(
                        PaymentOrderUpdateRequest.ReceivingAccount.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                PaymentOrderUpdateRequest.ReceivingAccount.AccountDetail
                                    .AccountNumberType
                                    .ARBITRUM_ADDRESS
                            )
                            .build()
                    )
                    .accountType(ExternalAccountType.CASH)
                    .addContactDetail(
                        ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ContactDetailCreateRequest.ContactIdentifierType.EMAIL
                            )
                            .build()
                    )
                    .externalId("external_id")
                    .ledgerAccount(
                        LedgerAccountCreateRequest.builder()
                            .currency("currency")
                            .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .normalBalance(TransactionDirection.CREDIT)
                            .currencyExponent(0L)
                            .description("description")
                            .externalId("external_id")
                            .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                LedgerAccountCreateRequest.LedgerableType.EXTERNAL_ACCOUNT
                            )
                            .metadata(
                                LedgerAccountCreateRequest.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        PaymentOrderUpdateRequest.ReceivingAccount.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .name("name")
                    .partyAddress(
                        AddressRequest.builder()
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .build()
                    )
                    .partyIdentifier("party_identifier")
                    .partyName("party_name")
                    .partyType(PaymentOrderUpdateRequest.ReceivingAccount.PartyType.BUSINESS)
                    .plaidProcessorToken("plaid_processor_token")
                    .addRoutingDetail(
                        PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail
                                    .RoutingNumberType
                                    .ABA
                            )
                            .paymentType(
                                PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail.PaymentType
                                    .ACH
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(paymentOrderUpdateRequest.receivingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdateRequest.reconciliationStatus())
            .isEqualTo(PaymentOrderUpdateRequest.ReconciliationStatus.UNRECONCILED)
        assertThat(paymentOrderUpdateRequest.remittanceInformation())
            .isEqualTo("remittance_information")
        assertThat(paymentOrderUpdateRequest.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(paymentOrderUpdateRequest.statementDescriptor())
            .isEqualTo("statement_descriptor")
        assertThat(paymentOrderUpdateRequest.status())
            .isEqualTo(PaymentOrderUpdateRequest.Status.APPROVED)
        assertThat(paymentOrderUpdateRequest.subtype())
            .isEqualTo(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
        assertThat(paymentOrderUpdateRequest.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(paymentOrderUpdateRequest.ultimateOriginatingPartyIdentifier())
            .isEqualTo("ultimate_originating_party_identifier")
        assertThat(paymentOrderUpdateRequest.ultimateOriginatingPartyName())
            .isEqualTo("ultimate_originating_party_name")
        assertThat(paymentOrderUpdateRequest.ultimateReceivingPartyIdentifier())
            .isEqualTo("ultimate_receiving_party_identifier")
        assertThat(paymentOrderUpdateRequest.ultimateReceivingPartyName())
            .isEqualTo("ultimate_receiving_party_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentOrderUpdateRequest =
            PaymentOrderUpdateRequest.builder()
                .accounting(
                    Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .chargeBearer(PaymentOrderUpdateRequest.ChargeBearer.SHARED)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .description("description")
                .direction(PaymentOrderUpdateRequest.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalId("external_id")
                .fallbackType(PaymentOrderUpdateRequest.FallbackType.ACH)
                .foreignExchangeContract("foreign_exchange_contract")
                .foreignExchangeIndicator(
                    PaymentOrderUpdateRequest.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                )
                .addLineItem(
                    LineItemRequest.builder()
                        .amount(0L)
                        .accountingCategoryId("accounting_category_id")
                        .description("description")
                        .metadata(
                            LineItemRequest.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .build()
                )
                .metadata(
                    PaymentOrderUpdateRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .nsfProtected(true)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingPartyAddress(
                    PaymentOrderUpdateRequest.OriginatingPartyAddress.builder()
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .build()
                )
                .originatingPartyName("originating_party_name")
                .originatingSecondaryPartyName("originating_secondary_party_name")
                .priority(PaymentOrderUpdateRequest.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("purpose")
                .receivingAccount(
                    PaymentOrderUpdateRequest.ReceivingAccount.builder()
                        .addAccountDetail(
                            PaymentOrderUpdateRequest.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    PaymentOrderUpdateRequest.ReceivingAccount.AccountDetail
                                        .AccountNumberType
                                        .ARBITRUM_ADDRESS
                                )
                                .build()
                        )
                        .accountType(ExternalAccountType.CASH)
                        .addContactDetail(
                            ContactDetailCreateRequest.builder()
                                .contactIdentifier("contact_identifier")
                                .contactIdentifierType(
                                    ContactDetailCreateRequest.ContactIdentifierType.EMAIL
                                )
                                .build()
                        )
                        .externalId("external_id")
                        .ledgerAccount(
                            LedgerAccountCreateRequest.builder()
                                .currency("currency")
                                .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .normalBalance(TransactionDirection.CREDIT)
                                .currencyExponent(0L)
                                .description("description")
                                .externalId("external_id")
                                .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableType(
                                    LedgerAccountCreateRequest.LedgerableType.EXTERNAL_ACCOUNT
                                )
                                .metadata(
                                    LedgerAccountCreateRequest.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .putAdditionalProperty("key", JsonValue.from("value"))
                                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                        .build()
                                )
                                .build()
                        )
                        .metadata(
                            PaymentOrderUpdateRequest.ReceivingAccount.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .name("name")
                        .partyAddress(
                            AddressRequest.builder()
                                .country("country")
                                .line1("line1")
                                .line2("line2")
                                .locality("locality")
                                .postalCode("postal_code")
                                .region("region")
                                .build()
                        )
                        .partyIdentifier("party_identifier")
                        .partyName("party_name")
                        .partyType(PaymentOrderUpdateRequest.ReceivingAccount.PartyType.BUSINESS)
                        .plaidProcessorToken("plaid_processor_token")
                        .addRoutingDetail(
                            PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail.builder()
                                .routingNumber("routing_number")
                                .routingNumberType(
                                    PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail
                                        .RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail
                                        .PaymentType
                                        .ACH
                                )
                                .build()
                        )
                        .build()
                )
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reconciliationStatus(PaymentOrderUpdateRequest.ReconciliationStatus.UNRECONCILED)
                .remittanceInformation("remittance_information")
                .sendRemittanceAdvice(true)
                .statementDescriptor("statement_descriptor")
                .status(PaymentOrderUpdateRequest.Status.APPROVED)
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .type(PaymentOrderType.ACH)
                .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                .ultimateOriginatingPartyName("ultimate_originating_party_name")
                .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                .ultimateReceivingPartyName("ultimate_receiving_party_name")
                .build()

        val roundtrippedPaymentOrderUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentOrderUpdateRequest),
                jacksonTypeRef<PaymentOrderUpdateRequest>(),
            )

        assertThat(roundtrippedPaymentOrderUpdateRequest).isEqualTo(paymentOrderUpdateRequest)
    }
}
