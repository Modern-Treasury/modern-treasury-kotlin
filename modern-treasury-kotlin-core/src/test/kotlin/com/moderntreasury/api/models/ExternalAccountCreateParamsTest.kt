// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountCreateParamsTest {

    @Test
    fun createExternalAccountCreateParams() {
        ExternalAccountCreateParams.builder()
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .accountDetails(
                listOf(
                    ExternalAccountCreateParams.AccountDetail.builder()
                        .accountNumber("account_number")
                        .accountNumberType(
                            ExternalAccountCreateParams.AccountDetail.AccountNumberType.AU_NUMBER
                        )
                        .build()
                )
            )
            .accountType(ExternalAccountType.CASH)
            .contactDetails(
                listOf(
                    ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            ExternalAccountCreateParams.ContactDetailCreateRequest
                                .ContactIdentifierType
                                .EMAIL
                        )
                        .build()
                )
            )
            .ledgerAccount(
                ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
            .metadata(
                ExternalAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .name("name")
            .partyAddress(
                ExternalAccountCreateParams.AddressRequest.builder()
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
            .partyType(ExternalAccountCreateParams.PartyType.BUSINESS)
            .plaidProcessorToken("plaid_processor_token")
            .routingDetails(
                listOf(
                    ExternalAccountCreateParams.RoutingDetail.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(
                            ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                        )
                        .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalAccountCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accountDetails(
                    listOf(
                        ExternalAccountCreateParams.AccountDetail.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                ExternalAccountCreateParams.AccountDetail.AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .accountType(ExternalAccountType.CASH)
                .contactDetails(
                    listOf(
                        ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                            .contactIdentifier("contact_identifier")
                            .contactIdentifierType(
                                ExternalAccountCreateParams.ContactDetailCreateRequest
                                    .ContactIdentifierType
                                    .EMAIL
                            )
                            .build()
                    )
                )
                .ledgerAccount(
                    ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                                .COUNTERPARTY
                        )
                        .metadata(
                            ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata
                                .builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .build()
                )
                .metadata(
                    ExternalAccountCreateParams.Metadata.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .name("name")
                .partyAddress(
                    ExternalAccountCreateParams.AddressRequest.builder()
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
                .partyType(ExternalAccountCreateParams.PartyType.BUSINESS)
                .plaidProcessorToken("plaid_processor_token")
                .routingDetails(
                    listOf(
                        ExternalAccountCreateParams.RoutingDetail.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                            )
                            .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.accountDetails())
            .isEqualTo(
                listOf(
                    ExternalAccountCreateParams.AccountDetail.builder()
                        .accountNumber("account_number")
                        .accountNumberType(
                            ExternalAccountCreateParams.AccountDetail.AccountNumberType.AU_NUMBER
                        )
                        .build()
                )
            )
        assertThat(body.accountType()).isEqualTo(ExternalAccountType.CASH)
        assertThat(body.contactDetails())
            .isEqualTo(
                listOf(
                    ExternalAccountCreateParams.ContactDetailCreateRequest.builder()
                        .contactIdentifier("contact_identifier")
                        .contactIdentifierType(
                            ExternalAccountCreateParams.ContactDetailCreateRequest
                                .ContactIdentifierType
                                .EMAIL
                        )
                        .build()
                )
            )
        assertThat(body.ledgerAccount())
            .isEqualTo(
                ExternalAccountCreateParams.LedgerAccountCreateRequest.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        ExternalAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                ExternalAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.partyAddress())
            .isEqualTo(
                ExternalAccountCreateParams.AddressRequest.builder()
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .build()
            )
        assertThat(body.partyIdentifier()).isEqualTo("party_identifier")
        assertThat(body.partyName()).isEqualTo("party_name")
        assertThat(body.partyType()).isEqualTo(ExternalAccountCreateParams.PartyType.BUSINESS)
        assertThat(body.plaidProcessorToken()).isEqualTo("plaid_processor_token")
        assertThat(body.routingDetails())
            .isEqualTo(
                listOf(
                    ExternalAccountCreateParams.RoutingDetail.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(
                            ExternalAccountCreateParams.RoutingDetail.RoutingNumberType.ABA
                        )
                        .paymentType(ExternalAccountCreateParams.RoutingDetail.PaymentType.ACH)
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ExternalAccountCreateParams.builder().build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }
}
