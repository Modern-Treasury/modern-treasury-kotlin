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
                            .partyType(
                                PaymentOrderUpdateRequest.ReceivingAccount.PartyType.BUSINESS
                            )
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
                    .reconciliationStatus(
                        PaymentOrderUpdateRequest.ReconciliationStatus.UNRECONCILED
                    )
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
                                    PaymentOrderUpdateRequest.ReceivingAccount.AccountDetail
                                        .builder()
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
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
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
                                .partyType(
                                    PaymentOrderUpdateRequest.ReceivingAccount.PartyType.BUSINESS
                                )
                                .plaidProcessorToken("plaid_processor_token")
                                .addRoutingDetail(
                                    PaymentOrderUpdateRequest.ReceivingAccount.RoutingDetail
                                        .builder()
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
                        .reconciliationStatus(
                            PaymentOrderUpdateRequest.ReconciliationStatus.UNRECONCILED
                        )
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                            .partyType(
                                PaymentOrderUpdateRequest.ReceivingAccount.PartyType.BUSINESS
                            )
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
                    .reconciliationStatus(
                        PaymentOrderUpdateRequest.ReconciliationStatus.UNRECONCILED
                    )
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PaymentOrderUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
