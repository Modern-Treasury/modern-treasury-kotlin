// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.Accounting
import com.moderntreasury.api.models.AddressRequest
import com.moderntreasury.api.models.ContactDetailCreateRequest
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.LedgerAccountCreateRequest
import com.moderntreasury.api.models.LedgerEntryCreateRequest
import com.moderntreasury.api.models.LedgerTransactionCreateRequest
import com.moderntreasury.api.models.LineItemRequest
import com.moderntreasury.api.models.PaymentOrderAsyncCreateRequest
import com.moderntreasury.api.models.PaymentOrderCreateParams
import com.moderntreasury.api.models.PaymentOrderSubtype
import com.moderntreasury.api.models.PaymentOrderType
import com.moderntreasury.api.models.PaymentOrderUpdateParams
import com.moderntreasury.api.models.PaymentOrderUpdateRequest
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentOrderServiceTest {

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
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
                        PaymentOrderCreateParams.PaymentOrderDocumentCreateRequest.builder()
                            .file("Example data".byteInputStream())
                            .documentType("document_type")
                            .documentableId("documentable_id")
                            .documentableType(
                                PaymentOrderCreateParams.PaymentOrderDocumentCreateRequest
                                    .DocumentableType
                                    .CONNECTION
                            )
                            .build()
                    )
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalId("external_id")
                    .fallbackType(PaymentOrderCreateParams.FallbackType.ACH)
                    .foreignExchangeContract("foreign_exchange_contract")
                    .foreignExchangeIndicator(
                        PaymentOrderCreateParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                    )
                    .ledgerTransaction(
                        LedgerTransactionCreateRequest.builder()
                            .addLedgerEntry(
                                LedgerEntryCreateRequest.builder()
                                    .direction(TransactionDirection.CREDIT)
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .amount(0L)
                                    .amountString("amount_string")
                                    .availableBalanceAmount(
                                        LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .lockVersion(0L)
                                    .metadata(
                                        LedgerEntryCreateRequest.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty("key", JsonValue.from("value"))
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
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .status(LedgerTransactionCreateRequest.Status.ARCHIVED)
                            .build()
                    )
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                        PaymentOrderCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .nsfProtected(true)
                    .originatingPartyAddress(
                        PaymentOrderCreateParams.OriginatingPartyAddress.builder()
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
                                    .addLedgerAccountCategoryId(
                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                    )
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        LedgerAccountCreateRequest.LedgerableType.EXTERNAL_ACCOUNT
                                    )
                                    .metadata(
                                        LedgerAccountCreateRequest.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty("key", JsonValue.from("value"))
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
                    .ultimateOriginatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ultimateOriginatingPartyAddress(
                        PaymentOrderCreateParams.UltimateOriginatingPartyAddress.builder()
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .build()
                    )
                    .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                    .ultimateOriginatingPartyName("ultimate_originating_party_name")
                    .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                    .ultimateReceivingPartyName("ultimate_receiving_party_name")
                    .vendorAttributes(
                        PaymentOrderCreateParams.VendorAttributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        paymentOrder.validate()
    }

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
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

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
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
                    .paymentOrderUpdateRequest(
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
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
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
                                        PaymentOrderUpdateRequest.ReceivingAccount.AccountDetail
                                            .builder()
                                            .accountNumber("account_number")
                                            .accountNumberType(
                                                PaymentOrderUpdateRequest.ReceivingAccount
                                                    .AccountDetail
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
                                            .externalId("external_id")
                                            .addLedgerAccountCategoryId(
                                                "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                            )
                                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .ledgerableType(
                                                LedgerAccountCreateRequest.LedgerableType
                                                    .EXTERNAL_ACCOUNT
                                            )
                                            .metadata(
                                                LedgerAccountCreateRequest.Metadata.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("bar"),
                                                    )
                                                    .putAdditionalProperty(
                                                        "key",
                                                        JsonValue.from("value"),
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
                                        PaymentOrderUpdateRequest.ReceivingAccount.Metadata
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty("key", JsonValue.from("value"))
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
                                        PaymentOrderUpdateRequest.ReceivingAccount.PartyType
                                            .BUSINESS
                                    )
                                    .plaidProcessorToken("plaid_processor_token")
                                    .addRoutingDetail(
                                        PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail
                                            .builder()
                                            .routingNumber("routing_number")
                                            .routingNumberType(
                                                PaymentOrderUpdateRequest.ReceivingAccount
                                                    .RoutingDetail
                                                    .RoutingNumberType
                                                    .ABA
                                            )
                                            .paymentType(
                                                PaymentOrderUpdateRequest.ReceivingAccount
                                                    .RoutingDetail
                                                    .PaymentType
                                                    .ACH
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .reconciliationStatus(
                                PaymentOrderUpdateRequest.ReconciliationStatus.UNRECONCILED
                            )
                            .remittanceInformation("remittance_information")
                            .sendRemittanceAdvice(true)
                            .statementDescriptor("statement_descriptor")
                            .status(PaymentOrderUpdateRequest.Status.APPROVED)
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

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
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
                PaymentOrderAsyncCreateRequest.builder()
                    .amount(0L)
                    .direction(PaymentOrderAsyncCreateRequest.Direction.CREDIT)
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
                    .chargeBearer(PaymentOrderAsyncCreateRequest.ChargeBearer.SHARED)
                    .currency(Currency.AED)
                    .description("description")
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .externalId("external_id")
                    .fallbackType(PaymentOrderAsyncCreateRequest.FallbackType.ACH)
                    .foreignExchangeContract("foreign_exchange_contract")
                    .foreignExchangeIndicator(
                        PaymentOrderAsyncCreateRequest.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                    )
                    .ledgerTransaction(
                        LedgerTransactionCreateRequest.builder()
                            .addLedgerEntry(
                                LedgerEntryCreateRequest.builder()
                                    .direction(TransactionDirection.CREDIT)
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .amount(0L)
                                    .amountString("amount_string")
                                    .availableBalanceAmount(
                                        LedgerEntryCreateRequest.AvailableBalanceAmount.builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .lockVersion(0L)
                                    .metadata(
                                        LedgerEntryCreateRequest.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty("key", JsonValue.from("value"))
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
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .status(LedgerTransactionCreateRequest.Status.ARCHIVED)
                            .build()
                    )
                    .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                        PaymentOrderAsyncCreateRequest.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .nsfProtected(true)
                    .originatingPartyAddress(
                        PaymentOrderAsyncCreateRequest.OriginatingPartyAddress.builder()
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
                    .priority(PaymentOrderAsyncCreateRequest.Priority.HIGH)
                    .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .purpose("purpose")
                    .receivingAccount(
                        PaymentOrderAsyncCreateRequest.ReceivingAccount.builder()
                            .addAccountDetail(
                                PaymentOrderAsyncCreateRequest.ReceivingAccount.AccountDetail
                                    .builder()
                                    .accountNumber("account_number")
                                    .accountNumberType(
                                        PaymentOrderAsyncCreateRequest.ReceivingAccount
                                            .AccountDetail
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
                                    .addLedgerAccountCategoryId(
                                        "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"
                                    )
                                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .ledgerableType(
                                        LedgerAccountCreateRequest.LedgerableType.EXTERNAL_ACCOUNT
                                    )
                                    .metadata(
                                        LedgerAccountCreateRequest.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .metadata(
                                PaymentOrderAsyncCreateRequest.ReceivingAccount.Metadata.builder()
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
                            .partyType(
                                PaymentOrderAsyncCreateRequest.ReceivingAccount.PartyType.BUSINESS
                            )
                            .plaidProcessorToken("plaid_processor_token")
                            .addRoutingDetail(
                                PaymentOrderAsyncCreateRequest.ReceivingAccount.RoutingDetail
                                    .builder()
                                    .routingNumber("routing_number")
                                    .routingNumberType(
                                        PaymentOrderAsyncCreateRequest.ReceivingAccount
                                            .RoutingDetail
                                            .RoutingNumberType
                                            .ABA
                                    )
                                    .paymentType(
                                        PaymentOrderAsyncCreateRequest.ReceivingAccount
                                            .RoutingDetail
                                            .PaymentType
                                            .ACH
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .receivingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .reconciliationStatus(
                        PaymentOrderAsyncCreateRequest.ReconciliationStatus.UNRECONCILED
                    )
                    .remittanceInformation("remittance_information")
                    .sendRemittanceAdvice(true)
                    .statementDescriptor("statement_descriptor")
                    .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                    .transactionMonitoringEnabled(true)
                    .ultimateOriginatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ultimateOriginatingPartyAddress(
                        PaymentOrderAsyncCreateRequest.UltimateOriginatingPartyAddress.builder()
                            .country("country")
                            .line1("line1")
                            .line2("line2")
                            .locality("locality")
                            .postalCode("postal_code")
                            .region("region")
                            .build()
                    )
                    .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                    .ultimateOriginatingPartyName("ultimate_originating_party_name")
                    .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                    .ultimateReceivingPartyName("ultimate_receiving_party_name")
                    .vendorAttributes(
                        PaymentOrderAsyncCreateRequest.VendorAttributes.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        asyncResponse.validate()
    }
}
