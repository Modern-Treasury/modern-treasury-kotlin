// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkResultServiceTest {

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
    @Test
    fun retrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkResultService = client.bulkResults()

        val bulkResult = bulkResultService.retrieve("id")

        bulkResult.validate()
    }

    @Disabled("Mock server doesn't generate valid example responses for recursive schemas")
    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val bulkResultService = client.bulkResults()

        val page = bulkResultService.list()

        page.items().forEach { it.validate() }
    }
}
