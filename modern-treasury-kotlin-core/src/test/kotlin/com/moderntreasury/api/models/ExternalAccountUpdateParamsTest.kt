package com.moderntreasury.api.models

import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExternalAccountUpdateParamsTest {

    @Test
    fun createExternalAccountUpdateParams() {
        ExternalAccountUpdateParams.builder()
            .id("string")
            .partyType(ExternalAccountUpdateParams.PartyType.BUSINESS)
            .accountType(ExternalAccountType.CASH)
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("string")
            .partyName("string")
            .partyAddress(
                ExternalAccountUpdateParams.AddressRequest.builder()
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .build()
            )
            .metadata(ExternalAccountUpdateParams.Metadata.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExternalAccountUpdateParams.builder()
                .id("string")
                .partyType(ExternalAccountUpdateParams.PartyType.BUSINESS)
                .accountType(ExternalAccountType.CASH)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .partyName("string")
                .partyAddress(
                    ExternalAccountUpdateParams.AddressRequest.builder()
                        .country("string")
                        .line1("string")
                        .line2("string")
                        .locality("string")
                        .postalCode("string")
                        .region("string")
                        .build()
                )
                .metadata(ExternalAccountUpdateParams.Metadata.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.partyType()).isEqualTo(ExternalAccountUpdateParams.PartyType.BUSINESS)
        assertThat(body.accountType()).isEqualTo(ExternalAccountType.CASH)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.name()).isEqualTo("string")
        assertThat(body.partyName()).isEqualTo("string")
        assertThat(body.partyAddress())
            .isEqualTo(
                ExternalAccountUpdateParams.AddressRequest.builder()
                    .country("string")
                    .line1("string")
                    .line2("string")
                    .locality("string")
                    .postalCode("string")
                    .region("string")
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(ExternalAccountUpdateParams.Metadata.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = ExternalAccountUpdateParams.builder().id("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = ExternalAccountUpdateParams.builder().id("string").build()
        assertThat(params).isNotNull
        // path param "id"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
