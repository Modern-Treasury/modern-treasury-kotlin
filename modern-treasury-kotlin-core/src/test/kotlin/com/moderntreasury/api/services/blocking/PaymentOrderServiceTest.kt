// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.Accounting
import com.moderntreasury.api.models.AddressRequest
import com.moderntreasury.api.models.ContactDetailCreateRequest
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.DocumentCreate
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.LedgerAccountCreateRequest
import com.moderntreasury.api.models.LedgerEntryCreateRequest
import com.moderntreasury.api.models.LedgerTransactionCreateRequest
import com.moderntreasury.api.models.LineItem
import com.moderntreasury.api.models.PaymentOrderAsyncCreate
import com.moderntreasury.api.models.PaymentOrderCreateParams
import com.moderntreasury.api.models.PaymentOrderSubtype
import com.moderntreasury.api.models.PaymentOrderType
import com.moderntreasury.api.models.PaymentOrderUpdate
import com.moderntreasury.api.models.PaymentOrderUpdateParams
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentOrderServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentOrderService = client.paymentOrders()

        val paymentOrder =
            paymentOrderService.create(
                PaymentOrderCreateParams.builder()
                    .amount(0L)
                    .direction(PaymentOrderCreateParams.Direction.CREDIT)
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
                    .chargeBearer(PaymentOrderCreateParams.ChargeBearer.SHARED)
                    .currency(Currency.AED)
                    .description("description")
                    .addDocument(
                        DocumentCreate.builder()
                            .documentableId("documentable_id")
                            .documentableType(DocumentCreate.DocumentableType.COUNTERPARTIES)
                            .file("some content")
                            .documentType("document_type")
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
                    .reconciliationStatus(
                        PaymentOrderCreateParams.ReconciliationStatus.UNRECONCILED
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

        paymentOrder.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentOrderService = client.paymentOrders()

        val paymentOrder = paymentOrderService.retrieve("id")

        paymentOrder.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentOrderService = client.paymentOrders()

        val paymentOrder =
            paymentOrderService.update(
                PaymentOrderUpdateParams.builder()
                    .id("id")
                    .paymentOrderUpdate(
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
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
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
                                        PaymentOrderUpdate.ReceivingAccount.Metadata.builder()
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
                                        PaymentOrderUpdate.ReceivingAccount.PartyType.BUSINESS
                                    )
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
                                                PaymentOrderUpdate.ReceivingAccount.RoutingDetail
                                                    .PaymentType
                                                    .ACH
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .reconciliationStatus(
                                PaymentOrderUpdate.ReconciliationStatus.UNRECONCILED
                            )
                            .remittanceInformation("remittance_information")
                            .sendRemittanceAdvice(true)
                            .statementDescriptor("statement_descriptor")
                            .status(PaymentOrderUpdate.Status.APPROVED)
                            .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                            .type(PaymentOrderType.ACH)
                            .ultimateOriginatingPartyIdentifier(
                                "ultimate_originating_party_identifier"
                            )
                            .ultimateOriginatingPartyName("ultimate_originating_party_name")
                            .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                            .ultimateReceivingPartyName("ultimate_receiving_party_name")
                            .build()
                    )
                    .build()
            )

        paymentOrder.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentOrderService = client.paymentOrders()

        val page = paymentOrderService.list()

        page.items().forEach { it.validate() }
    }

    @Test
    fun createAsync() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentOrderService = client.paymentOrders()

        val asyncResponse =
            paymentOrderService.createAsync(
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

        asyncResponse.validate()
    }
}
