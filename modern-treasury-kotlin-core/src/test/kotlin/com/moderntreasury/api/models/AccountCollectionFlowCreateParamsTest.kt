// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCollectionFlowCreateParamsTest {

    @Test
    fun create() {
        AccountCollectionFlowCreateParams.builder()
            .accountCollectionFlowCreateRequest(
                AccountCollectionFlowCreateRequest.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPaymentType("string")
                    .addReceivingCountry(AccountCollectionFlowCreateRequest.ReceivingCountry.USA)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountCollectionFlowCreateParams.builder()
                .accountCollectionFlowCreateRequest(
                    AccountCollectionFlowCreateRequest.builder()
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addPaymentType("string")
                        .addReceivingCountry(
                            AccountCollectionFlowCreateRequest.ReceivingCountry.USA
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AccountCollectionFlowCreateRequest.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPaymentType("string")
                    .addReceivingCountry(AccountCollectionFlowCreateRequest.ReceivingCountry.USA)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountCollectionFlowCreateParams.builder()
                .accountCollectionFlowCreateRequest(
                    AccountCollectionFlowCreateRequest.builder()
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addPaymentType("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AccountCollectionFlowCreateRequest.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPaymentType("string")
                    .build()
            )
    }
}
