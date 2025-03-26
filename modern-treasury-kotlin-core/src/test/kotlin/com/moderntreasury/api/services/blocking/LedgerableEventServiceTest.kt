// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.LedgerableEventCreateParams
import com.moderntreasury.api.models.LedgerableEventRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LedgerableEventServiceTest {

    @Test
    fun create() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerableEventService = client.ledgerableEvents()

        val ledgerableEvent =
            ledgerableEventService.create(
                LedgerableEventCreateParams.builder()
                    .name("name")
                    .customData(JsonValue.from(mapOf<String, Any>()))
                    .description("description")
                    .metadata(
                        LedgerableEventCreateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )

        ledgerableEvent.validate()
    }

    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerableEventService = client.ledgerableEvents()

        val ledgerableEvent =
            ledgerableEventService.retrieve(
                LedgerableEventRetrieveParams.builder().id("id").build()
            )

        ledgerableEvent.validate()
    }
}
