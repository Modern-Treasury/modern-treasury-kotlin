// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowRetrieveParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountCollectionFlowServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowService = client.accountCollectionFlows()

        val accountCollectionFlow =
            accountCollectionFlowService.create(
                AccountCollectionFlowCreateParams.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPaymentType("string")
                    .addReceivingCountry(AccountCollectionFlowCreateParams.ReceivingCountry.USA)
                    .build()
            )

        accountCollectionFlow.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowService = client.accountCollectionFlows()

        val accountCollectionFlow =
            accountCollectionFlowService.retrieve(
                AccountCollectionFlowRetrieveParams.builder().id("id").build()
            )

        accountCollectionFlow.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowService = client.accountCollectionFlows()

        val accountCollectionFlow =
            accountCollectionFlowService.update(
                AccountCollectionFlowUpdateParams.builder()
                    .id("id")
                    .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                    .build()
            )

        accountCollectionFlow.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowService = client.accountCollectionFlows()

        val page = accountCollectionFlowService.list()

        page.items().forEach { it.validate() }
    }
}
