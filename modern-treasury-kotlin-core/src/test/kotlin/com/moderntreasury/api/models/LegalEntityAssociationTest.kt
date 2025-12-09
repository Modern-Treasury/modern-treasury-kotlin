// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalEntityAssociationTest {

    @Test
    fun create() {
        val legalEntityAssociation =
            LegalEntityAssociation.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .childLegalEntity(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .ownershipPercentage(0L)
                .parentLegalEntityId("parent_legal_entity_id")
                .addRelationshipType(LegalEntityAssociation.RelationshipType.AUTHORIZED_SIGNER)
                .title("title")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(legalEntityAssociation.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(legalEntityAssociation._childLegalEntity())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(legalEntityAssociation.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityAssociation.discardedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(legalEntityAssociation.liveMode()).isEqualTo(true)
        assertThat(legalEntityAssociation.object_()).isEqualTo("object")
        assertThat(legalEntityAssociation.ownershipPercentage()).isEqualTo(0L)
        assertThat(legalEntityAssociation.parentLegalEntityId()).isEqualTo("parent_legal_entity_id")
        assertThat(legalEntityAssociation.relationshipTypes())
            .containsExactly(LegalEntityAssociation.RelationshipType.AUTHORIZED_SIGNER)
        assertThat(legalEntityAssociation.title()).isEqualTo("title")
        assertThat(legalEntityAssociation.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalEntityAssociation =
            LegalEntityAssociation.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .childLegalEntity(JsonValue.from(mapOf<String, Any>()))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discardedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .liveMode(true)
                .object_("object")
                .ownershipPercentage(0L)
                .parentLegalEntityId("parent_legal_entity_id")
                .addRelationshipType(LegalEntityAssociation.RelationshipType.AUTHORIZED_SIGNER)
                .title("title")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedLegalEntityAssociation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalEntityAssociation),
                jacksonTypeRef<LegalEntityAssociation>(),
            )

        assertThat(roundtrippedLegalEntityAssociation).isEqualTo(legalEntityAssociation)
    }
}
