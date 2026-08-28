// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalEntityAssociationCreateParamsTest {

    @Test
    fun create() {
        LegalEntityAssociationCreateParams.builder()
            .childLegalEntityId("child_legal_entity_id")
            .parentLegalEntityId("parent_legal_entity_id")
            .addRelationshipType(
                LegalEntityAssociationCreateParams.RelationshipType.AUTHORIZED_SIGNER
            )
            .ownershipPercentage(0L)
            .title("title")
            .build()
    }

    @Test
    fun body() {
        val params =
            LegalEntityAssociationCreateParams.builder()
                .childLegalEntityId("child_legal_entity_id")
                .parentLegalEntityId("parent_legal_entity_id")
                .addRelationshipType(
                    LegalEntityAssociationCreateParams.RelationshipType.AUTHORIZED_SIGNER
                )
                .ownershipPercentage(0L)
                .title("title")
                .build()

        val body = params._body()

        assertThat(body.childLegalEntityId()).isEqualTo("child_legal_entity_id")
        assertThat(body.parentLegalEntityId()).isEqualTo("parent_legal_entity_id")
        assertThat(body.relationshipTypes())
            .containsExactly(LegalEntityAssociationCreateParams.RelationshipType.AUTHORIZED_SIGNER)
        assertThat(body.ownershipPercentage()).isEqualTo(0L)
        assertThat(body.title()).isEqualTo("title")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LegalEntityAssociationCreateParams.builder()
                .childLegalEntityId("child_legal_entity_id")
                .parentLegalEntityId("parent_legal_entity_id")
                .addRelationshipType(
                    LegalEntityAssociationCreateParams.RelationshipType.AUTHORIZED_SIGNER
                )
                .build()

        val body = params._body()

        assertThat(body.childLegalEntityId()).isEqualTo("child_legal_entity_id")
        assertThat(body.parentLegalEntityId()).isEqualTo("parent_legal_entity_id")
        assertThat(body.relationshipTypes())
            .containsExactly(LegalEntityAssociationCreateParams.RelationshipType.AUTHORIZED_SIGNER)
    }
}
