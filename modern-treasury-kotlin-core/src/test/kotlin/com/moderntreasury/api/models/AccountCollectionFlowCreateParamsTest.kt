// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCollectionFlowCreateParamsTest {

    @Test
    fun createAccountCollectionFlowCreateParams() {
        AccountCollectionFlowCreateParams.builder()
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addPaymentType("string")
            .addReceivingCountry(AccountCollectionFlowCreateParams.ReceivingCountry.USA)
            .build()
    }

    @Test
    fun body() {
        val params =
            AccountCollectionFlowCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPaymentType("string")
                .addReceivingCountry(AccountCollectionFlowCreateParams.ReceivingCountry.USA)
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentTypes()).isEqualTo(listOf("string"))
        assertThat(body.receivingCountries())
            .isEqualTo(listOf(AccountCollectionFlowCreateParams.ReceivingCountry.USA))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AccountCollectionFlowCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPaymentType("string")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentTypes()).isEqualTo(listOf("string"))
    }
}
