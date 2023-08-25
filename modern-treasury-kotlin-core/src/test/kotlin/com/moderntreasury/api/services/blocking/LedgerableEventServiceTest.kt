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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerableEventService = client.ledgerableEvents()
        val ledgerableEvent =
            ledgerableEventService.create(
                LedgerableEventCreateParams.builder()
                    .amount(123L)
                    .name("string")
                    .currency("string")
                    .currencyExponent(123L)
                    .customData(JsonNull.of())
                    .description("string")
                    .direction("string")
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
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerableEventService = client.ledgerableEvents()
        val ledgerableEvent =
            ledgerableEventService.retrieve(
                LedgerableEventRetrieveParams.builder().id("string").build()
            )
        println(ledgerableEvent)
        ledgerableEvent.validate()
    }
}
