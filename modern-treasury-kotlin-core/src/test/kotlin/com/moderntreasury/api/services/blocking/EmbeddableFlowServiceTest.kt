// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.AccountCollectionFlowCreateRequest
import com.moderntreasury.api.models.EmbeddableFlowCreateParams
import com.moderntreasury.api.models.EmbeddableFlowUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmbeddableFlowServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowService = client.embeddableFlows()

        val embeddableFlow =
            embeddableFlowService.create(
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
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowService = client.embeddableFlows()

        val embeddableFlow = embeddableFlowService.retrieve("id")

        embeddableFlow.validate()
    }

    @Test
    fun update() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowService = client.embeddableFlows()

        val embeddableFlow =
            embeddableFlowService.update(
                EmbeddableFlowUpdateParams.builder()
                    .id("id")
                    .status(EmbeddableFlowUpdateParams.Status.CANCELLED)
                    .build()
            )

        embeddableFlow.validate()
    }

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val embeddableFlowService = client.embeddableFlows()

        val page = embeddableFlowService.list()

        page.items().forEach { it.validate() }
    }
}
