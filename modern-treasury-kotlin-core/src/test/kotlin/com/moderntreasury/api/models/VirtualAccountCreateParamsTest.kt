// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VirtualAccountCreateParamsTest {

    @Test
    fun createVirtualAccountCreateParams() {
        VirtualAccountCreateParams.builder()
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .accountDetails(
                listOf(
                    VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                        .accountNumber("account_number")
                        .accountNumberType(
                            VirtualAccountCreateParams.AccountDetailCreateRequest.AccountNumberType
                                .AU_NUMBER
                        )
                        .build()
                )
            )
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .ledgerAccount(
                VirtualAccountCreateParams.LedgerAccountCreateRequest.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        VirtualAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        VirtualAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
            .metadata(
                VirtualAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .routingDetails(
                listOf(
                    VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(
                            VirtualAccountCreateParams.RoutingDetailCreateRequest.RoutingNumberType
                                .ABA
                        )
                        .paymentType(
                            VirtualAccountCreateParams.RoutingDetailCreateRequest.PaymentType.ACH
                        )
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            VirtualAccountCreateParams.builder()
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .accountDetails(
                    listOf(
                        VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                            .accountNumber("account_number")
                            .accountNumberType(
                                VirtualAccountCreateParams.AccountDetailCreateRequest
                                    .AccountNumberType
                                    .AU_NUMBER
                            )
                            .build()
                    )
                )
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .ledgerAccount(
                    VirtualAccountCreateParams.LedgerAccountCreateRequest.builder()
                        .currency("currency")
                        .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .normalBalance(TransactionDirection.CREDIT)
                        .currencyExponent(0L)
                        .description("description")
                        .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                        .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .ledgerableType(
                            VirtualAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                                .COUNTERPARTY
                        )
                        .metadata(
                            VirtualAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                                .putAdditionalProperty("key", JsonValue.from("value"))
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .putAdditionalProperty("modern", JsonValue.from("treasury"))
                                .build()
                        )
                        .build()
                )
                .metadata(
                    VirtualAccountCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .routingDetails(
                    listOf(
                        VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                            .routingNumber("routing_number")
                            .routingNumberType(
                                VirtualAccountCreateParams.RoutingDetailCreateRequest
                                    .RoutingNumberType
                                    .ABA
                            )
                            .paymentType(
                                VirtualAccountCreateParams.RoutingDetailCreateRequest.PaymentType
                                    .ACH
                            )
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.accountDetails())
            .isEqualTo(
                listOf(
                    VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                        .accountNumber("account_number")
                        .accountNumberType(
                            VirtualAccountCreateParams.AccountDetailCreateRequest.AccountNumberType
                                .AU_NUMBER
                        )
                        .build()
                )
            )
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.debitLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.ledgerAccount())
            .isEqualTo(
                VirtualAccountCreateParams.LedgerAccountCreateRequest.builder()
                    .currency("currency")
                    .ledgerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .normalBalance(TransactionDirection.CREDIT)
                    .currencyExponent(0L)
                    .description("description")
                    .ledgerAccountCategoryIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .ledgerableId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .ledgerableType(
                        VirtualAccountCreateParams.LedgerAccountCreateRequest.LedgerableType
                            .COUNTERPARTY
                    )
                    .metadata(
                        VirtualAccountCreateParams.LedgerAccountCreateRequest.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                VirtualAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.routingDetails())
            .isEqualTo(
                listOf(
                    VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(
                            VirtualAccountCreateParams.RoutingDetailCreateRequest.RoutingNumberType
                                .ABA
                        )
                        .paymentType(
                            VirtualAccountCreateParams.RoutingDetailCreateRequest.PaymentType.ACH
                        )
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            VirtualAccountCreateParams.builder()
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
    }
}
