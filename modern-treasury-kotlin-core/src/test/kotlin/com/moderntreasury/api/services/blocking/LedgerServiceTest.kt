// File generated from our OpenAPI spec by Stainless.

package com.moderntreasury.api.services.blocking

import com.moderntreasury.api.TestServerExtension
import com.moderntreasury.api.client.okhttp.ModernTreasuryOkHttpClient
import com.moderntreasury.api.models.*
import com.moderntreasury.api.models.LedgerListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class LedgerServiceTest {

    @Test
    fun callCreate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerService = client.ledgers()
        val ledger =
            ledgerService.create(
                LedgerCreateParams.builder()
                    .name("string")
                    .description("string")
                    .metadata(LedgerCreateParams.Metadata.builder().build())
                    .build()
            )
        println(ledger)
        ledger.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerService = client.ledgers()
        val ledger = ledgerService.retrieve(LedgerRetrieveParams.builder().id("string").build())
        println(ledger)
        ledger.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerService = client.ledgers()
        val ledger =
            ledgerService.update(
                LedgerUpdateParams.builder()
                    .id("string")
                    .description("string")
                    .metadata(LedgerUpdateParams.Metadata.builder().build())
                    .name("string")
                    .build()
            )
        println(ledger)
        ledger.validate()
    }

    @Test
    fun callList() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerService = client.ledgers()
        val response = ledgerService.list(LedgerListParams.builder().build())
        println(response)
        response.items().forEach { it.validate() }
    }

    @Test
    fun callDelete() {
        val client =
            ModernTreasuryOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .organizationId("my-organization-ID")
                .build()
        val ledgerService = client.ledgers()
        val ledger = ledgerService.delete(LedgerDeleteParams.builder().id("string").build())
        println(ledger)
        ledger.validate()
    }
}
