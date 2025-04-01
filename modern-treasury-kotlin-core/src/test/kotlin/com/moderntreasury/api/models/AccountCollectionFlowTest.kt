// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountCollectionFlowTest {

    @Test
    fun create() {
        val accountCollectionFlow =
            AccountCollectionFlow.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPaymentType(AccountCollectionFlow.PaymentType.ACH)
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientToken("client_token")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .addReceivingCountry(AccountCollectionFlow.ReceivingCountry.USA)
                .status(AccountCollectionFlow.Status.CANCELLED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(accountCollectionFlow.counterpartyId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCollectionFlow.paymentTypes())
            .containsExactly(AccountCollectionFlow.PaymentType.ACH)
        assertThat(accountCollectionFlow.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCollectionFlow.clientToken()).isEqualTo("client_token")
        assertThat(accountCollectionFlow.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountCollectionFlow.externalAccountId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(accountCollectionFlow.liveMode()).isEqualTo(true)
        assertThat(accountCollectionFlow.object_()).isEqualTo("object")
        assertThat(accountCollectionFlow.receivingCountries())
            .containsExactly(AccountCollectionFlow.ReceivingCountry.USA)
        assertThat(accountCollectionFlow.status()).isEqualTo(AccountCollectionFlow.Status.CANCELLED)
        assertThat(accountCollectionFlow.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountCollectionFlow =
            AccountCollectionFlow.builder()
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPaymentType(AccountCollectionFlow.PaymentType.ACH)
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientToken("client_token")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .externalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .liveMode(true)
                .object_("object")
                .addReceivingCountry(AccountCollectionFlow.ReceivingCountry.USA)
                .status(AccountCollectionFlow.Status.CANCELLED)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAccountCollectionFlow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountCollectionFlow),
                jacksonTypeRef<AccountCollectionFlow>(),
            )

        assertThat(roundtrippedAccountCollectionFlow).isEqualTo(accountCollectionFlow)
    }
}
