package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCollectionFlowCreateParamsTest {

    @Test
    fun createAccountCollectionFlowCreateParams() {
        AccountCollectionFlowCreateParams.builder()
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .paymentTypes(listOf("string"))
            .receivingCountries(listOf(AccountCollectionFlowCreateParams.ReceivingCountry.USA))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountCollectionFlowCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentTypes(listOf("string"))
                .receivingCountries(listOf(AccountCollectionFlowCreateParams.ReceivingCountry.USA))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentTypes()).isEqualTo(listOf("string"))
        assertThat(body.receivingCountries())
            .isEqualTo(listOf(AccountCollectionFlowCreateParams.ReceivingCountry.USA))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AccountCollectionFlowCreateParams.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .paymentTypes(listOf("string"))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.paymentTypes()).isEqualTo(listOf("string"))
    }
}
