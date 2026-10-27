// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmbeddableFlowTest {

    @Test
    fun create() {
        val embeddableFlow =
            EmbeddableFlow.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientToken("client_token")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .options(
                    EmbeddableFlow.Options.UnionMember0.builder()
                        .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(EmbeddableFlow.Options.UnionMember0.Type.INDIVIDUAL)
                        .build()
                )
                .status(EmbeddableFlow.Status.CANCELLED)
                .template(EmbeddableFlow.Template.LEGAL_ENTITY_ONBOARDING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(embeddableFlow.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(embeddableFlow.clientToken()).isEqualTo("client_token")
        assertThat(embeddableFlow.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(embeddableFlow.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(embeddableFlow.liveMode()).isEqualTo(true)
        assertThat(embeddableFlow.object_()).isEqualTo("object")
        assertThat(embeddableFlow.options())
            .isEqualTo(
                EmbeddableFlow.Options.ofUnionMember0(
                    EmbeddableFlow.Options.UnionMember0.builder()
                        .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(EmbeddableFlow.Options.UnionMember0.Type.INDIVIDUAL)
                        .build()
                )
            )
        assertThat(embeddableFlow.status()).isEqualTo(EmbeddableFlow.Status.CANCELLED)
        assertThat(embeddableFlow.template())
            .isEqualTo(EmbeddableFlow.Template.LEGAL_ENTITY_ONBOARDING)
        assertThat(embeddableFlow.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val embeddableFlow =
            EmbeddableFlow.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .clientToken("client_token")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .options(
                    EmbeddableFlow.Options.UnionMember0.builder()
                        .legalEntityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(EmbeddableFlow.Options.UnionMember0.Type.INDIVIDUAL)
                        .build()
                )
                .status(EmbeddableFlow.Status.CANCELLED)
                .template(EmbeddableFlow.Template.LEGAL_ENTITY_ONBOARDING)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEmbeddableFlow =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(embeddableFlow),
                jacksonTypeRef<EmbeddableFlow>(),
            )

        assertThat(roundtrippedEmbeddableFlow).isEqualTo(embeddableFlow)
    }
}
