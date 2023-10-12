// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.VirtualAccountListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class VirtualAccountServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountService = client.virtualAccounts()
        val virtualAccount =
            virtualAccountService.create(
                VirtualAccountCreateParams.builder()
                    .internalAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("string")
                    .accountDetails(
                        listOf(
                            VirtualAccountCreateParams.AccountDetailCreateRequest.builder()
                                .accountNumber("string")
                                .accountNumberType(
                                    VirtualAccountCreateParams.AccountDetailCreateRequest
                                        .AccountNumberType
                                        .CLABE
                                )
                                .build()
                        )
                    )
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .creditLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .debitLedgerAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("string")
                    .metadata(VirtualAccountCreateParams.Metadata.builder().build())
                    .routingDetails(
                        listOf(
                            VirtualAccountCreateParams.RoutingDetailCreateRequest.builder()
                                .routingNumber("string")
                                .routingNumberType(
                                    VirtualAccountCreateParams.RoutingDetailCreateRequest
                                        .RoutingNumberType
                                        .ABA
                                )
                                .paymentType(
                                    VirtualAccountCreateParams.RoutingDetailCreateRequest
                                        .PaymentType
                                        .ACH
                                )
                                .build()
                        )
                    )
                    .build()
            )
        println(virtualAccount)
        virtualAccount.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountService = client.virtualAccounts()
        val virtualAccount =
            virtualAccountService.retrieve(
                VirtualAccountRetrieveParams.builder().id("string").build()
            )
        println(virtualAccount)
        virtualAccount.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountService = client.virtualAccounts()
        val virtualAccount =
            virtualAccountService.update(
                VirtualAccountUpdateParams.builder()
                    .id("string")
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .metadata(VirtualAccountUpdateParams.Metadata.builder().build())
                    .name("string")
                    .build()
            )
        println(virtualAccount)
        virtualAccount.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountService = client.virtualAccounts()
        val response = virtualAccountService.list(VirtualAccountListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val virtualAccountService = client.virtualAccounts()
        val virtualAccount =
            virtualAccountService.delete(VirtualAccountDeleteParams.builder().id("string").build())
        println(virtualAccount)
        virtualAccount.validate()
    }
}
