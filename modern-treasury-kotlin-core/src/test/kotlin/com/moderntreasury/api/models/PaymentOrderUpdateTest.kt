// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentOrderUpdateTest {

    @Test
    fun create() {
        val paymentOrderUpdate =
            PaymentOrderUpdate.builder()
                .accounting(
                    Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .chargeBearer(PaymentOrderUpdate.ChargeBearer.SHARED)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .description("description")
                .direction(PaymentOrderUpdate.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fallbackType(PaymentOrderUpdate.FallbackType.ACH)
                .foreignExchangeContract("foreign_exchange_contract")
                .foreignExchangeIndicator(
                    PaymentOrderUpdate.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                )
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
                    PaymentOrderUpdate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .nsfProtected(true)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingPartyName("originating_party_name")
                .priority(PaymentOrderUpdate.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("purpose")
                .receivingAccount(
                    PaymentOrderUpdate.ReceivingAccount.builder()
                        .addAccountDetail(
                            PaymentOrderUpdate.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    PaymentOrderUpdate.ReceivingAccount.AccountDetail
                                        .AccountNumberType
                                        .AU_NUMBER
                                )
                                .build()
                        )
                        .accountType(ExternalAccountType.BASE_WALLET)
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
                                .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableType(
                                    LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY
                                )
                                .metadata(
                                    LedgerAccountCreateRequest.Metadata.builder()
                                        .putAdditionalProperty("key", JsonValue.from("value"))
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                        .build()
                                )
                                .build()
                        )
                        .metadata(
                            PaymentOrderUpdate.ReceivingAccount.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                        .partyType(PaymentOrderUpdate.ReceivingAccount.PartyType.BUSINESS)
                        .plaidProcessorToken("plaid_processor_token")
                        .addRoutingDetail(
                            PaymentOrderUpdate.ReceivingAccount.RoutingDetail.builder()
                                .routingNumber("routing_number")
                                .routingNumberType(
                                    PaymentOrderUpdate.ReceivingAccount.RoutingDetail
                                        .RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    PaymentOrderUpdate.ReceivingAccount.RoutingDetail.PaymentType
                                        .ACH
                                )
                                .build()
                        )
                        .build()
                )
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reconciliationStatus(PaymentOrderUpdate.ReconciliationStatus.UNRECONCILED)
                .remittanceInformation("remittance_information")
                .sendRemittanceAdvice(true)
                .statementDescriptor("statement_descriptor")
                .status(PaymentOrderUpdate.Status.APPROVED)
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .type(PaymentOrderType.ACH)
                .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                .ultimateOriginatingPartyName("ultimate_originating_party_name")
                .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                .ultimateReceivingPartyName("ultimate_receiving_party_name")
                .build()

        assertThat(paymentOrderUpdate.accounting())
            .isEqualTo(
                Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(paymentOrderUpdate.accountingCategoryId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdate.accountingLedgerClassId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdate.amount()).isEqualTo(0L)
        assertThat(paymentOrderUpdate.chargeBearer())
            .isEqualTo(PaymentOrderUpdate.ChargeBearer.SHARED)
        assertThat(paymentOrderUpdate.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdate.currency()).isEqualTo(Currency.AED)
        assertThat(paymentOrderUpdate.description()).isEqualTo("description")
        assertThat(paymentOrderUpdate.direction()).isEqualTo(PaymentOrderUpdate.Direction.CREDIT)
        assertThat(paymentOrderUpdate.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(paymentOrderUpdate.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrderUpdate.fallbackType()).isEqualTo(PaymentOrderUpdate.FallbackType.ACH)
        assertThat(paymentOrderUpdate.foreignExchangeContract())
            .isEqualTo("foreign_exchange_contract")
        assertThat(paymentOrderUpdate.foreignExchangeIndicator())
            .isEqualTo(PaymentOrderUpdate.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
        assertThat(paymentOrderUpdate.lineItems())
            .containsExactly(
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
        assertThat(paymentOrderUpdate.metadata())
            .isEqualTo(
                PaymentOrderUpdate.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(paymentOrderUpdate.nsfProtected()).isEqualTo(true)
        assertThat(paymentOrderUpdate.originatingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdate.originatingPartyName()).isEqualTo("originating_party_name")
        assertThat(paymentOrderUpdate.priority()).isEqualTo(PaymentOrderUpdate.Priority.HIGH)
        assertThat(paymentOrderUpdate.processAfter())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(paymentOrderUpdate.purpose()).isEqualTo("purpose")
        assertThat(paymentOrderUpdate.receivingAccount())
            .isEqualTo(
                PaymentOrderUpdate.ReceivingAccount.builder()
                    .addAccountDetail(
                        PaymentOrderUpdate.ReceivingAccount.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                PaymentOrderUpdate.ReceivingAccount.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                    .accountType(ExternalAccountType.BASE_WALLET)
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
                            .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY)
                            .metadata(
                                LedgerAccountCreateRequest.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        PaymentOrderUpdate.ReceivingAccount.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                    .partyType(PaymentOrderUpdate.ReceivingAccount.PartyType.BUSINESS)
                    .plaidProcessorToken("plaid_processor_token")
                    .addRoutingDetail(
                        PaymentOrderUpdate.ReceivingAccount.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                PaymentOrderUpdate.ReceivingAccount.RoutingDetail.RoutingNumberType
                                    .ABA
                            )
                            .paymentType(
                                PaymentOrderUpdate.ReceivingAccount.RoutingDetail.PaymentType.ACH
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(paymentOrderUpdate.receivingAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(paymentOrderUpdate.reconciliationStatus())
            .isEqualTo(PaymentOrderUpdate.ReconciliationStatus.UNRECONCILED)
        assertThat(paymentOrderUpdate.remittanceInformation()).isEqualTo("remittance_information")
        assertThat(paymentOrderUpdate.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(paymentOrderUpdate.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(paymentOrderUpdate.status()).isEqualTo(PaymentOrderUpdate.Status.APPROVED)
        assertThat(paymentOrderUpdate.subtype()).isEqualTo(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
        assertThat(paymentOrderUpdate.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(paymentOrderUpdate.ultimateOriginatingPartyIdentifier())
            .isEqualTo("ultimate_originating_party_identifier")
        assertThat(paymentOrderUpdate.ultimateOriginatingPartyName())
            .isEqualTo("ultimate_originating_party_name")
        assertThat(paymentOrderUpdate.ultimateReceivingPartyIdentifier())
            .isEqualTo("ultimate_receiving_party_identifier")
        assertThat(paymentOrderUpdate.ultimateReceivingPartyName())
            .isEqualTo("ultimate_receiving_party_name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val paymentOrderUpdate =
            PaymentOrderUpdate.builder()
                .accounting(
                    Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .amount(0L)
                .chargeBearer(PaymentOrderUpdate.ChargeBearer.SHARED)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .currency(Currency.AED)
                .description("description")
                .direction(PaymentOrderUpdate.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fallbackType(PaymentOrderUpdate.FallbackType.ACH)
                .foreignExchangeContract("foreign_exchange_contract")
                .foreignExchangeIndicator(
                    PaymentOrderUpdate.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                )
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
                    PaymentOrderUpdate.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .nsfProtected(true)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .originatingPartyName("originating_party_name")
                .priority(PaymentOrderUpdate.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("purpose")
                .receivingAccount(
                    PaymentOrderUpdate.ReceivingAccount.builder()
                        .addAccountDetail(
                            PaymentOrderUpdate.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    PaymentOrderUpdate.ReceivingAccount.AccountDetail
                                        .AccountNumberType
                                        .AU_NUMBER
                                )
                                .build()
                        )
                        .accountType(ExternalAccountType.BASE_WALLET)
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
                                .addLedgerAccountCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .ledgerableType(
                                    LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY
                                )
                                .metadata(
                                    LedgerAccountCreateRequest.Metadata.builder()
                                        .putAdditionalProperty("key", JsonValue.from("value"))
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                        .build()
                                )
                                .build()
                        )
                        .metadata(
                            PaymentOrderUpdate.ReceivingAccount.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                        .partyType(PaymentOrderUpdate.ReceivingAccount.PartyType.BUSINESS)
                        .plaidProcessorToken("plaid_processor_token")
                        .addRoutingDetail(
                            PaymentOrderUpdate.ReceivingAccount.RoutingDetail.builder()
                                .routingNumber("routing_number")
                                .routingNumberType(
                                    PaymentOrderUpdate.ReceivingAccount.RoutingDetail
                                        .RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    PaymentOrderUpdate.ReceivingAccount.RoutingDetail.PaymentType
                                        .ACH
                                )
                                .build()
                        )
                        .build()
                )
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reconciliationStatus(PaymentOrderUpdate.ReconciliationStatus.UNRECONCILED)
                .remittanceInformation("remittance_information")
                .sendRemittanceAdvice(true)
                .statementDescriptor("statement_descriptor")
                .status(PaymentOrderUpdate.Status.APPROVED)
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .type(PaymentOrderType.ACH)
                .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                .ultimateOriginatingPartyName("ultimate_originating_party_name")
                .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                .ultimateReceivingPartyName("ultimate_receiving_party_name")
                .build()

        val roundtrippedPaymentOrderUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(paymentOrderUpdate),
                jacksonTypeRef<PaymentOrderUpdate>(),
            )

        assertThat(roundtrippedPaymentOrderUpdate).isEqualTo(paymentOrderUpdate)
    }
}
