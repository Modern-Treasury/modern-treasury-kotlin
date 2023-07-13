package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.AccountCollectionFlowListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountCollectionFlowServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val accountCollectionFlowService = client.accountCollectionFlows()
        val accountConnectionFlow =
            accountCollectionFlowService.create(
                AccountCollectionFlowCreateParams.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .paymentTypes(listOf("string"))
                    .build()
            )
        println(accountConnectionFlow)
        accountConnectionFlow.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val accountCollectionFlowService = client.accountCollectionFlows()
        val accountConnectionFlow =
            accountCollectionFlowService.retrieve(
                AccountCollectionFlowRetrieveParams.builder().id("string").build()
            )
        println(accountConnectionFlow)
        accountConnectionFlow.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val accountCollectionFlowService = client.accountCollectionFlows()
        val accountConnectionFlow =
            accountCollectionFlowService.update(
                AccountCollectionFlowUpdateParams.builder()
                    .id("string")
                    .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                    .build()
            )
        println(accountConnectionFlow)
        accountConnectionFlow.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .webhookKey("string")
                .build()
        val accountCollectionFlowService = client.accountCollectionFlows()
        val response =
            accountCollectionFlowService.list(AccountCollectionFlowListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
