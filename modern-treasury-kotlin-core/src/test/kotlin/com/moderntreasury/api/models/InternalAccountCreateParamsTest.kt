package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountCreateParamsTest {

    @Test
    fun createInternalAccountCreateParams() {
        InternalAccountCreateParams.builder()
            .connectionId("string")
            .name("string")
            .partyName("string")
            .partyAddress(
                InternalAccountCreateParams.PartyAddress.builder()
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
            .currency(InternalAccountCreateParams.Currency.USD)
            .entityId("string")
            .parentAccountId("string")
            .counterpartyId("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("string")
                .name("string")
                .partyName("string")
                .partyAddress(
                    InternalAccountCreateParams.PartyAddress.builder()
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .region("string")
                        .postalCode("string")
                        .country("string")
                        .build()
                )
                .currency(InternalAccountCreateParams.Currency.USD)
                .entityId("string")
                .parentAccountId("string")
                .counterpartyId("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.partyName()).isEqualTo("string")
        assertThat(body.partyAddress())
            .isEqualTo(
                InternalAccountCreateParams.PartyAddress.builder()
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .region("string")
                    .postalCode("string")
                    .country("string")
                    .build()
            )
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
        assertThat(body.entityId()).isEqualTo("string")
        assertThat(body.parentAccountId()).isEqualTo("string")
        assertThat(body.counterpartyId()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("string")
                .name("string")
                .partyName("string")
                .currency(InternalAccountCreateParams.Currency.USD)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("string")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.partyName()).isEqualTo("string")
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
    }
}
