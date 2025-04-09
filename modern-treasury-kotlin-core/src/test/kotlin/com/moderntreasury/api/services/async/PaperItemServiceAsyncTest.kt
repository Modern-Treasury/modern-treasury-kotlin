// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.PaperItemRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaperItemServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paperItemServiceAsync = client.paperItems()

        val paperItem =
            paperItemServiceAsync.retrieve(PaperItemRetrieveParams.builder().id("id").build())

        paperItem.validate()
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val paperItemServiceAsync = client.paperItems()

        val page = paperItemServiceAsync.list()

        page.items().forEach { it.validate() }
    }
}
