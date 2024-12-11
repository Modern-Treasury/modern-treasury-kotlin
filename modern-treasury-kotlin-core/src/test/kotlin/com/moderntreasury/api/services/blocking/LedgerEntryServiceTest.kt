// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.core.JsonValue
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerEntryListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerEntryServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEntryService = client.ledgerEntries()
        val ledgerEntry =
            ledgerEntryService.retrieve(
                LedgerEntryRetrieveParams.builder().id("id").showBalances(true).build()
            )
        println(ledgerEntry)
        ledgerEntry.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEntryService = client.ledgerEntries()
        val ledgerEntry =
            ledgerEntryService.update(
                LedgerEntryUpdateParams.builder()
                    .id("id")
                    .metadata(
                        LedgerEntryUpdateParams.Metadata.builder()
                            .putAdditionalProperty("key", JsonValue.from("value"))
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .putAdditionalProperty("modern", JsonValue.from("treasury"))
                            .build()
                    )
                    .build()
            )
        println(ledgerEntry)
        ledgerEntry.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerEntryService = client.ledgerEntries()
        val response = ledgerEntryService.list(LedgerEntryListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }
}
