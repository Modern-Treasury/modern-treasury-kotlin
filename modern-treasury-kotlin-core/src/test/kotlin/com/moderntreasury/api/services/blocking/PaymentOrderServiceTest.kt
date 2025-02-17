// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.PaymentOrderCreateAsyncParams
import com.moderntreasury.api.models.PaymentOrderCreateParams
import com.moderntreasury.api.models.PaymentOrderListParams
import com.moderntreasury.api.models.PaymentOrderRetrieveParams
import com.moderntreasury.api.models.PaymentOrderSubtype
import com.moderntreasury.api.models.PaymentOrderType
import com.moderntreasury.api.models.PaymentOrderUpdateParams
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class PaymentOrderServiceTest {

    @Test
    fun callCreate() {
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
                            .documentableId("documentable_id")
                            .documentableType(
                                PaymentOrderCreateParams.DocumentCreateRequest.DocumentableType
                                    .CASES
                            )
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
                        PaymentOrderCreateParams.LedgerTransactionCreateRequest.builder()
                            .addLedgerEntry(
                                PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .builder()
                                    .amount(0L)
                                    .direction(TransactionDirection.CREDIT)
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .availableBalanceAmount(
                                        PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .AvailableBalanceAmount
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .lockVersion(0L)
                                    .metadata(
                                        PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
                                            .build()
                                    )
                                    .pendingBalanceAmount(
                                        PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PendingBalanceAmount
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .postedBalanceAmount(
                                        PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PostedBalanceAmount
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
                                PaymentOrderCreateParams.LedgerTransactionCreateRequest
                                    .LedgerableType
                                    .EXPECTED_PAYMENT
                            )
                            .metadata(
                                PaymentOrderCreateParams.LedgerTransactionCreateRequest.Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .status(
                                PaymentOrderCreateParams.LedgerTransactionCreateRequest.Status
                                    .ARCHIVED
                            )
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
                            .accountType(ExternalAccountType.CASH)
                            .addContactDetail(
                                PaymentOrderCreateParams.ReceivingAccount.ContactDetailCreateRequest
                                    .builder()
                                    .contactIdentifier("contact_identifier")
                                    .contactIdentifierType(
                                        PaymentOrderCreateParams.ReceivingAccount
                                            .ContactDetailCreateRequest
                                            .ContactIdentifierType
                                            .EMAIL
                                    )
                                    .build()
                            )
                            .ledgerAccount(
                                PaymentOrderCreateParams.ReceivingAccount.LedgerAccountCreateRequest
                                    .builder()
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
                                        PaymentOrderCreateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .LedgerableType
                                            .COUNTERPARTY
                                    )
                                    .metadata(
                                        PaymentOrderCreateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .Metadata
                                            .builder()
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
                                PaymentOrderCreateParams.ReceivingAccount.AddressRequest.builder()
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
        println(paymentOrder)
        paymentOrder.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentOrderService = client.paymentOrders()
        val paymentOrder =
            paymentOrderService.retrieve(PaymentOrderRetrieveParams.builder().id("id").build())
        println(paymentOrder)
        paymentOrder.validate()
    }

    @Test
    fun callUpdate() {
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
                    .accounting(
                        PaymentOrderUpdateParams.Accounting.builder()
                            .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .accountingCategoryId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accountingLedgerClassId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .amount(0L)
                    .chargeBearer(PaymentOrderUpdateParams.ChargeBearer.SHARED)
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.AED)
                    .description("description")
                    .direction(PaymentOrderUpdateParams.Direction.CREDIT)
                    .effectiveDate(LocalDate.parse("2019-12-27"))
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fallbackType(PaymentOrderUpdateParams.FallbackType.ACH)
                    .foreignExchangeContract("foreign_exchange_contract")
                    .foreignExchangeIndicator(
                        PaymentOrderUpdateParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                    )
                    .addLineItem(
                        PaymentOrderUpdateParams.LineItemRequest.builder()
                            .amount(0L)
                            .accountingCategoryId("accounting_category_id")
                            .description("description")
                            .metadata(
                                PaymentOrderUpdateParams.LineItemRequest.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .build()
                    )
                    .metadata(
                        PaymentOrderUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .nsfProtected(true)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .originatingPartyName("originating_party_name")
                    .priority(PaymentOrderUpdateParams.Priority.HIGH)
                    .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .purpose("purpose")
                    .receivingAccount(
                        PaymentOrderUpdateParams.ReceivingAccount.builder()
                            .addAccountDetail(
                                PaymentOrderUpdateParams.ReceivingAccount.AccountDetail.builder()
                                    .accountNumber("account_number")
                                    .accountNumberType(
                                        PaymentOrderUpdateParams.ReceivingAccount.AccountDetail
                                            .AccountNumberType
                                            .AU_NUMBER
                                    )
                                    .build()
                            )
                            .accountType(ExternalAccountType.CASH)
                            .addContactDetail(
                                PaymentOrderUpdateParams.ReceivingAccount.ContactDetailCreateRequest
                                    .builder()
                                    .contactIdentifier("contact_identifier")
                                    .contactIdentifierType(
                                        PaymentOrderUpdateParams.ReceivingAccount
                                            .ContactDetailCreateRequest
                                            .ContactIdentifierType
                                            .EMAIL
                                    )
                                    .build()
                            )
                            .ledgerAccount(
                                PaymentOrderUpdateParams.ReceivingAccount.LedgerAccountCreateRequest
                                    .builder()
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
                                        PaymentOrderUpdateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .LedgerableType
                                            .COUNTERPARTY
                                    )
                                    .metadata(
                                        PaymentOrderUpdateParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .Metadata
                                            .builder()
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
                                PaymentOrderUpdateParams.ReceivingAccount.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .name("name")
                            .partyAddress(
                                PaymentOrderUpdateParams.ReceivingAccount.AddressRequest.builder()
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
                            .partyType(PaymentOrderUpdateParams.ReceivingAccount.PartyType.BUSINESS)
                            .plaidProcessorToken("plaid_processor_token")
                            .addRoutingDetail(
                                PaymentOrderUpdateParams.ReceivingAccount.RoutingDetail.builder()
                                    .routingNumber("routing_number")
                                    .routingNumberType(
                                        PaymentOrderUpdateParams.ReceivingAccount.RoutingDetail
                                            .RoutingNumberType
                                            .ABA
                                    )
                                    .paymentType(
                                        PaymentOrderUpdateParams.ReceivingAccount.RoutingDetail
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
                    .status(PaymentOrderUpdateParams.Status.APPROVED)
                    .subtype(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
                    .type(PaymentOrderType.ACH)
                    .ultimateOriginatingPartyIdentifier("ultimate_originating_party_identifier")
                    .ultimateOriginatingPartyName("ultimate_originating_party_name")
                    .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                    .ultimateReceivingPartyName("ultimate_receiving_party_name")
                    .build()
            )
        println(paymentOrder)
        paymentOrder.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentOrderService = client.paymentOrders()
        val response = paymentOrderService.list(PaymentOrderListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callCreateAsync() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paymentOrderService = client.paymentOrders()
        val asyncResponse =
            paymentOrderService.createAsync(
                PaymentOrderCreateAsyncParams.builder()
                    .amount(0L)
                    .direction(PaymentOrderCreateAsyncParams.Direction.CREDIT)
                    .originatingAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(PaymentOrderType.ACH)
                    .accounting(
                        PaymentOrderCreateAsyncParams.Accounting.builder()
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
                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.builder()
                            .addLedgerEntry(
                                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                    .LedgerEntryCreateRequest
                                    .builder()
                                    .amount(0L)
                                    .direction(TransactionDirection.CREDIT)
                                    .ledgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .availableBalanceAmount(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .AvailableBalanceAmount
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .lockVersion(0L)
                                    .metadata(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .Metadata
                                            .builder()
                                            .putAdditionalProperty("key", JsonValue.from("value"))
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .putAdditionalProperty(
                                                "modern",
                                                JsonValue.from("treasury"),
                                            )
                                            .build()
                                    )
                                    .pendingBalanceAmount(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PendingBalanceAmount
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from(0))
                                            .build()
                                    )
                                    .postedBalanceAmount(
                                        PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                            .LedgerEntryCreateRequest
                                            .PostedBalanceAmount
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
                                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                    .LedgerableType
                                    .EXPECTED_PAYMENT
                            )
                            .metadata(
                                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .status(
                                PaymentOrderCreateAsyncParams.LedgerTransactionCreateRequest.Status
                                    .ARCHIVED
                            )
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
                                PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
                                    .builder()
                                    .accountNumber("account_number")
                                    .accountNumberType(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount.AccountDetail
                                            .AccountNumberType
                                            .AU_NUMBER
                                    )
                                    .build()
                            )
                            .accountType(ExternalAccountType.CASH)
                            .addContactDetail(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .ContactDetailCreateRequest
                                    .builder()
                                    .contactIdentifier("contact_identifier")
                                    .contactIdentifierType(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount
                                            .ContactDetailCreateRequest
                                            .ContactIdentifierType
                                            .EMAIL
                                    )
                                    .build()
                            )
                            .ledgerAccount(
                                PaymentOrderCreateAsyncParams.ReceivingAccount
                                    .LedgerAccountCreateRequest
                                    .builder()
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
                                        PaymentOrderCreateAsyncParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .LedgerableType
                                            .COUNTERPARTY
                                    )
                                    .metadata(
                                        PaymentOrderCreateAsyncParams.ReceivingAccount
                                            .LedgerAccountCreateRequest
                                            .Metadata
                                            .builder()
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
                                PaymentOrderCreateAsyncParams.ReceivingAccount.Metadata.builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .name("name")
                            .partyAddress(
                                PaymentOrderCreateAsyncParams.ReceivingAccount.AddressRequest
                                    .builder()
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
                                PaymentOrderCreateAsyncParams.ReceivingAccount.RoutingDetail
                                    .builder()
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
            )
        println(asyncResponse)
        asyncResponse.validate()
    }
}
