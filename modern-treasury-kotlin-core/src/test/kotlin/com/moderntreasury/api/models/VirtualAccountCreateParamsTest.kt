// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VirtualAccountCreateParamsTest {

    @Test
    fun createVirtualAccountCreateParams() {
        VirtualAccountCreateParams.builder()
            .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("string")
            .accountDetails(
                listOf(
                    VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                        .accountNumber("string")
                        .accountNumberType(
                            VirtualAccountCreateParams.AccountDetailCreateRequest.AccountNumberType
                                .CLABE
                        )
                        .build()
                )
            )
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("string")
            .metadata(VirtualAccountCreateParams.Metadata.builder().build())
            .routingDetails(
                listOf(
                    VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                        .routingNumber("string")
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
                .name("string")
                .accountDetails(
                    listOf(
                        VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                            .accountNumber("string")
                            .accountNumberType(
                                VirtualAccountCreateParams.AccountDetailCreateRequest
                                    .AccountNumberType
                                    .CLABE
                            )
                            .build()
                    )
                )
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .metadata(VirtualAccountCreateParams.Metadata.builder().build())
                .routingDetails(
                    listOf(
                        VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                            .routingNumber("string")
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
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.accountDetails())
            .isEqualTo(
                listOf(
                    VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                        .accountNumber("string")
                        .accountNumberType(
                            VirtualAccountCreateParams.AccountDetailCreateRequest.AccountNumberType
                                .CLABE
                        )
                        .build()
                )
            )
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.creditLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.debitLedgerAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).isEqualTo("string")
        assertThat(body.metadata()).isEqualTo(VirtualAccountCreateParams.Metadata.builder().build())
        assertThat(body.routingDetails())
            .isEqualTo(
                listOf(
                    VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                        .routingNumber("string")
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
                .name("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.internalAccountId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("string")
    }
}
