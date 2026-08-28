// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LegalEntityAssociationServiceAsyncTest {

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
    @Test
    suspend fun create() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityAssociationServiceAsync = client.legalEntityAssociations()

        val legalEntityAssociation =
            legalEntityAssociationServiceAsync.create(
                LegalEntityAssociationCreateParams.builder()
                    .childLegalEntityId("child_legal_entity_id")
                    .parentLegalEntityId("parent_legal_entity_id")
                    .addRelationshipType(
                        LegalEntityAssociationCreateParams.RelationshipType.AUTHORIZED_SIGNER
                    )
                    .ownershipPercentage(0L)
                    .title("title")
                    .build()
            )

        legalEntityAssociation.validate()
    }

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
    @Test
    suspend fun delete() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityAssociationServiceAsync = client.legalEntityAssociations()

        val legalEntityAssociation = legalEntityAssociationServiceAsync.delete("id")

        legalEntityAssociation.validate()
    }
}
