// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentOrderUpdateParamsTest {

    @Test
    fun create() {
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
                                        PaymentOrderUpdate.ReceivingAccount.RoutingDetail
                                            .PaymentType
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = PaymentOrderUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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
                                            PaymentOrderUpdate.ReceivingAccount.RoutingDetail
                                                .PaymentType
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                                        PaymentOrderUpdate.ReceivingAccount.RoutingDetail
                                            .PaymentType
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PaymentOrderUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
