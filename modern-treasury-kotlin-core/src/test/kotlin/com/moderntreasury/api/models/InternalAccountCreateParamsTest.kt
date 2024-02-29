// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountCreateParamsTest {

    @Test
    fun createInternalAccountCreateParams() {
        InternalAccountCreateParams.builder()
            .connectionId("string")
            .currency(InternalAccountCreateParams.Currency.USD)
            .name("string")
            .partyName("string")
            .counterpartyId("string")
            .legalEntityId("string")
            .parentAccountId("string")
            .partyAddress(
                InternalAccountCreateParams.PartyAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
            .vendorAttributes(InternalAccountCreateParams.VendorAttributes.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("string")
                .currency(InternalAccountCreateParams.Currency.USD)
                .name("string")
                .partyName("string")
                .counterpartyId("string")
                .legalEntityId("string")
                .parentAccountId("string")
                .partyAddress(
                    InternalAccountCreateParams.PartyAddress.builder()
                        .country("string")
                        .line1("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .line2("string")
                        .build()
                )
                .vendorAttributes(InternalAccountCreateParams.VendorAttributes.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("string")
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.partyName()).isEqualTo("string")
        assertThat(body.counterpartyId()).isEqualTo("string")
        assertThat(body.legalEntityId()).isEqualTo("string")
        assertThat(body.parentAccountId()).isEqualTo("string")
        assertThat(body.partyAddress())
            .isEqualTo(
                InternalAccountCreateParams.PartyAddress.builder()
                    .country("string")
                    .line1("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .line2("string")
                    .build()
            )
        assertThat(body.vendorAttributes())
            .isEqualTo(InternalAccountCreateParams.VendorAttributes.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("string")
                .currency(InternalAccountCreateParams.Currency.USD)
                .name("string")
                .partyName("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("string")
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.partyName()).isEqualTo("string")
    }
}
