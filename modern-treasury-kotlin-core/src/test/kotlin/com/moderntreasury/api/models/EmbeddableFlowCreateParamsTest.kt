// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddableFlowCreateParamsTest {

    @Test
    fun create() {
        EmbeddableFlowCreateParams.builder()
            .options(
                EmbeddableFlowCreateParams.Options.AccountCollectionFlowCreateRequest.builder()
                    .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addPaymentType("string")
                    .addReceivingCountry(
                        EmbeddableFlowCreateParams.Options.AccountCollectionFlowCreateRequest
                            .ReceivingCountry
                            .USA
                    )
                    .build()
            )
            .template(EmbeddableFlowCreateParams.Template.LEGAL_ENTITY_ONBOARDING)
            .build()
    }

    @Test
    fun body() {
        val params =
            EmbeddableFlowCreateParams.builder()
                .options(
                    EmbeddableFlowCreateParams.Options.AccountCollectionFlowCreateRequest.builder()
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addPaymentType("string")
                        .addReceivingCountry(
                            EmbeddableFlowCreateParams.Options.AccountCollectionFlowCreateRequest
                                .ReceivingCountry
                                .USA
                        )
                        .build()
                )
                .template(EmbeddableFlowCreateParams.Template.LEGAL_ENTITY_ONBOARDING)
                .build()

        val body = params._body()

        assertThat(body.options())
            .isEqualTo(
                EmbeddableFlowCreateParams.Options.ofAccountCollectionFlowCreateRequest(
                    EmbeddableFlowCreateParams.Options.AccountCollectionFlowCreateRequest.builder()
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addPaymentType("string")
                        .addReceivingCountry(
                            EmbeddableFlowCreateParams.Options.AccountCollectionFlowCreateRequest
                                .ReceivingCountry
                                .USA
                        )
                        .build()
                )
            )
        assertThat(body.template())
            .isEqualTo(EmbeddableFlowCreateParams.Template.LEGAL_ENTITY_ONBOARDING)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmbeddableFlowCreateParams.builder()
                .options(
                    EmbeddableFlowCreateParams.Options.AccountCollectionFlowCreateRequest.builder()
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addPaymentType("string")
                        .build()
                )
                .template(EmbeddableFlowCreateParams.Template.LEGAL_ENTITY_ONBOARDING)
                .build()

        val body = params._body()

        assertThat(body.options())
            .isEqualTo(
                EmbeddableFlowCreateParams.Options.ofAccountCollectionFlowCreateRequest(
                    EmbeddableFlowCreateParams.Options.AccountCollectionFlowCreateRequest.builder()
                        .counterpartyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addPaymentType("string")
                        .build()
                )
            )
        assertThat(body.template())
            .isEqualTo(EmbeddableFlowCreateParams.Template.LEGAL_ENTITY_ONBOARDING)
    }
}
