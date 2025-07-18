// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentOrderCreateAsyncParamsTest {

    @Test
    fun create() {
        PaymentOrderCreateAsyncParams.builder()
            .amount(0L)
            .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
            .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(PaymentOrderType.ACH)
            .accounting(
                Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .chargeBearer(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
            .currency(Currency.AED)
            .description("description")
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .fallbackType(PaymentOrderCreateAsyncParams.FallbackType.ACH)
            .foreignExchangeContract("foreign_exchange_contract")
            .foreignExchangeIndicator(
                PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
            )
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
            .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addLineItem(
                PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                    .amount(0L)
                    .accountingCategoryId("accounting_category_id")
                    .description("description")
                    .metadata(
                        PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
            .metadata(
                PaymentOrderCreateAsyncParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .nsfProtected(true)
            .originatingPartyName("originating_party_name")
            .priority(PaymentOrderCreateAsyncParams.Priority.HIGH)
            .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .purpose("purpose")
            .receivingAccount(
                PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                    .addAccountDetail(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
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
                        PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder()
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
                    .partyType(PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS)
                    .plaidProcessorToken("plaid_processor_token")
                    .addRoutingDetail(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                    .RoutingNumberType
                                    .ABA
                            )
                            .paymentType(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                    .PaymentType
                                    .ACH
                            )
                            .build()
                    )
                    .build()
            )
            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .remittanceInformation("remittance_information")
            .sendRemittanceAdvice(true)
            .statementDescriptor("statement_descriptor")
            .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
            .transactionMonitoringEnabled(true)
            .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
            .ultimateOriginatingPartyName("ultimate_originating_party_name")
            .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
            .ultimateReceivingPartyName("ultimate_receiving_party_name")
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentOrderCreateAsyncParams.builder()
                .amount(0L)
                .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentOrderType.ACH)
                .accounting(
                    Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeBearer(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
                .currency(Currency.AED)
                .description("description")
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fallbackType(PaymentOrderCreateAsyncParams.FallbackType.ACH)
                .foreignExchangeContract("foreign_exchange_contract")
                .foreignExchangeIndicator(
                    PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                )
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
                .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addLineItem(
                    PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                        .amount(0L)
                        .accountingCategoryId("accounting_category_id")
                        .description("description")
                        .metadata(
                            PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .build()
                )
                .metadata(
                    PaymentOrderCreateAsyncParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .nsfProtected(true)
                .originatingPartyName("originating_party_name")
                .priority(PaymentOrderCreateAsyncParams.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("purpose")
                .receivingAccount(
                    PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                        .addAccountDetail(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
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
                            PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder()
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
                        .partyType(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS
                        )
                        .plaidProcessorToken("plaid_processor_token")
                        .addRoutingDetail(
                            PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail.builder()
                                .routingNumber("routing_number")
                                .routingNumberType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                        .RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                        .PaymentType
                                        .ACH
                                )
                                .build()
                        )
                        .build()
                )
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .remittanceInformation("remittance_information")
                .sendRemittanceAdvice(true)
                .statementDescriptor("statement_descriptor")
                .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                .transactionMonitoringEnabled(true)
                .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                .ultimateOriginatingPartyName("ultimate_originating_party_name")
                .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                .ultimateReceivingPartyName("ultimate_receiving_party_name")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.direction()).isEqualTo(PaymentOrderCreateAsyncParams.Direction.CREDIT)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(body.accounting())
            .isEqualTo(
                Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.accountingCategoryId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.accountingLedgerClassId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.chargeBearer()).isEqualTo(PaymentOrderCreateAsyncParams.ChargeBearer.SHARED)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.fallbackType()).isEqualTo(PaymentOrderCreateAsyncParams.FallbackType.ACH)
        assertThat(body.foreignExchangeContract()).isEqualTo("foreign_exchange_contract")
        assertThat(body.foreignExchangeIndicator())
            .isEqualTo(PaymentOrderCreateAsyncParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
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
        assertThat(body.ledgerTransactionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.lineItems())
            .containsExactly(
                PaymentOrderCreateAsyncParams.LineItemRequest.builder()
                    .amount(0L)
                    .accountingCategoryId("accounting_category_id")
                    .description("description")
                    .metadata(
                        PaymentOrderCreateAsyncParams.LineItemRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                PaymentOrderCreateAsyncParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.nsfProtected()).isEqualTo(true)
        assertThat(body.originatingPartyName()).isEqualTo("originating_party_name")
        assertThat(body.priority()).isEqualTo(PaymentOrderCreateAsyncParams.Priority.HIGH)
        assertThat(body.processAfter()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.purpose()).isEqualTo("purpose")
        assertThat(body.receivingAccount())
            .isEqualTo(
                PaymentOrderCreateAsyncParams.ReceivingAccount.builder()
                    .addAccountDetail(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
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
                        PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder()
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
                    .partyType(PaymentOrderCreateAsyncParams.ReceivingAccount.PartyType.BUSINESS)
                    .plaidProcessorToken("plaid_processor_token")
                    .addRoutingDetail(
                        PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                    .RoutingNumberType
                                    .ABA
                            )
                            .paymentType(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                    .PaymentType
                                    .ACH
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.receivingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.remittanceInformation()).isEqualTo("remittance_information")
        assertThat(body.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(body.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(body.subtype()).isEqualTo(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
        assertThat(body.transactionMonitoringEnabled()).isEqualTo(true)
        assertThat(body.ultimateOriginatingPartyIdentifier())
            .isEqualTo("ultimate_originating_party_identifier")
        assertThat(body.ultimateOriginatingPartyName()).isEqualTo("ultimate_originating_party_name")
        assertThat(body.ultimateReceivingPartyIdentifier())
            .isEqualTo("ultimate_receiving_party_identifier")
        assertThat(body.ultimateReceivingPartyName()).isEqualTo("ultimate_receiving_party_name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentOrderCreateAsyncParams.builder()
                .amount(0L)
                .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentOrderType.ACH)
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.direction()).isEqualTo(PaymentOrderCreateAsyncParams.Direction.CREDIT)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.type()).isEqualTo(PaymentOrderType.ACH)
    }
}
