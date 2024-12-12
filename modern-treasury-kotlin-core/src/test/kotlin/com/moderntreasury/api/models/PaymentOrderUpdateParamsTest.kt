// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentOrderUpdateParamsTest {

    @Test
    fun createPaymentOrderUpdateParams() {
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
            .lineItems(
                listOf(
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
                    .accountDetails(
                        listOf(
                            PaymentOrderUpdateParams.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    PaymentOrderUpdateParams.ReceivingAccount.AccountDetail
                                        .AccountNumberType
                                        .AU_NUMBER
                                )
                                .build()
                        )
                    )
                    .accountType(ExternalAccountType.CASH)
                    .contactDetails(
                        listOf(
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
                            .ledgerAccountCategoryIds(
                                listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            )
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                PaymentOrderUpdateParams.ReceivingAccount.LedgerAccountCreateRequest
                                    .LedgerableType
                                    .COUNTERPARTY
                            )
                            .metadata(
                                PaymentOrderUpdateParams.ReceivingAccount.LedgerAccountCreateRequest
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
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
                    .routingDetails(
                        listOf(
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
    }

    @Test
    fun getBody() {
        val params =
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
                .lineItems(
                    listOf(
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
                        .accountDetails(
                            listOf(
                                PaymentOrderUpdateParams.ReceivingAccount.AccountDetail.builder()
                                    .accountNumber("account_number")
                                    .accountNumberType(
                                        PaymentOrderUpdateParams.ReceivingAccount.AccountDetail
                                            .AccountNumberType
                                            .AU_NUMBER
                                    )
                                    .build()
                            )
                        )
                        .accountType(ExternalAccountType.CASH)
                        .contactDetails(
                            listOf(
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
                                .ledgerAccountCategoryIds(
                                    listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
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
                        .routingDetails(
                            listOf(
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accounting())
            .isEqualTo(
                PaymentOrderUpdateParams.Accounting.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .classId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        assertThat(body.accountingCategoryId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.accountingLedgerClassId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.amount()).isEqualTo(0L)
        assertThat(body.chargeBearer()).isEqualTo(PaymentOrderUpdateParams.ChargeBearer.SHARED)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.direction()).isEqualTo(PaymentOrderUpdateParams.Direction.CREDIT)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.expiresAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.fallbackType()).isEqualTo(PaymentOrderUpdateParams.FallbackType.ACH)
        assertThat(body.foreignExchangeContract()).isEqualTo("foreign_exchange_contract")
        assertThat(body.foreignExchangeIndicator())
            .isEqualTo(PaymentOrderUpdateParams.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
        assertThat(body.lineItems())
            .isEqualTo(
                listOf(
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
            )
        assertThat(body.metadata())
            .isEqualTo(
                PaymentOrderUpdateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.nsfProtected()).isEqualTo(true)
        assertThat(body.originatingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.originatingPartyName()).isEqualTo("originating_party_name")
        assertThat(body.priority()).isEqualTo(PaymentOrderUpdateParams.Priority.HIGH)
        assertThat(body.processAfter()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.purpose()).isEqualTo("purpose")
        assertThat(body.receivingAccount())
            .isEqualTo(
                PaymentOrderUpdateParams.ReceivingAccount.builder()
                    .accountDetails(
                        listOf(
                            PaymentOrderUpdateParams.ReceivingAccount.AccountDetail.builder()
                                .accountNumber("account_number")
                                .accountNumberType(
                                    PaymentOrderUpdateParams.ReceivingAccount.AccountDetail
                                        .AccountNumberType
                                        .AU_NUMBER
                                )
                                .build()
                        )
                    )
                    .accountType(ExternalAccountType.CASH)
                    .contactDetails(
                        listOf(
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
                            .ledgerAccountCategoryIds(
                                listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            )
                            .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .ledgerableType(
                                PaymentOrderUpdateParams.ReceivingAccount.LedgerAccountCreateRequest
                                    .LedgerableType
                                    .COUNTERPARTY
                            )
                            .metadata(
                                PaymentOrderUpdateParams.ReceivingAccount.LedgerAccountCreateRequest
                                    .Metadata
                                    .builder()
                                    .putAdditionalProperty("key", JsonValue.from("value"))
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
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
                    .routingDetails(
                        listOf(
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
                    )
                    .build()
            )
        assertThat(body.receivingAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.remittanceInformation()).isEqualTo("remittance_information")
        assertThat(body.sendRemittanceAdvice()).isEqualTo(true)
        assertThat(body.statementDescriptor()).isEqualTo("statement_descriptor")
        assertThat(body.status()).isEqualTo(PaymentOrderUpdateParams.Status.APPROVED)
        assertThat(body.subtype()).isEqualTo(PaymentOrderSubtype.BACS_NEW_INSTRUCTION)
        assertThat(body.type()).isEqualTo(PaymentOrderType.ACH)
        assertThat(body.ultimateOriginatingPartyIdentifier())
            .isEqualTo("ultimate_originating_party_identifier")
        assertThat(body.ultimateOriginatingPartyName()).isEqualTo("ultimate_originating_party_name")
        assertThat(body.ultimateReceivingPartyIdentifier())
            .isEqualTo("ultimate_receiving_party_identifier")
        assertThat(body.ultimateReceivingPartyName()).isEqualTo("ultimate_receiving_party_name")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = PaymentOrderUpdateParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = PaymentOrderUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
