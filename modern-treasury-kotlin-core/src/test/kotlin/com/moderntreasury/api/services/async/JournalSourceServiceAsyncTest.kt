// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.async

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClientAsync
import com.moderntreasury.api.models.JournalSourceListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class JournalSourceServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val journalSourceServiceAsync = client.journalSources()

        journalSourceServiceAsync.retrieve("id")
    }

    @Test
    suspend fun list() {
        val client =
            ModernTreasuryOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val journalSourceServiceAsync = client.journalSources()

        journalSourceServiceAsync.list(
            JournalSourceListParams.builder()
                .journalEntryId("journal_entry_id")
                .journalReportId("journal_report_id")
                .page(0L)
                .perPage(0L)
                .sourceId("source_id")
                .sourceType("source_type")
                .build()
        )
    }
}
