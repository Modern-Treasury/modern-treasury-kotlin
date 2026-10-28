// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.AccountCollectionFlowCreateRequest
import com.moderntreasury.api.models.EmbeddableFlowCreateParams
import com.moderntreasury.api.models.EmbeddableFlowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmbeddableFlowServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowServiceAsync = client.embeddableFlows()

        val embeddableFlow =
            embeddableFlowServiceAsync.create(
                EmbeddableFlowCreateParams.builder()
                    .options(
                        AccountCollectionFlowCreateRequest.builder()
                            .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addPaymentType("string")
                            .addReceivingCountry(
                                AccountCollectionFlowCreateRequest.ReceivingCountry.USA
                            )
                            .build()
                    )
                    .template(EmbeddableFlowCreateParams.Template.LEGAL_ENTITY_ONBOARDING)
                    .build()
            )

        embeddableFlow.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowServiceAsync = client.embeddableFlows()

        val embeddableFlow = embeddableFlowServiceAsync.retrieve("id")

        embeddableFlow.validate()
    }

    @Test
    suspend fun update() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowServiceAsync = client.embeddableFlows()

        val embeddableFlow =
            embeddableFlowServiceAsync.update(
                EmbeddableFlowUpdateParams.builder()
                    .id("id")
                    .status(EmbeddableFlowUpdateParams.Status.CANCELLED)
                    .build()
            )

        embeddableFlow.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowServiceAsync = client.embeddableFlows()

        val page = embeddableFlowServiceAsync.list()

        page.items().forEach { it.validate() }
    }
}
