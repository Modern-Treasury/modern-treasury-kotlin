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
            .routingNumber("routing_number")
            .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
            .paymentType(RoutingDetailCreateParams.PaymentType.ACH)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RoutingDetailCreateParams.builder()
                .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
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
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
                .paymentType(RoutingDetailCreateParams.PaymentType.ACH)
                .build()

        val body = params._body()

        assertThat(body.routingNumber()).isEqualTo("routing_number")
        assertThat(body.routingNumberType())
            .isEqualTo(RoutingDetailCreateParams.RoutingNumberType.ABA)
        assertThat(body.paymentType()).isEqualTo(RoutingDetailCreateParams.PaymentType.ACH)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RoutingDetailCreateParams.builder()
                .accountsType(RoutingDetailCreateParams.AccountsType.EXTERNAL_ACCOUNTS)
                .accountId("account_id")
                .routingNumber("routing_number")
                .routingNumberType(RoutingDetailCreateParams.RoutingNumberType.ABA)
                .build()

        val body = params._body()

        assertThat(body.routingNumber()).isEqualTo("routing_number")
        assertThat(body.routingNumberType())
            .isEqualTo(RoutingDetailCreateParams.RoutingNumberType.ABA)
    }
}
