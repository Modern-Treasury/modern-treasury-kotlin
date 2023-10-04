// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.InternalAccountListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InternalAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()
        val internalAccount =
            internalAccountService.create(
                InternalAccountCreateParams.builder()
                    .connectionId("string")
                    .currency(InternalAccountCreateParams.Currency.USD)
                    .name("string")
                    .partyName("string")
                    .counterpartyId("string")
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
                    .vendorAttributes(
                        InternalAccountCreateParams.VendorAttributes.builder().build()
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()
        val internalAccount =
            internalAccountService.retrieve(
                InternalAccountRetrieveParams.builder().id("string").build()
            )
        println(internalAccount)
        internalAccount.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()
        val internalAccount =
            internalAccountService.update(
                InternalAccountUpdateParams.builder()
                    .id("string")
                    .counterpartyId("string")
                    .metadata(InternalAccountUpdateParams.Metadata.builder().build())
                    .name("string")
                    .parentAccountId("string")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val internalAccountService = client.internalAccounts()
        val response = internalAccountService.list(InternalAccountListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
