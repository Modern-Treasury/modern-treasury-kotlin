// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountUpdateParamsTest {

    @Test
    fun create() {
        ExternalAccountUpdateParams.builder()
            .id("id")
            .accountType(ExternalAccountType.BASE_WALLET)
            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadata(
                ExternalAccountUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .name("name")
            .partyAddress(
                AddressRequest.builder()
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
    fun pathParams() {
        val params = ExternalAccountUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExternalAccountUpdateParams.builder()
                .id("id")
                .accountType(ExternalAccountType.BASE_WALLET)
                .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadata(
                    ExternalAccountUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .name("name")
                .partyAddress(
                    AddressRequest.builder()
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

        val body = params._body()

        assertThat(body.accountType()).isEqualTo(ExternalAccountType.BASE_WALLET)
        assertThat(body.counterpartyId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadata())
            .isEqualTo(
                ExternalAccountUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.partyAddress())
            .isEqualTo(
                AddressRequest.builder()
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
    fun bodyWithoutOptionalFields() {
        val params = ExternalAccountUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
