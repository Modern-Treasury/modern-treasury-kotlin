// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.LegalEntityAssociationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LegalEntityAssociationServiceTest {

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityAssociationService = client.legalEntityAssociations()

        val legalEntityAssociation =
            legalEntityAssociationService.create(
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
    fun delete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val legalEntityAssociationService = client.legalEntityAssociations()

        val legalEntityAssociation = legalEntityAssociationService.delete("id")

        legalEntityAssociation.validate()
    }
}
