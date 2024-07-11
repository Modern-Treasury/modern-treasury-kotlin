// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountUpdateParamsTest {

    @Test
    fun createExternalAccountUpdateParams() {
        ExternalAccountUpdateParams.builder()
            .id("id")
            .accountType(ExternalAccountType.CASH)
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(ExternalAccountUpdateParams.Metadata.builder().build())
            .name("name")
            .partyAddress(
                ExternalAccountUpdateParams.AddressRequest.builder()
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .build()
            )
            .partyName("party_name")
            .partyType(ExternalAccountUpdateParams.PartyType.BUSINESS)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalAccountUpdateParams.builder()
                .id("id")
                .accountType(ExternalAccountType.CASH)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(ExternalAccountUpdateParams.Metadata.builder().build())
                .name("name")
                .partyAddress(
                    ExternalAccountUpdateParams.AddressRequest.builder()
                        .country("country")
                        .line1("line1")
                        .line2("line2")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .build()
                )
                .partyName("party_name")
                .partyType(ExternalAccountUpdateParams.PartyType.BUSINESS)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountType()).isEqualTo(ExternalAccountType.CASH)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .isEqualTo(ExternalAccountUpdateParams.Metadata.builder().build())
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.partyAddress())
            .isEqualTo(
                ExternalAccountUpdateParams.AddressRequest.builder()
                    .country("country")
                    .line1("line1")
                    .line2("line2")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .build()
            )
        assertThat(body.partyName()).isEqualTo("party_name")
        assertThat(body.partyType()).isEqualTo(ExternalAccountUpdateParams.PartyType.BUSINESS)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ExternalAccountUpdateParams.builder().id("id").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = ExternalAccountUpdateParams.builder().id("id").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
