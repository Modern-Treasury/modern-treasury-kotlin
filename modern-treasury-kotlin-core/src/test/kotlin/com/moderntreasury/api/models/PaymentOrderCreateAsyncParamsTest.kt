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
            .paymentOrderAsyncCreate(
                PaymentOrderAsyncCreate.builder()
                    .amount(0L)
                    .direction(PaymentOrderAsyncCreate.Direction.CREDIT)
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
                    .chargeBearer(PaymentOrderAsyncCreate.ChargeBearer.SHARED)
                    .currency(Currency.AED)
                    .description("description")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fallbackType(PaymentOrderAsyncCreate.FallbackType.ACH)
                    .foreignExchangeContract("foreign_exchange_contract")
                    .foreignExchangeIndicator(
                        PaymentOrderAsyncCreate.ForeignExchangeIndicator.FIXED_TO_VARIABLE
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
                        PaymentOrderAsyncCreate.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .nsfProtected(true)
                    .originatingPartyName("originating_party_name")
                    .priority(PaymentOrderAsyncCreate.Priority.HIGH)
                    .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .purpose("purpose")
                    .receivingAccount(
                        PaymentOrderAsyncCreate.ReceivingAccount.builder()
                            .addAccountDetail(
                                PaymentOrderAsyncCreate.ReceivingAccount.AccountDetail.builder()
                                    .accountNumber("account_number")
                                    .accountNumberType(
                                        PaymentOrderAsyncCreate.ReceivingAccount.AccountDetail
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
                                    .addLedgerAccountCategoryId(
                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                    )
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY
                                    )
                                    .metadata(
                                        LedgerAccountCreateRequest.Metadata.builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .metadata(
                                PaymentOrderAsyncCreate.ReceivingAccount.Metadata.builder()
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
                            .partyType(PaymentOrderAsyncCreate.ReceivingAccount.PartyType.BUSINESS)
                            .plaidProcessorToken("plaid_processor_token")
                            .addRoutingDetail(
                                PaymentOrderAsyncCreate.ReceivingAccount.RoutingDetail.builder()
                                    .routingNumber("routing_number")
                                    .routingNumberType(
                                        PaymentOrderAsyncCreate.ReceivingAccount.RoutingDetail
                                            .RoutingNumberType
                                            .ABA
                                    )
                                    .paymentType(
                                        PaymentOrderAsyncCreate.ReceivingAccount.RoutingDetail
                                            .PaymentType
                                            .ACH
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reconciliationStatus(PaymentOrderAsyncCreate.ReconciliationStatus.UNRECONCILED)
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PaymentOrderCreateAsyncParams.builder()
                .paymentOrderAsyncCreate(
                    PaymentOrderAsyncCreate.builder()
                        .amount(0L)
                        .direction(PaymentOrderAsyncCreate.Direction.CREDIT)
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
                        .chargeBearer(PaymentOrderAsyncCreate.ChargeBearer.SHARED)
                        .currency(Currency.AED)
                        .description("description")
                        .effectiveDate(LocalDate.parse("2019-12-27"))
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fallbackType(PaymentOrderAsyncCreate.FallbackType.ACH)
                        .foreignExchangeContract("foreign_exchange_contract")
                        .foreignExchangeIndicator(
                            PaymentOrderAsyncCreate.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                        )
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
                            PaymentOrderAsyncCreate.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .nsfProtected(true)
                        .originatingPartyName("originating_party_name")
                        .priority(PaymentOrderAsyncCreate.Priority.HIGH)
                        .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .purpose("purpose")
                        .receivingAccount(
                            PaymentOrderAsyncCreate.ReceivingAccount.builder()
                                .addAccountDetail(
                                    PaymentOrderAsyncCreate.ReceivingAccount.AccountDetail.builder()
                                        .accountNumber("account_number")
                                        .accountNumberType(
                                            PaymentOrderAsyncCreate.ReceivingAccount.AccountDetail
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
                                        .addLedgerAccountCategoryId(
                                            "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                        )
                                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .ledgerableType(
                                            LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY
                                        )
                                        .metadata(
                                            LedgerAccountCreateRequest.Metadata.builder()
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
                                        .build()
                                )
                                .metadata(
                                    PaymentOrderAsyncCreate.ReceivingAccount.Metadata.builder()
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
                                    PaymentOrderAsyncCreate.ReceivingAccount.PartyType.BUSINESS
                                )
                                .plaidProcessorToken("plaid_processor_token")
                                .addRoutingDetail(
                                    PaymentOrderAsyncCreate.ReceivingAccount.RoutingDetail.builder()
                                        .routingNumber("routing_number")
                                        .routingNumberType(
                                            PaymentOrderAsyncCreate.ReceivingAccount.RoutingDetail
                                                .RoutingNumberType
                                                .ABA
                                        )
                                        .paymentType(
                                            PaymentOrderAsyncCreate.ReceivingAccount.RoutingDetail
                                                .PaymentType
                                                .ACH
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .reconciliationStatus(
                            PaymentOrderAsyncCreate.ReconciliationStatus.UNRECONCILED
                        )
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PaymentOrderAsyncCreate.builder()
                    .amount(0L)
                    .direction(PaymentOrderAsyncCreate.Direction.CREDIT)
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
                    .chargeBearer(PaymentOrderAsyncCreate.ChargeBearer.SHARED)
                    .currency(Currency.AED)
                    .description("description")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fallbackType(PaymentOrderAsyncCreate.FallbackType.ACH)
                    .foreignExchangeContract("foreign_exchange_contract")
                    .foreignExchangeIndicator(
                        PaymentOrderAsyncCreate.ForeignExchangeIndicator.FIXED_TO_VARIABLE
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
                        PaymentOrderAsyncCreate.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .nsfProtected(true)
                    .originatingPartyName("originating_party_name")
                    .priority(PaymentOrderAsyncCreate.Priority.HIGH)
                    .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .purpose("purpose")
                    .receivingAccount(
                        PaymentOrderAsyncCreate.ReceivingAccount.builder()
                            .addAccountDetail(
                                PaymentOrderAsyncCreate.ReceivingAccount.AccountDetail.builder()
                                    .accountNumber("account_number")
                                    .accountNumberType(
                                        PaymentOrderAsyncCreate.ReceivingAccount.AccountDetail
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
                                    .addLedgerAccountCategoryId(
                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                    )
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        LedgerAccountCreateRequest.LedgerableType.COUNTERPARTY
                                    )
                                    .metadata(
                                        LedgerAccountCreateRequest.Metadata.builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .metadata(
                                PaymentOrderAsyncCreate.ReceivingAccount.Metadata.builder()
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
                            .partyType(PaymentOrderAsyncCreate.ReceivingAccount.PartyType.BUSINESS)
                            .plaidProcessorToken("plaid_processor_token")
                            .addRoutingDetail(
                                PaymentOrderAsyncCreate.ReceivingAccount.RoutingDetail.builder()
                                    .routingNumber("routing_number")
                                    .routingNumberType(
                                        PaymentOrderAsyncCreate.ReceivingAccount.RoutingDetail
                                            .RoutingNumberType
                                            .ABA
                                    )
                                    .paymentType(
                                        PaymentOrderAsyncCreate.ReceivingAccount.RoutingDetail
                                            .PaymentType
                                            .ACH
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reconciliationStatus(PaymentOrderAsyncCreate.ReconciliationStatus.UNRECONCILED)
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentOrderCreateAsyncParams.builder()
                .paymentOrderAsyncCreate(
                    PaymentOrderAsyncCreate.builder()
                        .amount(0L)
                        .direction(PaymentOrderAsyncCreate.Direction.CREDIT)
                        .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(PaymentOrderType.ACH)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PaymentOrderAsyncCreate.builder()
                    .amount(0L)
                    .direction(PaymentOrderAsyncCreate.Direction.CREDIT)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(PaymentOrderType.ACH)
                    .build()
            )
    }
}
