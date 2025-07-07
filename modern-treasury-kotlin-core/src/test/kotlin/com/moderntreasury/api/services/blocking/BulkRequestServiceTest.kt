// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.Accounting
import com.moderntreasury.api.models.AddressRequest
import com.moderntreasury.api.models.BulkRequestCreateParams
import com.moderntreasury.api.models.ContactDetailCreateRequest
import com.moderntreasury.api.models.Currency
import com.moderntreasury.api.models.ExternalAccountType
import com.moderntreasury.api.models.LedgerAccountCreateRequest
import com.moderntreasury.api.models.LedgerEntryCreateRequest
import com.moderntreasury.api.models.LedgerTransactionCreateRequest
import com.moderntreasury.api.models.PaymentOrderSubtype
import com.moderntreasury.api.models.PaymentOrderType
import com.moderntreasury.api.models.TransactionDirection
import java.time.LocalDate
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkRequestServiceTest {

    @Disabled("Multipart documents aren't constructed properly yet")
    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkRequestService = client.bulkRequests()

        val bulkRequest =
            bulkRequestService.create(
                BulkRequestCreateParams.builder()
                    .actionType(BulkRequestCreateParams.ActionType.CREATE)
                    .resourceType(BulkRequestCreateParams.ResourceType.PAYMENT_ORDER)
                    .addResource(
                        BulkRequestCreateParams.Resource.PaymentOrderAsyncCreateRequest.builder()
                            .amount(0L)
                            .direction(
                                BulkRequestCreateParams.Resource.PaymentOrderAsyncCreateRequest
                                    .Direction
                                    .CREDIT
                            )
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
                            .chargeBearer(
                                BulkRequestCreateParams.Resource.PaymentOrderAsyncCreateRequest
                                    .ChargeBearer
                                    .SHARED
                            )
                            .currency(Currency.AED)
                            .description("description")
                            .effectiveDate(LocalDate.parse("2019-12-27"))
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .fallbackType(
                                BulkRequestCreateParams.Resource.PaymentOrderAsyncCreateRequest
                                    .FallbackType
                                    .ACH
                            )
                            .foreignExchangeContract("foreign_exchange_contract")
                            .foreignExchangeIndicator(
                                BulkRequestCreateParams.Resource.PaymentOrderAsyncCreateRequest
                                    .ForeignExchangeIndicator
                                    .FIXED_TO_VARIABLE
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
                            )
                            .ledgerTransactionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addLineItem(
                                BulkRequestCreateParams.Resource.PaymentOrderAsyncCreateRequest
                                    .LineItemRequest
                                    .builder()
                                    .amount(0L)
                                    .accountingCategoryId("accounting_category_id")
                                    .description("description")
                                    .metadata(
                                        BulkRequestCreateParams.Resource
                                            .PaymentOrderAsyncCreateRequest
                                            .LineItemRequest
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
                                BulkRequestCreateParams.Resource.PaymentOrderAsyncCreateRequest
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                    .build()
                            )
                            .nsfProtected(true)
                            .originatingPartyName("originating_party_name")
                            .priority(
                                BulkRequestCreateParams.Resource.PaymentOrderAsyncCreateRequest
                                    .Priority
                                    .HIGH
                            )
                            .processAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .purpose("purpose")
                            .receivingAccount(
                                BulkRequestCreateParams.Resource.PaymentOrderAsyncCreateRequest
                                    .ReceivingAccount
                                    .builder()
                                    .addAccountDetail(
                                        BulkRequestCreateParams.Resource
                                            .PaymentOrderAsyncCreateRequest
                                            .ReceivingAccount
                                            .AccountDetail
                                            .builder()
                                            .accountNumber("account_number")
                                            .accountNumberType(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderAsyncCreateRequest
                                                    .ReceivingAccount
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
                                        BulkRequestCreateParams.Resource
                                            .PaymentOrderAsyncCreateRequest
                                            .ReceivingAccount
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
                                        BulkRequestCreateParams.Resource
                                            .PaymentOrderAsyncCreateRequest
                                            .ReceivingAccount
                                            .PartyType
                                            .BUSINESS
                                    )
                                    .plaidProcessorToken("plaid_processor_token")
                                    .addRoutingDetail(
                                        BulkRequestCreateParams.Resource
                                            .PaymentOrderAsyncCreateRequest
                                            .ReceivingAccount
                                            .RoutingDetail
                                            .builder()
                                            .routingNumber("routing_number")
                                            .routingNumberType(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderAsyncCreateRequest
                                                    .ReceivingAccount
                                                    .RoutingDetail
                                                    .RoutingNumberType
                                                    .ABA
                                            )
                                            .paymentType(
                                                BulkRequestCreateParams.Resource
                                                    .PaymentOrderAsyncCreateRequest
                                                    .ReceivingAccount
                                                    .RoutingDetail
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
                            .ultimateOriginatingPartyIdentifier(
                                "ultimate_originating_party_identifier"
                            )
                            .ultimateOriginatingPartyName("ultimate_originating_party_name")
                            .ultimateReceivingPartyIdentifier("ultimate_receiving_party_identifier")
                            .ultimateReceivingPartyName("ultimate_receiving_party_name")
                            .build()
                    )
                    .metadata(
                        BulkRequestCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        bulkRequest.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkRequestService = client.bulkRequests()

        val bulkRequest = bulkRequestService.retrieve("id")

        bulkRequest.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkRequestService = client.bulkRequests()

        val page = bulkRequestService.list()

        page.items().forEach { it.validate() }
    }
}
