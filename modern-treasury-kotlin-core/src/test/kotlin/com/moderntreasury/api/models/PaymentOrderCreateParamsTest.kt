// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.MultipartField
import java.io.InputStream
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentOrderCreateParamsTest {

    @Test
    fun create() {
        PaymentOrderCreateParams.builder()
            .amount(0L)
            .direction(PaymentOrderCreateParams.Direction.CREDIT)
            .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(PaymentOrderType.ACH)
            .accounting(
                PaymentOrderCreateParams.Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .chargeBearer(PaymentOrderCreateParams.ChargeBearer.SHARED)
            .currency(Currency.AED)
            .description("description")
            .addDocument(
                PaymentOrderCreateParams.DocumentCreateRequest.builder()
                    .file("some content".byteInputStream())
                    .documentType("document_type")
                    .documentableId("documentable_id")
                    .documentableType(
                        PaymentOrderCreateParams.DocumentCreateRequest.DocumentableType.CONNECTIONS
                    )
                    .build()
            )
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .fallbackType(PaymentOrderCreateParams.FallbackType.ACH)
            .foreignExchangeContract("foreign_exchange_contract")
            .foreignExchangeIndicator(
                PaymentOrderCreateParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
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
                PaymentOrderCreateParams.LineItemRequest.builder()
                    .amount(0L)
                    .accountingCategoryId("accounting_category_id")
                    .description("description")
                    .metadata(
                        PaymentOrderCreateParams.LineItemRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
            .metadata(
                PaymentOrderCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .nsfProtected(true)
            .originatingPartyName("originating_party_name")
            .priority(PaymentOrderCreateParams.Priority.HIGH)
            .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .purpose("purpose")
            .receivingAccount(
                PaymentOrderCreateParams.ReceivingAccount.builder()
                    .addAccountDetail(
                        PaymentOrderCreateParams.ReceivingAccount.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                PaymentOrderCreateParams.ReceivingAccount.AccountDetail
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
                        PaymentOrderCreateParams.ReceivingAccount.Metadata.builder()
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
                    .partyType(PaymentOrderCreateParams.ReceivingAccount.PartyType.BUSINESS)
                    .plaidProcessorToken("plaid_processor_token")
                    .addRoutingDetail(
                        PaymentOrderCreateParams.ReceivingAccount.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                PaymentOrderCreateParams.ReceivingAccount.RoutingDetail
                                    .RoutingNumberType
                                    .ABA
                            )
                            .paymentType(
                                PaymentOrderCreateParams.ReceivingAccount.RoutingDetail.PaymentType
                                    .ACH
                            )
                            .build()
                    )
                    .build()
            )
            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .reconciliationStatus(PaymentOrderCreateParams.ReconciliationStatus.UNRECONCILED)
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
            PaymentOrderCreateParams.builder()
                .amount(0L)
                .direction(PaymentOrderCreateParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentOrderType.ACH)
                .accounting(
                    PaymentOrderCreateParams.Accounting.builder()
                        .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chargeBearer(PaymentOrderCreateParams.ChargeBearer.SHARED)
                .currency(Currency.AED)
                .description("description")
                .addDocument(
                    PaymentOrderCreateParams.DocumentCreateRequest.builder()
                        .file("some content".byteInputStream())
                        .documentType("document_type")
                        .documentableId("documentable_id")
                        .documentableType(
                            PaymentOrderCreateParams.DocumentCreateRequest.DocumentableType
                                .CONNECTIONS
                        )
                        .build()
                )
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fallbackType(PaymentOrderCreateParams.FallbackType.ACH)
                .foreignExchangeContract("foreign_exchange_contract")
                .foreignExchangeIndicator(
                    PaymentOrderCreateParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
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
                    PaymentOrderCreateParams.LineItemRequest.builder()
                        .amount(0L)
                        .accountingCategoryId("accounting_category_id")
                        .description("description")
                        .metadata(
                            PaymentOrderCreateParams.LineItemRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .build()
                )
                .metadata(
                    PaymentOrderCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .nsfProtected(true)
                .originatingPartyName("originating_party_name")
                .priority(PaymentOrderCreateParams.Priority.HIGH)
                .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .purpose("purpose")
                .receivingAccount(
                    PaymentOrderCreateParams.ReceivingAccount.builder()
                        .addAccountDetail(
                            PaymentOrderCreateParams.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    PaymentOrderCreateParams.ReceivingAccount.AccountDetail
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
                            PaymentOrderCreateParams.ReceivingAccount.Metadata.builder()
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
                        .partyType(PaymentOrderCreateParams.ReceivingAccount.PartyType.BUSINESS)
                        .plaidProcessorToken("plaid_processor_token")
                        .addRoutingDetail(
                            PaymentOrderCreateParams.ReceivingAccount.RoutingDetail.builder()
                                .routingNumber("routing_number")
                                .routingNumberType(
                                    PaymentOrderCreateParams.ReceivingAccount.RoutingDetail
                                        .RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    PaymentOrderCreateParams.ReceivingAccount.RoutingDetail
                                        .PaymentType
                                        .ACH
                                )
                                .build()
                        )
                        .build()
                )
                .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .reconciliationStatus(PaymentOrderCreateParams.ReconciliationStatus.UNRECONCILED)
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

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "amount" to MultipartField.of(0L),
                        "direction" to MultipartField.of(PaymentOrderCreateParams.Direction.CREDIT),
                        "originating_account_id" to
                            MultipartField.of("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                        "type" to MultipartField.of(PaymentOrderType.ACH),
                        "accounting" to
                            MultipartField.of(
                                PaymentOrderCreateParams.Accounting.builder()
                                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            ),
                        "accounting_category_id" to
                            MultipartField.of("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                        "accounting_ledger_class_id" to
                            MultipartField.of("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                        "charge_bearer" to
                            MultipartField.of(PaymentOrderCreateParams.ChargeBearer.SHARED),
                        "currency" to MultipartField.of(Currency.AED),
                        "description" to MultipartField.of("description"),
                        "documents" to
                            MultipartField.builder<
                                    List<PaymentOrderCreateParams.DocumentCreateRequest>
                                >()
                                .value(
                                    listOf(
                                        PaymentOrderCreateParams.DocumentCreateRequest.builder()
                                            .file("some content".byteInputStream())
                                            .documentType("document_type")
                                            .documentableId("documentable_id")
                                            .documentableType(
                                                PaymentOrderCreateParams.DocumentCreateRequest
                                                    .DocumentableType
                                                    .CONNECTIONS
                                            )
                                            .build()
                                    )
                                )
                                .contentType("application/octet-stream")
                                .build(),
                        "effective_date" to MultipartField.of(LocalDate.parse("2019-12-27")),
                        "expires_at" to
                            MultipartField.of(OffsetDateTime.parse("2019-12-27T18:11:19.117Z")),
                        "fallback_type" to
                            MultipartField.of(PaymentOrderCreateParams.FallbackType.ACH),
                        "foreign_exchange_contract" to
                            MultipartField.of("foreign_exchange_contract"),
                        "foreign_exchange_indicator" to
                            MultipartField.of(
                                PaymentOrderCreateParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                            ),
                        "ledger_transaction" to
                            MultipartField.of(
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
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .putAdditionalProperty(
                                                        "modern",
                                                        JsonValue.from("treasury"),
                                                    )
                                                    .build()
                                            )
                                            .pendingBalanceAmount(
                                                LedgerEntryCreateRequest.PendingBalanceAmount
                                                    .builder()
                                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                                    .build()
                                            )
                                            .postedBalanceAmount(
                                                LedgerEntryCreateRequest.PostedBalanceAmount
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
                                        LedgerTransactionCreateRequest.LedgerableType
                                            .EXPECTED_PAYMENT
                                    )
                                    .metadata(
                                        LedgerTransactionCreateRequest.Metadata.builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
                                            .build()
                                    )
                                    .status(LedgerTransactionCreateRequest.Status.ARCHIVED)
                                    .build()
                            ),
                        "ledger_transaction_id" to
                            MultipartField.of("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                        "line_items" to
                            MultipartField.of(
                                listOf(
                                    PaymentOrderCreateParams.LineItemRequest.builder()
                                        .amount(0L)
                                        .accountingCategoryId("accounting_category_id")
                                        .description("description")
                                        .metadata(
                                            PaymentOrderCreateParams.LineItemRequest.Metadata
                                                .builder()
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
                            ),
                        "metadata" to
                            MultipartField.of(
                                PaymentOrderCreateParams.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            ),
                        "nsf_protected" to MultipartField.of(true),
                        "originating_party_name" to MultipartField.of("originating_party_name"),
                        "priority" to MultipartField.of(PaymentOrderCreateParams.Priority.HIGH),
                        "process_after" to
                            MultipartField.of(OffsetDateTime.parse("2019-12-27T18:11:19.117Z")),
                        "purpose" to MultipartField.of("purpose"),
                        "receiving_account" to
                            MultipartField.of(
                                PaymentOrderCreateParams.ReceivingAccount.builder()
                                    .addAccountDetail(
                                        PaymentOrderCreateParams.ReceivingAccount.AccountDetail
                                            .builder()
                                            .accountNumber("account_number")
                                            .accountNumberType(
                                                PaymentOrderCreateParams.ReceivingAccount
                                                    .AccountDetail
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
                                                ContactDetailCreateRequest.ContactIdentifierType
                                                    .EMAIL
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
                                                LedgerAccountCreateRequest.LedgerableType
                                                    .COUNTERPARTY
                                            )
                                            .metadata(
                                                LedgerAccountCreateRequest.Metadata.builder()
                                                    .putAdditionalProperty(
                                                        "key",
                                                        JsonValue.from("value"),
                                                    )
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .putAdditionalProperty(
                                                        "modern",
                                                        JsonValue.from("treasury"),
                                                    )
                                                    .build()
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        PaymentOrderCreateParams.ReceivingAccount.Metadata.builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
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
                                        PaymentOrderCreateParams.ReceivingAccount.PartyType.BUSINESS
                                    )
                                    .plaidProcessorToken("plaid_processor_token")
                                    .addRoutingDetail(
                                        PaymentOrderCreateParams.ReceivingAccount.RoutingDetail
                                            .builder()
                                            .routingNumber("routing_number")
                                            .routingNumberType(
                                                PaymentOrderCreateParams.ReceivingAccount
                                                    .RoutingDetail
                                                    .RoutingNumberType
                                                    .ABA
                                            )
                                            .paymentType(
                                                PaymentOrderCreateParams.ReceivingAccount
                                                    .RoutingDetail
                                                    .PaymentType
                                                    .ACH
                                            )
                                            .build()
                                    )
                                    .build()
                            ),
                        "receiving_account_id" to
                            MultipartField.of("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                        "reconciliation_status" to
                            MultipartField.of(
                                PaymentOrderCreateParams.ReconciliationStatus.UNRECONCILED
                            ),
                        "remittance_information" to MultipartField.of("remittance_information"),
                        "send_remittance_advice" to MultipartField.of(true),
                        "statement_descriptor" to MultipartField.of("statement_descriptor"),
                        "subtype" to MultipartField.of(PaymentOrderSubtype.BACS_NEW_INSTRUCTION),
                        "transaction_monitoring_enabled" to MultipartField.of(true),
                        "ultimate_originating_party_identifier" to
                            MultipartField.of("ultimate_originating_party_identifier"),
                        "ultimate_originating_party_name" to
                            MultipartField.of("ultimate_originating_party_name"),
                        "ultimate_receiving_party_identifier" to
                            MultipartField.of("ultimate_receiving_party_identifier"),
                        "ultimate_receiving_party_name" to
                            MultipartField.of("ultimate_receiving_party_name"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentOrderCreateParams.builder()
                .amount(0L)
                .direction(PaymentOrderCreateParams.Direction.CREDIT)
                .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(PaymentOrderType.ACH)
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "amount" to MultipartField.of(0L),
                        "direction" to MultipartField.of(PaymentOrderCreateParams.Direction.CREDIT),
                        "originating_account_id" to
                            MultipartField.of("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                        "type" to MultipartField.of(PaymentOrderType.ACH),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
