// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualAccountCreateParamsTest {

    @Test
    fun create() {
        VirtualAccountCreateParams.builder()
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .addAccountDetail(
                AccountDetailCreate.builder()
                    .accountNumber("account_number")
                    .accountNumberType(AccountDetailCreate.AccountNumberType.AU_NUMBER)
                    .build()
            )
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
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
                VirtualAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .addRoutingDetail(
                RoutingDetailCreate.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                    .paymentType(RoutingDetailCreate.PaymentType.ACH)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            VirtualAccountCreateParams.builder()
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .addAccountDetail(
                    AccountDetailCreate.builder()
                        .accountNumber("account_number")
                        .accountNumberType(AccountDetailCreate.AccountNumberType.AU_NUMBER)
                        .build()
                )
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
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
                    VirtualAccountCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addRoutingDetail(
                    RoutingDetailCreate.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                        .paymentType(RoutingDetailCreate.PaymentType.ACH)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.accountDetails())
            .containsExactly(
                AccountDetailCreate.builder()
                    .accountNumber("account_number")
                    .accountNumberType(AccountDetailCreate.AccountNumberType.AU_NUMBER)
                    .build()
            )
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.debitLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("description")
        assertThat(body.ledgerAccount())
            .isEqualTo(
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
        assertThat(body.metadata())
            .isEqualTo(
                VirtualAccountCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.routingDetails())
            .containsExactly(
                RoutingDetailCreate.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                    .paymentType(RoutingDetailCreate.PaymentType.ACH)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VirtualAccountCreateParams.builder()
                .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("name")
    }
}
