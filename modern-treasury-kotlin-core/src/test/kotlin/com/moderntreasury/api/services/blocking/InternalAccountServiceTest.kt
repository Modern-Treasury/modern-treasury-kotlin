// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.InternalAccountCreateParams
import com.moderntreasury.api.models.InternalAccountListParams
import com.moderntreasury.api.models.InternalAccountRetrieveParams
import com.moderntreasury.api.models.InternalAccountUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InternalAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()
        val internalAccount =
            internalAccountService.create(
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
            )
        println(internalAccount)
        internalAccount.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()
        val internalAccount =
            internalAccountService.retrieve(
                InternalAccountRetrieveParams.builder().id("id").build()
            )
        println(internalAccount)
        internalAccount.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()
        val internalAccount =
            internalAccountService.update(
                InternalAccountUpdateParams.builder()
                    .id("id")
                    .counterpartyId("counterparty_id")
                    .ledgerAccountId("ledger_account_id")
                    .metadata(
                        InternalAccountUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .name("name")
                    .parentAccountId("parent_account_id")
                    .build()
            )
        println(internalAccount)
        internalAccount.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()
        val response = internalAccountService.list(InternalAccountListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
