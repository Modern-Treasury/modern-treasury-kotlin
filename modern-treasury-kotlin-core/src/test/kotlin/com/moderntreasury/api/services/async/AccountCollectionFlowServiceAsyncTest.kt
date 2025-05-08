// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.AccountCollectionFlowCreateParams
import com.moderntreasury.api.models.AccountCollectionFlowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountCollectionFlowServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowServiceAsync = client.accountCollectionFlows()

        val accountCollectionFlow =
            accountCollectionFlowServiceAsync.create(
                AccountCollectionFlowCreateParams.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPaymentType("string")
                    .addReceivingCountry(AccountCollectionFlowCreateParams.ReceivingCountry.USA)
                    .build()
            )

        accountCollectionFlow.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowServiceAsync = client.accountCollectionFlows()

        val accountCollectionFlow = accountCollectionFlowServiceAsync.retrieve("id")

        accountCollectionFlow.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowServiceAsync = client.accountCollectionFlows()

        val accountCollectionFlow =
            accountCollectionFlowServiceAsync.update(
                AccountCollectionFlowUpdateParams.builder()
                    .id("id")
                    .status(AccountCollectionFlowUpdateParams.Status.CANCELLED)
                    .build()
            )

        accountCollectionFlow.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val accountCollectionFlowServiceAsync = client.accountCollectionFlows()

        val page = accountCollectionFlowServiceAsync.list()

        page.items().forEach { it.validate() }
    }
}
