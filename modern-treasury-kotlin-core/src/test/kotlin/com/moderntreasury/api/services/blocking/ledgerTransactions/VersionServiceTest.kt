// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking.ledgerTransactions

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class VersionServiceTest {

    @Test
    fun list() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val versionService = client.ledgerTransactions().versions()

        val page = versionService.list()

        page.items().forEach { it.validate() }
    }
}
