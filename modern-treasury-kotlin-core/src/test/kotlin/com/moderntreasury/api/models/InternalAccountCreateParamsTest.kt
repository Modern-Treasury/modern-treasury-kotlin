// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InternalAccountCreateParamsTest {

    @Test
    fun createInternalAccountCreateParams() {
        InternalAccountCreateParams.builder()
            .connectionId("connection_id")
            .currency(InternalAccountCreateParams.Currency.USD)
            .name("name")
            .partyName("party_name")
            .counterpartyId("counterparty_id")
            .legalEntityId("legal_entity_id")
            .parentAccountId("parent_account_id")
            .partyAddress(
                InternalAccountCreateParams.PartyAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
            .vendorAttributes(
                InternalAccountCreateParams.VendorAttributes.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("connection_id")
                .currency(InternalAccountCreateParams.Currency.USD)
                .name("name")
                .partyName("party_name")
                .counterpartyId("counterparty_id")
                .legalEntityId("legal_entity_id")
                .parentAccountId("parent_account_id")
                .partyAddress(
                    InternalAccountCreateParams.PartyAddress.builder()
                        .country("country")
                        .line1("line1")
                        .locality("locality")
                        .postalCode("postal_code")
                        .region("region")
                        .line2("line2")
                        .build()
                )
                .vendorAttributes(
                    InternalAccountCreateParams.VendorAttributes.builder()
                        .putAdditionalProperty("key", JsonValue.from("value"))
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .putAdditionalProperty("modern", JsonValue.from("treasury"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("connection_id")
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.partyName()).isEqualTo("party_name")
        assertThat(body.counterpartyId()).isEqualTo("counterparty_id")
        assertThat(body.legalEntityId()).isEqualTo("legal_entity_id")
        assertThat(body.parentAccountId()).isEqualTo("parent_account_id")
        assertThat(body.partyAddress())
            .isEqualTo(
                InternalAccountCreateParams.PartyAddress.builder()
                    .country("country")
                    .line1("line1")
                    .locality("locality")
                    .postalCode("postal_code")
                    .region("region")
                    .line2("line2")
                    .build()
            )
        assertThat(body.vendorAttributes())
            .isEqualTo(
                InternalAccountCreateParams.VendorAttributes.builder()
                    .putAdditionalProperty("key", JsonValue.from("value"))
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .putAdditionalProperty("modern", JsonValue.from("treasury"))
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("connection_id")
                .currency(InternalAccountCreateParams.Currency.USD)
                .name("name")
                .partyName("party_name")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.connectionId()).isEqualTo("connection_id")
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.partyName()).isEqualTo("party_name")
    }
}
