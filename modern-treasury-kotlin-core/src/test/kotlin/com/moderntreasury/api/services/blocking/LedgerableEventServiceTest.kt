// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonNull
import com.moderntreasury.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerableEventServiceTest {

    @Test
    fun callCreate() {
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
                    .customData(JsonNull.of())
                    .description("description")
                    .metadata(LedgerableEventCreateParams.Metadata.builder().build())
                    .build()
            )
        println(ledgerableEvent)
        ledgerableEvent.validate()
    }

    @Test
    fun callRetrieve() {
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
        println(ledgerableEvent)
        ledgerableEvent.validate()
    }
}
