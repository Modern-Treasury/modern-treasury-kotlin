// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.moderntreasury.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountCreateParamsTest {

    @Test
    fun create() {
        InternalAccountCreateParams.builder()
            .connectionId("connection_id")
            .currency(InternalAccountCreateParams.Currency.USD)
            .name("name")
            .partyName("party_name")
            .addAccountCapability(
                AccountCapability.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .direction(TransactionDirection.CREDIT)
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .identifier("identifier")
                    .liveMode(true)
                    .object_("object")
                    .paymentType(AccountCapability.PaymentType.ACH)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .accountType(InternalAccountCreateParams.AccountType.CHECKING)
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
    fun body() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("connection_id")
                .currency(InternalAccountCreateParams.Currency.USD)
                .name("name")
                .partyName("party_name")
                .addAccountCapability(
                    AccountCapability.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .direction(TransactionDirection.CREDIT)
                        .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .identifier("identifier")
                        .liveMode(true)
                        .object_("object")
                        .paymentType(AccountCapability.PaymentType.ACH)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .accountType(InternalAccountCreateParams.AccountType.CHECKING)
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

        val body = params._body()

        assertThat(body.connectionId()).isEqualTo("connection_id")
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.partyName()).isEqualTo("party_name")
        assertThat(body.accountCapabilities())
            .containsExactly(
                AccountCapability.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .direction(TransactionDirection.CREDIT)
                    .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .identifier("identifier")
                    .liveMode(true)
                    .object_("object")
                    .paymentType(AccountCapability.PaymentType.ACH)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.accountType()).isEqualTo(InternalAccountCreateParams.AccountType.CHECKING)
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
    fun bodyWithoutOptionalFields() {
        val params =
            InternalAccountCreateParams.builder()
                .connectionId("connection_id")
                .currency(InternalAccountCreateParams.Currency.USD)
                .name("name")
                .partyName("party_name")
                .build()

        val body = params._body()

        assertThat(body.connectionId()).isEqualTo("connection_id")
        assertThat(body.currency()).isEqualTo(InternalAccountCreateParams.Currency.USD)
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.partyName()).isEqualTo("party_name")
    }
}
