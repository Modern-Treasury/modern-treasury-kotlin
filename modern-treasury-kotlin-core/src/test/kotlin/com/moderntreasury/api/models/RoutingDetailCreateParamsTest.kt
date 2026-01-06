// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoutingDetailCreateParamsTest {

    @Test
    fun create() {
        RoutingDetailCreateParams.builder()
            .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
            .accountId("account_id")
            .routingDetailCreate(
                RoutingDetailCreate.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                    .paymentType(RoutingDetailCreate.PaymentType.ACH)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RoutingDetailCreateParams.builder()
                .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .routingDetailCreate(
                    RoutingDetailCreate.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("external_accounts")
        assertThat(params._pathParam(1)).isEqualTo("account_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RoutingDetailCreateParams.builder()
                .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .routingDetailCreate(
                    RoutingDetailCreate.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                        .paymentType(RoutingDetailCreate.PaymentType.ACH)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            RoutingDetailCreateParams.builder()
                .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .routingDetailCreate(
                    RoutingDetailCreate.builder()
                        .routingNumber("routing_number")
                        .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RoutingDetailCreate.builder()
                    .routingNumber("routing_number")
                    .routingNumberType(RoutingDetailCreate.RoutingNumberType.ABA)
                    .build()
            )
    }
}
