// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCollectionFlowCreateRequestTest {

    @Test
    fun create() {
        val accountCollectionFlowCreateRequest =
            AccountCollectionFlowCreateRequest.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPaymentType("string")
                .addReceivingCountry(AccountCollectionFlowCreateRequest.ReceivingCountry.USA)
                .build()

        assertThat(accountCollectionFlowCreateRequest.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCollectionFlowCreateRequest.paymentTypes()).containsExactly("string")
        assertThat(accountCollectionFlowCreateRequest.receivingCountries())
            .containsExactly(AccountCollectionFlowCreateRequest.ReceivingCountry.USA)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountCollectionFlowCreateRequest =
            AccountCollectionFlowCreateRequest.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPaymentType("string")
                .addReceivingCountry(AccountCollectionFlowCreateRequest.ReceivingCountry.USA)
                .build()

        val roundtrippedAccountCollectionFlowCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountCollectionFlowCreateRequest),
                jacksonTypeRef<AccountCollectionFlowCreateRequest>(),
            )

        assertThat(roundtrippedAccountCollectionFlowCreateRequest)
            .isEqualTo(accountCollectionFlowCreateRequest)
    }
}
